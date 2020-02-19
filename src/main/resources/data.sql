drop table need_child if exists ;
drop table hiring_need if exists;
drop table hiringc_child if exists;
drop table hiringc if exists;

drop table hiring if exists;
drop table child if exists;
drop table need if exists;



CREATE TABLE public.hiring (
        id SERIAL primary key NOT NULL,
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
        indefinite_contact character varying(100) NOT NULL,
        category character varying(100) NOT NULL,
        offer_validation character varying(100) NOT NULL,
        offer1 integer NOT NULL,
        counter_offer2 integer NOT NULL,
        reason_rejection_offer character varying(100) NOT NULL,
        validated character varying(100) NOT NULL,
        employee_web character varying(100) NOT NULL,
        observations character varying(100) NOT NULL,
        resource_profitability character varying(100) NOT NULL,
        direct_selection character varying(100) NOT NULL,
        out_sourcing character varying(100) NOT NULL,
        active BOOLEAN
);

CREATE TABLE public.need (
        id SERIAL primary key NOT NULL,
        name character varying(100) NOT NULL,
        active BOOLEAN
);

CREATE TABLE public.hiring_need(
    need_id integer NOT NULL,
    hiring_id integer NOT NULL
);

CREATE TABLE public.child (
        id SERIAL primary key NOT NULL,
        name character varying(100) NOT NULL,
        active BOOLEAN
);

CREATE TABLE public.hiringc (
         id SERIAL primary key NOT NULL,
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
        indefinite_contact character varying(100) NOT NULL,
        category character varying(100) NOT NULL,
        offer_validation character varying(100) NOT NULL,
        offer1 integer NOT NULL,
        counter_offer2 integer NOT NULL,
        reason_rejection_offer character varying(100) NOT NULL,
        validated character varying(100) NOT NULL,
        employee_web character varying(100) NOT NULL,
        observations character varying(100) NOT NULL,
        resource_profitability character varying(100) NOT NULL,
        direct_selection character varying(100) NOT NULL,
        out_sourcing character varying(100) NOT NULL,
        active BOOLEAN
);

CREATE TABLE public.hiringc_child(
    child_id integer NOT NULL,
    hiringc_id integer NOT NULL
);

CREATE TABLE public.need_child(
    need_id integer NOT NULL,
    child_id integer NOT NULL
);

/*INSERT INTO hiring (name,active) VALUES ('Java Devops',true);
INSERT INTO hiring (name,active) VALUES ('React Devops',true);
INSERT INTO hiring (name,active) VALUES ('QA Devops',true);

INSERT INTO hiring (name,active) VALUES ('Java Devops',true);
INSERT INTO hiring (name,active) VALUES ('Angular Devops',true);
INSERT INTO hiring (name,active) VALUES ('Angular Devops',true);*/

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);


INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);



INSERT INTO need (name,active) VALUES ('Pelayo',true);
INSERT INTO need (name,active) VALUES ('ING',true);



INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,1);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,2);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,3);

INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,4);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,5);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,6);



/*INSERT INTO hiringc (name,active) VALUES ('Vue Devops',true);
INSERT INTO hiringc (name,active) VALUES ('Pentester Devops',true);
INSERT INTO hiringc (name,active) VALUES ('Product Owner Devops',true);*/


INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);

INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);

INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);

INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);


INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);

INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contact,category,
                    offer_validation,offer1,counter_offer2,reason_rejection_offer,validated,employee_web,observations,
                    resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'','SI','IS SB N1','Validad por TA',18500,20000,
        '','SI','SI','','', '','',true);

INSERT INTO child (name,active) VALUES ('Pelayo',true);
INSERT INTO child (name,active) VALUES ('ING',true);



INSERT INTO hiringc_child (child_id,hiringc_id) VALUES (1,1);
INSERT INTO hiringc_child (child_id,hiringc_id) VALUES (1,2);
INSERT INTO hiringc_child (child_id,hiringc_id) VALUES (2,3);



INSERT INTO need_child (need_id,child_id) VALUES (1,1);
INSERT INTO need_child (need_id,child_id) VALUES (2,2);