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
 
 --급여(salary)가 5500 이상인 직원의 이름(name)과 급여를 조회하세요.
 
 
 select sal,ename from emp
 where sal > 2000; 
 
 
 --HR 부서에서 일하는 직원의 모든 정보를 조회하세요.
 
 select * from emp
 where deptno = 30;
 --2020년 이후에 입사한 직원의 이름과 입사일(hire_date)을 조회하세요.
 
 select ename,hiredate from emp
where hiredate < to_date('80/01/01','yy-mm-dd');

 
 --IT 부서 직원 중 급여가 6500 이상인 직원의 이름과 급여를 조회하세요
 
 select ename,sal,deptno from emp
 where sal >2000 and deptno =20;
 
 --HR 또는 Sales 부서에 속한 직원 중 급여가 5000보다 큰 직원의 이름과 부서를 조회하세요.
 select ename,deptno from emp
 where deptno = 20 or sal > 1000;
 
 --사원의 이름(ename)과 입사일(hiredate)을 YYYY-MM 형식으로 출력하세요
 select ename,to_char(hiredate,'YYYY-MM') from emp;
 
 --사원의 이름과 급여를 TO_CHAR로 천 단위 구분 쉼표(,)와 함께 출력하세요.
 select ename,sal, to_char(sal,'99,99') from emp;
 
 --입사일(hiredate)을 YYYY-MM-DD (DY) 형식으로 출력하세요.
 
 select to_char(hiredate,'YYYY-MM-DD') from emp;
 
 
 --입사일(hiredate)을 YYYY-MM-DD (DY) 형식으로 출력하세요.
 select  to_char(hiredate,'YYYY-MM-DD (dy)') from emp;
 
 --사원의 이름과 입사 월을 전체 영어 이름(Month)으로 출력하세요.
 
 select ename 이름,to_char(hiredate,'Month') 달 from emp;
  --커미션(comm)이 NULL인 경우 '0'으로 출력하고, 사원 이름과 커미션을 조회하세요.
select ename, nvl(comm,0) from emp; 
select ename,comm,nvl(comm,0) from emp;

--NVL 함수를 사용해서 다음 조건을 만족하는 쿼리를 작성하세요:
--커미션이 NULL이면 'No Bonus', 커미션이 있으면 'Has Bonus'라는 문자열을 보여주세요.

select comm,nvl(comm,0) from emp
where replace(nvl(comm,0),0,'0')) = 'ok';
;
SELECT comm, NVL(comm, 0)
FROM emp
WHERE REPLACE(NVL(comm, 0), 0, '') = '22';

SELECT comm, NVL(comm, 0)
FROM emp
WHERE REPLACE(NVL(comm, 0), 0, '0') = 'ok';

