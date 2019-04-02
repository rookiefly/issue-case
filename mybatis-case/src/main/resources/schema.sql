SET MODE MySQL; -- for h2 test
drop table if exists `gorder`;
drop table if exists `order`;

create table `gorder`
(
    gorder_id   int primary key auto_increment,
    user_id     varchar(255),
    amount      double,
    create_time timestamp,
    update_time timestamp,
    index g_user_id_index (user_id)
);

create table `order`
(
    order_id    int primary key auto_increment,
    gorder_id   varchar(255),
    user_id     varchar(255),
    amount      double,
    create_time timestamp,
    update_time timestamp,
    index user_id_index (user_id),
    index gorder_id_index (gorder_id)
);

drop table if exists `city`;
drop table if exists `hotel`;

create table `city`
(
    id      int primary key auto_increment,
    name    varchar(255),
    state   varchar(255),
    country varchar(255)
);
create table `hotel`
(
    city    int,
    name    varchar(255),
    address varchar(255),
    zip     varchar(255)
);

insert into city (name, state, country)
values ('San Francisco', 'CA', 'US');
insert into hotel(city, name, address, zip)
values (1, 'Conrad Treasury Place', 'William & George Streets', '4001')
