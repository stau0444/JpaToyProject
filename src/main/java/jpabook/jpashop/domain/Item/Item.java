package jpabook.jpashop.domain.Item;

import jpabook.jpashop.domain.BaseEntity;
import jpabook.jpashop.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Item extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private  int price;

    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories;

}
