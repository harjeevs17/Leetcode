# Write your MySQL query statement below

delete p2 from Person as p1 JOIN Person as p2 where p1.email = p2.email AND p2.id> p1.id;