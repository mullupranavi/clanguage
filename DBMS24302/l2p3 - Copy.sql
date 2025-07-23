create database uni
use uni
create table students(stu_id int(8),
name char(50),
marks int(3),
grade char(1)
)
insert into students(stu_id,name,marks,grade) values (1953520,'Pranavi',93,2)
insert into students(stu_id,name,marks,grade) values(848744,'Reshmika',96,1)
insert into students(stu_id,name,marks,grade) values(24120,'Revathi',36,6)
select * from students
select name from students where marks>80
