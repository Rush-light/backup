drop database if exists testdb;
create database testdb;
use testdb;
create table test_table(
user_id int,
user_name varchar(255),
password varchar(255)
);

<<<<<<< HEAD
insert into test_table values(1,"taro","123");
insert into test_table values(2,"jiro","456");
insert into test_table values(3,"hanako","789");
=======
insert into test_table values (1,"taro","123");
insert into test_table values (2"jiro","456");
insert into test_table values (3,"hanako","789");
>>>>>>> 4e0770c925b8cd9ec72db1561eb44a075847c9a8
