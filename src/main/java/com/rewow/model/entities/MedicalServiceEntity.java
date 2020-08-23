package com.rewow.model.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "medical_service", schema = "public", catalog = "d76p9hqs38cjgf")
public class MedicalServiceEntity {
    private Integer idService;
    private String nameService;

    @Id
    @Column(name = "id_service")
    public Integer getIdService() {
        return idService;
    }

    public void setIdService(Integer idService) {
        this.idService = idService;
    }

    @Basic
    @Column(name = "name_service")
    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalServiceEntity that = (MedicalServiceEntity) o;
        return Objects.equals(idService, that.idService) &&
                Objects.equals(nameService, that.nameService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idService, nameService);
    }
}
