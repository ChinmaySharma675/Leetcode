-- Last updated: 3/7/2026, 10:35:53 PM
# Write your MySQL query statement below
select * from Cinema where ID%2!=0 and description!='boring' order by rating desc;