select comm,to_char(nvl(comm,0)) 
from emp
where replace(nvl(to_char(nvl(comm,0)),0,'0') = 'ok' ;


SELECT comm, to_char(NVL(comm, 'ok')) AS comm_display
FROM emp
WHERE to_char(NVL(comm, 'ok')) = 'ok';

select nvto_char(comm,'0') from emp;


select nvl(comm,0),count(*),
case 
when nvl(comm,0) = 0 then '없음'
else '있음'
end as 11,count(*) from emp
group by 
case 
when nvl(comm,0) = 0 then '없음'
else '있음' end ;

SELECT 
    CASE 
        WHEN NVL(comm, 0) = 0 THEN '없음'
        ELSE '있음'
    END AS comm_status,
    COUNT(*) 
FROM emp
GROUP BY 
    CASE 
        WHEN NVL(comm, 0) = 0 THEN '없음'
        ELSE '있음'
    END;
    
    
select 
case 
when nvl(comm,0) = 0 then '없음'
else '있음'
end,count(*) from emp
group by 
case 
when nvl(comm,0) = 0 then '없음'
else '있음'
end ;

SELECT 
    CASE 
        WHEN NVL(comm, 0) = 0 THEN '없음'
        ELSE '있음'
    END AS comm_status,
    COUNT(*) AS 인원수
FROM emp
GROUP BY 
    CASE 
        WHEN NVL(comm, 0) = 0 THEN '없음'
        ELSE '있음'
    END;
    
    select ename,
    case 
    when nvl(comm,0) = 0  then '없음'
    else  '있음'
    end
    from emp
    order by  
    case 
    when nvl(comm,0) = 0  then '없음'
    else  '있음'
    end desc;
    
--문제 1. comm이 없음 / 있음 으로 구분하여 그룹화하고, 2명 이상인 그룹만 출력하기

select count(*),
 case 
 when nvl(comm,0) = 0 then '없음'
 else '있음'  end from emp
 
 group by 
 case
 when nvl(comm,0) = 0 then '없음'
 else '있음'end 
having count(*) >= 2
 order by 
  case 
 when nvl(comm,0) = 0 then '없음'
 else '있음'  end desc;
 
 --문제 2. 부서별 평균 월급이 2000 이상인 부서만 출력하기
 
 select trunc(avg(sal)),deptno from emp
 having avg(sal) > 2000 
 group by deptno ;
 
 -- 문제 3. 부서별 보너스(comm)가 있는 사람 수가 2명 이상인 부서만 출력
 
 select deptno,comm from emp
having comm > 0

group by deptno;

SELECT deptno, COUNT(*) AS 직원수
FROM emp
WHERE deptno >= 30 AND NVL(comm, 0) >= 0
GROUP BY deptno;

select deptno, count(*)  from emp
having deptno >= 20 and comm >= 0
group by deptno,comm, count(*);

select deptno,count(*)  from emp
having deptno >= 30 and  comm >= 0
group by deptno,comm,count(*);

SELECT 
  CASE WHEN NVL(comm, 0) = 0 THEN '없음' ELSE '있음' END AS comm_status,
  COUNT(*) AS 인원수
FROM emp
GROUP BY 
  CASE WHEN NVL(comm, 0) = 0 THEN '없음' ELSE '있음' END
HAVING COUNT(*) >= 2;


--문제: 부서별(department) 평균 급여가 6000 이상인 부서의 이름과 평균 급여를 출력하는 SQL을 작성하세요.

select  trunc(avg(sal)),deptno from emp
group by sal, deptno 
having trunc(avg(sal)) > 2000 and count deptno = 10;

select count(deptno)from emp
having count(deptno)3 >= 10;

 
select deptno,avg(sal),count(deptno) from emp
having avg(sal) >= 2000
group by  deptno, sal;

SELECT deptno, AVG(sal), COUNT(*) AS emp_count
FROM emp
GROUP BY deptno
HAVING AVG(sal) >= 2000;


select deptno, trunc(avg(sal)), count(*)
from emp
group by deptno
having trunc(avg(sal)) >= 2000;
--각 부서(deptno)별로 평균 급여(sal)를 구하시오.

select deptno, trunc(avg(sal)), count(*)
from emp
group by deptno;
--각 직무(job)별로 직원 수를 구하시오.
select job,count(*) from emp
group by job;
--각 부서별로 총 급여(sal)의 합을 구하고, 그 결과에 별칭 total_sal을 붙이시오.

select deptno,sum(sal) as total_sal from emp
group by deptno;
--각 직무별로 최고 급여(sal)와 최저 급여를 구하시오.

select job,max(sal),min(sal) from emp
group by job;
--각 부서별로 직원 수(empno)와 평균 급여를 구하시오. 단, 컬럼명은 각각 emp_count, avg_sal로 지정하시오.

select deptno,count(*) as emp_count,trunc(avg(sal)) as avg_sal from emp
group by deptno;

--각 부서번호와 직무(job)를 기준으로 그룹을 묶고, 해당 그룹의 직원 수를 구하시오.

select job, deptno, count(*) from emp
group by job, deptno;

--부서번호(deptno)가 존재하는 모든 부서에 대해 부서번호와 해당 부서의 전체 급여 
--합을 구하시오. 급여합에 별칭 total_salary를 붙이시오.

select deptno, sum(sal) from emp
having deptno in (10,20,30)
group by deptno;

select deptno, sum(sal) from emp
having deptno in(10,20,30)
group by deptno;
--직원의 급여(sal)가 3000 이상이면 'High Salary', 3000 미만이면 
--'Low Salary'로 출력되도록 하시오. 별칭은 salary_status로 지정하시오.
select ename,sal,
case 
when sal >= 3000 then 'High Salary'
when sal < 3000 then 'Low Salary' 
end as salary from emp;
--부서(deptno)가 10이면 'Head Office', 20이면 'HR Department', 30이면 'Sales
--Department'로 표시되도록 하시오. 별칭은 department_name으로 지정하시오.

select ename,deptno,
case 
when deptno = 10 then '11'
when deptno = 20 then '22'
when deptno = 30 then '33'
end as dep
from emp;

select initcap(ename) from emp;


select empno, ename,mgr,
case 
when substr(empno,1,2) <= 75 then '5555'
when substr(empno,1,2) <= 76 then '6666'
when substr(empno,1,2) <= 77 then '7777'
when substr(empno,1,2) <= 78 then '8888'
else '0000'
end 
from emp;

select comm, ename,mgr,
case 
when substr(comm,1,2) <= 75 then '5555'
when substr(comm,1,2) <= 76 then '6666'
when substr(comm,1,2) <= 77 then '7777'
when substr(comm,1,2) <= 78 then '8888'
else  '0000'
end  from emp;
job to_char(comm)
--각 부서번호와 직무(job)를 기준으로 그룹을 묶고, 해당 그룹의 직원 수를 구하시오

select deptno,job,count(*) from emp
group by deptno,job;


--직무(job)**별로 직원 수와 평균 급여를 구하고,
--직원 수가 2명 이상인 직무만 출력하시오.
select job,trunc(avg(sal)), count(*) from emp
group by job
having count(*) > 2;

--부서별로 급여의 합(sal)과 인원 수를 구하시오.
--단, 급여 합이 9000 이상인 부서만 출력하시오.

select select avg(sal),
case 
when avg(sal) >= 3000 then 'A등급'
when avg(sal) >= 2000 then 'B등급'
else 'C등급'
end from emp;
,sum(sal),count(*) from emp
group by deptno
having sum(sal) > 9000;

--emp 테이블에서 부서별로 급여(sal) 평균 + 커미션(comm) 평균의 합을 구하고,
--이 값이 2000 이상인 부서만 출력하시오.
--단, comm이 NULL인 경우는 0으로 처리하시오.

select deptno,trunc(avg(sal)),trunc(avg(nvl(comm,0))) from emp

group by deptno

having trunc(avg(sal)) + trunc(avg(nvl(comm,0))) >= 2000;

--각 부서의 평균 급여를 구하고,
--평균 급여가 3000 이상이면 'A등급',
--2000 이상이면 'B등급',
--그 이하는 'C등급'으로 표시하시오.


select deptno,count(*),trunc(avg(sal)),
case 
when avg(sal) >= 3000 then 'A등급'
when avg(sal) >= 2000 then 'B등급'
else 'C등급'
end from emp
group by deptno;

--전체 평균 급여보다 높은 급여를 받는 직원들만 조회하시오.
-- 2073 
select ename,sal from emp
where sal > 2073;

--부서별로 comm(커미션)의 평균을 구하되,
--NULL은 0으로 간주하고, 평균 커미션이 100 이상인 부서만 출력하시오.

select deptno,trunc(avg(nvl(comm,0))) from emp
group by 
deptno
having trunc(avg(nvl(comm,0))) > 100;

--직원 이름(ename)이 'S'로 시작하는 직원들의
--이름과 직무(job)를 모두 소문자로 출력하시오.

select ename,lower(job) from emp
where ename like 'S%';
--직원별로 근무일 수(SYSDATE - hiredate)를 구하시오.
--근무일 수가 15000일 이상인 직원만 출력하시오.

select hiredate, to_char(hiredate,'YYYY','MM','DD') from emp;

select to_char(hiredate,'YYYY''MM''DD') from emp;
SELECT ename, hiredate, TRUNC(SYSDATE - hiredate) AS days_worked
FROM emp
WHERE SYSDATE - hiredate >= 15000;

select ename, hiredate, sysdate - hiredate
from emp
where sysdate - hiredate >= 15000;


--각 부서별로 MANAGER 직무를 가진 직원 수를 구하시오.
--단, MANAGER가 2명 이상인 부서만 출력하시오.

select deptno,job,count(*) from emp
group by deptno,job
having job like 'SALESMAN' and count(*) >= 3;

select deptno,avg(sal) from emp

group by deptno;

select deptno, avg(nvl(comm,0)) from emp

group by deptno;

--이름을 총 20자리 중 가운데 정렬

select lpad(rpad(ename,12),20) from emp;

  select ename from emp
union all
 select job from emp;

select * from emp, dept
order by empno;

-- (테이블).(컬럼)특정

select * from emp , dept  
where emp.deptno = dept. deptno
order by empno;


select * from emp e, dept d
where e. deptno = d. deptno
order by empno;

select e.ename, d.deptno from emp
e, dept d 
where e. deptno = d.deptno;

select * from salgrade;

select ename,sal,grade from emp e,salgrade s
where e.sal >= s.losal and e.sal <= s.hisal;


select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename  from emp e1,emp e2
where e1.mgr(+) = e2.empno;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename  from emp e1,emp e2
where e1.mgr = e2.empno(+);


--테이블 명바꾸면 select 안에 테이블.컬럼

select * from salgrade;

select empno, ename,deptno 
from emp e join dept d using(deptno)
where sal >= 3000;

select empno, ename,e.deptno 
from emp e join dept d on(e.deptno = d.deptno)
where sal >= 3000;

select * from emp e1 join emp e2 on(e1.mgr = e2. empno);

select empno, ename,e.deptno
from emp e join dept d on(e.deptno = d.deptno);

select empno,ename, e.deptno
from emp e,dept d
where  d.deptno = e.deptno and sal > 2000;

left outer join ;

select * from
emp e1 left outer join emp e2 on(e1.mgr = e2.empno) 
where e1.sal > 2000;
--1번
select e.deptno,d.dname,e.empno,e.ename,sal 
from emp e left outer join dept d on(e.deptno = d.deptno)
where sal > 2000
order by d.deptno, d.dname;
--2
select e.deptno,d.dname,floor(avg(e.sal)),max(e.sal),min(e.sal),count(*)
from emp e
left outer join dept d on e.deptno = d.deptno
group by e.deptno,d.dname;

--3번
select e.deptno,d.dname,e.empno,e.ename,e.job,sal 
from dept d left outer join emp e on(e.deptno = d.deptno)
order by d.deptno,e.ename ;



--4번
select e.deptno,d.dname,e.empno,e.ename,e.job,sal 
from dept d left outer join emp e on(e.deptno = d.deptno)
order by d.deptno,e.empno;

select e.deptno,d.dname, e.ename,e.job,e.sal from 
left emp e outer join dept d on(e.deptno = d.deptno)
;
select e.deptno,d.dname,e.empno,e.ename, e.job,e.sal from 
emp e left outer join dept d on(e.deptno = d.deptno)
;
select e.deptno,d.dname,e.empno,e.ename,e.mgr,e.sal from
emp e left outer join dept d on (e.mgr = e.deptno);

select d.deptno,d.dname,e.empno,e.ename, e.job,e.sal from 
emp e left outer join on(e.deptno = d.deptno);

select d.deptno,d.dname,e.empno,e.ename,e.job,e.sal
    from dept d
    left outer join emp e  on (e.deptno = d.deptno)

    ;
    
 select d.deptno,d.dname,e.empno,e.ename,e.mgr,e.sal from
dept d left outer join emp e on (e.mgr = e.deptno);


select e.deptno,d.dname,e.ename,e.mgr,e.sal,d.deptno,s.losal,s.hisal,s.grade,
e.empno mgr_empno,e.ename mgr_ename 
from
dept d left outer join emp e on(e.deptno = d.deptno) 
left outer join salgrade s on (s.grade < e.sal)
where e.sal >= s.losal and e.sal <= s.hisal
 ;
select * from salgrade;

select d.deptno,d.dname,e.empno,e.ename,e.job,e.sal,
e.deptno,s.losal,s.hisal,s.grade,e.mgr MGR_EMPNO,e.ename MGR_ENAME
from
dept d left outer join emp e on(e.mgr = e.empno) ;
 


select d.deptno,d.dname,e.empno,e.ename,e.job,e.sal,
e.deptno,s.losal,s.hisal,s.grade,e.mgr MGR_EMPNO,e.ename MGR_ENAME
from 
dept d left outer join emp e on(e.deptno = d.deptno)
where e.sal > losal;




select d.deptno,d.dname,e.empno,e.ename,e.mgr,e.sal,
e.deptno,s.losal,s.hisal,s.grade,m.empno MGR_EMPNO,m.ename MGR_ENAME
from 
dept d left outer join emp e on e.deptno = d.deptno
left outer join salgrade s on e.sal >= s.losal and e.sal <= s.hisal
left outer join emp m on e.mgr = m.empno
order by e.deptno,e.empno;

select d.deptno,d.dname,e.empno,e.ename,e.mgr,e.sal,
e.deptno,s.losal,s.hisal,s.grade,m.empno MGR_EMPNO,m.ename MGR_ENAME
from 
dept d left outer join emp e on e.deptno = d.deptno

left outer join salgrade s on e.sal > s.losal and e.sal < s.hisal
left outer join emp m on e.mgr = m.empno
order by e.deptno,e.empno
;

select * from dept;

select
 d.deptno,d.dname,e.empno, e.ename,e.mgr, e.sal,e.deptno,
 s.losal,s.hisal,s.grade, c.empno mgr_empno,c.ename mgr_ename
 from dept d
 left outer join  emp e on e.deptno = d.deptno
 left outer join  salgrade s on e.sal >= s. losal and e.sal <= s.hisal
 left outer join  emp c on e.mgr = c.empno
 order by e.deptno,e.empno;
 
 
 select d.deptno,d.dname,e.empno,e.ename,e.mgr,e.sal,
e.deptno,s.losal,s.hisal,s.grade,m.empno MGR_EMPNO,m.ename MGR_ENAME
from 
dept d left outer join emp e on e.deptno = d.deptno
left outer join salgrade s on e.sal >= s.losal and e.sal <= s.hisal
left outer join emp m on e.mgr = m.empno
order by e.deptno,e.empno;


select * from emp 
where 
sal > (select sal from emp where ename = 'JONES');;

select * from emp
where hiredate < (select hiredate from emp 
                  where ename = 'SCOTT');





--EMP 부서의 평균보다 많이 받는사람을 뽑아보자

select * from emp
where sal > (select avg(sal) from emp);           

select * from emp
where sal in (select max(sal) from emp 
group by deptno);
                  
    


select * 
from emp
where sal 
in (select max(sal)
from emp 
group by deptno )
;

select * 
from emp;
select *
from emp,dept
where emp.deptno = dept.deptno;

select e10.empno, e10.ename, e10.deptno, d.dname,d.loc
            -- 이 *사이에 원본기준으로 
from ( select * from emp where deptno = 10) e10,
    ( select * from dept) d
    where e10.deptno = d.deptno;



--직책 별로 3명이상 있는사람만 구하시오


select job, count(*)
from emp 
group by job
having count(*) >= 3;


select job, count(*)
from emp 
group by job;





select e.deptno,e.empno,e.ename,e.mgr,e.sal,d.deptno,s.losal,s.hisal,s.grade,
      c.empno,c.ename from dept d
      left outer join emp e on e.deptno = d.deptno
      left outer join salgrade s on e.sal >= s.losal and sal <= s.hisal
      left outer join emp c on e.mgr = c.empno
      order by e.deptno, e. empno;
      
   /*   각 직원의 다음 정보를 모두 출력하는 쿼리를 작성하세요:

직원 사번, 이름, 직무, 급여

부서명과 부서 위치

해당 직원의 급여 등급 (salgrade 기준)

상사의 이름 (emp 테이블에서 상사 정보 추출) */


select 
e.mgr,e.empno,e.ename,e.job,e.sal,e.deptno,b.dname,b.loc,c.grade,f.empno, f.ename
from emp e
left outer join dept b on e.deptno = b.deptno
left outer join salgrade c on e.sal >=  c.losal and e.sal <= c.hisal
left outer join emp f on f.empno = e.mgr
;

--각 직원의 정보와 상사의 이름, 부서명, 부서위치, 급여 등급을 포함한 결과를 조회하세요.

select e.ename,c.enaem,;

--급여 등급이 3 이상인 직원만 조회한다.

--각 직원의 이름, 직무, 급여, 부서명, 급여 등급, 상사의 이름을 출력한다.
--
--부서명이 SALES인 직원은 제외한다.
--
--상사가 없는 직원도 포함되어야 한다.
--
--결과는 급여 등급 내림차순, 직원 이름 오름차순으로 정렬한다

select e.ename,e.job,e.sal,d.dname,s.grade,d.dname,m.ename,s.losal,s.hisal from
emp e 
left outer join salgrade s on s.grade >= 3
left outer join dept d on e.deptno = d. deptno
left outer join emp m on m.empno = e.mgr
where d.dname != 'SALES' and e.sal >= losal and e.sal <=hisal
order by e.sal,e.ename desc;

select e.deptno,d.dname,trunc(avg(e.sal)),max(e.sal),min(e.sal),count(*)
from emp e
left outer join dept d on e.deptno = d.deptno
group by e.deptno,d.dname;

select d.deptno,d.dname,e.empno,e.ename,e.job,e.sal
from dept d 
left outer join emp e on d.deptno = e.deptno
order by d.deptno,e.ename
;
select e.empno,e.ename,e.job,e.mgr,e.sal,d.deptno
from emp e
left outer join dept d on e.deptno = d.deptno;

select e.ename,e.job,e.sal,d.dname,d.loc,s.losal,s.hisal,m.ename
from dept d
left outer join emp e on e.deptno = d.deptno
left outer join salgrade s on e.sal >= losal and sal <= hisal
left outer join emp m on e.mgr = m.empno
where s.grade >= 2 and d.loc in('DALLAS','CHICAGO')
order by s.grade,e.sal desc;

select e.ename,e.job,e.sal,d.dname,d.loc,s.grade,m.ename 상사
from dept d 
left outer join emp e on e.deptno = d.deptno
left outer join salgrade s on e.sal >= s.losal and e.sal <= s.hisal
left outer join emp m on e.mgr = m.empno
where e.sal >= 1500 and  e.sal <= 3000
order by e.sal, e.ename desc;


select e.ename,e.sal,c.grade,c.losal,c.hisal
from salgrade c 
left outer join emp e on e.sal >= losal and e.sal <= hisal;

select d.dname,ename,e.sal,c.grade,c.losal,c.hisal
from dept d 
left outer join emp e on e.deptno = d.deptno
left outer join salgrade c on e.sal >= losal and e.sal <= hisal
where d.dname like  'SALES'  ;

-- 퀴즈 
-- 각부서별로 급여가
 -- 가장높은사원, 가장 낮은 사원의 급여 차이를 가져와이새끼야
 
 select deptno,max(sal), min(sal), max(sal) - min(sal) from 
emp 
group by deptno;

--전체 길이의 반 - 글씨 길이의 반
select lpad(rpad(job,20/2),20) from emp;

select lpad(rpad(job,10),20) from emp;


select lpad(job,length(job)/2+ 20/2,'-')

     rpad(lpad(job,length(job)/2+20/2),'-'),20,'-')
     from emp;
     
     
     
     
     
     
     
     
     
 --직책 별로 3명이상 있는사람만 구하시오


