select * from emp 
where empno >= 7000 or empno < 9000;

select * from emp 
where empno >= 7000 and empno <9000;

select * from emp 
where  empno in ( 7000,7500 );

select * from emp 
where empno >= 7521 and empno < 7800;

select * from emp
where sal >= 3000;

select * from emp 
where SAL >= 3000;

select * from emp
where sal <= 1500 and job = 'SALESMAN';
-- 80년 10월 10일이후 
select * from emp
where hiredate > '81/10/10';

select * from emp
where deptno in (10,20) and empno > 7600;
--87년이전 이던가 1600이하

select * from emp
where hiredate < '86/12/30' and sal < 1600;  

select * from emp
where comm >= 100 and empno >= 30; 

select * from emp
where comm is null;

select * from emp
order by deptno asc, sal desc;
select * from emp
where deptno = 30
order by sal desc;

select * from emp
where ename = 'SMITH';
select * from emp 
where deptno = 30 or job = 'CLERK';

select * from emp
where job = 'CLERK' or sal > 2000 and deptno = 10;

select * from emp
where sal > 2000;

select * from emp
where job = 'CLERK' or sal > 2000 and deptno = 10;
-- and가 뒤에있으면 앞에 내용이 and랑 엮여서 다른뜻이됨 그러므로 앞에 or을 엮어줘야함
select * from emp
where (job = 'CLERK' or sal > 2000)and deptno = 10;

