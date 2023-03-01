# rewards-api

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


--- To run the application ----

Change the DB password in application.properties file

API for Customer with id

GET URL

http://localhost:8056/customers/1002

{
    "customerId": 1002,
    "customerName": "mnr",
    "transactions": [
        {
            "points": 20,
            "id": 1201,
            "totalAmount": 70.5,
            "purchaseDescription": "PurchaseJ",
            "transactionDate": "2023-02-27T06:00:00.000+00:00"
        },
        {
            "points": 0,
            "id": 1200,
            "totalAmount": 15.8,
            "purchaseDescription": "PurchaseI",
            "transactionDate": "2023-02-27T06:00:00.000+00:00"
        },
        {
            "points": 86,
            "id": 1202,
            "totalAmount": 118.9,
            "purchaseDescription": "PurchaseK",
            "transactionDate": "2023-02-27T06:00:00.000+00:00"
        }
    ],
    "rewardPoints": 106,
    "totalPurchases": 205.2
}

API for customer 

GET URL 

http://localhost:8056/customers

[
    {
        "customerId": 1000,
        "customerName": "abc",
        "transactions": [
            {
                "points": 470,
                "id": 1006,
                "totalAmount": 310.5,
                "purchaseDescription": "PurchaseF",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            },
            {
                "points": 180,
                "id": 1004,
                "totalAmount": 165.5,
                "purchaseDescription": "PurchaseD",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            },
            {
                "points": 5,
                "id": 1009,
                "totalAmount": 55.8,
                "purchaseDescription": "PurchaseG",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            },
            {
                "points": 50,
                "id": 1001,
                "totalAmount": 100.0,
                "purchaseDescription": "PurchaseA",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            },
            {
                "points": 72,
                "id": 1003,
                "totalAmount": 111.0,
                "purchaseDescription": "PurchaseC",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            },
            {
                "points": 1,
                "id": 1002,
                "totalAmount": 51.0,
                "purchaseDescription": "PurchaseB",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            },
            {
                "points": 10,
                "id": 1005,
                "totalAmount": 60.5,
                "purchaseDescription": "PurchaseE",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            }
        ],
        "rewardPoints": 788,
        "totalPurchases": 854.3
    },
    {
        "customerId": 1001,
        "customerName": "xyz",
        "transactions": [
            {
                "points": 450,
                "id": 1008,
                "totalAmount": 300.0,
                "purchaseDescription": "PurchaseL",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            }
        ],
        "rewardPoints": 450,
        "totalPurchases": 300.0
    },
    {
        "customerId": 1002,
        "customerName": "mnr",
        "transactions": [
            {
                "points": 86,
                "id": 1202,
                "totalAmount": 118.9,
                "purchaseDescription": "PurchaseK",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            },
            {
                "points": 0,
                "id": 1200,
                "totalAmount": 15.8,
                "purchaseDescription": "PurchaseI",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            },
            {
                "points": 20,
                "id": 1201,
                "totalAmount": 70.5,
                "purchaseDescription": "PurchaseJ",
                "transactionDate": "2023-02-27T06:00:00.000+00:00"
            }
        ],
        "rewardPoints": 106,
        "totalPurchases": 205.20000000000002
    }
]






