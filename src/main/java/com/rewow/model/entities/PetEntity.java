package com.rewow.model.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "pet", schema = "public", catalog = "d76p9hqs38cjgf")
@Builder
@Data
public class PetEntity {
    @Id
    @Column(name = "id_pet")
    private Integer idPet;

    @Basic
    @Column(name = "owner_name")
    private String ownerName;

    @Basic
    @Column(name = "pet_name")
    private String petName;

    @Basic
    @Column(name = "age")
    private Integer age;

}