select job, count(*)
from emp 
group by job
having count(*) >= 3;

select *
from (
select job, count(*) cnt
from emp 
group by job)
 where cnt  >= 3; 
 
 
 --책에 안나오는내용
 select * from(
 select rownum rn , emp.*
 from emp)
 where rn > 3 and rn < 6;
 
 
 
 -- 연봉순으로 정렬된 2번3번을 뽑아주시오
 
 -- select 문이 마지막에 실행되기에 새로 감싸 원래있던 select 문을 또 감싸서 순서
 -- 를 빨리 실행시킴
 select * from (
 select rownum rn,e.*  --1번
 from (
 select emp.*        
 from emp
 order by sal desc)
 e ) 
 where rn >= 2 and rn <= 4
 ;
 
 with e10 as( 
 select * from emp where deptno = 10)
 
 select ename from e10;
 

 select rownum rn,e.*
 from (
 select emp.*
 from emp

 order by sal desc)
 where rn >= 2 or rn <= 3
 e 
 ;
 
 
 
 --247페이지 참조
 select * from emp e1 
 where sal >(select min(sal)
  from emp e2 
  where e2.deptno = e1.deptno)
  order by deptno, sal;
  
  select empno, ename, job, sal,
        (select grade 
          from salgrade
          where e.sal between losal and hisal)as salgarde,
          deptno,
          (select dname from dept 
          where e. deptno = dept.deptno) as dname
          from emp e;
        
        
