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

select comm from emp
where is null;

select comm, is null comm  from emp;
SELECT comm, comm IS NULL AS is_comm_null FROM emp;
SELECT comm from emp
where comm is null;

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


--부서 10번을 사원번호 내림차순으로 정렬하여 출력
select empno from emp
order by desc;


--부서 20번을 사원번호 오름차순으로 정렬하여 출력



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


-- 부서 10번을 사원번호 내림차순desc으로 정렬하여 출력
-- 부서 20번을 사원번호 오름차순으로 정렬하여 출력

select * from emp
(where deptno = 10
union all
select * from emp
where deptno = 20)
order by deptno;





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

select ename from emp
where lower(ename) like lower('%M%');

-- substr
select job, substr(job, 1, 2),substr(job, 3, 2),substr(job,5) from emp;

select job, substr(job, 1) from emp;

--사원 이름을 두번쨰 부터 3글자만 출력
-- substr 뒤에 숫자 넉넉하게 써도 됨.
select ename, substr(ename,2,30) from emp;
-- substr 뒤에 숫자는 - 나올수없음 앞에 -는 뒤에부터 읽는거
select job, substr(job,-3,2) from emp;

select job, substr(job,3,2) from emp;

--이름의 마지막 3글자만 출력하기
select ename, substr(ename,-3) from emp;
--뒤에 넉넉하게 해도됨
select ename, substr(ename,-3,10) from emp;

