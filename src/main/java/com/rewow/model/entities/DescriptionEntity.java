package com.rewow.model.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "description", schema = "public", catalog = "d76p9hqs38cjgf")
public class DescriptionEntity {
    private Integer idDescription;
    private String textDescription;
    private String dateDescription;

    @Id
    @Column(name = "id_description")
    public Integer getIdDescription() {
        return idDescription;
    }

    public void setIdDescription(Integer idDescription) {
        this.idDescription = idDescription;
    }

    @Basic
    @Column(name = "text_description")
    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    @Basic
    @Column(name = "date_description")
    public String getDateDescription() {
        return dateDescription;
    }

    public void setDateDescription(String dateDescription) {
        this.dateDescription = dateDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DescriptionEntity that = (DescriptionEntity) o;
        return Objects.equals(idDescription, that.idDescription) &&
                Objects.equals(textDescription, that.textDescription) &&
                Objects.equals(dateDescription, that.dateDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDescription, textDescription, dateDescription);
    }
}
