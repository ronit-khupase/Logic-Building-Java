import java.util.Arrays;
import java.util.Scanner;

public class Phase1 {
    Scanner sc = new Scanner(System.in);

    public void level1(){
        System.out.println("Enter number");
        int n = sc.nextInt();

        //1. Check whether a number is positive, negative, or zero.
        if(n>0) System.out.println("Number is Positive");
        else if(n<0) System.out.println("Number is Negative");
        else System.out.println("Number is Zero");

        //2. Check if a number is even or odd.
        String str = n%2 == 0 ? "Even Number" : "Odd Number";
        System.out.println(str);

        //3. Check if a number is divisible by 5.
        String str1 = n%5 == 0 ? n+" Divisible by 5" : n+" Not divisible by 5";
        System.out.println(str1);

        //4. Check if a number is divisible by both 3 and 5.
        String str2 = n%5 == 0 && n%3 == 0 ? n+" Divisible by 5 and 3" : n+" Not divisible by 5 and 3";
        System.out.println(str2);

        //5. Check if a given year is a leap year.
        System.out.println("Enter year");
        int year = sc.nextInt();
        if (year%100 == 0)
            if(year%400==0) System.out.println("LeapYear");
            else System.out.println("Not LeapYear");
        else
            if(year%4==0) System.out.println("LeapYear");
            else System.out.println("Not LeapYear");

        //6. Take two numbers and print the larger one.
        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String str3 = num1>num2 ? num1+" is Larger" : num2+" is Larger";
        System.out.println(str3);

        //7. Take three numbers and print the largest.
        System.out.println("Enter 3 numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int num = number1>number2 ? Math.max(number1, number3) : Math.max(number2, number3);
        System.out.println(num+" is the largest of 3");

        //8. Print "Cold", "Warm", or "Hot" based on temperature.
        System.out.println("Enter Temperature");
        int temp = sc.nextInt();
        if (temp < 30)  System.out.println("Cold");
        else if (temp < 40 )  System.out.println("Warm");
        else System.out.println("Hot");

        //9. Check whether a character is a vowel or consonant.
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a' : System.out.println("Vowel"); break;
            case 'e' : System.out.println("Vowel"); break;
            case 'i' : System.out.println("Vowel"); break;
            case 'o' : System.out.println("Vowel"); break;
            case 'u' : System.out.println("Vowel"); break;
            default : System.out.println("Consonant");
        }

        //10. Check whether a character is uppercase, lowercase, digit, or special character.
        System.out.println("Enter a Character");
        char c = sc.next().charAt(0);
        if (Character.isLowerCase(c))
            System.out.println("Lowercase");
        else if (Character.isUpperCase(c))
            System.out.println("Lowercase");
        else if (Character.isDigit(c))
            System.out.println("Digit");
        else
            System.out.println("Special Character");

    }

