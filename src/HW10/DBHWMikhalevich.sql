CREATE DATABASE DBHW;
COMMENT ON DATABASE "DBHW" IS 'otus_hw_emikhalevich';

CREATE TABLE ANSWERS
(
    uid         INTEGER                     NOT NULL UNIQUE,
    text        VARCHAR(4000)               NOT NULL,
    result      INTEGER                     NOT NULL,
    PRIMARY KEY (uid)
);

ALTER TABLE IF EXISTS ANSWERS
    ALTER COLUMN uid ADD GENERATED BY DEFAULT AS IDENTITY ( CYCLE INCREMENT 1 START 1 );

INSERT INTO ANSWERS(text, result)
VALUES
    ( '1. Тиват", "2. Белгород ", "3. Вране", "4. Белград', 4),
    ( '1. Φ", "2. Δ", "3. Й", "4. \u03A1', 3),
    ( '1. 0,67", "2. 273,15", "3. 9,81", "4. 1,618', 3),
    ( '1. Кандела", "2. Кельвин", "3. Моль", "4. Люкс', 1);

CREATE TABLE QUESTIONS
(
    uid         INTEGER             NOT NULL UNIQUE,
    text        VARCHAR(4000)       NOT NULL UNIQUE,
    answers     INTEGER             REFERENCES ANSWERS (uid),
    PRIMARY KEY (uid)
);

ALTER TABLE IF EXISTS QUESTIONS
    ALTER COLUMN uid ADD GENERATED BY DEFAULT AS IDENTITY ( CYCLE INCREMENT 10 START 10 );


INSERT INTO QUESTIONS(text, answers)
VALUES
    ('Вопрос 1. Назовите столицу Сербии? Указать номер варианта ответа', 1),
    ('Вопрос 2. Что из перечисленного не является буквой греческого алфавита?', 2),
    ('Вопрос 3. Значение физической постоянной ускорения свободного падения (нормальное) в м/с^2?', 3),
    ('Вопрос 4. Что из перечисленного является единицей измерения силы света (СИ)?' , 4);
