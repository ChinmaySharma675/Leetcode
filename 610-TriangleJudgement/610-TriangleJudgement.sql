-- Last updated: 3/7/2026, 10:35:55 PM
select x,y,z, case when x+y>z and x+z>y and y+z>x then "Yes" else "No" END as triangle from Triangle;