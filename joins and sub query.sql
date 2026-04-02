CREATE TABLE customers (
    customer_id INT,
    customer_name VARCHAR(50),
    city VARCHAR(50)
);

CREATE TABLE orders (
    order_id INT,
    customer_id INT,
    amount INT
);
INSERT INTO customers VALUES
(1, 'Arun', 'Chennai'),
(2, 'Priya', 'Madurai'),
(3, 'Rahul', 'Coimbatore');

INSERT INTO orders VALUES
(101, 1, 6000),
(102, 2, 3000),
(103, 3, 8000),
(104, 1, 2000);

SELECT o.order_id, c.customer_name, c.city, o.amount
FROM orders o, customers c
WHERE o.customer_id = c.customer_id
AND o.amount > 5000;

CREATE TABLE departments (
    dept_id INT,
    dept_name VARCHAR(50)
);

CREATE TABLE employees (
    emp_id INT,
    emp_name VARCHAR(50),
    dept_id INT,
    salary INT
);

INSERT INTO departments VALUES
(1, 'HR'),
(2, 'IT'),
(3, 'Sales');

INSERT INTO employees VALUES
(101, 'John', 1, 35000),
(102, 'Sara', 2, 25000),
(103, 'David', 1, 40000),
(104, 'Anu', 3, 28000);

SELECT e.emp_name, d.dept_name, e.salary
FROM employees e, departments d
WHERE e.dept_id = d.dept_id
AND e.salary > 30000
AND d.dept_name = 'HR';

CREATE TABLE orders2 (
    order_id INT,
    customer_id INT,
    amount INT
);

INSERT INTO orders2 VALUES
(201, 1, 5000),
(202, 2, 7000),
(203, 3, 3000),
(204, 4, 9000);

SELECT order_id, customer_id, amount
FROM orders2
WHERE amount > (SELECT AVG(amount) FROM orders2);

