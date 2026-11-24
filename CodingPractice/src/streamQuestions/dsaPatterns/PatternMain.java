package streamQuestions.dsaPatterns;

public class PatternMain {
    public static void main(String[] args) {
//1st problem
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("second problem");
        //2nd problem
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //3rd problem
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        //4th problem
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        //5th problem
        int counter = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

        //6th problem
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        //7th problem
        for (int i=1;i<=5;i++){
            for (int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //8th problem
        for (int i=1;i<=5;i++){
            for (int s = 1; s<=5-i;s++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=5;i>=1;i--){
            for(int s=1; s<=5-i+1;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
