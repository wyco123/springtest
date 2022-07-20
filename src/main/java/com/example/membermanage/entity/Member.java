package com.example.membermanage.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Member {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String grade; // 회원 등급

    private String name; // 이름

    private String period; // 구력

    private String joinDate; // 가입일자

    private String phone;

    private String address;

}
