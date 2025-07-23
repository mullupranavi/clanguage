create database student
use student
create table belongs(name char(8),
roll_no int(3),
address char(100))
insert into belongs(name , roll_no , address) values ('Arnav',98,'Near temple ; Punjagutta; Hyd')
select * from belongs
insert into belongs(name,roll_no,address)values('Gauri',22,'Near prism school; Sris colony; Nandyala')
insert into belongs(name,roll_no,address)values('Niteesh',23,'Near IOCL; IOCL colony; Vaddodara')
insert into belongs(name,roll_no,address)values('Pradeep',25,'Near IAS coaching centre; centere street;Delhi')
select name from belongs
select roll_no from belongs
alter table belongs add age int(3)
update belongs set age=20 where name = 'Gauri'
update belongs set age = 23 where name ='Niteesh'
delete from belongs where name ='Arnav'
update belongs set age = 27 where name = 'Pradeep'
