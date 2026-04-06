
CREATE TABLE department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50),
    location VARCHAR(50)
);


CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    age INT,
    salary INT,
    dept_id INT,
    job_role VARCHAR(50),
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);


INSERT INTO department VALUES
(10, 'HR', 'Chennai'),
(20, 'IT', 'Madurai'),
(30, 'Finance', 'Trichy'),
(40, 'Sales', 'Coimbatore');


INSERT INTO employee VALUES
(101, 'Arun', 23, 25000, 20, 'Developer'),
(102, 'Bala', 30, 40000, 10, 'Recruiter'),
(103, 'Charan', 27, 35000, 20, 'Tester'),
(104, 'Divya', 35, 50000, 30, 'Accountant'),
(105, 'Eswar', 29, 28000, 40, 'Sales Executive'),
(106, 'Farhana', 26, 32000, 20, 'Developer'),
(107, 'Gokul', 31, 45000, 30, 'Analyst'),
(108, 'Hari', 24, 22000, 10, 'Assistant');

SELECT emp_name, salary, salary * 12 AS annual_salary FROM employee;

SELECT emp_name, salary + 5000 AS bonus_salary FROM employee;

SELECT emp_name, salary - 2000 AS reduced_salary FROM employee;

SELECT * FROM employee WHERE salary > 30000;

SELECT * FROM employee WHERE age < 28;

SELECT * FROM employee WHERE salary = 25000;

SELECT * FROM employee WHERE age <> 30;

SELECT * FROM employee WHERE salary > 25000 AND dept_id = 20;

SELECT * FROM employee WHERE dept_id = 10 OR dept_id = 30;

SELECT * FROM employee WHERE NOT salary < 30000;

SELECT * FROM employee WHERE age > 25 AND salary < 45000;

SELECT * FROM employee WHERE salary BETWEEN 25000 AND 40000;

SELECT * FROM employee WHERE dept_id IN (10, 20);

SELECT * FROM employee WHERE emp_name LIKE 'A%';

SELECT * FROM employee WHERE emp_name LIKE '%a';

SELECT * FROM employee WHERE emp_name LIKE '%ar%';

SELECT * FROM employee WHERE dept_id NOT IN (30, 40);

SELECT * FROM employee;

SELECT emp_name, salary FROM employee;

SELECT dept_name, location FROM department;

SELECT * FROM employee WHERE dept_id = 20;

SELECT * FROM employee WHERE salary > 35000;

SELECT * FROM employee WHERE age < 30;

SELECT * FROM employee ORDER BY salary ASC;

SELECT * FROM employee ORDER BY age DESC;

SELECT emp_name FROM employee ORDER BY emp_name ASC;

SELECT dept_id, COUNT(*) FROM employee GROUP BY dept_id;

SELECT dept_id, MAX(salary) FROM employee GROUP BY dept_id;

SELECT dept_id, MIN(salary) FROM employee GROUP BY dept_id;

SELECT dept_id, AVG(salary) FROM employee GROUP BY dept_id;

SELECT dept_id, COUNT(*) 
FROM employee 
GROUP BY dept_id 
HAVING COUNT(*) > 2;

SELECT dept_id, AVG(salary) 
FROM employee 
GROUP BY dept_id 
HAVING AVG(salary) > 30000;

SELECT dept_id, MAX(salary) 
FROM employee 
GROUP BY dept_id 
HAVING MAX(salary) > 40000;

SELECT DISTINCT dept_id FROM employee;

SELECT DISTINCT job_role FROM employee;

SELECT * FROM employee LIMIT 3;

SELECT * FROM employee ORDER BY salary DESC LIMIT 2;

SELECT * FROM employee 
WHERE salary > 25000 
ORDER BY salary DESC;

SELECT * FROM employee 
WHERE dept_id = 20 AND age BETWEEN 24 AND 30;

SELECT dept_id, COUNT(*) 
FROM employee 
GROUP BY dept_id 
HAVING AVG(salary) > 30000;

SELECT * FROM employee 
WHERE emp_name LIKE 'D%' OR emp_name LIKE 'F%';

SELECT * FROM employee 
WHERE job_role IN ('Developer', 'Tester');

SELECT * FROM employee 
WHERE salary NOT BETWEEN 25000 AND 35000;

SELECT dept_id, SUM(salary) 
FROM employee 
GROUP BY dept_id;

SELECT dept_id, SUM(salary) 
FROM employee 
GROUP BY dept_id 
HAVING SUM(salary) > 60000;

SELECT e.emp_name, d.dept_name
FROM employee e
JOIN department d ON e.dept_id = d.dept_id;

SELECT e.emp_name, e.salary, d.location
FROM employee e
JOIN department d ON e.dept_id = d.dept_id;

SELECT e.emp_name
FROM employee e
JOIN department d ON e.dept_id = d.dept_id
WHERE d.dept_name = 'IT';

SELECT e.emp_name
FROM employee e
JOIN department d ON e.dept_id = d.dept_id
WHERE d.location = 'Chennai';

SELECT e.emp_name, e.salary, d.dept_name
FROM employee e
JOIN department d ON e.dept_id = d.dept_id
WHERE e.salary > 30000;

SELECT d.dept_name, COUNT(e.emp_id)
FROM department d
JOIN employee e ON d.dept_id = e.dept_id
GROUP BY d.dept_name;

SELECT d.dept_name, COUNT(e.emp_id)
FROM department d
JOIN employee e ON d.dept_id = e.dept_id
GROUP BY d.dept_name
HAVING COUNT(e.emp_id) > 1;