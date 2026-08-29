import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Phase2 {

    Scanner sc = new Scanner(System.in);

    public void level1(){

        //1. Print numbers from 1 to 10.
        System.out.println("1 to 10");
        for(int i = 1; i <= 10; i++)
            System.out.print(i+" ");

        //2. Print all even numbers between 1 and 100.
        System.out.println("Even in 1 to 100");
        for (int i = 1; i <=100; i++ )
            if(i%2==0)
                System.out.print(i+" ");

        //3. Print all odd numbers between 1 and 100.
        System.out.println("Odd in 1 to 100");
        for (int i = 1; i <=100; i++ )
            if(i%2 != 0)
                System.out.print(i+" ");

        //4. Print numbers from 10 down to 1.
        System.out.println("10 to 1");
        for(int i = 10; i > 0; i--)
            System.out.print(i+" ");

        //5. Print multiplication table.
        System.out.println("Table of 5");
        for(int i = 1; i <= 10; i++)
            System.out.println("5 * "+i+ " = "+ i*5);

        //6. Sum first n natural numbers.
        System.out.println("Sum of first n ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; sum+=i,i++);
        System.out.println("Total Sum = "+sum);

        //7. Sum even numbers up to n.
        System.out.println("Sum of first even n ");
        sum = 0;
        for(int i = 1; i <= n; i++)
            if(i%2==0)
                sum+=i;
        System.out.println("Total Sum = "+sum);

        //8. Sum odd numbers up to n.
        System.out.println("Sum of first odd n ");
        sum = 0;
        for(int i = 1; i <= n; i++)
            if(i%2!=0)
                sum+=i;
        System.out.println("Total Sum = "+sum);

        //9. Factorial of a number.
        System.out.println("Factorial");
        long fact = 1;
        n = sc.nextInt();
        for(int i = n;i > 0; i--)
            fact*=i;
        System.out.println("Factorial = "+fact);

        //10. Product of digits.
        System.out.println("Product of Digits:");
        n = sc.nextInt();
        int prod =1;
        for( ; n > 0; n/=10)
            prod*= n%10;
        System.out.println("Product of digits is : "+prod);
    }

    public void level2(){

//        1. Count digits.
        System.out.println("Number of digits");
        int n = sc.nextInt();
        int cnt = 0;
        for( ; n > 0; n/=10)
            cnt++;
        System.out.println("Number of digits are : "+cnt);

//        2. Reverse number.
        System.out.println("Reverse Number");
        int num = sc.nextInt();
        n = num;
        int rev = 0;
        for( ; n > 0; n/= 10)
            rev = rev*10 + n%10;
        System.out.println("Reverse Number is: "+rev);

//        3. Palindrome number.
        System.out.println("Palindrome Number");
        if(num == rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

//        4. Sum of digits.
        System.out.println("Sum of Number");
        num = sc.nextInt();
        int sum = 0;
        for( ; num > 0; num/= 10)
            sum+= num%10;
        System.out.println("Sum of Digits is: "+sum);

//        5. Armstrong number.
        System.out.println("Armstrong or Not");
        num = sc.nextInt();
        n = num;
        sum = 0;
        for( ; n > 0; n/= 10) {
            int rem = n%10;
            sum+= (int)Math.pow(rem,3);
        }
        if (num == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

//        6. Perfect number.
        System.out.println("Perfect or Not");
        sum = 1;
        n = sc.nextInt();
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0)
                sum+=i;

            if(i != n/i)
                sum += n/i;
        }
        if(n == sum) System.out.println("Perfect Number");
        else System.out.println("Not Perfect");

//        7. Prime numbers between 1 and 100.
        System.out.println("Prime in 1 to 100");

        for(int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println(i+" ");
        }

//        8. Check prime number.
        System.out.println("Prime or not");
        num = sc.nextInt();
        boolean prime = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0) {
               prime = false;
                break;
            }
        }
        if(prime) System.out.println("Number is Prime");
        else System.out.println("Not Prime");

//        9. Fibonacci series.
        System.out.println("Fibonacci Series");
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n == 0) System.out.println("Zero Entered");
        else if(n == 1) System.out.println(a);
        else if (n == 2) System.out.println(a+" "+b);
        else{
            System.out.print(a+" "+b+" ");

            for(int i = 3; i <= n; i++){
                int c = a+b;
                a = b;
                b = c;
                System.out.print(c+" ");
            }
        }

//        10. Sum of Fibonacci series.
        System.out.println("Sum of Fibonacci Series");
        n = sc.nextInt();
        a = 0; b = 1;
        if(n == 0) System.out.println(0);
        else if(n == 1) System.out.println(a);
        else if (n == 2) System.out.println(a+b);
        else{
            int sumFib = a+b;
            for(int i = 3; i <= n; i++){
                int c = a+b;
                a = b;
                b = c;
                sumFib += c;
            }
            System.out.println("Sum is : "+sumFib);
        }
    }


    public void level3() {
//        1. Print squares from 1 to n.
        System.out.println("Squares");
        for (int i = 1; i <= 10; i++)
            System.out.print(Math.pow(i,2)+" ");

//        2. Print cubes from 1 to n.
        System.out.println("Cubes");
        for (int i = 1; i <= 10; i++)
            System.out.print(Math.pow(i,3)+" ");

//        3. Print numbers divisible by 7 in range.
        System.out.println("Divisible by 7 in a range");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            for( ; a <= b; a++ )
                if(a%7 == 0)
                    System.out.println(a+" ");
        }
        else{
            for( ; b <= a; b++ )
                if(b%7 == 0)
                    System.out.println(b+" ");
        }

