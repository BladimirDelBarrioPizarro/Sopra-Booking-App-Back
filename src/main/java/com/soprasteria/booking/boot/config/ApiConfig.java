package com.soprasteria.booking.boot.config;

import com.soprasteria.booking.controller.HiringController;
import com.soprasteria.booking.controller.NeedController;
import com.soprasteria.booking.controller.impl.HiringControllerImpl;
import com.soprasteria.booking.controller.impl.NeedControllerImpl;
import com.soprasteria.booking.dao.HiringDao;
import com.soprasteria.booking.dao.NeedDao;
import com.soprasteria.booking.service.HiringService;
import com.soprasteria.booking.service.NeedService;
import com.soprasteria.booking.service.impl.HiringServiceImpl;
import com.soprasteria.booking.service.impl.NeedServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
public class ApiConfig {


    @Bean
    public NeedService needService(NeedDao needDao){
        return new NeedServiceImpl(needDao);
    }

    @Bean
    public HiringService hiringService(HiringDao hiringDao){
        return new HiringServiceImpl(hiringDao);
    }

    @Bean
    public NeedController needController(NeedService needService, EntityLinks entityLinks){
        return new NeedControllerImpl(needService,entityLinks);
    }

    @Bean
    public HiringController hiringController(HiringService hiringService,EntityLinks entityLinks){
        return new HiringControllerImpl(hiringService,entityLinks);
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration corsConfig =  new CorsConfiguration();
        corsConfig.addAllowedOrigin("http://localhost:3000");
        corsConfig.setAllowedMethods(Arrays.asList("POST","GET","PUT","DELETE","OPTIONS"));
        corsConfig.setAllowCredentials(true);
        corsConfig.setAllowedHeaders(Arrays.asList("Authorization","Content-Type"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",corsConfig);
        return source;
    }
}
