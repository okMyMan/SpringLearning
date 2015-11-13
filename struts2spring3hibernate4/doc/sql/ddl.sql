


CREATE DATABASE IF NOT EXISTS javassdb default charset utf8 COLLATE utf8_general_ci;

use javassdb;

drop table if exists tbl_user;
create table tbl_user
(
   id                 int not null auto_increment,
   username           varchar(200),
   email              varchar(200),
   password           varchar(200),
   registerDate       timestamp,
   primary key (id),
   unique index(username)
)
charset=utf8 ENGINE=InnoDB;
