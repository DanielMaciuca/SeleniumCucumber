package JavaCourse.ConditionalStatements.Switch;

public class Example {
    public static void main(String[] args) {

        // If the value of dayOFWeek matches a case, the block code will be executed AND all the CODE after will be executed as well
        // If the value of dayOFWeek DOESN'T match a case, default code block will be executed
        // You can use 'brake' to stop the Switch code execution -> if dayOFWeek matches any case, the code is executed until the break is encountered

        int dayOFWeek = 2;

        switch (dayOFWeek) {
            case 1:
                System.out.println("First day");
                break;
            case 2:
                System.out.println("Second day");
                break;
            case 3:
                System.out.println("Third day");
                break;
            default:
                System.out.println("Invalid day");
        }

        String role = "Admin";

        if (role.equals("Admin")) {
            System.out.println("Role is admin");
        } else if (role.equals("Moderator")) {
            System.out.println("Role is Moderator");
        } else {
            System.out.println("There is a different role");
        }

        String secondRole = "Admin";
        switch (secondRole) {
            case "Admin":
                System.out.println("User is Admin");
                break;
            case "Moderator":
                System.out.println("User is Moderator");
                break;
            default:
                System.out.println("Invalid Role");
        }
    }

}
