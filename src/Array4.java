import java.util.Scanner;

public class Array4 {
    static void main(String[] args) {
        /*

السؤال — تحليل درجات الطلاب

اكتب برنامج Java يطلب من المستخدم إدخال درجات 5 طلاب وتخزينها داخل مصفوفة.

المطلوب:

* طباعة جميع الدرجات.
* حساب مجموع الدرجات.
* حساب متوسط الدرجات.
* إيجاد أعلى درجة.
* إيجاد أقل درجة.
* حساب عدد الطلاب الناجحين، علمًا أن درجة النجاح هي 50.

مثال للتشغيل:

Enter grade 1: 80
Enter grade 2: 45
Enter grade 3: 70
Enter grade 4: 90
Enter grade 5: 55
Grades: 80 45 70 90 55
Sum: 340
Average: 68.0
Highest grade: 90
Lowest grade: 45
Passed students: 4

استخدم:

int[] grades = new int[5];

وحاول تحله باستخدام حلقات for فقط.
         */
        Scanner in = new Scanner(System.in);

                int[] grades = new int[5];

                int sum = 0;
                int passedStudents = 0;

                // إدخال الدرجات
                for (int i = 0; i < grades.length; i++) {
                    System.out.print("Enter grade " + (i + 1) + ": ");
                    grades[i] = in.nextInt();
                }

                // نبدأ بأول عنصر لإيجاد أعلى وأقل درجة
                int highestGrade = grades[0];
                int lowestGrade = grades[0];

                // تحليل الدرجات
                for (int i = 0; i < grades.length; i++) {

                    sum += grades[i];

                    if (grades[i] > highestGrade) {
                        highestGrade = grades[i];
                    }

                    if (grades[i] < lowestGrade) {
                        lowestGrade = grades[i];
                    }

                    if (grades[i] >= 50) {
                        passedStudents++;
                    }
                }

                double average = (double) sum / grades.length;

                // طباعة جميع الدرجات
                System.out.print("\nGrades: ");

                for (int i = 0; i < grades.length; i++) {
                    System.out.print(grades[i] + " ");
                }

                // طباعة النتائج
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
                System.out.println("Highest grade: " + highestGrade);
                System.out.println("Lowest grade: " + lowestGrade);
                System.out.println("Passed students: " + passedStudents);

                in.close();
    }
}
