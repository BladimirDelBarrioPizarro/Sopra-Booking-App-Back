package com.soprasteria.booking.boot.config;

import com.soprasteria.booking.controller.*;
import com.soprasteria.booking.controller.impl.*;
import com.soprasteria.booking.dao.*;
import com.soprasteria.booking.service.*;
import com.soprasteria.booking.service.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApiConfig {



    @Bean
    public NeedService needService(NeedDao needDao,ChildDao childDao,HiringDao hiringDao){
        return new NeedServiceImpl(needDao,childDao,hiringDao);
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
    public RecruiterService recruiterService(RecruiterDao recruiterDao){
        return new RecruiterServiceImpl(recruiterDao);
    }


    @Bean
    public ChildController childController(ChildService childService){
        return new ChildControllerImpl(childService);
    }

    @Bean
    public NeedController needController(NeedService needService){
        return new NeedControllerImpl(needService);
    }

    @Bean
    public HiringController hiringController(HiringService hiringService){
        return new HiringControllerImpl(hiringService);
    }

    @Bean
    public HiringcController hiringcController(HiringcService hiringcService){
        return new HiringcControllerImpl(hiringcService);
    }

    @Bean
    public RecruiterController recruiterController(RecruiterService recruiterService){
        return new RecruiterControllerImpl(recruiterService);
    }
}
