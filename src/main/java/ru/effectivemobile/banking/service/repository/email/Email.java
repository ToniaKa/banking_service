package ru.effectivemobile.banking.service.repository.email;

import jakarta.persistence.*;
import ru.effectivemobile.banking.service.repository.user.User;

@Entity
@Table(name = "email", schema = "banking_service")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_id_gen")
    @SequenceGenerator(name = "email_id_gen", sequenceName = "email_id_seq", schema = "banking_service", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "email")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
