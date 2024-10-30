CREATE TYPE form_of_education as ENUM(
    'DISTANCE_EDUCATION',
    'FULL_TIME_EDUCATION',
    'EVENING_CLASSES'
);

CREATE TYPE semester as ENUM(
    'FIRST',
    'SECOND',
    'THIRD',
    'SEVENTH',
    'EIGHTH'
);

CREATE TYPE color as ENUM(
    'BLUE',
    'WHITE',
    'BROWN'
);

CREATE TYPE country as ENUM(
    'USA',
    'SPAIN',
    'JAPAN'
);

CREATE TABLE IF NOT EXISTS coordinates(
    id SERIAL PRIMARY KEY,
    x INT CHECK ( x > -123 ) NOT NULL,
    y REAL NOT NULL
);

CREATE TABLE IF NOT EXISTS location(
    id SERIAL PRIMARY KEY,
    x INT,
    y INT,
    z REAL NOT NULL
);

CREATE TABLE IF NOT EXISTS person(
    id SERIAL PRIMARY KEY,
    name VARCHAR(40) NOT NULL CHECK ( trim(name) <> '' ),
    eye_color color,
    hair_color color,
    location INT REFERENCES location(id) NOT NULL,
    height INT CHECK ( height > 0 ),
    nationality country
);

CREATE TABLE IF NOT EXISTS study_group (
    id SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL CHECK ( trim(name) <> '' ),
    creation_date TIMESTAMP NOT NULL DEFAULT NOW(),
    coordinates INT REFERENCES coordinates(id),
    form_of_education form_of_education,
    students_count INT CHECK ( students_count > 0 ),
    transferred_students INT CHECK ( transferred_students > 0 ),
    expelled_students INT CHECK ( expelled_students > 0 ),
    should_be_expelled INT CHECK ( should_be_expelled > 0 ),
    average_mark DECIMAL(3, 2) CHECK ( average_mark > 0 ),
    semester semester,
    group_admin INT REFERENCES person(id) NOT NULL
);