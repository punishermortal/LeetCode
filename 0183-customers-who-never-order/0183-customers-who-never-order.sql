select cu.name as 'customers' from customers as cu
left join orders as od
on cu.id=od.customerid 
where od.customerid is null;
