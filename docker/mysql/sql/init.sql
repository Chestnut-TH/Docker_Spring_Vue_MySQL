CREATE DATABASE IF NOT EXISTS testdb;

CREATE TABLE IF NOT EXISTS user(
    id INTEGER not null,
    name varchar(20) not null,
    PRIMARY KEY (id, name)
);

INSERT INTO user(id, name)VALUES(1, 'Tarou');