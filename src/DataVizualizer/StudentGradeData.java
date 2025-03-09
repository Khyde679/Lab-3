package DataVizualizer;

public record StudentGradeData(String id, String fname, String lname, String email, String gender, int age, String department, float attendance,
                               float midtermScore, float finalScore, float assignAvg, float quizAvg, float participation, float projScore, String grade, float studyHours,
                               boolean extracurricular, boolean internet, String parentEd, String familyIncome, int stress, float sleep) {
public Object[] toObjectArray() {
    Object[] objects = new Object[22];
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
    objects[14] = grade;
    objects[15] = studyHours;
    objects[16] = extracurricular;
    objects[17] = internet;
    objects[18] = parentEd;
    objects[19] = familyIncome;
    objects[20] = stress;
    objects[21] = sleep;

    return objects;
}

}
