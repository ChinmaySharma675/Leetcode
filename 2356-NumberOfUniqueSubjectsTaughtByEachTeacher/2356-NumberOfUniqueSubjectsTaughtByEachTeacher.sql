-- Last updated: 9/23/2026, 1:30:23 PM
select teacher_id,count(distinct subject_id) as cnt from Teacher group by teacher_id