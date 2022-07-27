package com.sistema.see.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Event {
    @Id
    @Column(name = "id")
    private int id;
    private String nome;
    private String descri;
    private String tipo;
    private Date inicio;
    private String fim;
    private String intervalo;
    private Date endPoll;
    private String status;
    @OneToOne
    private User idAdmin;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Event event = (Event) o;
        return id == event.id && Objects.equals(nome, event.nome) && Objects.equals(descri, event.descri) && Objects.equals(tipo, event.tipo)
                && Objects.equals(inicio, event.inicio) && Objects.equals(fim, event.fim) && Objects.equals(intervalo, event.intervalo)
                && Objects.equals(endPoll, event.endPoll) && Objects.equals(status, event.status) && Objects.equals(idAdmin, event.idAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descri, tipo, inicio, fim, intervalo, endPoll, status, idAdmin);
    }
}
