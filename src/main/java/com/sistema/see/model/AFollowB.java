package com.sistema.see.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
@Getter
@Setter
@Entity
@Table(name = "a_follow_b")
public class AFollowB {
    @EmbeddedId
    AFollowBPK id;

    @ManyToOne
    @MapsId("userA")
    @JoinColumn(name = "user_a_id")
    private User user_A;
    
    @ManyToOne
    @MapsId("userB")
    @JoinColumn(name = "user_b_id")
    private User user_B;

    private Date startIn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AFollowB aFollowB = (AFollowB) o;
        return user_A == aFollowB.user_A && user_B == aFollowB.user_B && Objects.equals(startIn, aFollowB.startIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_A, user_B, startIn);
    }
}
