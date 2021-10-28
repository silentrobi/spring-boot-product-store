--liquibase formatted sql

--changeset silentrobi:002

alter table branch_product
    add constraint PK_branch_product
        primary key (branch_id, product_id);
--rollback alter table branch_product drop constraint PK_branch_product;

alter table branch_product
    add constraint FK_branch_product_product
        foreign key (product_id)
            references product
            on delete cascade
            on update cascade;
--rollback alter table branch_product drop constraint FK_branch_product_product;

alter table branch_product
    add constraint FK_branch_product_branch
        foreign key (branch_id)
            references branch
            on delete cascade
            on update cascade;
--rollback alter table branch_product drop constraint FK_branch_product_branch;

alter table product
    add constraint FK_product_category
        foreign key (category_id)
            references category
            on delete cascade
            on update cascade;
--rollback alter table product drop constraint FK_product_category;

