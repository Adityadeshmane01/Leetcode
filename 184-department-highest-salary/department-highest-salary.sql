# Write your MySQL query statement below
with ranked_t as(
    select *,dense_rank() over(partition by departmentId order by salary desc) as `rank` from Employee
)
select d.name as Department,u.name as Employee,salary as Salary from ranked_t as u join Department as d on u.departmentId=d.id where u.`rank`=1 order by salary;