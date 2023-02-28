----- DataBase Creation ------

create database rewardsdb;



-------- table creation ------

drop table transaction;

drop table customer;

create table customer(customer_id int, customer_name varchar(50));

create table transaction(id int, purchase_desc varchar(50),total_Amt double, trans_date date,customer_id int);

 
 
 ------ Insertion Data -----
 
delete from transaction where id in (1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1011);

delete from customer where customer_id in (1000,1001,1002); 
 
 
 
insert into customer(customer_id, customer_name) values (1000, 'abc');
insert into customer(customer_id, customer_name) values (1001, 'xyz');
insert into customer(customer_id, customer_name) values (1002, 'mnr');

insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1001, 'PurchaseA', 100, '2023-02-27 10:10:10', 1000);
insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1002, 'PurchaseB', 51, '2023-02-27 10:10:10', 1000);
insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1003, 'PurchaseC', 111, '2023-02-27 10:10:10', 1000);
insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1004, 'PurchaseD', 165.50, '2023-02-27 10:10:10', 1000);
insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1005, 'PurchaseE', 60.50, '2023-02-27 10:10:10', 1000);
insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1006, 'PurchaseF', 310.50, '2023-02-27 10:10:10', 1000);
insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1007, 'PurchaseG', 55.80, '2023-02-27 10:10:10', 1000);

insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1008, 'PurchaseI', 15.80, '2023-02-27 10:10:10', 1002);
insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1009, 'PurchaseJ', 70.50, '2023-02-27 10:10:10', 1002);
insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1010, 'PurchaseK', 118.90, '2023-02-27 10:10:10', 1002);

insert into transaction(id, purchase_desc, total_amt, trans_date, customer_id) values (1011, 'PurchaseL', 300, '2023-02-27 10:10:10', 1001);