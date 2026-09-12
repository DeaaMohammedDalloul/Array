import java.util.Scanner;

public class Arrya8 {
    static void main(String[] args) {
        /*
        اكتب برنامج Java يقوم بالآتي:

* ينشئ مصفوفة لتخزين 6 أعداد صحيحة.
* يطلب من المستخدم إدخال الأعداد.
* يطبع جميع الأعداد السالبة الموجودة في المصفوفة.
* يحسب مجموع الأعداد الموجبة.
* يحسب عدد الأصفار الموجودة في المصفوفة
         */
        Scanner in = new Scanner(System.in);
        int [] numbers = new int[6];
        int count = 0;
        int sum = 0;


        for (int i = 0; i < numbers.length ; ++i){
            System.out.print("Enter number "+ (i+1)+ ": " );
            numbers[i]=in.nextInt();
            if (numbers[i] > 0){
                count ++;
            }else if (numbers[i] == 0){
                sum++;

            }

        }

        for (int i = 0; i < numbers.length ; ++i){
            if (numbers[i] < 0 ){
                System.out.println(numbers[i]);
            }
        }

        System.out.println("count: " + count);
        System.out.println("Zero: " + sum);


        }
}
