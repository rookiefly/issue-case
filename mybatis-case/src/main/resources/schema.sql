SET MODE MySQL; -- for h2 test
drop table if exists `gorder`;
drop table if exists `order`;

create table `gorder`
(
    gorderId   int primary key auto_increment,
    userId     varchar(255),
    amount      double,
    createTime timestamp,
    updateTime timestamp,
    index g_user_id_index (userId)
);

insert into `gorder` (gorderId, userId, amount)
values (1, 'rookiefly@163.com', 234.5);

insert into  `gorder` (gorderId, userId, amount)
values (2, 'rookiefly@126.com', 136);

create table `order`
(
    orderId    int primary key auto_increment,
    gorderId   int,
    userId     varchar(255),
    amount      double,
    createTime timestamp,
    updateTime timestamp,
    index user_id_index (orderId),
    index gorder_id_index (gorderId)
);

insert into `order` (orderId, gorderId, userId, amount)
values (1, 1, 'rookiefly@163.com', 100);

insert into `order` (orderId, gorderId, userId, amount)
values (2, 1, 'rookiefly@163.com', 134.5);

insert into `order` (orderId, gorderId, userId, amount)
values (3, 2, 'rookiefly@126.com', 136);

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
