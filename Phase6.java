import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
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

    public void level2(){

        System.out.println("1. Anagram check.");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }


        System.out.println("2. Count vowels in each word.");
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        for(String word : words){
            int cnt = 0;
            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                    cnt++;
                }
            }
            System.out.println("Vowel Count in : "+word +" is "+cnt);
        }

        System.out.println("3. Reverse even-length words.");
        for(int i = 0; i < words.length; i++){
            if(words[i].length()%2 ==0){
                StringBuilder sb = new StringBuilder(words[i]);
                words[i] = String.valueOf(sb.reverse());
            }
        }
        str = String.join(" ",words);
        System.out.println("String After Reversing Even Words: "+str);

        System.out.println("4. Replace vowels with positions a=1, e=2, i=3.");
        str = sc.nextLine();
        words = str.split("\\s+");
        for(int i = 0; i < words.length; i++){
            char[] ch = words[i].toCharArray();
            for(int j = 0; j < ch.length; j++){
                switch (Character.toLowerCase(ch[j])){
                    case 'a' : ch[j] = '1'; break;
                    case 'e' : ch[j] = '2'; break;
                    case 'i' : ch[j] = '3'; break;
                    case 'o' : ch[j] = '4'; break;
                    case 'u' : ch[j] = '5'; break;
                }
            }
            words[i] = new String(ch);
        }
        System.out.println("String After Changing Vowels :"+ String.join(" ", words));

        System.out.println("5. Print repeated characters.");
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++) {

            boolean alreadyPrinted = false;

            for(int k = 0; k < i; k++) {
                if(Character.toLowerCase(s.charAt(i)) ==
                        Character.toLowerCase(s.charAt(k))) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(alreadyPrinted) continue;

            for(int j = i + 1; j < s.length(); j++) {
                if(Character.toLowerCase(s.charAt(i)) ==
                        Character.toLowerCase(s.charAt(j))) {
                    System.out.println(s.charAt(i));
                    break;
                }
            }
        }

        System.out.println("6. Words starting and ending with same letter.");
        s = sc.nextLine();
        words = s.split("\\s+");
        for(String word : words){
            if(Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(word.charAt(word.length()-1))){
                System.out.println(word+" ");
            }
        }

        System.out.println("7. Alternate word case.");
        for(int i = 0; i < words.length; i++){
            if((i+1) %2 == 0){
                System.out.print(words[i].toLowerCase()+" ");
            }
            else {
                System.out.print(words[i].toUpperCase()+" ");
            }
        }

        System.out.println("8. String rotation check.");

        String str1 = sc.nextLine().trim().toLowerCase();
        String str2 = sc.nextLine().trim().toLowerCase();

        if(str1.length() == str2.length() &&
                (str1 + str1).contains(str2)){
            System.out.println("Rotation");
        }else{
            System.out.println("Not Rotation");
        }

        System.out.println("9. Word with maximum vowels.");
        String string = sc.nextLine();

        words = string.split("\\s+");

        String maxWord = "";
        int maxVowels = 0;

        for(String word : words){
            int count = 0;

            for(char ch : word.toLowerCase().toCharArray()){
                if("aeiou".indexOf(ch) != -1){
                    count++;
                }
            }

            if(count > maxVowels){
                maxVowels = count;
                maxWord = word;
            }
        }

        System.out.println("Word: " + maxWord);
        System.out.println("Vowels: " + maxVowels);


        System.out.println("10. Remove duplicate words.");
        string = sc.nextLine();

        words = string.split("\\s+");

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(words));

        for(String word : set){
            System.out.print(word + " ");
        }
    }

    public void level3(){

        System.out.println("5. Move all zeros to end.");
        System.out.println("Enter Number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int zeroIdx = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[zeroIdx++] = arr[i];
            }
        }

        while (zeroIdx < arr.length){
            arr[zeroIdx++] = 0;
        }
        System.out.println("Array After Shifting zeros to End: "+ Arrays.toString(arr));

        System.out.println(" 7. Merge arrays.");
        System.out.println("Enter Number of elements: ");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] merged = new int[arr1.length + arr2.length];

        for(int i =0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i =0; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++){
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            merged[arr1.length+i] = arr2[i];
        }

        System.out.println("Merged Array : "+ Arrays.toString(merged));

        System.out.println("9. Right rotate by one.");
        System.out.println("Enter Number of elements: ");
        n = sc.nextInt();
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        System.out.println("Array After Rotation : "+ Arrays.toString(arr));

    }

    public void level4(){
        System.out.println("2. Array pairs with given sum.");
        System.out.println("Enter Number of Elements: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int[] arr5 = new int[n];
        for (int i = 0; i < n; i++) {
            arr5[i] = sc.nextInt();
        }
        System.out.println("Enter Target Sum : ");
        int sum = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            int target = sum - arr5[i];
            if(set.contains(target)){
                System.out.println(arr5[i]+" "+target+" ");
            }
            set.add(arr5[i]);
        }

        System.out.println("3. All subarrays.");
        arr5 = new int[3];
        System.out.println("Enter 3 Elements in Array: ");
        for (int i = 0; i < 3; i++) {
            arr5[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr5[k] + " ");
                }
                System.out.println();
            }
        }


        System.out.println("4. Check sorted array ASC or DESC.");

        System.out.println("Enter Number of Elements:");
        int num6 = sc.nextInt();

        int[] array = new int[num6];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < num6; i++) {
            array[i] = sc.nextInt();
        }

        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < num6 - 1; i++) {
            if (array[i] > array[i + 1]) {
                asc = false;
            }
            if (array[i] < array[i + 1]) {
                desc = false;
            }
        }

        if (asc) {
            System.out.println("Ascending Sorted");
        } else if (desc) {
            System.out.println("Descending Sorted");
        } else {
            System.out.println("Not Sorted");
        }

        System.out.println("5. Consecutive occurrence count.");
        System.out.println("Enter Number of Elements:");
        num6 = sc.nextInt();
        int[] a = new int[num6];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < num6; i++) {
            a[i] = sc.nextInt();
        }

        int count = 1;

        for (int i = 1; i < num6; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.println(a[i - 1] + " -> " + count);
                count = 1;
            }
        }
        System.out.println(a[num6 - 1] + " -> " + count);


        System.out.println("6. Matching character pairs.");

        System.out.println("Enter String:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(i) + " - " + str.charAt(j));
                }
            }
        }

        System.out.println("7. Character pattern (A, AB, ABC...).");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            char ch = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }

        System.out.println("8. Pascal Triangle Upto n Rows.");
        System.out.println("Enter n :");
        int num1 = sc.nextInt();
        for (int i = 0; i < num1; i++) {

            for (int s = 0; s < num1 - i - 1; s++) {
                System.out.print(" ");
            }

            int num5 = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num5 + " ");
                num5 = num5 * (i - j) / (j + 1);
            }

            System.out.println();
        }

        System.out.println("10. Spiral number pattern.");
        System.out.print("Enter n: ");
        int n1 = sc.nextInt();

        int[][] arr = new int[n1][n1];

        int top = 0, bottom = n1 - 1;
        int left = 0, right = n1 - 1;
        int num = 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = num++;
                }
                left++;
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }

    }

    public void level5(){
//        3. Password validation.
//        5. Coin toss simulation using Random, count heads and tails.
//        6. Digit frequency.
//        7. Common elements between arrays.
//        8. Common characters between strings.
    }
}
