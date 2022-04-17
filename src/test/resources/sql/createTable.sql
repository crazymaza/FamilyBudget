create table FAMILY
(
    id IDENTITY NOT NULL PRIMARY KEY,
    people_id_set_id     int,
    communication_fee_id int,
    communal_payments_id int,
    credits_id           int
);

create table PEOPLE
(
    id IDENTITY NOT NULL PRIMARY KEY,
    name         varchar,
    income       int,
    family_id_id int,
    FOREIGN KEY (family_id_id) REFERENCES FAMILY (id)
);

create table PAYMENTS
(
    id IDENTITY NOT NULL PRIMARY KEY,
    family_id_id int,
    today        int,
    plan         int,
    diff         int,
    FOREIGN KEY (family_id_id) REFERENCES FAMILY (id)
);

create table CREDITS
(
    id IDENTITY NOT NULL PRIMARY KEY,
    family_id_id int,
    today        int,
    plan         int,
    diff         int,
    FOREIGN KEY (family_id_id) REFERENCES FAMILY (id)
);

create table FEE
(
    id IDENTITY NOT NULL PRIMARY KEY,
    family_id_id int,
    today        int,
    plan         int,
    diff         int,
    FOREIGN KEY (family_id_id) REFERENCES FAMILY (id)
);

insert into FAMILY(people_id_set_id, communication_fee_id,
                   communal_payments_id, credits_id)
values (1, 1, 1, 1);
insert into PEOPLE(name, income, family_id_id)
values ('some', 10, 1);
insert into PAYMENTS(family_id_id, today, plan, diff)
values (1, 10, 11, 1);
insert into CREDITS(family_id_id, today, plan, diff)
values (1, 10, 11, 1);
insert into FEE(family_id_id, today, plan, diff)
values (1, 10, 11, 1);
