package jdbc.callablestmt;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStmtEx04 {
    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmtEx04() throws SQLException {
          // 1. connection 얻어오기
          conn =  DBUtil.getConnection();
          conn.setAutoCommit(false); // 자동커밋을 비활성화하여 수동커밋 전환 


          // 2. CallableStatement 객체를 이용하여 호출할 프로시저 연결
          cs = conn.prepareCall("{CALL SP_MEMBER_LIST()}");

          // 5. 쿼리 수행
          ResultSet rs = cs.executeQuery();

        while (rs.next()) {
            String seq = rs.getString("m_seq");
            String userid = rs.getString("m_userid");
            String pwd = rs.getString("m_pwd");
            String email = rs.getString("m_email");
            String hp = rs.getString("m_hp");
            String registdate = rs.getString("m_registdate");
            String point = rs.getString("m_point");
            System.out.printf("%s %s %s %s %s %s %n", seq, userid, pwd, email, hp, registdate, point);
        }



           if(rs != null) rs.close();
           if(cs != null) cs.close();
           if(conn != null) conn.close();

    }

    public static void main(String[] args) throws SQLException {
         new CallableStmtEx04();
    }


}
