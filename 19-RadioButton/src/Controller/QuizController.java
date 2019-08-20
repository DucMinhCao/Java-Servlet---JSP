package Controller;

import Bean.AnswerUser;
import Bean.Question;
import DAO.QuizDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@WebServlet("/QuizController")
public class QuizController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numberOfQuestion = QuizDAO.GetNumberOfQuestion();
        List<AnswerUser> answerUser = new ArrayList<>();
        List<String> rightAnswer = QuizDAO.resultList();
        for (int i = 1; i <= numberOfQuestion; i++) {
            String answer = request.getParameter(String.valueOf(i));
            if (answer != null) {
                AnswerUser au = new AnswerUser();
                au.setNumber(i);
                au.setAnswer(answer);
                answerUser.add(au);
            } else {
                request.setAttribute("ErroMessage", "You havent finished the test");
                List<Question> list = QuizDAO.DisplayQuestion();
                request.setAttribute("list", list);
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Quiz.jsp");
                rd.forward(request, response);
            }
        }
        request.setAttribute("rightAnswer", rightAnswer);
        request.setAttribute("userAnser", answerUser);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Result.jsp");
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
