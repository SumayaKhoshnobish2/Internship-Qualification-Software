import java.util.Scanner;

public class InternshipQualification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("What is your class grade? ");
        int classGrade = scanner.nextInt();
        System.out.print("What are your contract points?: ");
        int contractPoints = scanner.nextInt();

        checkQualification(name, classGrade, contractPoints);
    }

    public static void checkQualification(String name, int classGrade, int contractPoints) {
        if (classGrade >= 70 && contractPoints >= 350) {
            System.out.println(name + ", Congratulations! You qualify for an internship.");
        } else {
            System.out.println(name + ", you do not qualify for an internship.");
        }
    }
}
