create database workplace
use workplace
create table workers( name char(8),
emp_id int(6),
salary int(7),
designation char(10));
describe workers
insert into workers(name,emp_id,salary,designation) values ('veda',195345,65000,'regular')
select * from workers 
insert into workers(name,emp_id,salary,designation) values ('niteesh',848744,120000,'incharge')
insert into workers(name,emp_id,salary,designation) values ('abbas',345066,45000,'Fresher')
insert into workers(name,emp_id,salary,designation) values ('preksha',097966,23000,'Fresher')
insert into workers(name,emp_id,salary,designation) values ('suhana',356465,30000,'regular')
insert into workers(name,emp_id,salary,designation) values ('varun',694388,100000,'incharge')
select count(name)  as totalnumberofworkers from workers 
select sum(salary) as totalsalaryofnumbers from workers
select avg(salary) as averagesalary from workers
select max(salary) as highestsalary , min(salary) as lowestsalary from workers
select count(department) as numberofdepartments from workers
alter table workers add department char(20)
update workers set department='FRONTEND' where name='abbas'
update workers set department ='BACKEND' where name='veda'
update workers set department ='CODING BLOCK'where name ='preksha'
update workers set department ='CODING BLOCK'where name ='varun'
update workers set department ='HR'where name ='niteesh'
update workers set department ='Database'where name ='suhana'
select department,sum(salary) as totalsalarybydepartment from workers group by department
select department,count(emp_id) as totalmemebrsbydepartment from workers group by department
select department,max(salary)as totalsalary from workers group by department
select department,avg(salary > 50000) as avg50000salary from workers group by department
alter table workers add joining int(4)
