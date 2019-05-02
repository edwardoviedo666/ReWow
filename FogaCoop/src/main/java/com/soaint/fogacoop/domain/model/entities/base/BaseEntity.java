package com.soaint.fogacoop.domain.model.entities.base;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Data
@NoArgsConstructor
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Version
    private Integer version;



}
