package com.xworkz.common.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CommonDto {
    private Integer registerId;
    private String userName;
    private Long phoneNumber;
    private String email;
    private String psw;
    private String cPsw;

}
