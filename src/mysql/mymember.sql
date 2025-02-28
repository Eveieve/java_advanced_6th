use ssgdb;
create table mymember
(
    memId   varchar(20) primary key,
    memName varchar(30) not null,
    memPass varchar(20) not null,
    memTel  numeric(13) not null,
    memAddr varchar(50) not null
);
