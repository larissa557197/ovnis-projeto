-- --  Criar enum ShapeEnum
-- CREATE TYPE shape_enum AS ENUM ('Disc', 'Sphere', 'Triangle', 'Other');
-- Criar tabela register_ovni
CREATE TABLE register_ovni (
   id SERIAL PRIMARY KEY,
   location VARCHAR(255) NOT NULL,
   local_date_time TIMESTAMP NOT NULL,
   shape_enum VARCHAR(255) NOT NULL,
   quantity INT NOT NULL
);


