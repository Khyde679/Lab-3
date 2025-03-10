package DataVizualizer;

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
            extracurricular = data[17].equals("true");
            internet = data[18].equals("true");
            parentEd = data[19];
            familyIncome = data[20];
            stress = Integer.parseInt(data[21]);
            sleep = Float.parseFloat(data[22]);
        } catch (NumberFormatException e) {
            System.out.println("Id = " + id);
            System.out.println("First Name = " + fname);
            System.out.println("Last Name = " + lname);
            System.out.println("Email = " + email);
            System.out.println("Gender = " +gender);
            System.out.println("Age = " + age);
            System.out.println("Department = " + department);
            System.out.println("Attendance = " + attendance);
            System.out.println("midtermScore = " + midtermScore);
            System.out.println("finalScore = " +finalScore);
            System.out.println("assignAvg = " +assignAvg);
            System.out.println("quizAvg = " +quizAvg);
            System.out.println("participation = " +participation);
            System.out.println("projScore = " +projScore);
            System.out.println("totalScore = " +totalScore);
            System.out.println("grade = " +grade);
            System.out.println("studyHours = " +studyHours);
            System.out.println("Extracurricular = " + extracurricular);
            System.out.println("Internet = " + internet);
            System.out.println("Parent Education = " + parentEd);
            System.out.println("Project Score = " + projScore);
            System.out.println("Family Income = " + familyIncome);
            System.out.println("Stress Level = " + stress);
            System.out.println("Sleep Amount = " + sleep);

            throw e;
        }

        return new StudentGradeData(id, fname, lname, email, gender, age, department, attendance, midtermScore, finalScore, assignAvg, quizAvg, participation,
                projScore, totalScore, grade, studyHours, extracurricular, internet, parentEd, familyIncome, stress, sleep);
    }
}
