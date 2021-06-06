package jpabook.jpashop.domain.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "M")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends Item{

    private String director;

    private String actor;

}
