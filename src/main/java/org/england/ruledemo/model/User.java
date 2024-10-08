package org.england.ruledemo.model;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "users")
//@Data
@Getter
@Setter
public class User {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    public User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {

    }
}
