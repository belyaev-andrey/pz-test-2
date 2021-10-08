CREATE TABLE address
(
    id           BIGINT NOT NULL,
    address_line VARCHAR(255),
    owner_id     BIGINT,
    CONSTRAINT pk_address PRIMARY KEY (id)
);

ALTER TABLE address
    ADD CONSTRAINT FK_ADDRESS_ON_OWNER FOREIGN KEY (owner_id) REFERENCES owner (id);

INSERT INTO address (id, address_line, owner_id)
VALUES (1, 'Elm Street', 1);

INSERT INTO address (id, address_line, owner_id)
VALUES (2, 'Oak Street', 2);