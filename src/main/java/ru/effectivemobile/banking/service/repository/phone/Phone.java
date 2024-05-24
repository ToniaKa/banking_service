package ru.effectivemobile.banking.service.repository.phone;

import jakarta.persistence.*;
import ru.effectivemobile.banking.service.repository.user.User;

@Entity
@Table(name = "phone", schema = "banking_service")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "phone_id_gen")
    @SequenceGenerator(name = "phone_id_gen", sequenceName = "phone_id_seq", schema = "banking_service", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "phone")
    private String phone; // переименуй колонку в number например.

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
