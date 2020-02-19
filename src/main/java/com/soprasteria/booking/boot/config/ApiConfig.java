package com.soprasteria.booking.boot.config;

import com.soprasteria.booking.controller.ChildController;
import com.soprasteria.booking.controller.HiringController;
import com.soprasteria.booking.controller.HiringcController;
import com.soprasteria.booking.controller.NeedController;
import com.soprasteria.booking.controller.impl.ChildControllerImpl;
import com.soprasteria.booking.controller.impl.HiringControllerImpl;
import com.soprasteria.booking.controller.impl.HiringcControllerImpl;
import com.soprasteria.booking.controller.impl.NeedControllerImpl;
import com.soprasteria.booking.dao.ChildDao;
import com.soprasteria.booking.dao.HiringDao;
import com.soprasteria.booking.dao.HiringcDao;
import com.soprasteria.booking.dao.NeedDao;
import com.soprasteria.booking.service.ChildService;
import com.soprasteria.booking.service.HiringService;
import com.soprasteria.booking.service.HiringcService;
import com.soprasteria.booking.service.NeedService;
import com.soprasteria.booking.service.impl.ChildServiceImpl;
import com.soprasteria.booking.service.impl.HiringServiceImpl;
import com.soprasteria.booking.service.impl.HiringcServiceImpl;
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
    public ChildService childService(ChildDao childDao){
        return new ChildServiceImpl(childDao);
    }

    @Bean
    public HiringService hiringService(HiringDao hiringDao){
        return new HiringServiceImpl(hiringDao);
    }


    @Bean
    public HiringcService hiringcService(HiringcDao hiringcDao){
        return new HiringcServiceImpl(hiringcDao);
    }


    @Bean
    public ChildController childController(ChildService childService,EntityLinks entityLinks){
        return new ChildControllerImpl(childService,entityLinks);
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
    public HiringcController hiringcController(HiringcService hiringcService,EntityLinks entityLinks){
        return new HiringcControllerImpl(hiringcService,entityLinks);
    }
    
}
