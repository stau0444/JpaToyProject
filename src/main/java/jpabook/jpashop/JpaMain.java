package jpabook.jpashop;

import jpabook.jpashop.domain.Item.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Movie movie = new Movie();
            movie.setActor("actor");
            movie.setDirector("director");
            movie.setName("movie1");
            movie.setPrice(10000);

            em.persist(movie);

            em.flush();
            em.clear();

            Movie movie1 = em.find(Movie.class, movie.getId());

            System.out.println("movie1 = " + movie1);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }
}
