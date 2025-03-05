package jdbc.callablestmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//싱글톤을 적용한 Connection 객체 제공
public class DBUtil {

    private static Connection conn = null;   //내부에서 생성하여 선택적 공유할 수 있도록 private static 선언

    //외부에서 인스턴스 생성을 막기 위해서
    private DBUtil() {}

    public static Connection getConnection() {
        if (conn != null) {
            return conn;  // 기존에 연결이 존재한다면 그대로 반환
        }

        try {
            //1. MySQL 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. MySQL 연결 URL (3 가지 매개변수 값 : url , id, pwd)
            String url = "jdbc:mysql://127.0.0.1:3306/ssgdb?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "mysql1234";
            conn = DriverManager.getConnection(url, username, password);

            //3. "연결성공" 메세지 콘솔 출력
            System.out.println("Connected to the database successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버를 찾을 수 없습니다. 로드 실패!" + e.getMessage());
        } catch (SQLException e1){
            e1.printStackTrace();
        }


        return conn;
    }



}
