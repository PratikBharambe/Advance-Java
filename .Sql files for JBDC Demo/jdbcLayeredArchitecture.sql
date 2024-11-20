
drop database if exists javajdbc;
create database javajdbc;
use javajdbc;

drop table if exists userinfo;

create table userinfo (username varchar(20), password varchar(20), role varchar(10));

insert into userinfo values('admin1', 'admin1', 'admin'),('user1', 'user1', 'user');

drop table if exists product;

create table product(id int auto_increment PRIMARY KEY, name varchar(20), qty int, price DECIMAL, expdate date, cid int);

insert into product(name, qty, price, expdate, cid) values('product1', 10, 100, '2025-10-20', 1),
('product2', 20, 200, '2027-10-30', 2),
('product3', 30, 300, '2023-09-17', 3),
('product4', 40, 400, '2024-08-18', 4),
('product5', 50, 500, '2026-07-12', 5),
('product6', 60, 600, '2025-08-24', 6),
('product7', 70, 700, '2024-05-20', 7),
('product8', 80, 800, '2022-12-02', 8);

drop table if exists person;

create table person (firstname varchar(20), lastname varchar(20), gender varchar(20), degree varchar(20), city varchar(20), skills varchar(40));
