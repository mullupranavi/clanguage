create database company
use company
create table employis(emp_id int(10),
name char(50),
salary int(9),
department char(30))
insert into employis(emp_id,name,salary,department) values(54879,'VYSHU',23000,'AI')
insert into employis(emp_id,name,salary,department)values(50987,'MANOJ',57000,'Robotics')
insert into employis(emp_id,name,salary,department)values(64869,'VIDYA',45000,'CORE')
select name from employis where salary>30000;