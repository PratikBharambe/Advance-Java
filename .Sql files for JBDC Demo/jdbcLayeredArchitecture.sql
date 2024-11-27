
drop database if exists javajdbc;
create database javajdbc;
use javajdbc;


drop table if exists userinfo;

create table userinfo (username varchar(20), password varchar(20), role varchar(10));

insert into userinfo values('admin1', 'admin1', 'admin'),('user1', 'user1', 'user');


drop table if exists product;

create table product(id int PRIMARY KEY, name varchar(20), qty int, price DECIMAL, expdate date, cid int);

insert into product values(1, 'Lays', 10, 20, '2025-10-20', 1),
(2, 'parle', 20, 5, '2027-10-30', 2),
(3, 'thumbs up', 30, 25, '2023-09-17', 3),
(4, 'dairy milk', 40, 100, '2024-08-18', 4),
(5, 'Pringles', 50, 120, '2026-07-12', 1),
(6, 'Good day', 60, 20, '2025-08-24', 2),
(7, 'coco cola', 70, 25, '2024-05-20', 3),
(8, 'amul', 80, 100, '2022-12-02', 4);


drop table if exists catagory;

create table catagory(id int, cname varchar(30), cdesc varchar(50));

insert into catagory values(1, 'chips', 'crunchy munchy'),
(2, 'biscuit', 'Salty and sweet'),
(3, 'cold drinks', 'Thanda thanda cool cool'),
(4, 'chocalte', 'sweety');

drop table if exists person;

create table person (firstname varchar(20), lastname varchar(20), gender varchar(20), degree varchar(20), city varchar(20), skills varchar(40));


drop table if exists user;

create table user (id int primary key, username varchar(20), password varchar(20), role varchar(10));

insert into user values (1, "pratikbharambe", "welcome", "admin"),
(2, "lalitkamble", "welcome", "user"),
(3, "shreyaspatil", "welcome", "user"),
(4, "tejaspatil", "welcome", "user");


drop table if exists accounts;

create table accounts (id int primary key, name varchar(50), email varchar(50), balance int);

insert into accounts values (1, "Pratik Bharambe", "pratikbharambe@gmail.com", 125000),
(2, "Lalit Kamble", "lalitkamble@gmail.com", 105000),
(3, "Shreyas Patil", "Shreyaspatil@gmail.com", 50000),
(4, "Tejas Patil", "tejaspatil@gmail.com", 20000);