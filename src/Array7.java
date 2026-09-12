public class Array7 {
    static void main(String[] args) {
        int marks[][] = {
                {80, 70, 88, 90},
                {90, 73, 91, 95},
                {72, 83, 97, 92},
                {70, 95, 86, 70},
        };

        int sum = 0;
        for(int i = 0 ; i < marks.length ; i++) {
            System.out.println("Student Number ("+(i+1)+") Marks");
            for(int j = 0; j < marks[i].length ; j++) {
                System.out.println("Mark Subject Number ("+(j+1)+"): " + marks[i][j]);
                if (i==j){
                    sum += marks[i][j];
                }
            }
            System.out.println("==========");
            System.out.println(sum);
        }

//        System.out.println(marks[0][0] + marks[1][1] + marks[2][2] + marks [3][3]);
    }
}

