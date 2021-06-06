package jpabook.jpashop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Delivery extends BaseEntity{

    @Id @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "delivery",fetch = FetchType.LAZY)
    private Order order;


    private DeliveryStatus status;

    private String city;

    private String street;

    private String zipcode;
}

/*
create table Delivery (
       id bigint not null,
        city varchar(255),
        status integer,
        street varchar(255),
        zipcode varchar(255),
        primary key (id)
    )
 */