select e.job,e.empno,e.ename,e.sal,d.deptno,d.dname
  from emp e left outer join dept d on e.deptno = d.deptno
  where e.job like 'SALESMAN';
  
  
 select e.job, e.empno, e.ename,e.sal,d.deptno,d.dname 
 from emp e,dept d
   where e.deptno = d.deptno and e.job =
      (select e.job from emp 
      where ename = 'ALLEN');
    

SELECT e.job, e.empno, e.ename, e.sal, d.deptno, d.dname 
FROM emp e, dept d
WHERE e.deptno = d.deptno 
  AND e.job = ( SELECT job 
      FROM emp 
      WHERE ename = 'ALLEN'
  ) 
  
SELECT job 
      FROM emp 
      WHERE ename = 'ALLEN';
    










select e.job,e.ename,e.sal,e.deptno,d.dname
from emp e,dept d
where e.deptno = d.deptno
and e.job =
(select job from emp
where ename = 'ALLEN')
<<<<<<< HEAD
order by e.sal desc, e.ename 
=======
>>>>>>> 91bc050d48862b62bd892a357602f1c63549e47e












-- 전체사원 평균 급여 보다 많이 받는 사원의 사원정보, 부서 정보 ,급여등급 정보를 출력하는
--sql 구문을 작성하시오
;
select e.empno,e.ename,d.dname,e.hiredate,d.dept,e.sal,s.grade from
emp e, dept d, salgrade c
    select sal from emp
    where e.deptno = d.deptno and
    where e.sal 
    avg(sal) > (select avg(sal) from emp 
          )as dd;
          
