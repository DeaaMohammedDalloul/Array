import java.util.Scanner;

public class Array6 {
    static void main(String[] args) {
        /*
        اكتب برنامج Java يقوم بالآتي:

* ينشئ مصفوفة لتخزين 5 أعداد صحيحة.
* يطلب من المستخدم إدخال الأعداد.
* يطبع جميع الأعداد الزوجية الموجودة في المصفوفة.
* يحسب عدد الأعداد الزوجية
         */
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length ; ++i){
            System.out.print("Enter number "+ (i + 1) + ": ");
            num[i] = in.nextInt();
        }
        double count =0;

        System.out.println(" ======== Even numbers ======== ");

        for (int i = 0 ; i < num.length ; ++i){

            if (num[i] % 2 == 0){
                System.out.println("The Number "+ (i+1)+ ": " + num[i]);
                count ++;
            }
        }
        System.out.println( "Even numbers count: " +count);
    }
}