    public void level2(){

        //1. Check whether three sides form a valid triangle.
        System.out.println("Enter 3 sides of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b > c && a+c > b && b+c > a) System.out.println("Valid Triangle");
        else System.out.println("Invalid Triangle");

        //2. Determine whether a triangle is equilateral, isosceles, or scalene.
        if(a==b && b==c) System.out.println("Equilateral Triangle");
        else if(a==b || b==c || a==c) System.out.println("Isosceles Triangle");
        else System.out.println("Scalene Triangle");

        //3. Print grade (A/B/C/D/F) for marks (0–100).
        System.out.println("Enter Marks");
        int marks = sc.nextInt();

        if(marks > 100 && marks < 0) System.out.println("Invalid Marks");
        else if(marks > 90) System.out.println("Grade A");
        else if(marks > 80) System.out.println("Grade B");
        else if(marks > 60) System.out.println("Grade C");
        else if(marks > 40) System.out.println("Grade D");
        else  System.out.println("Fail");

        //4. Check if one number is a multiple of another.
        System.out.println("Enter 2 Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1%num2 == 0 || num2%num1 ==0) System.out.println("1 Number is multiple of another");
        else System.out.println("Numbers are not multiple of each other");

        //5. Print greeting based on hour of day.
        System.out.println("Enter Time in 24 hr format (24 for 12am)");
        double time = sc.nextDouble();
        if(time < 12) System.out.println("Good Morning");
        else if (time < 16) System.out.println("Good Afternoon");
        else if(time < 24) System.out.println("Good Evening");
        else System.out.println("Invalid Time");

        //6. Check voting eligibility.
        System.out.println("Enter Age");
        int age = sc.nextInt();
        if(age < 18 ) System.out.println("Not Eligible");
        else System.out.println("Eligible for Voting");

        //7. Determine whether two numbers are both even, both odd, or mixed.
        System.out.println("Enter 2 Numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if(number1 % 2 == 0 && number2 % 2 == 0) System.out.println("Both Even");
        else if(number1 % 2 != 0 && number2 % 2 != 0) System.out.println("Both Odd");
        else System.out.println("Mixed");

        //8. Check if a character lies between given alphabet ranges.
        System.out.println("Enter character");
        char ch = sc.next().charAt(0);
        System.out.println("Enter Alphabet Range(2 alphabet)");
        char left = sc.next().charAt(0);
        char right = sc.next().charAt(0);
        if(ch > left && ch < right || ch > right && ch < left) System.out.println("Alphabet Lies in range");
        else System.out.println("Don't lie in range");

        //9. Print day name for a number (1–7).
        System.out.println("Enter number from 1-7");
        int number = sc.nextInt();
        if(number < 1 && number >7) System.out.println("Invalid Number");
        else
            switch(number){
                case 1 :
                    System.out.println("Monday"); break;
                case 2:
                    System.out.println("Tuesday"); break;
                case 3 :
                    System.out.println("Wednesday"); break;
                case 4:
                    System.out.println("Thursday"); break;
                case 5 :
                    System.out.println("Friday"); break;
                case 6:
                    System.out.println("Saturday"); break;
                case 7 :
                    System.out.println("Sunday"); break;
                default:
                    System.out.println("Not Valid Day");
        }

        //10. Print number of days in a month.
        System.out.println("Enter Month");
        String month = sc.next();
        month = month.toLowerCase();
        switch(month){
            case "january" :
            case "march" :
            case "may":
            case "july" :
            case "august":
            case "october":
            case "december":
                System.out.println("31 Days");break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 Days"); break;
            case "february":
                System.out.println("28 or 29 days"); break;
            default:
                System.out.println("Invalid Month");
        }
    }

    public void level3(){

        //1. Check if all digits in a 3-digit number are distinct.
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int[] digits = new int[3];
        if(num < 100 && num > 999) System.out.println("Enter 3 digit Number");
        else {
            for (int i = 0; num > 0; num /= 10, i++)
                digits[i] = num % 10;
            if (digits[0] == digits[1] || digits[1] == digits[2] || digits[0] == digits[2])
                System.out.println("Not Distinct");
            else
                System.out.println("Digits are Distinct");
        }

        //2. Determine if middle digit is largest/smallest.
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && b > c) System.out.println("Middle Number is Largest");
        else if(a > b && b < c) System.out.println("Middle Number is Smallest");
        else System.out.println("Neither Smallest nor Largest");

        //3. Check whether first and last digits of a 4-digit number are equal.
        System.out.println("Enter 4 digit number");
        int number = sc.nextInt();
        int tens = number%10;
        int thousand = number/1000;
        if(tens == thousand) System.out.println("Digits are equal");
        else System.out.println("Digits are not equal");

        //4. Determine whether a number is single, double, or multi-digit.
        System.out.println("Enter number");
        int number1 = sc.nextInt();
        if(number1 / 10 == 0) System.out.println("Single Digit");
        else if (number1 / 100 == 0) System.out.println("Double Digit");
        else System.out.println("Multi Digit");

        //5. Check if a number is multiple of 7 or ends with 7.
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        if(num1 % 10 == 7 || num1 % 7 == 0) System.out.println("Number is multiple of 7 or ends with 7");
        else System.out.println("Number is not multiple of 7 or does not ends with 7");

        //6. Determine quadrant of a point (x,y).
        System.out.println("Enter coordinates of x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0) System.out.println("Quadrant 1");
        else if(x < 0 && y > 0) System.out.println("Quadrant 2");
        else if(x < 0 && y < 0) System.out.println("Quadrant 3");
        else if(x > 0 && y < 0) System.out.println("Quadrant 4");
        else System.out.println("Origin");

        //7. Check denomination breakup using ₹2000, ₹500, ₹100 notes.
        System.out.println("Enter Amount");
        int amt = sc.nextInt();
        int nt2000 = amt/2000;
        amt = amt % 2000;
        int nt500 = amt / 500;
        amt = amt % 500;
        int nt100 = amt / 100;
        System.out.println("Number of Rs.2000 notes : "+nt2000
                            +"\nNumber of Rs.500 notes : "+nt500
                            +"\nNumber of Rs.100 notes : "+nt100);

        //8. Check if a number lies within [100,999].
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if(n < 999 && n >100) System.out.println("Number lies in range");
        else System.out.println("Number does not lie in range");

        //9. Compute third angle of a triangle.
        System.out.println("Enter 2 angles of a triangle");
        int ang1 = sc.nextInt();
        int ang2 = sc.nextInt();
        int angles = ang1+ang2;
        if(angles >= 180) System.out.println("Invalid Angles");
        else {
            int ang3 = 180-angles;
            System.out.println("Third Angle is : " + ang3);
        }

        //10. Check if a number is a perfect square.
        System.out.println("Enter a Number");
        int sqr = sc.nextInt();
        int sqrt = (int) Math.sqrt(sqr);
        if(sqrt * sqrt == sqr) System.out.println("Perfect Square");
        else System.out.println("Not Perfect Square");
    }

    public void level4(){

        //1. Check if input is letter, digit, or neither.
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        if(Character.isDigit(ch)) System.out.println("Character is digit");
        else if(Character.isAlphabetic(ch)) System.out.println("Character is Letter");
        else System.out.println("Character is neither letter or digit");

        //2. divisible by 3 fizz, divisible by 5 buzz, if both FizzBuzz.
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if(n%3 == 0 && n%5 == 0) System.out.println("FizzBuzz");
        else if(n%5 == 0) System.out.println("Buzz");
        else if(n%3 == 0) System.out.println("Fizz");
        else System.out.println("Neither Divisible by 5 nor 3");

        //3. Print median among three numbers.
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        System.out.println("Median is : "+ arr[1]);

        //4. Determine AM/PM from 24-hour time.
        System.out.println("Enter Time");
        int time = sc.nextInt();
        if(time < 12 ) System.out.println(time+"AM");
        else if (time < 24) System.out.println(time-12 +"PM");
        else System.out.println("Invalid Time");

        //5. Check tax eligibility.
        System.out.println("Enter Income and Age");
        int income = sc.nextInt();
        int age = sc.nextInt();
        if(income > 500000 && age > 18) System.out.println("Eligible for Tax");
        else System.out.println("Not Eligible for Tax");

        //6. Take 2 numbers Check if both positive and sum < 100.
        System.out.println("Enter 2 Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > 0 && num2 > 0){
            System.out.println("Both are positive");
            if(num1 + num2 < 100) System.out.println("Sum is less than 100");
            else System.out.println("Sum is greater than 100");
            }
        else System.out.println("Both are not positive");

        //7. Print digit in words.
        System.out.println("Enter Number");
        int number = sc.nextInt();
            switch(number){
                case 0:
                    System.out.println("Zero"); break;
                case 1:
                    System.out.println("One"); break;
                case 2:
                    System.out.println("Two"); break;
                case 3:
                    System.out.println("Three"); break;
                case 4:
                    System.out.println("Four"); break;
                case 5:
                    System.out.println("Five"); break;
                case 6:
                    System.out.println("Six"); break;
                case 7:
                    System.out.println("Seven"); break;
                case 8:
                    System.out.println("Eight"); break;
                case 9:
                    System.out.println("Nine"); break;
                default:
                    System.out.println("Invalid digit");
            }

        //8. Determine weekday/weekend.
        System.out.println("Enter Day");
            String str = sc.next();
            str = str.toLowerCase();
            switch(str){
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                case "friday" :
                    System.out.println("Weekday"); break;
                case "saturday":
                case "sunday":
                    System.out.println("Weekend"); break;
                default:
                    System.out.println("Invalid Day");
            }

        //9. Calculate electricity bill.
        System.out.println("Enter Units Used");
        int units = sc.nextInt();
        if(units > 10) System.out.println("Light bill is :" + units*12);
        else if(units > 20) System.out.println("Light bill is :" + units*10);
        else if(units > 30) System.out.println("Light bill is :" + units*8);
        else System.out.println("Light bill is :" + units*6);

        //10. Validate password.
        System.out.println("Enter Password");
        String pass = sc.next();

        if(pass.length()<8 && !pass.matches(".*\\d.*")) System.out.println("Invalid Password");
        else System.out.println("Valid Password");
    }

    public void level5(){
        //1. Check whether point lies on X-axis, Y-axis, or origin.
        System.out.println("Enter x and y coordinates");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x == 0 && y == 0) System.out.println("Origin");
        else if(x == 0) System.out.println("On X-axis");
        else if(y == 0) System.out.println("On Y-axis");
        else System.out.println("Neither X-axis nor Y-axis");

        //2. Check Pythagorean triplet.
        System.out.println("Enter 3 sides of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a) System.out.println("Valid Pythagoras Triplet");
        else System.out.println("Invalid Pythagoras Triplet");

        //3. Validate calendar date(day and month).
        System.out.println("Enter date and month number");
        int date = sc.nextInt();
        int month = sc.nextInt();
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 : if (date > 0 && date <=31 ) System.out.println("Valid Date"); else System.out.println("Invalid Date"); break;
            case 2 :
            case 4 :
            case 6 :
            case 9 :
            case 11 : if(date > 0 && date <= 30 ) System.out.println("Valid Date"); else System.out.println("Invalid Date"); break;
            default :
                System.out.println("Invalid Date");
        }

        //4. Find smaller angle between clock hands.
        System.out.println("Enter Time in Hour and minute");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        if(hour > 12 && min >60) System.out.println("Invalid Time");
        else{
            int minHandPos = min/5;
            int minHandAngle = Math.abs(minHandPos-hour) * 30;
            double angle = minHandAngle - (double) min /2;
            System.out.println("Angle between both hands at "+hour+":"+min+" is "+angle);
        }
        //5. Take 3 Numbers and check if they are in arithmetic progression.
        System.out.println("Enter 3 numbers in order");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num2 - num1 == num3 - num2) System.out.println("In AP");
        else System.out.println("Not in AP");

        //6. Take 3 Numbers and check if they are in geometric progression.
        System.out.println("Enter 3 numbers in order");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if(number2 * number2 == number1 * number3) System.out.println("In GP");
        else System.out.println("Not in GP");

        //7. Take 3 digit number Check if first+last digit equals middle digit.
        System.out.println("Enter 3 digit number");
        int num = sc.nextInt();
        int sum = num%10 + num/100;
        num = num/10;
        if(sum == num%10) System.out.println("Same");
        else System.out.println("Not same");

        //8. Compare sum and product of digits.
        System.out.println("Enter Number");
        int digits = sc.nextInt();
        int sum1 = 0;
        int product = 1;
        for(; digits > 0; digits/=10){
            sum1 += digits%10;
            product *= digits%10;
        }
        if(sum1 == product) System.out.println("Product and Sum is equal");
        else System.out.println("Product and Sum is not equal");

        //9. Compare two dates and print which comes first.(day and month)
        System.out.println("Enter 2 dates(day and month)");
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int day2 = sc.nextInt();
        int month2 = sc.nextInt();

        if(month1 < month2) System.out.println(day1 + "/" +month1 + " is before " +day2 + "/" +month2);
        else if(month1 > month2) System.out.println(day2 + "/" +month2 + " is before " +day1 + "/" +month1);
        else
            if(day1 < day2) System.out.println(day1 + "/" +month1 + " is before " +day2 + "/" +month2);
            else System.out.println(day2 + "/" +month2 + " is before " +day1 + "/" +month1);

        //10. Print century from year.
        System.out.println("Enter Year");
        int year = sc.nextInt();
        System.out.println("Century for "+year+" is "+ (year/100+1) +"th century");
    }
}
