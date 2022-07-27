package com.sistema.see.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
public class EventChoice {
    @EmbeddedId
    EventChoicePK chave;

    private Date fim;
    private Date inicio;
    private Date voteDate;
    @ManyToOne
    @MapsId("idUserFk")
    @JoinColumn(name = "user_id")
    private User idUser_Fk;

    @ManyToOne
    @MapsId("idEventFk")
    @JoinColumn(name = "event_id")
    private Event idEvent_Fk;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EventChoice that = (EventChoice) o;
        return idUser_Fk == that.idUser_Fk && idEvent_Fk == that.idEvent_Fk && Objects.equals(fim, that.fim) && Objects.equals(inicio, that.inicio)
                && Objects.equals(voteDate, that.voteDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser_Fk, idEvent_Fk, fim, inicio, voteDate);
    }
}
