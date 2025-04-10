package mini_proj;
import java.util.Scanner;

class Student {
    private String name;
    private String studentID;
    private String courses = "";
    private int balance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        this.name = in.nextLine();
        setStudentID();
    }

    // Generate an ID
    private void setStudentID() {
        id++;
        this.studentID = "S" + id;
    }

    // Enroll in courses
    public void enroll() {
        Scanner in = new Scanner(System.in);
        String course;
        while (true) {
            System.out.print("Enter course to enroll (Q to quit): ");
            course = in.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses += "\n  " + course;
                balance += costOfCourse;
            } else {
                break;
            }
        }
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    // Pay Tuition
    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your payment: ₹");
        int payment = in.nextInt();
        balance -= payment;
        System.out.println("Thank you for your payment of ₹" + payment);
        viewBalance();
    }

    // Show status
    public void showStatus() {
        System.out.println("\n--- Student Status ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentID);
        System.out.println("Courses Enrolled:" + courses);
        System.out.println("Balance: ₹" + balance);
    }
}

public class student_management_systm {
    public static void main(String[] args) {
        Student st = new Student();
        st.enroll();
        st.viewBalance();
        st.payTuition();
        st.showStatus();
    }
}



public class student_management_systm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
