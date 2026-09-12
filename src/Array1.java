import java.util.Scanner;

public class Array1 {

    static void main(String[] args) {
        /*
        int[] ages = {58,48,32,29,28,26,25,24,22,17,15,15};

        for (int i= 0 ; i < ages.length ; i++){
            System.out.println(ages[i]);

        }

/*

         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number materials: ");

        double mat [] = new double[in.nextInt()];
        double total = 0;

        for (int i = 0 ; i < mat.length ; i++){
            System.out.print("mark materials "+ (i + 1)+ ": ");
            mat[i]=in.nextInt();
            total +=mat[i];
        }

        System.out.println(total);
        double average = (total / mat.length);
        System.out.println("The Average = " + average);

    }
}