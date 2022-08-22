import com.quest.Logic;
import com.quest.Login;
import org.junit.jupiter.api.Test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class LoginTest {

    @Test
    public void loginTest() throws ServletException, IOException {
        Login login = new Login();

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletContext servletContext = mock(ServletContext.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        HttpSession session = mock(HttpSession.class);

        when(request.getSession(true)).thenReturn(session);
        when(request.getServletContext()).thenReturn(servletContext);
        when(servletContext.getRequestDispatcher("/game.jsp")).thenReturn(dispatcher);
        when(request.getParameter("username")).thenReturn("myName");

        login.doGet(request, response);


        verify(servletContext, times(1)).getRequestDispatcher("/game.jsp");
        verify(request, times(1)).getRemoteAddr();

        assertEquals("myName", request.getParameter("username"));
        verify(request, atLeast(1)).getParameter("username");
    }
}
