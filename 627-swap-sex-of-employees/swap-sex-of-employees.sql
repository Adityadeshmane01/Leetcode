# Write your MySQL query statement below
UPDATE Salary SET sex =case
WHEN sex = 'm' then 'f'
WHEN sex = 'f' then 'm'
else sex
 END;
