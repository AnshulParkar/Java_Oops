public class StudentDetails {
    public static void main(String[] args) {
        // Check if the user provided the correct number of command-line arguments
        if (args.length != 4) {
            System.out.println("Usage: java StudentDetails <name> <roll_number> <age> <course>");
            return;
        }

        // Extract details from command-line arguments
        String name = args[0];
        String rollNumber = args[1];
        int age = Integer.parseInt(args[2]);
        String course = args[3];

        // Display the student's details
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
