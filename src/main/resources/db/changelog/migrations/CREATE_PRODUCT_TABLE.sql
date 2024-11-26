create table PRODUCT(
    id uuid not null,
    title varchar(255) not null,
    price int not null,
    description varchar(255)not null,
    primary key(id)
);