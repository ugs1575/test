DROP TABLE DEPT CASCADE CONSTRAINTS;
-- 부서 테이블
CREATE TABLE DEPT
( 
        DEPTNO NUMBER(2),
        DNAME VARCHAR2(14),
        LOC VARCHAR2(13) 
);
 
 
INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');
INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');
INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');
 
 
 
 
DROP TABLE EMP CASCADE CONSTRAINTS;
 
-- 직원 테이블
CREATE TABLE EMP
(
        EMPNO     NUMBER(4) NOT NULL,
        ENAME      VARCHAR2(10),
        JOB           VARCHAR2(9),
        MGR          NUMBER(4),
        HIREDATE    DATE,
        SAL            NUMBER(7, 2),
        COMM        NUMBER(7, 2),
        DEPTNO      NUMBER(2)
);
 
 
DELETE FROM EMP;
 
 
INSERT INTO EMP VALUES(7654, 'MARTIN', 'SALESMAN',  7698,
        sysdate, 1250, 1400, 30);
INSERT INTO EMP VALUES(7698, 'BLAKE',  'MANAGER',   7839,
        sysdate,  2850, NULL, 30);
INSERT INTO EMP VALUES(7782, 'CLARK',  'MANAGER',   7839,
       sysdate,  2450, NULL, 10);
INSERT INTO EMP VALUES(7788, 'SCOTT',  'ANALYST',   7566,
        sysdate, 3000, NULL, 20);
INSERT INTO EMP VALUES(7839, 'KING',   'PRESIDENT', NULL,
        sysdate, 5000, NULL, 10);
 
 
SELECT * FROM EMP;
SELECT * FROM emp WHERE deptno=10 ORDER BY deptno;

-- 직원수 출력
SELECT count(*) as o_count FROM EMP
WHERE deptno = 10;