<<<<<<< HEAD
 select e.empno, e.ename, e.hiredate, e.deptno, e.sal, s.grade, d.dname
from emp e, dept d, salgrade s
where e.deptno = d.deptno
  and e.sal >= s.losal
  and e.sal <= s.hisal
  and e.sal > (SELECT AVG(sal) FROM emp)  
=======
 SELECT e.empno, e.ename, e.hiredate, e.deptno, e.sal, s.grade, d.dname
FROM emp e, dept d, salgrade s
WHERE e.deptno = d.deptno
  AND e.sal >= s.losal
  AND e.sal <= s.hisal
  AND e.sal > (SELECT AVG(sal) FROM emp)  
>>>>>>> 91bc050d48862b62bd892a357602f1c63549e47e
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  ;
  select e.empno,e.ename,e.job,e.deptno,d.dname,d.loc
  from emp e, dept d 
<<<<<<< HEAD
  where e.deptno = 10 and e.job not in(select job from emp where deptno = 30 )    
    and e.deptno = d.deptno  ;



--where 절로 푼거
select e.empno,e.ename,e.sal,c.grade
from emp e, salgrade c
where e.sal > (select max(sal) from emp  where job like 'SALESMAN' ) 
and e.sal <= c.hisal 
and e.sal >= c.losal 
order by empno
;

--select 절로 푼거
select e.empno,e.ename,d.dname,e.hiredate,d.loc,e.sal,
(select grade from salgrade where sal >= losal and  sal <= hisal ) as11 from emp e,dept d 
  where sal > (select avg(sal) from emp)
  and e.deptno = d.deptno
 order by sal desc
  ;
  
  -----------------------
  desc emp;
  
  select * from comm
    


