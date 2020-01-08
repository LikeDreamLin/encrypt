create database encrypt CHARACTER SET 'utf8'COLLATE 'utf8_general_ci';

drop table if exists user_info;
create table user_info(
id varchar(20) primary key,
user_name varchar(20),
sex varchar(1),
papers_no varchar(50),
encrypt_papers_no varchar(200),
phone_no varchar(20),
address varchar(200)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;