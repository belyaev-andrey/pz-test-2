ALTER TABLE pet
    ADD pet_type_id BIGINT;

ALTER TABLE pet
    ADD CONSTRAINT FK_PET_ON_PET_TYPE FOREIGN KEY (pet_type_id) REFERENCES pettype (id);

UPDATE pet
SET pet_type_id = 1 WHERE id = 1;

UPDATE pet
SET pet_type_id = 2 WHERE id = 2;