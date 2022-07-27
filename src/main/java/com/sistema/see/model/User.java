package com.sistema.see.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
public class User {
    @Id
    @Column(name = "id")
    private int id;

    private String user;
    private String password;

    private String bio;
    private String email;
    private Date signUp;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user1 = (User) o;
        return id == user1.id && Objects.equals(user, user1.user) && Objects.equals(password, user1.password) && Objects.equals(bio, user1.bio)
                && Objects.equals(email, user1.email) && Objects.equals(signUp, user1.signUp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password, id, bio, email, signUp);
    }
}
