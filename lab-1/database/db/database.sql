CREATE DATABASE app ENCODING 'UTF8';

\c app;

CREATE TABLE comments (
  id SERIAL PRIMARY KEY,
  name VARCHAR(40) NULL,
  email VARCHAR(40) NULL,
  comment VARCHAR(200) NULL
);