package DataVizualizer;

public class Stream {
    public static StudentGradeData parseData(String[] data) {
        String id = data[0];
        String fname = data[1];
        String lname = data[2];
        String email = data[3];
        String gender = data[4];
        int age = Integer.parseInt(data[5]);
        String department = data[6];
        float attendance = Float.parseFloat(data[7]);
        float midtermScore = Float.parseFloat(data[8]);
        float finalScore = Float.parseFloat(data[9]);
        float assignAvg = Float.parseFloat(data[10]);
        float quizAvg = Float.parseFloat(data[11]);
        float participation = Float.parseFloat(data[12]);
        float projScore = Float.parseFloat(data[13]);
        String grade = data[14];
        float studyHours = Float.parseFloat(data[15]);
        boolean extracurricular = data[16].equals("true");
        boolean internet = data[17].equals("true");
        String parentEd = data[18];
        String familyIncome = data[19];
        int stress = Integer.parseInt(data[20]);
        float sleep = Float.parseFloat(data[21]);

        return new StudentGradeData(id, fname, lname, email, gender, age, department, attendance, midtermScore, finalScore, assignAvg, quizAvg, participation,
                projScore, grade, studyHours, extracurricular, internet, parentEd, familyIncome, stress, sleep);
    }
}
