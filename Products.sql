CREATE TABLE products(
product_id INT PRIMARY KEY,
product_name VARCHAR (50) NOT NULL,
price INT CHECK(price>0),
stock INT CHECK (stock >=0)
);
INSERT INTO products VALUES (301, 'Pen', 10, 100);
INSERT INTO products VALUES (302, 'Book', 50, 200);
INSERT INTO products VALUES (303, 'Bag', 500, 50);
INSERT INTO products VALUES (304, 'Bottle', 150, 0);
INSERT INTO products VALUES (305, 'Box', 80, 20);

SELECT * FROM products
WHERE stock = 0;

UPDATE products 
SET price = 550
WHERE product_name = 'Bag';

DELETE FROM products
WHERE product_name = 'Pen';