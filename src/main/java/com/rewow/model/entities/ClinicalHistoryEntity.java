package com.rewow.model.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "clinical_history", schema = "public", catalog = "d76p9hqs38cjgf")
public class ClinicalHistoryEntity {
    private Integer idHistory;

    @Id
    @Column(name = "id_history")
    public Integer getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(Integer idHistory) {
        this.idHistory = idHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClinicalHistoryEntity that = (ClinicalHistoryEntity) o;
        return Objects.equals(idHistory, that.idHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHistory);
    }
}
