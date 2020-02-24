package com.soprasteria.booking.model.mapper;


import com.soprasteria.booking.model.dto.HiringcDTO;
import com.soprasteria.booking.model.entity.Hiringc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HiringcMapper {

    public static List<HiringcDTO> mapHiringcListToHiringcListDTO(List<Hiringc> hiringcList) {
        return hiringcList.stream().map(HiringcMapper::mapHiringcToHiringcDTO).collect(Collectors.toList());
    }

    public static HiringcDTO mapHiringcToHiringcDTO(Hiringc hiringc) {
        return HiringcDTO.builder()
                .id(hiringc.getId())
                .companyHires(hiringc.getCompanyHires())
                .incorporationModality(hiringc.getIncorporationModality())
                .requestTeam(hiringc.getRequestTeam())
                .teamOffer(hiringc.getTeamOffer())
                .recruiter(hiringc.getRecruiter())
                .recruiterSource(hiringc.getRecruiterSource())
                .marketStall(hiringc.getMarketStall())
                .ambit(hiringc.getAmbit())
                .agency(hiringc.getAgency())
                .client(hiringc.getClient())
                .name(hiringc.getName())
                .incorporationDate(hiringc.getIncorporationDate())
                .exceptions(hiringc.getExceptions())
                .indefiniteContract(hiringc.getIndefiniteContract())
                .category(hiringc.getCategory())
                .offerValidation(hiringc.getOfferValidation())
                .offer1(hiringc.getOffer1())
                .counterOffer2(hiringc.getCounterOffer2())
                .variable(hiringc.getVariable())
                .offerStatus(hiringc.getOfferStatus())
                .reasonRejectionOffer(hiringc.getReasonRejectionOffer())
                .validated(hiringc.getValidated())
                .employeeWeb(hiringc.getEmployeeWeb())
                .observations(hiringc.getObservations())
                .resourceProfitability(hiringc.getResourceProfitability())
                .directSelection(hiringc.getDirectSelection())
                .outSourcing(hiringc.getOutSourcing())
                .active(hiringc.getActive())
                .build();
    }

    public static HiringcDTO mapHiringcOptionalToHiringcDTO(Optional<Hiringc> hiringcOptional) {
        return HiringcDTO.builder()
                .id(hiringcOptional.get().getId())
                .companyHires(hiringcOptional.get().getCompanyHires())
                .incorporationModality(hiringcOptional.get().getIncorporationModality())
                .requestTeam(hiringcOptional.get().getRequestTeam())
                .teamOffer(hiringcOptional.get().getTeamOffer())
                .recruiter(hiringcOptional.get().getRecruiter())
                .recruiterSource(hiringcOptional.get().getRecruiterSource())
                .marketStall(hiringcOptional.get().getMarketStall())
                .ambit(hiringcOptional.get().getAmbit())
                .agency(hiringcOptional.get().getAgency())
                .client(hiringcOptional.get().getClient())
                .name(hiringcOptional.get().getName())
                .incorporationDate(hiringcOptional.get().getIncorporationDate())
                .exceptions(hiringcOptional.get().getExceptions())
                .indefiniteContract(hiringcOptional.get().getIndefiniteContract())
                .category(hiringcOptional.get().getCategory())
                .offerValidation(hiringcOptional.get().getOfferValidation())
                .offer1(hiringcOptional.get().getOffer1())
                .counterOffer2(hiringcOptional.get().getCounterOffer2())
                .variable(hiringcOptional.get().getVariable())
                .offerStatus(hiringcOptional.get().getOfferStatus())
                .reasonRejectionOffer(hiringcOptional.get().getReasonRejectionOffer())
                .validated(hiringcOptional.get().getValidated())
                .employeeWeb(hiringcOptional.get().getEmployeeWeb())
                .observations(hiringcOptional.get().getObservations())
                .resourceProfitability(hiringcOptional.get().getResourceProfitability())
                .directSelection(hiringcOptional.get().getDirectSelection())
                .outSourcing(hiringcOptional.get().getOutSourcing())
                .active(hiringcOptional.get().getActive())
                .build();
    }
}
