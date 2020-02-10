drop table hiring_need if exists;
drop table hiring if exists;
drop table need if exists;

CREATE TABLE public.hiring (
        id SERIAL primary key NOT NULL,
        name character varying(100) NOT NULL,
        active BOOLEAN
);

INSERT INTO hiring (name,active) VALUES ('Java Devops',true);
INSERT INTO hiring (name,active) VALUES ('React Devops',true);
INSERT INTO hiring (name,active) VALUES ('QA Devops',true);

INSERT INTO hiring (name,active) VALUES ('Java Devops',true);
INSERT INTO hiring (name,active) VALUES ('Angular Devops',true);
INSERT INTO hiring (name,active) VALUES ('Angular Devops',true);

CREATE TABLE public.need (
        id SERIAL primary key NOT NULL,
        name character varying(100) NOT NULL,
        active BOOLEAN
);

INSERT INTO need (name,active) VALUES ('Pelayo',true);
INSERT INTO need (name,active) VALUES ('ING',true);

CREATE TABLE public.hiring_need(
    need_id integer NOT NULL,
    hiring_id integer NOT NULL
);

INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,1);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,2);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (1,3);

INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,4);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,5);
INSERT INTO hiring_need(need_id,hiring_id) VALUES (2,6);