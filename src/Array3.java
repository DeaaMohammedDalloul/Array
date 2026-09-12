import java.util.Scanner;

public class Array3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Names Number: ");
        int num = input.nextInt();
        input.nextLine();
        String[] names = new String[num];


        for (int i = 0 ; i < names.length ; ++i){
            System.out.print(" the name "+ (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        int[] age = new int[num];

        for (int i = 0 ; i < age.length ; ++i){
            System.out.print( names[i] + " the age: " );
            age[i]= input.nextInt();
        }


        for (int i = 0 ; i < names.length ; ++i){
            System.out.println( "Name: " + names[i] + " , Age " + age[i]);
        }

    }
}
