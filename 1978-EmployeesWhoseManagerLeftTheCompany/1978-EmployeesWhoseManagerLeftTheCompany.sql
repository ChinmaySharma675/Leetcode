-- Last updated: 9/23/2026, 1:31:04 PM
select employee_id from Employees where salary<30000 and manager_id not in (select employee_id from Employees where employee_id is not null ) order by employee_id ;
