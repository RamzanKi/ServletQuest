import com.quest.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserTest {
    @Test
    public void userTest() {
        User user = new User("myName");
        user.addUser();

        assertEquals(1, user.getUsersCount());
        assertEquals("myName", user.getName());

    }
}
