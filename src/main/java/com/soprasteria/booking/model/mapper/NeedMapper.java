package com.soprasteria.booking.model.mapper;

import com.soprasteria.booking.model.dto.NeedDTO;
import com.soprasteria.booking.model.entity.Need;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NeedMapper {
    public static List<NeedDTO> mapNeedListToNeedDTO(List<Need> needList) {
        return needList.stream().map(NeedMapper::mapNeedToNeedDTO).collect(Collectors.toList());
    }

    public static NeedDTO mapNeedToNeedDTO(Need need){
        return NeedDTO.builder()
                .id(need.getId())
                .name(need.getName())
                .idOffer(need.getIdOffer())
                .year(need.getYear())
                .creationWeek(need.getCreationWeek())
                .code(need.getCode())
                .month(need.getMonth())
                .idSeq(need.getIdSeq())
                .city(need.getCity())
                .position(need.getPosition())
                .state(need.getState())
                .recruiter(need.getRecruiter())
                .openingDate(need.getOpeningDate())
                .pipelDays(need.getPipelDays())
                .agency(need.getAgency())
                .client(need.getClient())
                .hiringManage(need.getHiringManage())
                .profile(need.getProfile())
                .technology(need.getTechnology())
                .subtechnology(need.getSubtechnology())
                .vacancies(need.getVacancies())
                .priority(need.getPriority())
                .pendingAccept(need.getPendingAccept())
                .closingDate(need.getClosingDate())
                .openDays(need.getOpenDays())
                .closingReason(need.getClosingReason())
                .active(need.getActive())
                .hiring(need.getHiring())
                .child(need.getChild())
                .build();
    }

    public static NeedDTO mapNeedOptionalToNeedDTO(Optional<Need> need) {
        return NeedDTO.builder()
                .id(need.get().getId())
                .name(need.get().getName())
                .idOffer(need.get().getIdOffer())
                .year(need.get().getYear())
                .creationWeek(need.get().getCreationWeek())
                .code(need.get().getCode())
                .month(need.get().getMonth())
                .idSeq(need.get().getIdSeq())
                .city(need.get().getCity())
                .position(need.get().getPosition())
                .state(need.get().getState())
                .recruiter(need.get().getRecruiter())
                .openingDate(need.get().getOpeningDate())
                .pipelDays(need.get().getPipelDays())
                .agency(need.get().getAgency())
                .client(need.get().getClient())
                .hiringManage(need.get().getHiringManage())
                .profile(need.get().getProfile())
                .technology(need.get().getTechnology())
                .subtechnology(need.get().getSubtechnology())
                .vacancies(need.get().getVacancies())
                .priority(need.get().getPriority())
                .pendingAccept(need.get().getPendingAccept())
                .closingDate(need.get().getClosingDate())
                .openDays(need.get().getOpenDays())
                .hiring(need.get().getHiring())
                .active(need.get().getActive())
                .child(need.get().getChild())
                .build();
    }
}

/*
*


    private String recruiter;
    private Timestamp openingDate;
    private String pipelDays;
    private String agency;
    private String client;
    private String hiringManage;
    private String profile;
    private String technology;
    private Integer vacancies;
    private String priority;
    private String pendingAccept;
    private Timestamp closingDate;
    private Integer openDays;
    private String closingReason;
    private Boolean active;
    private List<Hiring> hiring;
    private List<Child> child;
*
*
*
*
* */