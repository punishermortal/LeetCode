select 
    employee_id,
    if(employee_id%2!=0 and name NOT LIKE 'M%',salary,0) as bonus 
from Employees 
order by employee_id