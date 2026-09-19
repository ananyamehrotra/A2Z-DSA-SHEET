# Write your MySQL query statement below
select name as Customers from customers
where id not in(
    select c.id from customers c
    join orders o on o.customerId=c.id
);