CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL,
    product_name VARCHAR(50),
    quantity INT CHECK (quantity > 0),
    status VARCHAR(20)
);
INSERT INTO orders VALUES (401, 'Arun', 'Laptop', 1, 'Placed');
INSERT INTO orders VALUES (402, 'Bala', 'Mobile', 2, 'Placed');
INSERT INTO orders VALUES (403, 'Charan', 'Tablet', 1, 'Placed');
INSERT INTO orders VALUES (404, 'Dinesh', 'Mouse', 3, 'Placed');
INSERT INTO orders VALUES (405, 'Ezhil', 'Keyboard', 1, 'Placed');

SELECT * FROM orders;

SELECT * FROM orders
WHERE status = 'Placed';

UPDATE orders
SET status = 'Shipped'
WHERE customer_name = 'Bala';

SELECT * FROM orders
WHERE customer_name = 'Bala';

DELETE FROM orders
WHERE customer_name = 'Dinesh';