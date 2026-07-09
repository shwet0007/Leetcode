# Write your MySQL query statement below
with ct as(select *, rank() over(partition by email order by id) as rnk 
from Person )

Delete from Person
where id in(select id 
from ct where rnk>=2)