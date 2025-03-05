use ssgdb;

DROP TABLE IF EXISTS tb_product;

CREATE TABLE tb_product
( prodCode CHAR(3) NOT NULL,
  prodId CHAR(4) NOT NULL,
  prodDate DATETIME NOT NULL,
  prodState CHAR(10) NULL

);

ALTER TABLE tb_product
    ADD CONSTRAINT PK_product_proCode_proID
        PRIMARY KEY (prodCode,prodId);

-- 테이블의 인덱스 정보 확인
SHOW INDEX FROM tb_product;
SHOW INDEX FROM tb_member;


-- 뷰 (VIEW) : 일반 사용자 입장에서는 테이블과 동일하게 사용하는 객체이다. 뷰는 한번 생성해 놓으면 테이블처럼 사용가능한 객체이다.


SELECT userid,name,addr FROM usertbl;

create view v_usertbl as SELECT userid,name,addr FROM usertbl;

select * from v_usertbl;   -- view 는 읽기 전용 테이블이다.  뷰는 수정은 가능하지만 권장하지 않는다.


-- 물건을 구매한 회원들의 리스트 출력

CREATE VIEW v_userbuytbl as
SELECT u.userid , u.name, u.addr from usertbl u inner join buytbl b on u.userID = b.userID;
select * from v_userbuytbl where name ='김범수';

drop view v_userbuytbl;




-- 테이블 스페이스
#   테이블이 저장되는 물리적 공간을 '테이블 스페이스'라고 한다.
#   대용량의 데이터를 다룰 때 성능 향상을 위해 테이블 스페이스에 대한 설정방법을 알아야 함
#   데이터베이는 테이블을  논리적 공간으로 다루며, 테이블 스페이스는 실제로 데이터가 저장되는 물리적 공간을 의미한다.

SHOW VARIABLES LIKE 'innodb_data_file_path';

-- 대용량의 데이터를 운영한다고 가정하고, 테이블스페이스를 분리해서 설정하는 방법

# 1. innodb_file_per_table 상태정보를 on 상태인지를 확인한다.
SHOW VARIABLES  LIKE 'innodb_file_per_table';

# 테이블 스페이스 설정

CREATE TABLESPACE ts__a add datafile 'ts_a.ibd';
CREATE TABLESPACE ts__b add datafile 'ts_b.ibd';
CREATE TABLESPACE ts__c add datafile 'ts_c.ibd';


use ssgdb;
create table  table_a (id int) tablespace ts__a;
alter table table_a tablespace ts__b ;

create table table_c (select * from sakila.customer);






