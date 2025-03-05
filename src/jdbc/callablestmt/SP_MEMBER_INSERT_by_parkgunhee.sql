DROP PROCEDURE sp_MEMBER_INSERT;
DELIMITER $$
CREATE PROCEDURE sp_MEMBER_INSERT(IN m_userid VARCHAR(255), IN m_pwd VARCHAR(255), IN m_email VARCHAR(255), IN m_hp VARCHAR(255),IN m_point INT,
                                  IN cTName VARCHAR(255), OUT resultMsg VARCHAR(255))
BEGIN
    SET @sql = CONCAT(
            'INSERT INTO ', cTName,' (m_userid, m_pwd, m_email, m_hp,m_point) ',
               'VALUES (?,?,?,?,?)'
               );
    SET @m_userid = m_userid;
    SET @m_pwd = m_pwd;
    SET @m_email = m_email;
    SET @m_hp = m_hp;
    SET @m_point = m_point;
    SET resultMsg = '회원 정보가 안전하게 저장되었습니다.';

PREPARE stmt FROM @sql;
EXECUTE stmt USING @m_userid, @m_pwd, @m_email, @m_hp, @m_point;
DEALLOCATE PREPARE stmt;
END $$
DELIMITER ;


박건희
오후 12:21
drop procedure SP_MEMBER_INSERT;
delimiter $$
create procedure SP_MEMBER_INSERT (in TName varchar(20), in userid varchar(20), in pwd varchar(20), in email varchar(50),
                                   in hp varchar(20), in point int, out resultMsg varchar(20))
begin
    set @userid = userid;
    set @pwd = pwd;
    set @email = email;
    set @hp = hp;
    set @point = point;
    set resultMsg = '회원 정보가 안전하게 저장되었습니다.';
    set @strsql = concat('insert into ', TName, ' (m_userid, m_pwd, m_email, m_hp, m_registdate, m_point) ',
                             'values(?, ?, ?, ?, now(), ?);');
prepare stmt from @strsql;
execute stmt using @userid, @pwd, @email, @hp, @point;
deallocate prepare stmt;
COMMIT;
end $$
delimiter ;
set @resultMsg = '';
call SP_MEMBER_INSERT('TB_MEMBER', '12', '1', '1', '1', 1, @resultMsg);
select @resultMsg;