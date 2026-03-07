-- Last updated: 3/7/2026, 10:35:54 PM
select max(num) as num  from (select num from MyNumbers group by num having count(num)=1 ) as unique_num;