import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class LoginTest {

    @Test
    public void loginTest() {
        HttpServletRequest request = mock(HttpServletRequest.class);

        when(request.getParameter("username")).thenReturn("myName");

        assertEquals("myName", request.getParameter("username"));
        verify(request, atLeast(1)).getParameter("username");
    }
}
