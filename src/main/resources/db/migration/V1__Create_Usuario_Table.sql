CREATE TABLE usuario (
                         id SERIAL PRIMARY KEY,
                         nombre VARCHAR(100) NOT NULL,
                         correo VARCHAR(100) NOT NULL UNIQUE
);
