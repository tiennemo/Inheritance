package advance.dev;

public class Student extends Person {
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;
    private String studentId;
    private String className;

    public Student(String name, int age, String phoneNumber, double mathScore, double physicsScore, double chemistryScore, String studentId, String className) {
        super(name, age, phoneNumber);
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.studentId = studentId;
        this.className = className;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double calculateAverageScore() {
        return (mathScore + physicsScore + chemistryScore) / 3;
    }
}