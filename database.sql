CREATE DATABASE apotek

USE apotek

CREATE TYPE role_type AS ENUM ('ADMIN', 'USER');

CREATE TABLE users 
(
    id SERIAL PRIMARY KEY,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    phone INT,
    address VARCHAR(225),
    role ROLE_TYPE,
    token VARCHAR(100),
    token_expired_at BIGINT,
    UNIQUE (token)
);

insert into users(id, email, name, password, role)
    values ('1', 'admin@gmail.com', 'admin', 'admin', 'admin');