--liquibase formatted sql

--changeset i.i.f:1
CREATE TABLE socks
(
    id              serial,
    color           text,
    cotton_part     INTEGER,
    quantity        INTEGER,
    CONSTRAINT pk_socks PRIMARY KEY (id)
);

INSERT INTO socks ("id", "color", "cotton_part", "quantity")
VALUES (1, E'BLACK', 50, 200),
       (2, E'BLACK', 80, 300),
       (3, E'BROWN', 75, 100),
       (4, E'GREY', 75, 120),
       (5, E'WHITE', 50, 150),
       (6, E'WHITE', 80, 130);