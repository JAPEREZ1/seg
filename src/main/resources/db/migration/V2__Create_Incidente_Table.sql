CREATE TABLE incidentes (
                            id SERIAL PRIMARY KEY,
                            descripcion VARCHAR(255) NOT NULL,
                            fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            usuario_id INT NOT NULL,
                            FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE
);
