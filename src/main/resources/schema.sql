--create table

CREATE TABLE employee (
   id serial PRIMARY KEY,
   name VARCHAR(200) NOT NULL,
   email VARCHAR(200) NOT NULL,
   mobile VARCHAR(20) NOT NULL,
   age integer NULL
   department_id int NOT NULL,
   CONSTRAINT employee_department_id FOREIGN KEY (department_id) REFERENCES department (id)


)

--insert data

INSERT INTO employee(name,email,mobile,age) VALUES(?,?,?,?)


--update


UPDATE employee set name=?,email=?,mobile=?,age=? WHERE id=?

--delete
DELETE FROM employee WHERE id=?

--get data

SELECT * from employee

--get data by id

SELECT * FROM employee WHERE id =?"

