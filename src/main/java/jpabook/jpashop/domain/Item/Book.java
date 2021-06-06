package jpabook.jpashop.domain.Item;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "B")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Item{

    private String author;

    private String isbn;

}
