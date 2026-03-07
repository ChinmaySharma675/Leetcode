-- Last updated: 3/7/2026, 10:34:57 PM
select employee_id,department_id from Employee where primary_flag="Y"   union select employee_id,department_id from Employee where employee_id not in (select employee_id from Employee where primary_flag="Y") ;
