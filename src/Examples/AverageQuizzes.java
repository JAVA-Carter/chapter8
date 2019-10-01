package Examples;

import java.util.Scanner;

public class AverageQuizzes {
    public static void main(String[] args){
        int[] scoresArray = new int[10];
        int score;
        int count = 0;
        int total = 0;
//        final int QUIT = 999;
//        final int MAX = 10;

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < scoresArray.length; i++){
            System.out.println(count);
            System.out.println("Enter quiz score number " + i + ">>> ");
            score = in.nextInt();
            scoresArray[i] = score;
            count++;
            total = scoresArray[i] + total;
        }
        System.out.println("Scores entered:");
        for(int j = 0; j<scoresArray.length; j++){
            System.out.println(count);
            System.out.println(scoresArray);
            count++;
        }
        System.out.println("The average is " + total/scoresArray.length);

    }
}
