create database event_db
use event_db

create table tbl_signup(
id int primary key not null,
name varchar(15) not null,
user_name varchar(15)unique not null,
password varchar(15) not null, 
conform_password varchar(15) not null,
age varchar(5) not null,

)

create table tbl_event
(
Event_ID int primary key,
user_name varchar(15)not null,
Event_Title varchar (100) not null,
Event_Date date not null,
Event_Time time(0) not null, 
Event_Color varchar (20) not null,
Event_Description varchar (200) not null

FOREIGN KEY (user_name) REFERENCES tbl_signup(user_name)
)


select * from tbl_signup
select * from tbl_event

drop table tbl_signup
drop table tbl_event

drop database event_db