# Write your MySQL query statement below
with ranked_table as(
    select *,dense_rank() over(order by score desc) as `rank` from scores
)
select score,`rank` from ranked_table order by `rank` asc;