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