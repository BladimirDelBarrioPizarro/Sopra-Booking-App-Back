package com.soprasteria.booking.boot;

import com.soprasteria.booking.controller.NeedController;
import com.soprasteria.booking.controller.impl.NeedControllerImpl;
import com.soprasteria.booking.dao.NeedDao;
import com.soprasteria.booking.service.NeedService;
import com.soprasteria.booking.service.impl.NeedServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public NeedService needService(NeedDao needDao){
        return new NeedServiceImpl(needDao);
    }

    @Bean
    public NeedController needController(NeedService needService){
        return new NeedControllerImpl(needService);
    }

}
