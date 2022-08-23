import com.quest.Logic;
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
import static org.mockito.Mockito.atLeast;

public class LogicTest {

    @Test
    public void logicTest() throws ServletException, IOException {
        Logic logic = new Logic();

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletContext servletContext = mock(ServletContext.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        HttpSession session = mock(HttpSession.class);

        servletContext.setAttribute("question", "2");

        when(request.getServletContext()).thenReturn(servletContext);
        when(request.getParameter("question")).thenReturn("2");
        when(request.getSession()).thenReturn(session);
        when(servletContext.getRequestDispatcher("/gameOver.jsp")).thenReturn(dispatcher);
        when(request.getRequestDispatcher("/gameOver.jsp")).thenReturn(dispatcher);

        logic.doGet(request, response);

        verify(servletContext, times(1)).getRequestDispatcher("/gameOver.jsp");

        assertEquals("2", request.getParameter("question"));

        verify(request, atLeast(1)).getParameter("question");
    }


}
