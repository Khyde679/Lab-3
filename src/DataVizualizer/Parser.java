package DataVizualizer;

import java.util.Objects;

public class Parser {
    public static StudentGradeData parseData(String[] data) {
        String id = "";
        String fname = "";
        String lname = "";
        String email = "";
        String gender = "";
        int age = 0;
        String department = "";
        float attendance = 0;
        float midtermScore = 0;
        float finalScore = 0;
        float assignAvg = 0;
        float quizAvg = 0;
        float participation = 0;
        float projScore = 0;
        float totalScore = 0;
        String grade = "";
        float studyHours = 0;
        boolean extracurricular = false;
        boolean internet = false;
        String parentEd = "";
        String familyIncome = "";
        int stress = 0;
        float sleep = 0;

        try {
            id = data[0];
            fname = data[1];
            lname = data[2];
            email = data[3];
            gender = data[4];
            age = Integer.parseInt(data[5]);
            department = data[6];
            attendance = Float.parseFloat(data[7]);
            midtermScore = Float.parseFloat(data[8]);
            finalScore = Float.parseFloat(data[9]);
            assignAvg = Float.parseFloat(data[10]);
            quizAvg = Float.parseFloat(data[11]);
            participation = Float.parseFloat(data[12]);
            projScore = Float.parseFloat(data[13]);
            totalScore = Float.parseFloat(data[14]);
            grade = data[15];
            studyHours = Float.parseFloat(data[16]);
            extracurricular = strToBool(data[17]);
            internet = strToBool(data[18]);
            parentEd = data[19];
            familyIncome = data[20];
            stress = Integer.parseInt(data[21]);
            sleep = Float.parseFloat(data[22]);
        } catch (NumberFormatException e) {
            id = "Null";
            fname = "Null";
            lname = "Null";
            email = "Null";
            gender = "Null";
            age = -1;
            department = "Null";
            attendance = -1;
            midtermScore = -1;
            finalScore = -1;
            assignAvg = -1;
            quizAvg = -1;
            participation = -1;
            projScore = -1;
            totalScore = -1;
            grade = "Null";
            studyHours = -1;
            extracurricular = false;
            internet = false;
            parentEd = "Null";
            familyIncome = "Null";
            stress = -1;
            sleep = -1;
        }

        return new StudentGradeData(id, fname, lname, email, gender, age, department, attendance, midtermScore, finalScore, assignAvg, quizAvg, participation,
                projScore, totalScore, grade, studyHours, extracurricular, internet, parentEd, familyIncome, stress, sleep);
    }

    private static boolean strToBool(String str) {
        return Objects.equals(str, "Yes");
    }
}
