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