select job, substr(job, -length(job)), substr(job, -length(job),2)
substr(job,-3)
from emp;
select '010-1234-5678' as replace_before,
replace('010-1234-5678', '-', ' ') as replace_1,
replace('010-1234-5678''-', as replace_2
frome emp;

--aname의 E를 '-' 모두교체
select ename, replace(ename, 'E', '-') from emp;

select ename, replace(ename, 'E', '-')  from emp;
--직책에서 s를 *로 모두교체
select job, replace(job, 'S', '*') from emp;


select '010-1234-5678' replace_before,
 replace('010-1234-5678','-') replace_1,
 replace('010-1234-5678','-',' ') replace_2 from dual;
 
 --lpad, rpad
-- 모자르면 채우고
-- 넘어가면 자르고
 select lpad(ename, 10,' ') from emp;

--난이도 쉬운거
-- enmame에 앞에 두글자만 출력

 -- 이름을 마스킹하는 버전1
 -- 앞에 두글자만 원본을 출력하고 나머지는 4개의 *로 표시
 
 -- 사원 이름 두글자만 보이고 나머지는 *로. 단, 원래 이름 같이 만큼 표시
 
 
 --심화 
 --이름을 총 20자리 중 가운데 정렬



 select rpad(ename,2) 1, rpad(ename,6,'*') from emp;
 
 select ename, rpad(ename,6,'*') from emp;
 
 select ename, substr(ename,1,2),rpad(ename,6,' ') from emp;
 
 select ename, substr(ename,1,2),rpad(ename,6, '*') from emp;
 
 select ename, substr(ename,1,2) as1, rpad(as1,2,'*') as2 from emp;
 
 select ename, substr(ename,1,2) as1, rpad(as1,' ','*') from emp;
 
 select ename, substr(ename,1,2), rpad('','-1''*') from emp;
 
 select ename, lpad('','6''*') from emp;
 
 select substr(ename,1,2)as1, rpad(ename,6, '*') from emp;
 
 select rpad(substr(ename,'1','2'),'6','*')from emp;
 
 --1.
 select ename, substr(ename,1,2), rpad(ename,2) from emp;
 
 --2.
 
select rpad(substr(ename, 1,2);
--3.
select rpad( substr(ename, 1,2), length(ename),'*') from emp; --rpad 안에 넣어야 적용이됨

--- round 올림
select round(14.46,0), -- ,0이생략 하나만 입력하면 소수점 첫째자리 반올림
       round(14.46,1), --소수점 두번째 자리
       round(14.46,-1) -- 음수일 때 정수로 거슬러 올라간다
from dual; 



 --|| 두개 같이 표시 할대 
select 'ab' || 'cd'||'ef' from dual;
select empno || ' : ' || ename from emp;

select ename || '님' from emp; -- ll표시

--trim 왼쪽 오른쪽 사이에 공백없애기
select '   ab c   ', trim('   ab c   ') from dual;


15 / 5 =3 (0)
17 / 5 =3 (2)

--왜 -14 답이 -14 인가?
select trunc(14.46), trunc(14.46, 1), trunc(14.46, -1), trunc(-14.46)
from dual;

select ceil(3.14), 
floor(3.14),
ceil(-3.14), 
floor(-3.14),
trunc(-3.14)
from dual;


select 7 / 3 from dual;
select 7 / 0 from dual;


select ename, rpad(ename,7,'*') from emp;


select ename, rpad(substr(2.3)ename,7,'*') from emp;

select rpad(substr(ename,'1','2'),'6','*')from emp;

select rpad(substr(ename,'1','2'),'6','*')from emp;


select rpad( substr(ename, 1,2), length(ename),'*') as12 from emp;

select rpad( substr(ename, 1,2), length(ename),'*') from emp;

--- 정답이 나눈수를 넘을수 없다 ( 3= 1.2.0 ) /(4 =0.1.2.3)
select mod(7,3) from dual;
select mod(11,8) from dual;

select sysdate-10660 from dual;

select empno, empno + '1000' from emp;

select empno, empno + 'adad' from emp;

select ename, ename + 'A' from emp;

select 'A' || '123' as  from emp;
--날짜를 포맷팅 한거다 
select to_char(sysdate, 'yyyy"년"mm"월"dd"일"hh24"시"mi"분"ss"초"')as "현재" from dual;

select to_char(hiredate, 'yyyy"년"mm"월"dd"일"hh24"시"mi"분"ss"초"')as "입사날짜" from emp;


select to_date('2025-05-15','yyyy-mm-dd') from dual;

select to_date('2025-05-12', 'yyyy-mm-dd') - to_date('2024-05-12', 'yyyy-mm-dd') from dual;


select to_date('';

select * from emp
where hiredate > to_date('1981-06-01', 'yyyy-mm-dd');

select * from emp
where hiredate < '81-06-01';


select 
  sal,comm,  sal*12 + comm,
       sal*12 + nvl(comm, 0) from emp;
--이름의 마지막 3글자만 출력하기
select ename, substr(ename,-3) from emp;

select ename, substr(ename,1,3) from emp;
       
       -- 앞에 두글자만 원본을 출력하고 나머지는 4개의 *로 표시
       
select ename, substr(ename,2,3) from emp;
select ename, substr(ename,2,3) as2 from emp;

select ename, substr(ename,3,1) from emp;
--문제: 이름의 앞 두 글자만 표시하고, 나머지는 생략하고, 이름의 전체 길이를 덧붙여 출력하세요.
select ename, substr(ename,1,2,(length(ename)) from emp;

select ename, substr(ename,1,2) || length(ename) from emp;
 -- 앞에 두글자만 원본을 출력하고 나머지는 4개의 *로 표시
select ename, rpad( substr(ename,1,2)) from emp;
select ename, rpad(substr(ename,1,2), length(ename),'*') from emp;

select rpad( substr(ename, 1,2), length(ename),'*') from emp;

select substr(ename,1,2),rpad(substr(ename,1,2),6,'*') from emp;

select substr(ename,1,2), rpad(substr(ename,1,2),6,'*') from emp;

select ename, rpad(substr(ename,1,2), length(ename),'*') a1 from emp;

select ename, rpad(ename,length(ename)) from emp;

select ename, length(ename) from emp;

select ename, rpad(substr(ename,1,2),length(ename),'*') from emp;

select ename, rpad(substr(ename,1,2),5,'*') from emp;
 --이름을 총 20자리 중 가운데 정렬
 
select ename, substr(ename,3,11) from emp;
 

select ename, replace(ename,'A',' ') from emp;

select ename, replace(ename,'A','*') from emp;
select replace('010-2373-9184','-',' ') from emp;

--이메일에서 도메인 부분만 추출하기
--문제: email 컬럼에서 이메일 도메인 부분만 추출하세요. 예를 들어,
--'john.doe@example.com'은 'example.com'으로 바꿔야 합니다.
select ename, trim(job) from emp;

select round(1234.5678,0),round(1234.5678,1),round(1234.5678,2) from emp;

select round(1234.5678,3) from emp;

select round(1234.5678,1) from emp;
--선택 된걸 버려라      (1을선택)
select trunc(1234.5678,1) from dual;

select ceil(1234.5678,1) from dual;

select ename, rpad(substr (ename,1,3),length(ename),'*') from emp;

select ceil(123.4567,1) from emp;

select ename, replace(ename,'S''*') from emp;


select ename, rpad(substr(ename,5,'*')) from emp;

select ename, rpad(substr(ename,'A','*')) from emp;

select ename, substr(ename,'A','*') from emp;

select ename, replace(ename,'S','*') from emp;


select ename, substr(ename,1,3) from emp;

select ename, rpad(ename,10,'*') from emp;

select ename, length(ename) from emp;


select ename, rpad(substr(ename,1,2),length(ename),'*') from emp;


select ename, rpad(substr(ename,1,2),10,'*') from emp;

select round(123456.345,2) from emp; 

select trunc(123456.345,-1) from emp;

select ceil(-3.14) from dual;

select floor(-3.14) from emp;

select mod(15,4) from dual;


select to_char(sysdate,'yyyy"년"mm dd') as "시간" from dual;

select to_char(123456789,'999,999,999') from dual;

select 'we' || 123  from emp;

select to_char(sysdate, 'mon') from dual;

select * from emp
where hiredate > to_date('1980-01-01','yyyy,mm,dd') 
;
select * from emp
where hiredate  to_char('1980-01-01','yyyy,mm,dd')
;
select sal,sal*12, comm, sal+comm,
 sal*12+nvl(comm,0) 
from emp;

select to_date(sysdate,'yyyy''mm''dd') from dual;

-- 각 사원의 연봉을 출력
-- 월급 *12 +comm
--이름 ename, total_pay 출력

select ename,sal*12, nvl(comm,0),sal*12 + nvl(comm,0) total_pay  from emp;


-- [] 대괄호
-- {} 중괄호
-- () 소괄호 괄호


select  job, sal, 
       decode(job,
       'MANAGER', sal*1.1,
       'SALESMAN',sal*1.05,
       'ANALYST', sal,
       sal*1.03) as upal from emp;
       
       
       
       --case 를 쓰면 end 필수
       -- when 이럴대~ then 이렇게
       -- else 그렇지않으면
       
       select job, sal,
       case job
         when 'MANAGER' then sal*1.1
         when 'SALESMAN' then sal*1.05
         when 'ANALYST' then sal
         else sal*1.03 
          end as upsal from emp;       
          
          -- nvl 사용하지 않고 
          -- decode, case로 nvl이랑 동일한 결과 출력하기
          
    select comm, nvl(comm, -1) from emp;
    
    select comm,
    nvl(comm,-1), -- nvl로 전체 null 이 -1로
    decode(comm,null,-1, comm),
    case comm   --where comm = null 
    when null then -1 
    else comm
    end  as comm
    from emp;
    
    select empno, ename, comm, 
    case 
     when comm is null then '해당 없음'
     when comm = 0 then '0원'
     when comm > 0 then '수당 : ' || comm
     end as case
     from emp;
     
     select ;
     select ename,  rpad(epmno,1,'*') from emp;
     select ename, rpad(empno,7,'*') from emp;
  --1번    
    select empno, rpad(substr(empno,1,2),length(empno),'*') as MASKING_EMPNO,
    ename,rpad(substr(ename,1,1),length(ename),'*') as MASKIN_ENAME from emp
    where length(ename) >= 5 and  length(ename ) < 6; 
    
--2번
      
select empno,ename,sal, trunc(sal/21.5,2)as DAY_PAY,round(sal/21.5/8,1)as TIME_PAY
from emp
order by sal;
     
--4번

select empno,ename,mgr,
case 
when mgr is null then '0000'
when mgr > 7500  then '5555'
when mgr > 7500  then '5555' 
when mgr > 7600 then '6666'
when mgr > 7700 then '7777'
when mgr > 7800 then '8888'  
end as CHG_MGR
from emp;

select empno, ename,mgr 
where like(mgr) < 7500 from emp;

select empno, ename, mgr,
 case
 when mgr is null then '0000'
 when substr(mgr,1,2) = 75 then '5555'
 when substr(mgr,1,2) = 76 then '6666'
 when substr(mgr,1,2) = 77 then '7777'
 when substr(mgr,1,2) = 78 then '8888'
 else to_char(mgr)  --
 end from emp;
 
 select empno, ename, mgr,
 case substr(mgr,1,2)
 when '75' then '5555'
 when '76' then '6666'
when '77' then '7777'
when '78' then '8888'
 else to_char(nvl(mgr,'0000') )
 end end 
 from emp;
 select 
    case when substr(mgr,2,1) in ('5','6','7','8')
   lpad( substr(mgr, 2,1),length(mgr),substr(mgr,2,1) )
   from emp;
   
 select 
 case when mgr is null
 then '0000' when substr(mgr, 2,1) in('5','6','7','8')
   lpad( substr(mgr, 2,1),length(mgr),substr(mgr,2,1) )
   from emp;
   SELECT 
  CASE 
    WHEN mgr IS NULL THEN '0000'
    WHEN SUBSTR(TO_CHAR(mgr), 2, 1) IN ('5', '6', '7', '8') 
      THEN LPAD(SUBSTR(TO_CHAR(mgr), 2, 1), LENGTH(TO_CHAR(mgr)), SUBSTR(TO_CHAR(mgr), 2, 1))
    ELSE TO_CHAR(mgr)
  END AS mgr_result
FROM emp;
   
   
   select sum(sal)+ sum(comm) from emp --where 조건을 쓸수있음 sum값을 
   where deptno = 10;
   
   select sum(sal),sum(deptno) from emp
   where deptno = 10;
   
   select sum(comm)+ sum(sal) from emp; -- 1줄 1줄 맞춰야 결과나옴
   
   select count(*), sum(sal)/ 14 as11 from emp;
   
   select count(sal), count(comm) from emp;
   
   
   select max(sal),min(sal),min(hiredate),min(comm) from emp; --최고 숫자
   
   select min(sal) from emp; -- 최저 월급
   -- 이름에 A가 들어가는 사람은 몇명
   select count(*) from emp
   where ename like '%A%';
   
   select round(avg(sal))
   from emp
   where deptno = 30;
   --다중행 함수(집계 함수)는 where에서 사용할 수 없다
   select * from emp
   where sa > avg(sal);
   
   select round(avg(sal),0) from emp;
   
   select trunc(avg(sal)),sum(sal),count(*) deptno
    from emp
    group by deptno;
    
    select job from emp
    group by job;
    
    select count(sal) from emp
    group by sal;
    
    

   select deptno, job, count(*),ename
   from emp
   group by deptno, job, ename
   order by deptno,job;
   
   select job from emp
   where deptno = 10 
   group by job 
   order by job desc;
   
   
   --havig 단독으로 쓸수는없다 group by 랑 같이
   
   
   select job,deptno from emp
   group by deptno,job
   having deptno = 10;
   
   
   
   select job,deptno, avg(sal) from emp
   group by deptno,job;
   
   select job,deptno, avg(sal) from emp
   group by deptno,job
   having avg(sal) > 2000; -- where 이랑 비슷한 효과 그룹일때만
   
  /* 5 */ select job, count(*) as cnt
   /* 1 */from emp   --어디에서
  /* 2 */ where sal > 1000  --where 걸러낸다
  /* 3 */ group by job  --
  /* 4 */ having count(*) >= 3
  /*6 */  order by cnt desc;
  select empno, ename, mgr,
 case
 when mgr is null then '0000'
 when substr(mgr,1,2) = 75 then '5555'
 when substr(mgr,1,2) = 76 then '6666'
 when substr(mgr,1,2) = 77 then '7777'
 when substr(mgr,1,2) = 78 then '8888'
 else to_char(mgr)  --
 end from emp;
  
  select job,ename,mgr, 
  case job
  when 'MANAGER' then '관리자'
   else'기타직'
   end  as ww from emp;
   SELECT 
  ename,sal,
  CASE 
    WHEN sal >= 3000 THEN '고소득자'
    WHEN sal >= 2000 THEN '중간소득자'
    ELSE '저소득자'
  END AS 소득등급
FROM emp;

select deptno, trunc(avg(sal),0), trunc(max(sal),0), trunc(min(sal)), count(*)
as cnt
from emp
 group by deptno
 order by 

--2번
select job, count(*) from emp
group by job
having count(*) >= 3;


--3번

select '19'|| substr(to_char(hiredate),1,2) HIRE_YEAR
 from emp
 group by substr(to_char(hiredate),1,2);
 -------------------------------------------------
 select to_char(hiredate, 'YYYY') hire_year, deptno,count(*) cnt from emp
group by to_char(hiredate, 'YYYY'), deptno
order by to_char(hiredate, 'YYYY');

select nvl(comm,0),count(nvl(comm,0)),count(comm,1) from emp
       
 group by comm,nvl(comm,0),count(comm,1);
 
 select nvl(comm,0),count(nvl(comm,0))  from emp
 group by nvl(comm,0) count(nvl(comm,0));
 
  select comm,nvl(comm,0),count(nvl(comm,0)) from emp
  ;
  select comm, nvl(comm,0),count(nvl(comm,0)) from emp
  
  group by nvl(comm,0),comm;
  
  
  select comm, 
  case    
  when comm is null then 0000
  when to_char(comm > 1) then 'x'
  end from emp; 
  
  
select  nvl2(comm,'O','X')as exlst_comm, count(nvl2(comm,'O','X'))as cnt from emp

group by nvl2(comm,'O','X')
;
 select 
  case    
  when comm is null then 'X'
  when comm > -1 then 'O'
  end,count(*)  from emp
 group by 
 case    
  when comm is null then 'X'
  when comm > -1 then 'O'
  end;
    
  select '19'|| substr(to_char(hiredate),1,2),
   deptno
  HIRE_YEAR
 from emp ; 
    
    
 select deptno, trunc(avg(sal),0), trunc(max(sal),0), trunc(min(sal)), count(*)
as cnt
from emp
 group by deptno
 order by trunc(min(sal));
 select empno,ename,mgr,
  case
 when mgr is null then '0000'
 when substr(mgr,1,2) = 75 then '5555'
 when substr(mgr,1,2) = 76 then '6666'
 when substr(mgr,1,2) = 77 then '7777'
 when substr(mgr,1,2) = 78 then '8888'
 else to_char(mgr) 
 end from emp;
 
  select empno, ename, mgr,
 case substr(mgr,1,2)
 when is null then '0000'
 when '75' then '5555'
 when '76' then '6666'
when '77' then '7777'
when '78' then '8888'
 end  
 from emp;
 
 
 select empno, ename,mgr,
  case 
when substr(mgr,1,2) = 75 then '5555'
when substr(mgr,1,2) = 76 then '6666'
when substr(mgr,1,2) = 77 then '7777'
when substr(mgr,1,2) = 78 then '8888' 
else nvl(null,'0000')
end as11
from emp;
 
 
 
 
 

 select empno, ename,mgr,
 case 
 when mgr like'75%' =;
 
 
 

 
  select empno,ename,mgr,
  case
 when mgr is null then '0000'
 when substr(mgr,1,2) = 75 then '5555'
 when substr(mgr,1,2) = 76 then '6666'
 when substr(mgr,1,2) = 77 then '7777'
 when substr(mgr,1,2) = 78 then '8888'
 else to_char(mgr) 
 end from emp;
 
 
 
 
 
 
 
  