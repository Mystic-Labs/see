package com.sistema.see.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class AFollowBPK implements Serializable {
    @Column(name = "user_A")
    private int userA;
    @Column(name = "user_b")
    private int userB;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AFollowBPK that = (AFollowBPK) o;

        if (userA != that.userA) return false;
        return userB == that.userB;
    }

    @Override
    public int hashCode() {
        int result = userA;
        result = 31 * result + userB;
        return result;
    }
}
