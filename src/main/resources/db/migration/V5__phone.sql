CREATE TABLE phone
(
    id     BIGINT NOT NULL,
    number VARCHAR(255),
    CONSTRAINT pk_phone PRIMARY KEY (id)
);

INSERT INTO phone (id, number)
VALUES (1, '11-11-11');

INSERT INTO phone (id, number)
VALUES (2, '22-2-22');

ALTER TABLE owner
    ADD phone_id BIGINT;

UPDATE owner
SET phone_id = 1
WHERE id = 1;

UPDATE owner
SET phone_id = 2
WHERE id = 2;

ALTER TABLE owner
    ADD CONSTRAINT FK_OWNER_ON_PHONE FOREIGN KEY (phone_id) REFERENCES phone (id);