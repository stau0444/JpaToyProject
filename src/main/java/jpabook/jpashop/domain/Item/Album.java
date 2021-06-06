package jpabook.jpashop.domain.Item;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "A")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Album extends Item {

    private String artist;
    private String etc;

}
