package com.soprasteria.booking.service.dummy;

import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Hiring;
import com.soprasteria.booking.model.entity.Need;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NeedsServiceDummy {

    public static PageRequest pageRequestDummy(){
        return  PageRequest.of(0, 5, Sort.Direction.DESC, "name");
    }


    public static NeedDTO needDTODummy() throws ParseException {
        return NeedDTO.builder()
                .id(1L)
                .name("Test NeedDTO")
                .active(true)
                .hiring(Collections.singletonList(HiringServiceDummy.hiringDummy()))
                .build();
    }

    public static List<NeedDTO> needDTOListDummy() throws ParseException {
        return Collections.singletonList(needDTODummy());
    }

    public static Need needDummy() throws ParseException {
        return Need.builder()
                .id(1L)
                .name("Test Need")
                .active(true)
                .hiring(Collections.singletonList(HiringServiceDummy.hiringDummy()))
                .build();
    }

}

/*
* /*
* id SERIAL primary key NOT NULL,
        registration_date TIMESTAMP,
        company_hires character varying(100) NOT NULL,
        incorporation_modality character varying(100) NOT NULL,
        request_team character varying(100) NOT NULL,
        team_offer character varying(100) NOT NULL,
        recruiter character varying(100) NOT NULL,
        recruiter_source character varying(100) NOT NULL,
        market_stall character varying(100) NOT NULL,
        ambit character varying(100) NOT NULL,
        agency character varying(100) NOT NULL,
        client character varying(100) NOT NULL,
        name character varying(100) NOT NULL,
        incorporation_date TIMESTAMP,
        exceptions character varying(100) NOT NULL,
        indefinite_contract character varying(100) NOT NULL,
        category character varying(100) NOT NULL,
        offer_validation character varying(100) NOT NULL,
        offer1 DECIMAL NOT NULL,
        counter_offer2 DECIMAL,
        variable character varying(100) NOT NULL,
        offer_status character varying(100) NOT NULL,
        reason_rejection_offer character varying(100) NOT NULL,
        validated character varying(100),
        employee_web character varying(100),
        observations character varying(100),
        provider_name character varying(100) ,
        resource_profitability character varying(100),
        direct_selection DECIMAL,
        out_sourcing DECIMAL,
        active BOOLEAN
*
*
* */
