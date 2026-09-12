import java.util.Scanner;

public class Array9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number students: ");
        int[] marks = new int[in.nextInt()];

        int passed = 0;
        int failed = 0;
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = in.nextInt();

            sum += marks[i];

            if (marks[i] >= 50) {
                passed++;
            } else {
                failed++;
            }
        }

        int max = marks[0];
        int min = marks[0];
        System.out.println("=================================\n");

        System.out.println("All marks:");

        for (int i = 0; i < marks.length; i++) {

            System.out.println("Student " + (i + 1) + ": " + marks[i]);

            max = Math.max(max, marks[i]);
            min = Math.min(min, marks[i]);
        }

        double average = (double) sum / marks.length;

        System.out.println("\nAverage: " + average);
        System.out.println("Highest mark: " + max);
        System.out.println("Lowest mark: " + min);
        System.out.println("Passed students: " + passed);
        System.out.println("Failed students: " + failed);

        in.close();
    }
}