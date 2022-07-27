package com.sistema.see.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class EventChoicePK implements Serializable {
    @Column(name = "idUser_Fk")
    private int idUserFk;
    @Column(name = "idEvent_Fk")
    private int idEventFk;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EventChoicePK that = (EventChoicePK) o;
        return idUserFk == that.idUserFk && idEventFk == that.idEventFk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUserFk, idEventFk);
    }
}
