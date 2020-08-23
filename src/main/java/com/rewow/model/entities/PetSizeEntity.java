package com.rewow.model.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "pet_size", schema = "public", catalog = "d76p9hqs38cjgf")
public class PetSizeEntity {
    private Integer idSize;
    private String name;

    @Id
    @Column(name = "id_size")
    public Integer getIdSize() {
        return idSize;
    }

    public void setIdSize(Integer idSize) {
        this.idSize = idSize;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetSizeEntity that = (PetSizeEntity) o;
        return Objects.equals(idSize, that.idSize) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSize, name);
    }
}
