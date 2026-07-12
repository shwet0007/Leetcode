# Write your MySQL query statement below
SELECT unique_id,name  FROM EmployeeUNI as a RIGHT JOIN Employees as e on a.id = e.id
