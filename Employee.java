import java.util.Scanner;
// WAP to read and display details of an employee using single class and its object
public class Employee {
    
    public static final String id = null;

    public static void main(String args[])
    {
	System.out.println("Anshul Parkar\n C23-122\n");
        Scanner sc = new Scanner(System.in);
        Emp e = new Emp();
        System.out.println("Enter the Employee Details");
        System.out.println("Enter the Employee Id");
        e.id=sc.nextInt();
        System.out.println("Enter the Employee Name");
        e.name=sc.next();
        System.out.println("Enter the Employee Salary");
        e.salary=sc.nextFloat();
        System.out.println("\nAll Employee Details Are:\n");
        System.out.println("ID \t\t Name \t\t Salary \t\t");
        System.out.println(+e.id+ "\t\t " +e.name+ "\t\t " +e.salary+ "\t\t ");

    }

    nt name;
}
// cla
// }
// class Emp{
//     int id;
//     String name;
//     float salary;
// }