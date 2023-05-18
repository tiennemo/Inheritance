package advance.dev;

import java.util.Scanner;

public class MainApp {
	 public static void main(String[] args) {
	        Person[] persons = new Person[10];
	        input(persons);
	        System.out.println("Danh sách các người:");
	        print(persons);

	        
	 }

	    public static void input(Person[] persons) {
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < persons.length; i++) {
	            System.out.println("Nhập thông tin cho người thứ " + (i + 1) + ":");
	            System.out.print("Tên: ");
	            String name = scanner.nextLine();
	            System.out.print("Tuổi: ");
	            int age = Integer.parseInt(scanner.nextLine());
	            System.out.print("Số điện thoại: ");
	            String phoneNumber = scanner.nextLine();

	            if (i < 4) {
	                System.out.print("Mã giáo viên: ");
	                String teacherId = scanner.nextLine();
	                System.out.print("Hệ số lương: ");
	                double salaryCoefficient = Double.parseDouble(scanner.nextLine());
	                persons[i] = new Teacher(name, age, phoneNumber, teacherId, salaryCoefficient);
	            } else {
	                System.out.print("Điểm Toán: ");
	                double mathScore = Double.parseDouble(scanner.nextLine());
	                System.out.print("Điểm Lý: ");
	                double physicsScore = Double.parseDouble(scanner.nextLine());
	                System.out.print("Điểm Hóa: ");
	                double chemistryScore = Double.parseDouble(scanner.nextLine());
	                System.out.print("Mã sinh viên: ");
	                String studentId = scanner.nextLine();
	                System.out.print("Lớp: ");
	                String className = scanner.nextLine();
	                persons[i] = new Student(name, age, phoneNumber, mathScore, physicsScore, chemistryScore, studentId, className);
	            }}
	        }
	    
	    public static void print(Person[] persons) {
	        for (Person person : persons) {
	            System.out.println("Thông tin: ");
	            System.out.println("Tên: " + person.getName());
	            System.out.println("Tuổi: " + person.getAge());
	            System.out.println("Số điện thoại: " + person.getPhoneNumber());
	            if (person instanceof Teacher) {
	                Teacher teacher = (Teacher) person;
	                System.out.println("Mã giáo viên: " + teacher.getTeacherId());
	                System.out.println("Hệ số lương: " + teacher.getSalaryCoefficient());
	            } else if (person instanceof Student) {
	                Student student = (Student) person;
	                System.out.println("Điểm Toán: " + student.getMathScore());
	                System.out.println("Điểm Lý: " + student.getPhysicsScore());
	                System.out.println("Điểm Hóa: " + student.getChemistryScore());
	                System.out.println("Mã sinh viên: " + student.getStudentId());
	                System.out.println("Lớp: " + student.getClassName());
	                System.out.println("Điểm trung bình: " + student.calculateAverageScore());
	            }
	            System.out.println("--------------------");

}}}