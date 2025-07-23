create database schhol
use schhol
create table details(name char(10), rollno int(3))
describe details
insert into details(name , rollno) values('Ammu',1)
select * from details
alter table details add class int(2)
update details set class = 6 where name = 'Ammu'