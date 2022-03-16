# Write your MySQL query statement below
select class from courses GROUP BY class HAVING COUNT(class) >= 5;
