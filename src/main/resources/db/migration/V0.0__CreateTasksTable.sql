DROP TABLE IF EXISTS tasks;
CREATE TABLE tasks(
    id SERIAL primary key,
    title VARCHAR(100) NOT NULL,
    date VARCHAR(50) Not NULL,
    description TEXT
);