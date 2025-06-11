package com.xworkz.common.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Data
@Table(name = "common_info")
public class CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "register_id")
    private Integer registerId;

    @Column(name = "user_name")
    private String userName;

    private Long phoneNumber;

    private String email;

    @Column(name = "psw")
    private String psw;

    @Column(name = "confirm_psw")
    private String cPsw;
}
