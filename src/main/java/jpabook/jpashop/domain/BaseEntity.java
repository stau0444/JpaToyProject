package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {

    private LocalDateTime createAt;
    private LocalDateTime updatedAt;

    private String createdBy;
    private String updatedBy;
}