//        4. Find GCD of 2 numbers using loop.
        System.out.println("GCD");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 1;
        for(int i = 2; i <= Math.min(num2,num1); i++){
            if(num1%i == 0 && num2%i ==0)
                gcd = i;
        }
        System.out.println("GCD is : "+gcd);

//        5. Find LCM of 2 numbers using loop.
        System.out.println("LCM");
        int max = Math.max(num1, num2);
        while(true){
            if(max % num1 == 0 && max % num2 == 0){
                System.out.println("LCM is : "+max);
                break;
            }
            max++;
        }

//        6. Print factors of a number.
//        7. Sum of factors of a number.
        System.out.println("Factors and Sum of Factors of a number");
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= number; i++){
            if(number%i == 0){
                System.out.print(i+" ");
                sum += i;
            }
        }
        System.out.println("Sum of factors is: "+sum);

//        8. Strong number or not (Sum of factorial of digits = number).
        System.out.println("Strong Number");
        int num = sc.nextInt();
        sum = 0;
        for(int i = num; i > 0; i/=10){
            int fact = 1;
            for(int j = i%10; j > 0; j--){
                fact *= j;
            }
            sum += fact;
        }
        if(num == sum) System.out.println("Strong number");
        else System.out.println("Not Strong Number");

//        9. Arithmetic progression first n terms (a,d).
        System.out.println("Arithmetic Progression");
        int n = sc.nextInt();
        int firstT = sc.nextInt();
        int diff = sc.nextInt();
        for(int i = 1; i <= n; i++, firstT+=diff)
            System.out.print(firstT+" ");

//        10. Geometric progression first n terms (g,r).
        System.out.println("Geometric Progression");
        n = sc.nextInt();
        firstT = sc.nextInt();
        int ratio = sc.nextInt();
        for(int i = 1; i <= n; i++, firstT *= ratio)
            System.out.print(firstT+" ");
    }

    public void level5(){
        System.out.println("1. Numbers whose digit sum is even in 1 to 100.");
        for(int i = 1; i <= 100; i++){
            int sum = 0;
            for(int j = i; j > 0; j/=10){
                sum+=  j%10;
            }
            if(sum%2 == 0) System.out.print(i+" ");
        }

        System.out.println("2. Count numbers divisible by 7 but not 5 in 1 to 500.");
        int cnt = 0;
        for(int i = 1; i <= 500; i++){
            if(i%7 == 0 && i%5 != 0)
                cnt++;
        }
        System.out.println(cnt);

        System.out.println("3. Print palindrome numbers in 1 to 500.");
        for(int i = 1; i<= 500; i++){
            int rev = 0;
            for(int temp = i; temp > 0; temp /= 10){
                rev = rev*10 + temp%10;
            }
            if(rev == i) System.out.println(i);
        }

        System.out.println("4. Numbers whose digit sum is multiple of 3 in 1 to 100.");
        for(int i = 1; i <= 100; i++){
            int sum = 0;
            for(int j = i; j > 0; j/=10){
                sum+=  j%10;
            }
            if(sum%3 == 0) System.out.print(i+" ");
        }

        System.out.println("5. Smallest and largest digit in a number.");
        System.out.println("Enter number");
        int num = sc.nextInt();
        int small = num%10;
        int large = num%10;
        for(num/=10 ; num > 0; num/=10){
            if(num%10 < small ) small = num%10;
            if(num%10 > large)  large = num%10;
        }
        System.out.println("Smallest : "+small);
        System.out.println("Largest : "+large);

        System.out.println("6. Numbers whose binary representation contains even number of 1s (from 1 to n).");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            String bin = Integer.toBinaryString(i);
            int ones = 0;
            for (int j = 0; j < bin.length(); j++){
                if(bin.charAt(j) == '1'){
                    ones++;
                }
            }
            if(ones%2 == 0) {
                System.out.print(i+" ");
            }
        }

        System.out.println("7. Print pattern where row i prints i*i.");
        for(int i = sc.nextInt(), j = 1; j <= i; j++){
            System.out.println(j*j);
        }

        System.out.println("8. Print factorials from 1 to n.");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int fact = 1;
            for(int j = 1; j <= i; j++){
                fact*= j;
            }
            System.out.println("Factorial of "+i+" is "+fact);
        }

        System.out.println("9. Sum odd and even digits separately.");
        n = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for( ; n > 0; n/=10){
            int dig = n%10;
            if(dig%2 == 0) sumEven += dig;
            else sumOdd += dig;
        }
        System.out.println("Sum of Even Digits is : "+sumEven);
        System.out.println("Sum of Odd Digits is : "+sumOdd);

        System.out.println("10. Take 5 numbers as input. If user enters 0, skip it using continue. Print sum of all non-zero inputs.");
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int input = sc.nextInt();
            if(input == 0) continue;

            sum+= input;

        }
        System.out.println("Sum of all non-zero inputs is : "+sum);
    }
}
