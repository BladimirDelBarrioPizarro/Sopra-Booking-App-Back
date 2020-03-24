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
);

CREATE TABLE public.need (
        id SERIAL primary key NOT NULL,
        name character varying(100) NOT NULL,
        id_offer character varying(100) NOT NULL,
        year integer NOT NULL,
        creation_week integer NOT NULL,
        code character varying(100) NOT NULL,
        month character varying(100) NOT NULL,
        id_seq character varying(100) NOT NULL,
        city character varying(100) NOT NULL,
        position character varying(100) NOT NULL,
        state character varying(100) NOT NULL,
        recruiter character varying(100) NOT NULL,
        opening_date TIMESTAMP,
        pipel_days integer NOT NULL,
        agency character varying(100) NOT NULL,
        client character varying(100) NOT NULL,
        hiring_manage character varying(100) NOT NULL,
        profile character varying(100) NOT NULL,
        technology character varying(100) NOT NULL,
        subtechnology character varying(100) NOT NULL,
        vacancies integer NOT NULL,
        priority character varying(100) NOT NULL,
        pending_accept character varying(100) NOT NULL,
        closing_date TIMESTAMP,
        open_days integer NOT NULL,
        closing_reason character varying(100) NOT NULL,
        active BOOLEAN
);

CREATE TABLE public.hiring_need(
    need_id integer NOT NULL,
    hiring_id integer NOT NULL
);

CREATE TABLE public.child (
        id SERIAL primary key NOT NULL,
        name character varying(100) NOT NULL,
        id_offer character varying(100) NOT NULL,
        year integer NOT NULL,
        creation_week integer NOT NULL,
        code character varying(100) NOT NULL,
        month character varying(100) NOT NULL,
        id_seq character varying(100) NOT NULL,
        city character varying(100) NOT NULL,
        position character varying(100) NOT NULL,
        state character varying(100) NOT NULL,
        recruiter character varying(100) NOT NULL,
        opening_date TIMESTAMP,
        pipel_days integer NOT NULL,
        agency integer NOT NULL,
        client character varying(100) NOT NULL,
        hiring_manage character varying(100) NOT NULL,
        profile character varying(100) NOT NULL,
        technology character varying(100) NOT NULL,
        subtechnology character varying(100) NOT NULL,
        vacancies integer NOT NULL,
        priority character varying(100) NOT NULL,
        pending_accept character varying(100) NOT NULL,
        closing_date TIMESTAMP,
        open_days integer NOT NULL,
        closing_reason character varying(100) NOT NULL,
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
);

CREATE TABLE public.hiringc_child(
    child_id integer NOT NULL,
    hiringc_id integer NOT NULL
);

CREATE TABLE public.need_child(
    need_id integer NOT NULL,
    child_id integer NOT NULL
);

/* Hiring */

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR JAVA','DESARROLLO',951,'SBS','Bladimir del Barrio Pizarro',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JUNIOR ANGULAR','DESARROLLO',951,'SBS','Roberto del Barrio Pizarro',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR SENIOR JAVA','DESARROLLO',951,'SBS','Maria del Pilar Pizarro',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR REACT JUNIOR','DESARROLLO',951,'SBS','Gregorio del Barrio Perez',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);


INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR REACT SENIOR','DESARROLLO',951,'SBS','Juana Perez Baciero',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);

INSERT INTO hiring (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'QA','DESARROLLO',951,'SBS','Joaquin Perez Baciero',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);





/* Needs */

INSERT INTO need (name,id_offer,year,creation_week,code,month,id_seq,city,position,state,recruiter,opening_date,pipel_days,
                  agency,client,hiring_manage,profile,technology,subtechnology,vacancies,priority,pending_accept,closing_date,
                  open_days,closing_reason,active)
VALUES ('ING','m.1.35',2020,1,'code','Febrero','m.1.35','Madrid','D','A','CSG',CURRENT_TIMESTAMP,11,933,'SOPRA NORUEGA',
       'Jose Diago','BACKEND','JAVA','REACT',1,'ALTA','ACEPTA',CURRENT_TIMESTAMP,1,'ACEPTA',false);

