-- Last updated: 3/7/2026, 10:34:36 PM
select teacher_id,count(distinct subject_id) as cnt from Teacher group by teacher_id