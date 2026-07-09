# Write your MySQL query statement below



-- Delete from person
-- where (id,email) not in (select min(id),email from Person group by email )
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.email = p2.email
AND p1.id > p2.id;