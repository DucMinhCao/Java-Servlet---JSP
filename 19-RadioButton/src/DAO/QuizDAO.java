package DAO;

import Bean.Question;
import DB.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuizDAO {
    public static List<Question> DisplayQuestion() {
        Connection connection = null;
        PreparedStatement pstm = null;
        List<Question> list = new ArrayList<>();
        try {
            connection = DBConnection.getConnectino();
            String query = "SELECT * FROM cauhoitoeic";
            pstm = connection.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Question dummyQuestion = new Question();
                dummyQuestion.setId(rs.getInt("id"));
                dummyQuestion.setQuestion(rs.getString("question"));
                dummyQuestion.setOption1(rs.getString("option1"));
                dummyQuestion.setOption2(rs.getString("option2"));
                dummyQuestion.setOption3(rs.getString("option3"));
                dummyQuestion.setOption4(rs.getString("option4"));
                dummyQuestion.setCorrectAnswer(rs.getString("correctAnswer"));
                list.add(dummyQuestion);
            }
            rs.close();
            pstm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
         }
        return list;
    }

    public static List<String> resultList() {
        Connection connection = null;
        PreparedStatement pstm = null;
        List<String> resultList = new ArrayList<>();
        try {
            connection = DBConnection.getConnectino();
            String query = "SELECT correctAnswer FROM cauhoitoeic";
            pstm = connection.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                resultList.add(rs.getString("correctAnswer"));
            }
            rs.close();
            pstm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return resultList;
    }

    public static int GetNumberOfQuestion() {
        int count = 0;
        Connection connection = null;
        PreparedStatement pstm = null;
        try {
            connection = DBConnection.getConnectino();
            String query = "SELECT * FROM cauhoitoeic";
            pstm = connection.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ++count;
            }
            rs.close();
            pstm.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return count;
        }
    }

}
