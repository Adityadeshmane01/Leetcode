# Write your MySQL query statement below
with tables as(
    select *,lag(num,1) over(order by id) as prev1,
        lag(num,2) over(order by id) as prev2 from logs
)
select distinct num as ConsecutiveNums from tables where num=prev1 and num=prev2;