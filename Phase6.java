import java.util.Scanner;

public class Phase6 {
    Scanner sc = new Scanner(System.in);

    public void level1(){
        System.out.println("1. Numbers divisible by both 3 and 5.");
        for(int i = 1; i <= 100; i++){
            if (i%3 == 0 && i%5 == 0)
                System.out.print(i +" ");
        }

        System.out.println("2. Sum of digits.");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("Sum of digits: "+ sum);


        System.out.println("3. Armstrong number.");
        num = sc.nextInt();
        sum = 0;
        for(int i = num; i > 0; i /= 10){
            int rem = i%10;
            sum+= (int)Math.pow(rem,3);
        }
        if(num == sum){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }

        System.out.println("4. Armstrong numbers from 1–1000.");
        for(int i = 1; i <= 1000; i++){
            sum = 0;
            for(int j = i; j > 0; j /= 10){
                int rem = j%10;
                sum += (int)Math.pow(rem,3);
            }
            if(i == sum){
                System.out.print(i+" ");
            }
        }

        System.out.println("5. Factorial using recursion.");
        num = sc.nextInt();
        int fact = 1;
        while (num > 0){
            fact *= num;
            num--;
        }
        System.out.println("Factorial is:"+fact);

        System.out.println("6. Count digits.");
        num = sc.nextInt();
        int cnt = 0;
        while(num >0){
            num /= 10;
            cnt++;
        }
        System.out.println("Number of digits are : "+cnt);


        System.out.println("7. Prime numbers from 1 to N.");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }


        System.out.println("8. Reverse number.");
        System.out.println("9. Palindrome number.");
        int rev = 0;
        num = sc.nextInt();
        for(int i = num; i > 0; i/=10){
            int rem = i%10;
            rev = rev*10 + rem;
        }
        System.out.println("Reverse number is : "+rev);
        if(rev == num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }

        System.out.println("10. Perfect number.");
        num = sc.nextInt();
        sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(num == sum){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not Perfect Number");
        }

    }

    public boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
