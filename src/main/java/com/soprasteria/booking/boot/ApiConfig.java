package com.soprasteria.booking.boot;

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
    public HiringController hiringController(HiringService hiringService){
        return new HiringControllerImpl(hiringService);
    }
}
