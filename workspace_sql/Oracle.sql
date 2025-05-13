-- 한줄 주석
/* 범위 주석*/
/*여러줄
  주석 
  */
-- SQL : 
select * from emp;
select * from dept;
select * from salgrade;
select empno, deptno
from emp;
select ename, sal,
123*7, 'a' 
from emp;
select deptno 
from emp;
select distinct deptno 
from emp;

select distinct job, deptno 
from emp;
-- 부서번호로 오름차순, 겹치면 sal 내림차순

select ename "2름", sal 월급, 
sal "1번", sal*12+comm  감,
sal*12+comm 돈,
sal*12+comm "월 급", -- sql에서 유일하게" 들어가는 곳 컬럼에 이름정하는것
comm as 추가수당
from emp;
select distinct deptno from emp;
select * from emp where deptno = 30
order by sal;
select * from emp
where deptno = 30
and job = 'SALESMAN';
select * from emp where sal = 1600;

select sal from emp where sal = 1600;
-- 초과
select * from emp where sal > 1600;
--이상
select * from emp where sal >= 1600; -- = 이 오른쪽
--이하
select * from emp where sal <= 1600;
--부정
select * from emp where deptno != 30;

select * from emp where deptno <> 30;

select *from emp 
where deptno = 30
and job = 'SALESMAN';

-- OR
/*
     emp 테이블에서 부서번호 30이거나 직책이 CLERK 둘중하나 같은것들 출력하라
*/
select * from emp where 
deptno = 30 or job = 'CLERK';
/* job이 CLERK고 sal이 2000 초과 이거나 deptno가 10인 사원 조회 */
select * from emp 
where job = 'CLERK' and sal > 2000 or deptno = 10;

select * from emp
where not (job = 'CLERK' or ( sal > 1000 and deptno = 10));
/* 
   deptno != 30, deptno <> 30, deptno ^=30, not deptno = 30
   */
   --월급 2000이상 4000미만인 사원을 출력하시오
   
   select * from emp
   where sal >= 2000  and sal < 4000;
   -- 2000 <= sal < 4000
   -- where 2000 <= sal and asl < 4000;
   
   --부서번호 10 또는 20인 사원만 출력
   
   
   
select * from emp 
where deptno = 10 or deptno = 20;

select * from emp 
where deptno in ( 10, 20 );

select * from emp 
where deptno not in ( 10, 20 );




   
