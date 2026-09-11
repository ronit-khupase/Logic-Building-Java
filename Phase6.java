import java.util.Scanner;

public class Phase6 {
    Scanner sc = new Scanner(System.in);

    public void level1(){
        System.out.println("1. Numbers divisible by both 3 and 5.");
        for(int i = 1; i <= 100; i++){
            if (i%3 == 0 && i%5 == 0)
                System.out.print(i +" ");
        }

        System.out.println("");
//        2. Sum of digits.
//        3. Armstrong number.
//        4. Armstrong numbers from 1–1000.
//        5. Factorial using recursion.
//        6. Count digits.
//        7. Prime numbers from 1 to N.
//        8. Reverse number.
//        9. Palindrome number.
//        10. Perfect number.

    }
}
