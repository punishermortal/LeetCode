# Write your MySQL query statement below
#select ifnull distinct(salary) as secondHighestSalary from employee 
#order by salary desc
#limit 1,1
select max(salary) as secondhighestsalary from employee where salary !=(select max(salary) from employee)