select avg(sal),sal
from emp
 where sal < (select avg(sal)from emp);
 
 
 
  
select e.empno,e.ename,e.sal,c.grade
from emp e, salgrade c
where e.sal > (select max(sal) from emp where job like 'SALESMAN')
and e.sal >= losal
and e.sal <= hisal;


select e.ename,e.sal,c.grade,
(select grade from salgrade where sal > losal and sal < hisal) ss1
from emp e, salgrade c
where c.grade > 3


-- 1번 커미션이 null인 사원을 급여 오름차순으로 정렬

-- 2번 급여 등급 별 사원 수를 등급 오름차순으로 정렬
        --(모든 등급을 표시한다)
--3번 이름, 급여, 급여등급,부서이름 조회
-- 단, 급여등급 3이상만 조회. 급여등급 내림차순, 급여등급이 같은경우 급여 내림차순
--4번  부서명이 SALES인 사원 중 급여 등급이 2 또는 3인 사원을 급여 내림차순으로 정렬

;--1번
select ename,comm,sal from emp
 where comm is null 
 order by sal ;
 
 
 --2번 
 select e.ename, c.grade,count(*) from emp e, salgrade c
  group by e.ename,c.grade, c.losal, e.sal, c.hisal
  having  e.sal >= c.losal and e.sal <= c.hisal ;
  
  
  select s.grade,count(*) from emp e, salgrade s
  where e.sal >= s.losal and e.sal <= s.hisal
  group by s.grade
  order by s.grade;
  
  -- 2번 급여 등급 별 사원 수를 등급 오름차순으로 정렬
        --(모든 등급을 표시한다)
  
   select  ename,sal,grade from emp,salgrade c
    (select grade,count(*) from salgrade group by grade) 
               where sal >= losal and sal <= hisal 
        ;
     
--3번 번 이름, 급여, 급여등급,부서이름 조회


select e.ename,e.sal,c.grade,d.dname
       from emp e,dept d,salgrade c
       where e.deptno = d.deptno and e.sal >= losal and e.sal <= hisal
       and c.grade >= 3     
       order by c.grade desc ,e.sal desc
       

-- 단, 급여등급 3이상만 조회. 급여등급 내림차순, 급여등급이 같은경우 급여 내림차순
--4번  부서명이 SALES인 사원 중 급여 등급이 2 또는 3인 사원을 급여 내림차순으로 정렬
 
   ;
 select e.ename,d.dname,c.grade from emp e, dept d, salgrade c
 where d.dname = 'SALES' and e.sal >= losal and e.sal <= hisal 
 and d.deptno = e.deptno and c.grade in (2,3) 
 order by c.grade 
 ;
 
 desc from;
 
 
 create table emp_ddl (
               empno number(4),
               ename varchar2(10),
               job  varchar2(9),
               mgr number(4),
               hiredate date,
               sal number (7,2),
               comm number (7,2),
               deptno number (2)
               );
               desc emp_ddl;
    
            select * from emp_ddl
        
        ;
        create table dept_ddl
        as select * from dept;
        
        desc dept_ddl;
        
        select * from dept_ddl
        
        ;
        create table emp_ddl_30
        as select * from emp 
        where deptno = 30;
        
        select * from emp_ddl_30;
        
        create table empdept_ddl
        as select e.empno,e.ename,e.job,e.mgr,e.hiredate,e.sal,e.comm,
                  d.deptno, d.dname,d.loc
                  from emp e, dept d
                  where 1 != 1;
                  
                  
create table emp_alter
as select * from emp;


select * from emp_alter;

-- hp 컬럼 추가 (글자)
alter table emp_alter 
 add hp varchar2(20);  -- varchar로 적으면 varchar2로 인식된다

-- age 컬럼 추가 (숫자)
alter table emp_alter 
 add age number(3) ;
 
--컬럼 이름변경
alter table emp_alter 
 rename column hp to te12;
 
 
 alter table emp_alter 
 modify empno number(5)
--수정할 때 타입의 크기가 커지는 건 가능하지만
-- 줄어드는 건 불가능
;
alter table emp_alter 
 modify empno number(4);
select * from emp_alter;


alter table emp_alter
drop column te12;


create table emp_ww
( empno number(4),
 ename varchar2(10),
 job varchar2(9),
 mgr number(4)
 
 );
 
 
 select * from emp_rename;
 alter table emp_ww add sal number(8);
 
 rename emp_alter to emp_rename;

truncate table emp_rename; 

drop table emp_rename;

select * from emp_rename;
----------------------------------
--10장

create table dept_temp
as select* from dept;

insert into dept_temp (deptno, dname,loc)
            values(50, 'DATABASE','SEOUL');
            
select * from dept_temp; 

select *from dept_temp
where loc like 'SEOUL';


insert into dept_temp (deptno, dname,loc)
            values(50, 'DATABASE','SEOUL');
insert into dept_temp 
            values(60, 'NETWORK','BUSAN');
            
            
 insert 
 into dept_temp
 values (70,'WEB',null);


 insert 
 into dept_temp
 values (80,'MOBILE','');


select *from dept_temp
;
insert into dept_temp (deptno,loc)
values (90,'INCHEON');


create table emp_temp
as select * from emp where 1 <> 1;

select *from emp_temp;

insert into emp_temp (empno, ename,hiredate)
values (2111, '이순신',to_date('2025-05-21','yyyy-mm-dd'));

insert into emp_temp (empno, ename,hiredate)
values (3111,'심청이',sysdate);


insert into emp_temp
select * from emp where deptno = 10;

