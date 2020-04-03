package com.soprasteria.booking.service.dummy;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class HiringServiceDummy {

    public static List<HiringDTO> hiringDTOListDummy() throws ParseException {
        return Collections.singletonList(
                hiringDTODummy()
        );
    }

    public static HiringDTO hiringDTODummy() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse("23/09/2020");
        long time = date.getTime();
        return HiringDTO.builder()
                .id(1L)
                .registrationDate(new Timestamp(time))
                .companyHires("companyHires")
                .incorporationModality("incorporationModality")
                .requestTeam("requestTeam")
                .teamOffer("teamOffer")
                .recruiter("recruiter")
                .recruiterSource("recruiterSource")
                .marketStall("marketstall")
                .ambit("ambit")
                .agency("agency")
                .client("client")
                .name("name")
                .incorporationDate(new Timestamp(time))
                .exceptions("exceptions")
                .indefiniteContract("indefinitiveContract")
                .category("category")
                .offerValidation("offerValidation")
                .offer1((float) 2)
                .counterOffer2((float) 345)
                .variable("variable")
                .offerStatus("offerstatus")
                .reasonRejectionOffer("reasonRejection")
                .validated("validated")
                .employeeWeb("employeeWeb")
                .observations("observations")
                .providerName("providerName")
                .resourceProfitability("resourceProfitability")
                .directSelection((float) 789)
                .outSourcing((float) 678)
                .active(true)
                .build();
    }

    public static Hiring hiringDummy() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse("23/09/2020");
        long time = date.getTime();
        return Hiring.builder()
                .id(1L)
                .registrationDate(new Timestamp(time))
                .companyHires("companyHires")
                .incorporationModality("incorporationModality")
                .requestTeam("requestTeam")
                .teamOffer("teamOffer")
                .recruiter("recruiter")
                .recruiterSource("recruiterSource")
                .marketStall("marketstall")
                .ambit("ambit")
                .agency("agency")
                .client("client")
                .name("name")
                .incorporationDate(new Timestamp(time))
                .exceptions("exceptions")
                .indefiniteContract("indefinitiveContract")
                .category("category")
                .offerValidation("offerValidation")
                .offer1((float) 2)
                .counterOffer2((float) 345)
                .variable("variable")
                .offerStatus("offerstatus")
                .reasonRejectionOffer("reasonRejection")
                .validated("validated")
                .employeeWeb("employeeWeb")
                .observations("observations")
                .providerName("providerName")
                .resourceProfitability("resourceProfitability")
                .directSelection((float) 789)
                .outSourcing((float) 678)
                .active(true)
                .build();
    }
}


