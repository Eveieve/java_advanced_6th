package jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx03_by_parkgunhee {
    Connection conn = null;
    CallableStatement cs = null;
    public CallableStmtEx03_by_parkgunhee() throws SQLException {
        // 1. DBUtil에서 커낵션을 얻어올 것이다.
        conn = DBUtil.getConnection();
        // 내가 원할 때 커밋 하겠다
        conn.setAutoCommit(false);
        // 2. CallableStatement 객체를 이용하여 호출할 프로시저를 cs에 연결한다.
        cs = conn.prepareCall("{call SP_MEMBER_INSERT(?, ?, ?, ?, ?, ?, ?)}");
        // 3. 바인드 변수 (?) 에 값을 셋팅한다. inprarmenter (?)에 값 넣기
        cs.setString(1, "TB_MEMBER");
        cs.setString(2, "wm5256");
        cs.setString(3, "wm52566");
        cs.setString(4, "wm5256@naver.com");
        cs.setString(5, "02-592-2572");
        cs.setInt(6, 35100);
        // 4. OUT 파라미터에 저장된 프로시저의 수행 결과를 출력
        // 외부 변수를 등록할 필요가 있다
        cs.registerOutParameter(7, java.sql.Types.VARCHAR);
        // 5. 쿼리 수행
        // flag 의 값은 resultSet 객체의 경우는 true, 갱신카운트 또는 결과가 없는 false 리턴 됨
        boolean flag = cs.execute();
        System.out.println(flag);
        String resultMsg = cs.getString(7);
        System.out.println(resultMsg);
        // 내가 원할 때 커밋 하겠다
        conn.commit();
        // 6. 연결 닫기 (반드시 순서대로)
        if (cs != null) cs.close();
        if (conn != null) conn.close();
    }
    public static void main(String[] args) throws SQLException {
        new CallableStmtEx03();
    }
}