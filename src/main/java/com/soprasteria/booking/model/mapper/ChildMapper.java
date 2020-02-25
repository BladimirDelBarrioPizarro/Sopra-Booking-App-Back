package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.ChildDTO;
import com.soprasteria.booking.model.entity.Child;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChildMapper {

    public static List<ChildDTO> mapChildListToChildDTOList(List<Child> childList) {
        return childList.stream().map(ChildMapper::mapChildToChildDTO).collect(Collectors.toList());
    }

    public static ChildDTO mapChildToChildDTO(Child child) {
        return  ChildDTO.builder()
                .id(child.getId())
                .name(child.getName())
                .idOffer(child.getIdOffer())
                .year(child.getYear())
                .creationWeek(child.getCreationWeek())
                .code(child.getCode())
                .month(child.getMonth())
                .idSeq(child.getIdSeq())
                .city(child.getCity())
                .position(child.getPosition())
                .state(child.getState())
                .recruiter(child.getRecruiter())
                .openingDate(child.getOpeningDate())
                .pipelDays(child.getPipelDays())
                .agency(child.getAgency())
                .client(child.getClient())
                .hiringManage(child.getHiringManage())
                .profile(child.getProfile())
                .technology(child.getTechnology())
                .subtechnology(child.getSubtechnology())
                .vacancies(child.getVacancies())
                .priority(child.getPriority())
                .pendingAccept(child.getPendingAccept())
                .closingDate(child.getClosingDate())
                .openDays(child.getOpenDays())
                .closingReason(child.getClosingReason())
                .hiringc(child.getHiringc())
                .active(child.getActive())
                .build();
    }

    public static ChildDTO mapOptionalChildToChildDTO(Optional<Child> optionalChild) {
        return ChildDTO.builder()
                .id(optionalChild.get().getId())
                .name(optionalChild.get().getName())
                .idOffer(optionalChild.get().getIdOffer())
                .year(optionalChild.get().getYear())
                .creationWeek(optionalChild.get().getCreationWeek())
                .code(optionalChild.get().getCode())
                .month(optionalChild.get().getMonth())
                .idSeq(optionalChild.get().getIdSeq())
                .city(optionalChild.get().getCity())
                .position(optionalChild.get().getPosition())
                .state(optionalChild.get().getState())
                .recruiter(optionalChild.get().getRecruiter())
                .openingDate(optionalChild.get().getOpeningDate())
                .pipelDays(optionalChild.get().getPipelDays())
                .agency(optionalChild.get().getAgency())
                .client(optionalChild.get().getClient())
                .hiringManage(optionalChild.get().getHiringManage())
                .profile(optionalChild.get().getProfile())
                .technology(optionalChild.get().getTechnology())
                .subtechnology(optionalChild.get().getSubtechnology())
                .vacancies(optionalChild.get().getVacancies())
                .priority(optionalChild.get().getPriority())
                .pendingAccept(optionalChild.get().getPendingAccept())
                .closingDate(optionalChild.get().getClosingDate())
                .openDays(optionalChild.get().getOpenDays())
                .closingReason(optionalChild.get().getClosingReason())
                .hiringc(optionalChild.get().getHiringc())
                .active(optionalChild.get().getActive())
                .build();
    }
}
