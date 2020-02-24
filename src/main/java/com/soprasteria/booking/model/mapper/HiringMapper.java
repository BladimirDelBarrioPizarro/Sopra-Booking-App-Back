package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.HiringDTO;
import com.soprasteria.booking.model.entity.Hiring;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HiringMapper {
    public static List<HiringDTO> mapHiringListToHiringListDTO(List<Hiring> hiringList) {
        return hiringList.stream().map(HiringMapper::mapHiringToHiringDTO).collect(Collectors.toList());
    }

    public static HiringDTO mapHiringToHiringDTO(Hiring hiring) {
        return HiringDTO.builder()
                .id(hiring.getId())
                .companyHires(hiring.getCompanyHires())
                .incorporationModality(hiring.getIncorporationModality())
                .requestTeam(hiring.getRequestTeam())
                .teamOffer(hiring.getTeamOffer())
                .recruiter(hiring.getRecruiter())
                .recruiterSource(hiring.getRecruiterSource())
                .marketStall(hiring.getMarketStall())
                .ambit(hiring.getAmbit())
                .agency(hiring.getAgency())
                .client(hiring.getClient())
                .name(hiring.getName())
                .incorporationDate(hiring.getIncorporationDate())
                .exceptions(hiring.getExceptions())
                .indefiniteContract(hiring.getIndefiniteContract())
                .category(hiring.getCategory())
                .offerValidation(hiring.getOfferValidation())
                .offer1(hiring.getOffer1())
                .counterOffer2(hiring.getCounterOffer2())
                .variable(hiring.getVariable())
                .offerStatus(hiring.getOfferStatus())
                .reasonRejectionOffer(hiring.getReasonRejectionOffer())
                .validated(hiring.getValidated())
                .employeeWeb(hiring.getEmployeeWeb())
                .observations(hiring.getObservations())
                .resourceProfitability(hiring.getResourceProfitability())
                .directSelection(hiring.getDirectSelection())
                .outSourcing(hiring.getOutSourcing())
                .active(hiring.getActive())
                .build();
    }

    public static HiringDTO mapHiringOptionalToHiringDTO(Optional<Hiring> hiringOptional) {
        return HiringDTO.builder()
                .id(hiringOptional.get().getId())
                .companyHires(hiringOptional.get().getCompanyHires())
                .incorporationModality(hiringOptional.get().getIncorporationModality())
                .requestTeam(hiringOptional.get().getRequestTeam())
                .teamOffer(hiringOptional.get().getTeamOffer())
                .recruiter(hiringOptional.get().getRecruiter())
                .recruiterSource(hiringOptional.get().getRecruiterSource())
                .marketStall(hiringOptional.get().getMarketStall())
                .ambit(hiringOptional.get().getAmbit())
                .agency(hiringOptional.get().getAgency())
                .client(hiringOptional.get().getClient())
                .name(hiringOptional.get().getName())
                .incorporationDate(hiringOptional.get().getIncorporationDate())
                .exceptions(hiringOptional.get().getExceptions())
                .indefiniteContract(hiringOptional.get().getIndefiniteContract())
                .category(hiringOptional.get().getCategory())
                .offerValidation(hiringOptional.get().getOfferValidation())
                .offer1(hiringOptional.get().getOffer1())
                .counterOffer2(hiringOptional.get().getCounterOffer2())
                .reasonRejectionOffer(hiringOptional.get().getReasonRejectionOffer())
                .validated(hiringOptional.get().getValidated())
                .employeeWeb(hiringOptional.get().getEmployeeWeb())
                .observations(hiringOptional.get().getObservations())
                .resourceProfitability(hiringOptional.get().getResourceProfitability())
                .directSelection(hiringOptional.get().getDirectSelection())
                .outSourcing(hiringOptional.get().getOutSourcing())
                .active(hiringOptional.get().getActive())
                .build();
    }
}
