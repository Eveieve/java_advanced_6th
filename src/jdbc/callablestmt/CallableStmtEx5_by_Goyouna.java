package jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStmtEx5_by_Goyouna {

    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmtEx5_by_Goyouna() throws SQLException {

        conn =  DBUtil.getConnection();
        conn.setAutoCommit(false);

        cs = conn.prepareCall("{call SP_MEMBER_LIST()}");
        ResultSet rs = cs.executeQuery();

        while (rs.next()){
            sp_memberDto spMemberDto = new sp_memberDto();
            spMemberDto.setM_seq(rs.getInt("m_seq"));
            spMemberDto.setM_userid(rs.getString("m_userid"));
            spMemberDto.setM_pwd(rs.getString("m_pwd"));
            spMemberDto.setM_email(rs.getString("m_email"));
            spMemberDto.setM_hp(rs.getString("m_hp"));
            spMemberDto.setM_registdate(rs.getDate("m_registdate"));
            spMemberDto.setM_point(rs.getInt("m_point"));
            System.out.println(spMemberDto);
        }

        if(rs!=null) rs.close();
        if(cs != null) cs.close();
        if(conn != null) conn.close();

    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx5_by_Goyouna();

    }
}