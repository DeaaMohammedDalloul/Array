import java.util.Scanner;

public class Array5 {
    static void main(String[] args) {
        /*
        اكتب برنامج Java يقوم بالآتي:

* ينشئ مصفوفة لتخزين 4 أعداد صحيحة.
* يطلب من المستخدم إدخال الأعداد.
* يطبع جميع الأعداد.
* يحسب ويطبع مجموع الأعداد
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter long numbers: ");
        int num = in.nextInt();
        int[] numbers = new int[num];

        double sum = 0;

        for (int i = 0 ; i < numbers.length ; ++i){
            System.out.print("Enter number "+ (i + 1)+ ": ");
            numbers[i]=in.nextInt();
            sum += numbers[i];

        }
        for (int i = 0; i < numbers.length ; ++i){
            System.out.println("The number "+ (i + 1)+ ": " + numbers[i]);
        }
        System.out.println(sum);

    }
}
