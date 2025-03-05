package jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmt03_by_kangchangseon {

    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmt03_by_kangchangseon() throws SQLException{
        // 1. connection 얻어오기
        conn = DBUtil.getConnection();
        conn.setAutoCommit(false);

        // 2. CallableStatement 객체를 이용하여 호출할 프로시저 연결
        cs = conn.prepareCall("{call sp_MEMBER_INSERT(?,?,?,?,?,?,?)}"); // ? : cDATA ? : cTName ? resultMsg
        // 3. 바인드 변수에 값을 셋팅 inprarmenter (?) 에 값 넣기
        cs.setString(1, "응애"); // 코드 네임
        cs.setString(2, "123");
        cs.setString(3, "응애@com");
        cs.setString(4, "01011112222");
        cs.setInt(5, 123);
        cs.setString(6, "TB_MEMBER"); // 코드를 등록할 테이블 명

        // 4. out 파라미터에 저장된 프로시저의 수행결과에 대한 외부 변수 등록
        cs.registerOutParameter(7, java.sql.Types.VARCHAR);

        // 5. 쿼리 수행
        // flag의 값은 resultSet 객체의 경우는 true, 갱신 카운트 또는 결과가 없는 경우 false 리턴됨
        boolean flag = cs.execute();
        String resultMsg = cs.getString(7);

        System.out.println(flag);
        System.out.println(resultMsg);

        conn.commit();

        if(cs != null) cs.close();
        if(conn != null) conn.close();
    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx03();
    }
}