create table dept_tem3;
as select * from DEPT_tem2;
select * from dept_tem2;

update dept_tem2 
set loc = 'SEOUL';


select * from dept_tem2;

-- update, delete의
-- where를 무조건 select에서 검증하고 사용하
update dept_tem2
set dname = 'DATABASE', loc = 'SEOUL2'
where deptno = 40;

create table emp_tmp
as select * from emp;
-- 1번 전체 테이블
select * from emp_tmp;
-- 2번 검증 단계
select * from emp_tmp
where sal < 1000;
-- 3번 업데이트  
update emp_tmp
set sal = sal*1.03
where sal < 1000;
0000000000

create table emp_temp3
as select * from emp;

select * from emp_tamp2;


commit;

delete emp_temp3
where deptno =10;


rollback;


select * from emp_temp3;



create table emp_test
     (tid varchar2(10),
     tname  varchar2(50),
     hiredate  date,
     salary  number(7,2)
     );
     
     
     
  select * from emp_test   ;
  

 insert into emp_test (tid,tname,hiredate,salary)
                values('101','john',to_date('2022-01-15','YYYY-MM-DD'),5500.50)
                ;
 delete emp_test
 ;
update emp_test
set salary =  6000
where tid = 101
;
select * from emp_test ;

alter table emp_test
add department varchar2(50)
;
update emp_test
set department = '            집'
where tid = 101

;
alter table emp_test
rename column 사는곳 to         사는곳1;

alter table emp_test
;
drop table emp_test ;


create table coc
as select * from emp
where 1 != 1;

select * from coc

;
insert into coc (empno,ename,job,mgr)
values (1111,'hyg','무직',1123); 

update coc
set mgr = null
where empno =1111
;

delete coc; 

drop table co
;
alter table coc 
rename  cll;

rename coc to c__;


create table coc
as
select deptno from emp 
where deptno = 10;

alter table c__
rename column deptno to cc1;

select * from c__
;
drop table test;


create table coc
as select * from emp

;
select * from coc
;
insert into coc (empno,ename,job)
values (8000,'hyg',null)
;
delete coc 
where empno = 8000;


select * from dict;

select * from all_table
;
select * from user_indexes;

create index idx_emp_sal 
on emp(sal);

select * from user_ind_columns
;
-- 인덱스를 내용이 별로없어 활용안하기에 -> 강제로 index하게하는법

;
select * /*+ index(e idx_emp_sal)     */   --강제 힌트
from emp e
where sal = 2000 or deptno =10; and 

-- 뷰생성

create view vw_emp20
as(select empno, ename,job,deptno from emp
where deptno = 20 );


drop view vw_emp20;


create sequence seq_dept
start with 10;
--시퀀스 숫자올라가는거 확인
select seq_dept1.nextval
from dual;

-- 시퀀스 숫자안올라가고 확인방법
select seq_dept1.currval 
from dual;


--시퀀스 삭제
drop sequence seq_dept;

insert into dept_coc (deptno, dname, loc)
values (seq_dept.nextval, '테스트','천안');

select * from user_tables;

-- pk를 만들면 indexes까지 생성해줌
create table table_pk(
login_id varchar2(20) primary key,
login_pwd varchar2(20) not null,
ter varchar2(20));

select * from table_pk
;
select * from user_indexes;
;
insert into table_pk
values ('id','pw',null);
-- 이미 존재하는거 추가
insert into table_pk
values ('id','pw',null);
--null로 추가
update table_pk
set login_id = null
where login_id = 'id';
-- 이미 존재하는 것으로 변경
update table_pk
set login_id = 2
where login_pwd = '11';


select * from table_pk


;
create table dept_fk(
deptno number(2) constraint deptk_deptno_pk primary key,
dname varchar2(14),
loc varchar2(13)
);


create table emp_fk(
empno number(4) constraint pk_emp_fk primary key,
ename varchar2(14),
deptno number(2) constraint fk_emp_fk references dept_fk(deptno)
);


select * from dept_fk;

insert into emp_fk
values ( 1000, '이름',10);

insert into dept_fk
values ( 10, '이름','위치');

insert into emp_fk
values ( 1000, '이름','위치');


update dept_fk
set deptno = 20
where deptno = 10;


select * from emp_fk;


delete dept_fk
where deptno =20;

delete emp_fk
where deptno = 10;


update dept_fk
set deptno = 20
where deptno = 10;




create table oo
(oname varchar2(10),
deptno number(5),
empno number(5) primary key,
loc varchar2(10)
);


create table ee
(oname varchar2(10),
deptno number(5),
empno number(5),
loc varchar2(10),
primary key(empno),
foreign key (empno) references oo(empno)
);


insert into oo(oname,deptno,empno,loc)
values ('김동현',1234,1,'천안');


select * from oo

;
insert into oo(oname,deptno,empno,loc)
values ('선더',1,1,'마나');


update oo
set deptno = 1, loc = '평택'
where empno = 1;

insert into oo
values ('','3',3,'') 

;
insert into oo
values ('지두',4,4,'모부');


update oo
set oname = '비미',loc = '지미';


rollback;


select * from oo;


insert into oo (oname,deptno,empno,loc)
values ('모노비',1,1,'아디')

;
alter table oo
add 소속 varchar(10);


alter table oo
rename column loc to 지역;





insert into oo(이름,기호,나이,지역,소속)
values ('11',3,73,'무무','지지');

insert into oo
values ('11',3,73,'바바','미미');


alter table oo
modify 소속 varchar2(20);


select * from oo;

insert into oo (이름,기호)
values (null,3);

update oo
set 기호 = 1 
where 나이 = 63

;
insert into oo (이름,기호,나이,지역,소속)
values ('비마',sqc_oo.nextval,sqc_oo.nextval,'만두','고생');

