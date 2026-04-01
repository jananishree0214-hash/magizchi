CREATE TABLE patients (
    patient_id INT PRIMARY KEY,
    patient_name VARCHAR(50) NOT NULL,
    age INT CHECK (age > 0),
    disease VARCHAR(50),
    phone VARCHAR(15)
);
INSERT INTO patients VALUES (501, 'Kumar', 45, 'Fever', '9876543210');
INSERT INTO patients VALUES (502, 'Ravi', 30, 'Cold', '9876543211');
INSERT INTO patients VALUES (503, 'Siva', 60, 'Diabetes', '9876543212');
INSERT INTO patients VALUES (504, 'Mani', 25, 'Headache', '9876543213');
INSERT INTO patients VALUES (505, 'Raj', 50, 'BP', '9876543214');

SELECT * FROM patients;

SELECT * FROM patients
WHERE age > 40;

UPDATE patients
SET disease = 'Migraine'
WHERE patient_name = 'Mani';

SELECT * FROM patients
WHERE patient_name = 'Mani';

DELETE FROM patients
WHERE patient_name = 'Ravi';