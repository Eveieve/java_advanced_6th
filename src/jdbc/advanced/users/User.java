package jdbc.advanced.users;

import lombok.Data;
import lombok.ToString;

/**
 * The type User.
 */
@Data

public class User {
    private String memId;
    private String memName;
    private String memPass;
    private String memTel;
    private String memAddr;
}
