--liquibase formatted sql

--changeset silentrobi:003

alter table branch add column tel_no varchar(255);
--rollback alter table branch drop column tel_no;