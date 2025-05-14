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
--1번 부서번호 10번인 사람들을 출력
select * from emp
where deptno = 10;
--2번 부서번호 10번아닌 사람들을 출력
select * from emp
where not (deptno = 10);
--3번 급여가 3000 이상인 사람들을 출력
select * from emp
where sal >= 3000;
--4번 급여가 1500~3000사이(포함)의 사람을 출력
select * from emp
where sal >= 1500 and sal <= 3000;
--5번 부서번호 10번인 사람 중 급여 2000이상인 사람을 출력
select * from emp
where deptno = 10 and sal >= 2000;
--6번 부서번호 30번 중 1500~3000 사이(미포함)인 사람을 출력
select * from emp
where deptno = 30 and (sal > 1500 and sal < 3000);
/*7번 부서번호 30번 중 1500~3000 사이 (미포함)인 사람을 연봉이 작은순으로 출력, 연봉이
작은 순으로 출력, 연봉이 같은 경우 이름이 빠른 순으로 출력 */
select * from emp
where deptno = 30 and sal > 1500 and sal < 3000
order by sal, ename;
/*8번 부서번호 20,30번 중 1500~3000 사이 (미포함)인 사람을 연봉이 작은 순으로 출력,
연봉이 같은 경우 이름이 빠른 순으로 출력 */
select * from emp
where deptno in (20,30)and (sal > 1500 and sal < 3000)
order by sal,ename;
/*9번 부서번호가 20 또는 30이고 급여가 1500 이상인 직원의 이름과 급여를 급여 오름차순으로
 출력하라*/
select ename, sal from emp
where (deptno = 20 or deptno = 30) and sal >=1500
order by sal ;
--복사해서 ctrl /

select ename, sal from emp
where deptno in ( 20,30 ) and sal >=1500
order by sal;

-- 뭐뭐 사이 between and 2000~3000
select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000 
and deptno = 30;

-- 2000초과 3000미만을 할대
select * from emp
where sal between 2000 and 3000
and sal != 2000
and sal != 3000;

-- like
select * from emp
where ename like 'S%';

select * from emp
WHERE ENAME LIKE '_L%';

select * from emp
where ename like '_L%';

select * from emp
where ename like '%AD%';

select * from emp
where ename not like '%A%' or ename like '%S%'

select * from emp;


select comm from emp;

select * from emp
where comm is null;

select * from emp
where comm is not null;

select * from emp
where comm like '0';
-- union (select 끼리 묶어줌) //  
select * from emp where deptno = 10
union 
select * from emp where deptno = 10;

select * from emp where deptno = 10
union all
select * from emp where deptno = 10;

select empno from emp
union all 
select empno from emp;

select ename,empno,sal,deptno from emp
where ename like '%E%' and deptno = 30 and sal not between 1000 and 2000;


select * from emp
where (comm is null) and (job = 'MANAGER' or job = 'CLERK')
and (mgr  is not null) and ename != '_L%';

select ename,empno,sal,deptno from emp
where ename like '%E%' and deptno = 30 and (sal <1000 or sal > 2000);

select * from emp
where (comm is null) and (job = 'MANAGER' or job = 'CLERK')
and (mgr  is not null) and ename != '_L%';


--이름 번호 급여 부서를 출력하기
-- 이름에 E 포함 부서는 30 급여 1000~2000가 아닌

select ename, empno,sal, deptno from emp
where ename like '%E%'
and deptno = 30
and not (sal >= 1000 and sal <= 2000);


select * from emp
where (comm is null) and (job = 'MANAGER' or job = 'CLERK')
and (mgr  is not null) and not(ename = '_L%');

select * from emp
where comm is null
and job in ('MANAGER','CLERK')
and ename not like '_L%';

select ename, upper(ename), lower(ename), initcap(ename)
from emp;
-- lower 소문자 -- upper 대문자
select ename from emp
where lower(ename) like lower ('%aM%');

select upper('aBc'), lower('aBc') from dual;

select ename, length(ename) from emp;
where length(ename) = 5;
-- length 글자 숫자
select ename from emp
where length(ename) = 5;

select lengthb('a'), lengthb('한') from dual;

desc emp;


/* 수업 잘 듣기
   따라쓰기
   분석(이해)
   안보고 다시 쓰기
   몇개라도 바꿔보기 (응용)
   마지막으로 자랑 */
   
--1번 EMP 테이블을 사용하여 다음과 같은 사원 이름이 S로 끝나는 사원 데이터를 모두 출력해라   
select * from emp
where ename like '%S';
/*2번 EMP 테이블을 사용하여 30번 부서에서 근무하는 사원중에 직책이 SALESMAN인 사원의
사원번호 이름 직책 급여 부서번호를 출력해라*/

select empno, ename, job, sal, deptno from emp
where deptno = 30 and job = 'SALESMAN';

/*3번 EMP 테이블을 사용하여 20번, 30번 부서에 근무하는 사원 중 급여가 2000초과인 사원을
다음 두 방식의 SELECT문을 사용하여 사원 번호, 이름, 직책, 급여, 부서 번호를 출력하여라*/

select empno, ename, job, sal, deptno from emp
where deptno in(20,30) and sal > 2000;

/*4번 이번에는 NOT BETWEEN A AND B 연산자를 쓰지 않고 급여 열이 2000이상 3000이하 범위 
이외의 값을 가진 데이터만 출력하도록 하여라*/

select * from emp
where not (sal >= 2000 and sal <= 3000);

/* 사원 이름에 E가 포함된 30번 부서의 사원 중 급여가 1000~2000 사이가 아닌 사원 이름,
   사원 번호,급여,부서 번호를 출력하라*/
   
select ename, empno, sal, deptno from emp
where ename like('%E%') and deptno = 30 and  (not sal >= 1000 or not sal <=2000);

/* 추가 수당이 없고 상급자가 있고 직책이 MANAGER, CLERK인 사원 중에서 사원 이름의 
두번째 글자가 L이 아닌 사원의정보를 출력해라*/

select * from emp
where comm is null and mgr is not null and job in('MANAGER','CLERK')
and ename not like ('_L%');

select ename from emp
where ename like ('%A%');
union all
select empno from emp;

select empno, ename, sal, deptno from emp
where deptno = 10
union all
select sal, job, deptno, sal from emp
where deptno = 20;
select lower(ename) from emp;

select  from emp
where initcap(ename);

select * from emp
where lower(ename) like lower ('%aM%');

select * from emp
where lower(ename) like lower('%aM%');
--대문자나 소문자 섞여있을대 찾는방법?

/*emp 테이블에서 부서번호 20 , 30 이고 마지막ㅇ이름에 A 가들어가며 급여가 3000이상인
직원의 사원번호 직속상관의 사원번호 입사일 추가수당 나오게 만들어라*/

select empno, mgr, hiredate, comm, sal, ename, deptno from emp
where deptno in(20,30) and ename like ('%T') and sal >= 3000;

select ename, length(ename) from emp
where length(ename) = 5;

select * from emp
where length(ename) = 4;

select ename,length(job), job from emp
where length(job) = 8;

select * from emp;
--1번
select ename, length(ename) from emp;

--2번
select ename, job, length(ename) from emp
where length(ename) > 5;

--3번
select ename, empno, job, length(ename) from emp
where length(ename) > 5;

select  ename,lengthb(ename) from emp;

select length('잭스'), lengthb('잭스') from dual;
