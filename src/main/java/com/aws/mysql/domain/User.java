package com.aws.mysql.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: User
 * Inside the package - com.aws.mysql.domain
 * Created Date: 4/12/2020
 * Created Time: 4:53 PM
 **/
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_gen")
    @SequenceGenerator(name = "user_gen", sequenceName = "user_seq",initialValue = 10001, allocationSize = 1)
    private Long userId;
    private String userName;

//    public User() {
//    }
//
//    public User(String userName) {
//        this.userName = userName;
//    }
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
}
