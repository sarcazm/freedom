CREATE TABLE IF NOT EXISTS person (
    id UUID PRIMARY KEY,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    age INT,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP
    );

CREATE TABLE IF NOT EXISTS book (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    person_id UUID,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP
);

