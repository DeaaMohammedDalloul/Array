import java.util.Scanner;

public class Array2 {
    static void main(String[] args) {
        /*

اكتب برنامج Java يقوم بالآتي:

* أنشئ مصفوفة من نوع int تحتوي على 5 أرقام.
* اطلب من المستخدم إدخال الأرقام وتخزينها في المصفوفة.
* استخدم حلقة for لطباعة جميع عناصر المصفوفة.

مثال للتشغيل:

Enter number 1: 10
Enter number 2: 7
Enter number 3: 15
Enter number 4: 4
Enter number 5: 9
Array elements:
10
7
15
4
9

المطلوب منك استخدام:

int[] numbers = new int[5];

ولا تحسب المجموع أو الأكبر حاليًا؛ فقط إدخال العناصر وتخزينها ثم طباعتها.
         */
        Scanner in = new Scanner(System.in);
        int[] numbers  = new int[5];

        for (int i = 0 ; i < numbers.length ; i++){
            System.out.print("Enter number "+ (i + 1) + ": ");
            numbers[i]=in.nextInt();
        }

        for (int i = 0 ; i < numbers.length ; ++i){
            System.out.println(numbers[i]);
        }


in.nextInt();

    }
}
