package com.soprasteria.booking.boot.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Setter
@Getter
public class Properties {
    //Security
    @Value("${security.token.bitSecret}")
    private String bitSecret;

    @Value("${security.token.header}")
    private String header;


    @Value("${security.token.id}")
    private String id;

    @Value("${security.token.bearer}")
    private String bearer;


    @Value("${security.token.role}")
    private String role;

}