INSERT INTO need (name,id_offer,year,creation_week,code,month,id_seq,city,position,state,recruiter,opening_date,pipel_days,
                  agency,client,hiring_manage,profile,technology,subtechnology,vacancies,priority,pending_accept,closing_date,
                  open_days,closing_reason,active)
VALUES ('PELAYO','m.1.35',2020,1,'code','Febrero','m.1.35','Madrid','D','A','CSG',CURRENT_TIMESTAMP,11,933,'PELAYO MADRID',
       'Jose Diago','BACKEND','JAVA','REACT',1,'ALTA','ACEPTA',CURRENT_TIMESTAMP,1,'ACEPTA',true);



INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,1);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,2);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,3);

INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,4);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,5);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,6);



/* Hiringc */

INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JAVA SENIOR','DESARROLLO',951,'SBS','Ana Gomez Cuñado',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);

INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'QA','DESARROLLO',951,'SBS','Anabel Segura Perez',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);

INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR JAVA JUNIOR','DESARROLLO',951,'SBS','Alfonso Estepa',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);

INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR REACT JUNIOR','DESARROLLO',951,'SBS','Ian Curtis',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);



INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROJECT MANAGER','DESARROLLO',951,'SBS','Peter Hook',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);

INSERT INTO hiringc (registration_date,company_hires,incorporation_modality,request_team,team_offer,recruiter,recruiter_source,
                    market_stall,ambit,agency,client,name,incorporation_date,exceptions,indefinite_contract,category,
                    offer_validation,offer1,counter_offer2,variable,offer_status,reason_rejection_offer,validated,employee_web,observations,
                    provider_name,resource_profitability,direct_selection,out_sourcing,active)
VALUES(CURRENT_TIMESTAMP,'Sopra Steria España','Contrato','MAD','Filial MAD',
       'MHR','INFOJOBS:INSCRITO', 'PROGRAMADOR ANGULAR SENIOR','DESARROLLO',951,'SBS','Rodrigo Pizarro Escabia',
       CURRENT_TIMESTAMP,'EXCEPCIÓN: No cumple TITULO','SI','IS SB N1','Validad por TA',18500,20000,'SI','Aceptada',
        'Rechaza Oferta','SI','SI','Observations','Proveedor','12', 1000,1500,true);

/* Child */

INSERT INTO child (name,id_offer,year,creation_week,code,month,id_seq,city,position,state,recruiter,opening_date,pipel_days,
                  agency,client,hiring_manage,profile,technology,subtechnology,vacancies,priority,pending_accept,closing_date,
                  open_days,closing_reason,active)
VALUES ('ING','m.1.35',2020,1,'code','Febrero','m.1.35','Madrid','D','A','CSG',CURRENT_TIMESTAMP,11,933,'SOPRA NORUEGA',
       'Jose Diago','BACKEND','JAVA','REACT',1,'ALTA','ACEPTA',CURRENT_TIMESTAMP,1,'ACEPTA',true);

INSERT INTO child (name,id_offer,year,creation_week,code,month,id_seq,city,position,state,recruiter,opening_date,pipel_days,
                  agency,client,hiring_manage,profile,technology,subtechnology,vacancies,priority,pending_accept,closing_date,
                  open_days,closing_reason,active)
VALUES ('PELAYO','m.1.35',2020,1,'code','Febrero','m.1.35','Madrid','D','A','CSG',CURRENT_TIMESTAMP,11,933,'PELAYO MADRID',
       'Jose Diago','BACKEND','JAVA','REACT',1,'ALTA','ACEPTA',CURRENT_TIMESTAMP,1,'ACEPTA',true);



INSERT INTO hiringc_child (child_id,hiringc_id) VALUES (1,1);
INSERT INTO hiringc_child (child_id,hiringc_id) VALUES (1,2);
INSERT INTO hiringc_child (child_id,hiringc_id) VALUES (2,3);



INSERT INTO need_child (need_id,child_id) VALUES (1,1);
INSERT INTO need_child (need_id,child_id) VALUES (2,2);