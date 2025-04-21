
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT,
    marks DECIMAL(5,2)
);

INSERT INTO students (id, name, email, age, marks) VALUES
(1, 'Rahul', 'rahul22@gmail.com', 22, 89.50),
(2, 'Priya', 'priya21@gmail.com', 21, 92.00),
(3, 'Akash', 'akash23@gmail.com', 23, 85.75);


SELECT * FROM students WHERE age > 21;


UPDATE students
SET email = 'rahul@gmail.com'
WHERE id = 5; 


DELETE FROM students WHERE age < 18;


SELECT * FROM students
ORDER BY marks DESC
LIMIT 1 OFFSET 1;


CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    student_id INT,
    course_name VARCHAR(100),
    FOREIGN KEY (student_id) REFERENCES students(id)
);


INSERT INTO courses (course_id, student_id, course_name) VALUES
(101, 1, 'Java'),
(102, 2, 'Python'),
(103, 1, 'SQL');


SELECT s.name AS student_name, c.course_name
FROM students s
JOIN courses c ON s.id = c.student_id;
