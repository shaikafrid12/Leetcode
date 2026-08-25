# Write your MySQL query statement below
select e.name as Employee from Employee e inner join employee m on m.id=e.managerId  where e.salary > m.salary;

-- SELECT e.name AS Employee
-- FROM Employee e
-- INNER JOIN Employee m
-- ON e.managerId = m.id
-- WHERE e.salary > m.salary;