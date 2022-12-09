# Write your MySQL query statement below
#select ifnull distinct(salary) as secondHighestSalary from employee 
#order by salary desc
#limit 1,1
SELECT
    IFNULL(
      (SELECT DISTINCT Salary
       FROM Employee
       ORDER BY Salary DESC
        LIMIT 1 OFFSET 1),
    NULL) AS SecondHighestSalary
