--liquibase formatted sql

--changeset silentrobi:001
create table branch (
                        id  bigserial not null,
                        location varchar(255),
                        name varchar(255) not null,
                        primary key (id)
);

--rollback drop table branch;

create table branch_product (
                                branch_id int8 not null,
                                product_id int8 not null
);

--rollback drop table branch_product;

create table category (
                          id  bigserial not null,
                          name varchar(255),
                          primary key (id)
);
--rollback drop table category;

create table product (
                         id  bigserial not null,
                         count int4,
                         name varchar(255) not null,
                         category_id int8 not null,
                         primary key (id)
);
--rollback drop table product;
