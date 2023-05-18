package advance.dev;

public class Teacher extends Person {
    private String teacherId;
    private double salaryCoefficient;

    public Teacher(String name, int age, String phoneNumber, String teacherId, double salaryCoefficient) {
        super(name, age, phoneNumber);
        this.teacherId = teacherId;
        this.salaryCoefficient = salaryCoefficient;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double calculateSalary() {
		return salaryCoefficient;
        // Do the salary calculation based on the salary coefficient
        // and any other relevant factors
        // Return the calculated salary
    }
}