import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Phase3 {
    Scanner sc = new Scanner(System.in);
    public void level1(){
        System.out.println("1. Print 1 to n.");
        Q1(sc.nextInt());

        System.out.println(" 2. Print n to 1.");
        Q2(sc.nextInt());

        System.out.println("3. Print even numbers recursively 1 to n");
        Q3(sc.nextInt());

        System.out.println("4. Print odd numbers recursively 1 to n");
        Q4(sc.nextInt());

        System.out.println("5. Sum first n natural numbers.");
        System.out.println( Q5(sc.nextInt()));

        System.out.println("6. Factorial.");
        System.out.println( Q6(sc.nextInt()));

        System.out.println("7. Power function.");
        System.out.println( Q7(sc.nextInt(), sc.nextInt()));

        System.out.println(" 8. Nth Fibonacci number.");
        System.out.println( Q8(sc.nextInt()));

        System.out.println("  9. Fibonacci series.");
        Q9(sc.nextInt());

        System.out.println("10. Sum of digits.");
        System.out.println( Q10(sc.nextInt()));


    }

    public void Q1(int i){
        if(i == 0)
            return ;
        Q1(i-1);
        System.out.print(i+" ");

    }

    public void Q2(int i){
        if(i == 0)
            return;
        System.out.print(i+" ");
        Q2(i-1);

    }

    public void Q3(int i){
        if(i == 0)
            return;
        Q3(i-1);
        if(i%2 == 0)
            System.out.print(i+" ");
    }

    public void Q4(int i){
        if(i == 0)
            return;
        Q4(i-1);
        if(i%2 != 0)
            System.out.print(i+" ");
    }

    public int Q5(int i){
        if(i == 0)
            return 0;
        return i + Q5(i-1);
    }

    public int Q6(int i){
        if(i==0)
            return 1;
        return i * Q6(i-1);
    }

    public int Q7(int x, int y){
        if(y == 1)
            return x;
        return x * Q7(x, y-1);
    }

    public int Q8(int i){
        if (i <= 1)
            return i;
        return Q8(i-1) + Q8(i-2);
    }

    public void Q9(int n){
        for(int i = 0; i <= n; i++){
            System.out.println(Q8(i)+" ");
        }
    }

    public int Q10(int i){
       if(i <= 0)
           return 0;
       return i%10 + Q10(i/10);
    }

    public void level2(){

        System.out.println("1. Count digits.");
        System.out.println(level2Q1(sc.nextInt()));

        System.out.println("2. Reverse number.");
        System.out.println(level2Q2(sc.nextInt(),0));

        System.out.println("3. Palindrome number.");
        System.out.println(level2Q3(sc.nextInt()));

        System.out.println(" 4. Product of digits.");
        System.out.println(level2Q4(sc.nextInt()));

        System.out.println("5. Recursive GCD.");
        System.out.println(level2Q5(sc.nextInt(),sc.nextInt()));

        System.out.println("6. Decimal to binary.");
        level2Q6(sc.nextInt());

        System.out.println("7. Print digits in words.");
        level2Q7(sc.nextInt());

        System.out.println("8. Sum first n even numbers.");
        System.out.println(level2Q8(sc.nextInt()));

        System.out.println("9. Sum first n odd numbers.");
        System.out.println(level2Q9(sc.nextInt()));

        System.out.println("10. nCr using Pascal relation.");
        System.out.println(level2Q10(sc.nextInt(),sc.nextInt()));

    }

    public int level2Q1(int i){
        if(i <= 0)
            return 0;
        return 1 + level2Q1(i/10);

    }

    public int level2Q2(int i, int rev){
        if(i <= 0)
            return rev;
        return level2Q2(i/10, rev*10 + i%10);
    }

    public boolean level2Q3(int i){
        return i == level2Q2(i,0);
    }

    public int level2Q4(int i){
        if(i <= 0)
            return 1;
        return i%10 * level2Q4(i/10);
    }

    public int level2Q5(int i, int j){
        if(j==0)
            return i;
        return level2Q5(j, i%j);
    }

    public void level2Q6(int i){
        if(i == 0)
            return;
        level2Q6(i/2);
        System.out.print(i%2);
    }

    public void level2Q7(int i){
        if(i==0)
            return;
        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };
        level2Q7(i/10);
        System.out.print(words[i%10]+" ");
    }

    public int level2Q8(int i){
        if(i == 0)
            return 0;
        return (2*i) + level2Q8(i-1);
    }

    public int level2Q9(int i){
        if(i==1)
            return 1;
        return (2*i - 1) + level2Q9(i - 1);
    }

    public int level2Q10(int n, int r){
        if(r == 0 || n == r)
            return 1;
        return level2Q10(n-1, r-1) + level2Q10(n-1, r);
    }

    public void level3(){

        System.out.println(" 1. Print n stars recursively.");
        level3Q1(sc.nextInt());

        System.out.println("2. Print a square of stars recursively.");
        level3Q2(sc.nextInt(), sc.nextInt());

        System.out.println("3. Triangle (top-down).");
        level3Q3(sc.nextInt());

        System.out.println("4. Triangle (bottom-up).");
        level3Q4(sc.nextInt());

        System.out.println("5. Number pattern 1 to n each row.");
        level3Q5(sc.nextInt());

        System.out.println("6. Reverse triangle pattern.");
        level3Q6(sc.nextInt(),sc.nextInt());

        System.out.println("7. Multiplication table n.");
        level3Q7(sc.nextInt(),sc.nextInt());

        System.out.println("8. Print numbers in Increasing and decreasing sequence in same function.");
        level3Q8(sc.nextInt());

        System.out.println("9. Recursive series sum (1,2,3,4,..,n).");
        System.out.println(level3Q9(sc.nextInt()));

        System.out.println("10. Character pattern (A, AB, ABC...).");
        level3Q10(sc.nextInt(),sc.nextInt());
    }

    public void level3Q1(int i){
        if(i == 0)
            return;
        level3Q1(i-1);
        System.out.print("* ");
    }

    public void level3Q2(int row, int col){
        if(row == 0)
            return;

        printRow(col);
        System.out.println();
        level3Q2(row - 1, col);
    }

    public void printRow(int i){
        if(i == 0)
            return;

        System.out.print("* ");
        printRow(i-1);
    }

    public void level3Q3(int i){
        if(i == 0)
            return;
        level3Q3(i-1);
        System.out.println();
        printRow(i);
    }

    public void level3Q4(int i){
        if (i == 0)
            return;
        printRow(i);
        System.out.println();
        level3Q4(i-1);
    }

    public void level3Q5(int i){
        if(i == 0)
            return;
        level3Q5(i-1);
        System.out.println();
        printRowNum(i);
    }

    public void printRowNum(int  i){
        if(i == 0)
            return;
        printRowNum(i-1);
        System.out.print(i+" ");
    }

    public static void printSpaces(int n) {
        if (n == 0)
            return;

        System.out.print("  ");
        printSpaces(n - 1);
    }

    public static void printStars(int n) {
        if (n == 0)
            return;

        System.out.print("* ");
        printStars(n - 1);
    }

    public static void level3Q6(int n, int row) {
        if (row > n)
            return;

        printSpaces(n - row);
        printStars(row);
        System.out.println();
        level3Q6(n, row + 1);
    }

    public void level3Q7(int i, int j){
        if(j == 0)
            return;
        level3Q7(i, j-1);
        System.out.println(i+" "+"* "+j+" "+i*j);

    }

    public void level3Q8(int i){
        if(i == 0)
            return;
        System.out.print(i+" ");
        level3Q8(i-1);
        System.out.print(i+" ");
    }

    public int level3Q9(int i){
        if(i == 0)
            return 0;
        return i + level3Q9(i-1);
    }

    public static void printRow(char ch) {
        if (ch < 'A')
            return;

        printRow((char)(ch - 1));
        System.out.print(ch);
    }

    public static void level3Q10(int n, int row) {
        if (row > n)
            return;

        printRow((char)('A' + row - 1));
        System.out.println();

        level3Q10(n, row + 1);
    }

    public void level4(){

        System.out.println("1. Reverse string.");
        System.out.println(level4Q1(sc.next(), 0));

        System.out.println("2. Palindrome string.");
        System.out.println(level4Q2(sc.next()));

        System.out.println("3. Count vowels.");
        System.out.println(level4Q3(sc.next(),0));
        sc.nextLine();
        System.out.println("4. Remove spaces.");
        System.out.println(level4Q4(sc.nextLine(),0));

        System.out.println("5. Replace characters.");
        System.out.println(level4Q5(sc.nextLine(),0, sc.next().charAt(0),sc.next().charAt(0)));

        System.out.println("6. Remove character occurrences.");
        System.out.println(level4Q6(sc.nextLine(),0, sc.next().charAt(0)));

        sc.nextLine();
        System.out.println(" 7. Print characters one by one.");
        level4Q7(sc.nextLine(),0);

        System.out.println(" 8. Print reverse order.");
        level4Q8(sc.nextLine(),0);

        System.out.println("9. Convert to uppercase.");
        level4Q9(sc.nextLine(),0);

        System.out.println("10. Count consonants and vowels.");
        String str = sc.nextLine();
        System.out.println("Vowels : "+level4Q3( str,0));
        System.out.println("Consonants : "+level4Q10( str,0));

    }

    public String level4Q1(String str, int i){
        int len = str.length();
        if( i >= len/2)
            return str;

        char[] arr = str.toCharArray();

        char temp = arr[i];
        arr[i] = arr[len-1-i];
        arr[len-1-i] = temp;

        return level4Q1(new String(arr),i+1);
    }

    public boolean level4Q2(String str){
        return Objects.equals(str, level4Q1(str, 0));
    }

    public int level4Q3(String str, int i){
        int len = str.length();
        if(i >= len)
            return 0;

        char ch = Character.toLowerCase(str.charAt(i));
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return 1 + level4Q3(str, i + 1);

        return level4Q3(str, i + 1);
    }

    public String level4Q4(String str, int i){
        int len = str.length();
        if (i >= len)
            return "";
        if(str.charAt(i) == ' ')
            return level4Q4(str, i+1);

        return str.charAt(i) + level4Q4(str, i+1);
    }

    public String level4Q5(String str, int i, char find, char replace){
        int len = str.length();
        if(i >= len)
            return str;
        char[] arr = str.toCharArray();

        if(arr[i] == find)
            arr[i] = replace;

        return level4Q5(new String(arr),i+1, find, replace);
    }

    public String level4Q6(String str, int i, char ch){
        int len = str.length();
        if(i >= len)
            return "";

        if(str.charAt(i) == ch)
            return level4Q6(str, i+1, ch);

        return str.charAt(i) + level4Q6(str, i+1, ch);
    }

    public void level4Q7(String str, int i){
        int len = str.length();
        if(i >= len)
            return;
        System.out.print(str.charAt(i));
        level4Q7(str, i+1);
    }

    public void level4Q8(String str, int i){
        int len = str.length();
        if(i >= len)
            return;
        level4Q8(str, i+1);
        System.out.print(str.charAt(i));
    }

    public void level4Q9(String str, int i){
        int len = str.length();
        if(i >= len)
            return;
        System.out.print(Character.toUpperCase(str.charAt(i)));
        level4Q9(str, i+1);
    }

    public int level4Q10(String str, int i){
        int len = str.length();
        if(i >= len)
            return 0;
        char ch = Character.toLowerCase(str.charAt(i));
        if(Character.isLetter(ch))
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                return 1 + level4Q10(str, i + 1);

        return level4Q10(str, i+1);
    }

}
