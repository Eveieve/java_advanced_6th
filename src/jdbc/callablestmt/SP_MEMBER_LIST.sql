drop procedure SP_MEMBER_LIST;
delimiter $$
create procedure SP_MEMBER_LIST()
begin
    set @sqlstr = concat('SELECT * FROM TB_MEMBER');
prepare stmt from @sqlstr;
execute stmt;
deallocate prepare stmt;

commit ;
end $$
delimiter ;

call SP_MEMBER_LIST();