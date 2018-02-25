package com.example.eurekaprovideruser;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * liyan
 * 下午2:43
 **/

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String userName;
    @Column
    private int age;
    @Column
    private String name;
    @Column
    private BigDecimal balance;
}
