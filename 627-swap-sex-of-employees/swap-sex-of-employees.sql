# Write your MySQL query statement below
UPDATE Salary SET sex =case
WHEN sex = 'm' then 'f'
else 'm'
 END;
