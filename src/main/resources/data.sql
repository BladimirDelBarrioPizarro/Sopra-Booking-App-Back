drop table need_child if exists ;
drop table hiring_need if exists;
drop table hiringc_child if exists;
drop table hiringc if exists;

drop table hiring if exists;
drop table child if exists;
drop table need if exists;



CREATE TABLE public.hiring (
        id SERIAL primary key NOT NULL,
        name character varying(100) NOT NULL,
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
        name character varying(100) NOT NULL,
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

INSERT INTO hiring (name,active) VALUES ('Java Devops',true);
INSERT INTO hiring (name,active) VALUES ('React Devops',true);
INSERT INTO hiring (name,active) VALUES ('QA Devops',true);

INSERT INTO hiring (name,active) VALUES ('Java Devops',true);
INSERT INTO hiring (name,active) VALUES ('Angular Devops',true);
INSERT INTO hiring (name,active) VALUES ('Angular Devops',true);




INSERT INTO need (name,active) VALUES ('Pelayo',true);
INSERT INTO need (name,active) VALUES ('ING',true);



INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,1);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,2);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,3);

INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,4);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,5);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,6);



INSERT INTO hiringc (name,active) VALUES ('Vue Devops',true);
INSERT INTO hiringc (name,active) VALUES ('Pentester Devops',true);
INSERT INTO hiringc (name,active) VALUES ('Product Owner Devops',true);

INSERT INTO child (name,active) VALUES ('Pelayo',true);
INSERT INTO child (name,active) VALUES ('ING',true);



INSERT INTO hiringc_child (child_id,hiringc_id) VALUES (1,1);
INSERT INTO hiringc_child (child_id,hiringc_id) VALUES (1,2);
INSERT INTO hiringc_child (child_id,hiringc_id) VALUES (2,3);



INSERT INTO need_child (need_id,child_id) VALUES (1,1);
INSERT INTO need_child (need_id,child_id) VALUES (2,2);