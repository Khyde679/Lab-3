package DataVizualizer;

public record StudentGradeData(String id, String fname, String lname, String email, String gender, int age, String department, float attendance,
                               float midtermScore, float finalScore, float assignAvg, float quizAvg, float participation, float projScore, float totalScore, String grade, float studyHours,
                               boolean extracurricular, boolean internet, String parentEd, String familyIncome, int stress, float sleep) {

    public Object[] toObjectArray() {
    Object[] objects = new Object[23];
    objects[0] = id;
    objects[1] = fname;
    objects[2] = lname;
    objects[3] = email;
    objects[4] = gender;
    objects[5] = age;
    objects[6] = department;
    objects[7] = attendance;
    objects[8] = midtermScore;
    objects[9] = finalScore;
    objects[10] = assignAvg;
    objects[11] = quizAvg;
    objects[12] = participation;
    objects[13] = projScore;
    objects[14] = totalScore;
    objects[15] = grade;
    objects[16] = studyHours;
    objects[17] = extracurricular;
    objects[18] = internet;
    objects[19] = parentEd;
    objects[20] = familyIncome;
    objects[21] = stress;
    objects[22] = sleep;

    return objects;
    }

}