create sequence sqc_oo
increment by 1;

-

delete oo
where 기호 > 1
;
drop table oo

;SYS_C0033191


alter table oo
drop constraint SYS_C0033191

;
SELECT constraint_name,
       constraint_type
  FROM user_constraints
 WHERE table_name = 'OO';
 
 drop table oo
 cascade constraints purge;

--테이블 목록 전부확인
select * from user_tables
;
create table oe2
as select * from emp

;
select * from coc;

drop table oe2;


commit
;
alter table coc
rename column job to co1
;
rename table coc  to co1\

;
alter table coc
rename to co5;


create index oo1 on emp(deptno)

select * from 
;

SELECT index_name,
       table_name,
       uniqueness
  FROM user_indexes
 ORDER BY index_name
 
 ;
 drop index sal;
 
 
 select e.ename,d.dname,d.loc from emp e
 left outer join dept d on e.deptno = d.deptno;
 
 select e.ename,e.sal,d.dname,c.grade from emp e
 left outer join dept d on e.deptno = d.deptno
 left outer join salgrade c on e.sal >= c.losal and e.sal <= c.hisal
 
 ;
select round(avg(e.sal)),e.deptno,c.grade from emp e
left outer join salgrade c on round(avg(e.sal)) >= c.losal and round(avg(e.sal)) <= c.hisal

group by e.deptno,c.grade;


select e.deptno,c.grade,avg(e.sal) from emp e ,salgrade c 

group by e.deptno, c.grade
;
select deptno,grade,avg(e.sal) from emp e ,salgrade c 
         
group by deptno,grade

;
select e.deptno,avg(e.sal),c.grade from emp e
 left outer join salgrade c on avg(e.sal) >= losal

group by e.deptno
;
select e.deptno,avg(e.sal),c.grade from emp e,salgrade c
,(select avg(e.sal) from emp ) 
group by e.deptno;



select deptno,avg(sal) from 
(select deptno, avg(sal) from emp

group by deptno)e;


select e.deptno,avg(e.sal),c.grade 
from (select deptno,avg(sal) from emp x group by deptno)
e
left outer join salgrade c on x.avg(e.sal) >= c.losal and x.avg(e.sal) <= c.hisal

;


se

desc emp;



CREATE TABLE 사원정보 (
	empno	number(4)	NOT NULL,
	ename	vachar2(10)	NULL,
	job	vachar2(9)	NULL,
	mgr	number(4)	NULL,
	hiredate	date	NULL,
	sal	number(7.2)	NULL,
	comm	number(7.2)	NULL,
	deptno	number(2)	NOT NULL
);

CREATE TABLE `부서정보` (
	`부서번호`	number(2)	NOT NULL,
	`부서명`	varchar2(14)	NULL,
	`위치`	varchar2(13)	NULL
);

ALTER TABLE `사원정보` ADD CONSTRAINT `PK_사원정보` PRIMARY KEY (
	`empno`
);

ALTER TABLE `부서정보` ADD CONSTRAINT `PK_부서정보` PRIMARY KEY (
	`부서번호`
);




CREATE TABLE game1 (
    게임   VARCHAR2(255),
    가격   NUMBER(10),
    평점    NUMBER(7,2),
    출시일  DATE,
    장르      VARCHAR2(40),
    그림      VARCHAR2(40),
    제작사   VARCHAR2(20),
    제작사본사   VARCHAR2(20),
    제작사창립일  DATE
);

select * from as  이름 
where 장르_id  = 1  

 
1000001


장르 _id / 장르이름

  walsl2    / 로맨스
  
  2    / sf
  
  
  3  /  멜로
  
  
--  문항1】 emp 테이블에는 사원명(ename, varchar2(10))과 사원번호(empno, number(4))가 있습니다
--다음 사항을 만족하는 sql을 작성하시오. 
--1. 테이블의 사원번호(empno)와 사원명(ename)만 출력
--2. 사원번호가 높은 숫자부터 낮은 숫자 순서로 출력
--3. 보안을 위해 앞 2자리는 그대로 출력하고 나머지는 * 기호로 표시(출력 예시: 73**










1;
select ename,rpad(substr(empno,1,2),length(empno),'*') as empno from emp
order by empno desc;











--2mp 테이블에는 사원명(ename, varchar2(10)), 사원번호(empno, number(4)), 부서번호(deptno, number(2))가 
--있습니다.
-- dept 테이블에는 부서번호(deptno, number(2)), 부서이름(dname, varchar2(14)), 부서위치(loc, varchar2(13))가 
--있습니다.
--다음 사항을 만족하는 sql을 작성하시오. 
--1. 사원번호(empno), 사원명(ename), 부서이름(dname), 부서위치(loc)를 출력하세요
--2. 부서이름(dname) 기준으로 내림차순 정렬하세요










select e.empno,e.ename,d.dname,d.loc from emp e
left outer join dept d on e.deptno = d.deptno 

order by dname desc; 
  where e.deptno = 10 and job (select deptno from emp where job    
  
  
      
  create table tbl_todo (
  tno number primary key,
  title varchar2(4000) not null,
  dueDate date,
  finished number(1) 
--  default 0
  );
  select * from tbl_todo;
  
  create sequence seq_tbl_todo;
  
  
  insert into tbl_todo (tno, title, duedate, finished)
  values (seq_tbl_todo.nextval,'연습1',to_date( '2025-08-19','yyyy-mm-dd'), 0);
  
  delete tbl_todo
  where tno = 21;
  
  
  select * from tbl_todo
  where tno = 22;
  
  update tbl_todo
  set title = '바꾸기',
  duedate = '2025-01-01',
  finished = 1
  where tno = 40;
  
  commit;

