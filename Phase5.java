import java.util.Scanner;

public class Phase5 {
    Scanner sc = new Scanner(System.in);

    public void level1(){

        System.out.println("Enter String");
        String str = sc.nextLine();

        System.out.println("1. String length.");
        System.out.println("String Length: "+str.length());

        System.out.println("2. First and last character.");
        System.out.println("First Char: "+str.charAt(0)+" Last Char : "+str.charAt(str.length()-1));

        System.out.println("3. Convert to uppercase.");
        System.out.println(str.toUpperCase());

        System.out.println("4. Convert to lowercase.");
        System.out.println(str.toLowerCase());

        System.out.println("5. Count characters excluding spaces.");
        char[] charArr = str.toCharArray();
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(charArr[i] != ' '){
                cnt++;
            }
        }
        System.out.println("Length Without Spaces is : "+cnt);

        System.out.println("6. Count words.");
        str = str.trim();
        if(str.isEmpty())
            System.out.println("No words in string");
        else {
            String[] words = str.split("\\s+");
            System.out.println("No of words are : "+ words.length);
        }


        System.out.println("7. Concatenate strings.");
        String s = sc.nextLine();
        System.out.println("Concatenated String: " + str + s);

        System.out.println("8. Lexicographical comparison.");
        boolean found = false;
        char[] charArr1 = str.toCharArray();
        char[] charArr2 = s.toCharArray();
        int min = Math.min(str.length(), s.length());
        for(int i = 0; i < min; i++){
            if(charArr1[i] < charArr2[i]) {
                System.out.println(str + " comes before "+s);
                found = true;
                break;
            }
            else if(charArr1[i] > charArr2[i]){
                System.out.println(s + " comes before "+str);
                found = true;
                break;
            }
        }

        if(!found){
            if(str.length() > s.length()){
                System.out.println(s+" comes before "+str);
            } else if (str.length() < s.length()) {
                System.out.println(str+" comes before "+s);
            }
            else {
                System.out.println("Both Strings are Equal");
            }
        }


        System.out.println("9. ASCII values.");
        charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            System.out.println((int)charArr[i]);
        }

        System.out.println("10. Check empty string.");
        if(str.isEmpty()){
            System.out.println("String is Empty");
        }
        else
            System.out.println("String is not Empty");

    }

    public void level2(){

        System.out.println("1. Count vowels and consonants.");
        String str = sc.nextLine();

        str = str.toLowerCase();
        int vowel = 0, cons = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'
                || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u'){
                vowel++;
            }
            else if (Character.isLetter(str.charAt(i))){
                cons++;
            }
        }

        System.out.println("Vowels : "+ vowel + " Consonant: " + cons);


        System.out.println("2. Count digits, letters, special characters.");
        str = sc.nextLine();
        int dig = 0;
        int let = 0;
        int sym = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i)))
                let++;
            else if(Character.isDigit(str.charAt(i)))
                dig++;
            else
                sym++;
        }

        System.out.println("Letters : "+let+ " Digits : "+dig+ " Special Chars : "+sym);


        System.out.println("3. Count uppercase and lowercase.");
        str = sc.nextLine();
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                if(Character.isUpperCase(str.charAt(i)))
                    upper++;
                else if (Character.isLowerCase(str.charAt(i)))
                    lower++;
            }
        }

        System.out.println("Upper : "+upper+ " Lower: "+lower);


        System.out.println("4. Character frequency.");
        str = sc.nextLine();
        str = str.toLowerCase();
        boolean[] visited = new boolean[str.length()];

        for(int i = 0; i < str.length(); i++){
            if(visited[i])
                continue;
            int freq = 1;
            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    freq++;
                    visited[j] = true;
                }
            }
            System.out.println(str.charAt(i) + "->" + freq);
        }


        System.out.println("5. Count spaces.");
        str = sc.nextLine();
        int space = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                space++;
            }
        }
        System.out.println("Number of spaces is : "+space);


        System.out.println("6. Count given character occurrences.");
        int cnt = 0;
        str = sc.nextLine().toLowerCase();
        char ch = sc.next().charAt(0);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                cnt++;
            }
        }
        System.out.println(ch+" appears "+ cnt+" times.");

        sc.nextLine();
        System.out.println("7. Alphabets before/after a character.");
        str = sc.nextLine().toLowerCase();
        ch = Character.toLowerCase(sc.nextLine().charAt(0));

        int pos = str.indexOf(ch);

        if (pos == -1) {
            System.out.println("Character not found.");
        } else {
            int before = pos;
            int after = str.length() - pos - 1;

            System.out.println("Before : " + before);
            System.out.println("After : " + after);
        }


        System.out.println("8. Count substrings starting and ending with same character.");
        str = sc.nextLine().toLowerCase();
        cnt = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ')
                continue;
            for(int j = i; j < str.length(); j++){
                if (str.charAt(j) == ' ')
                    continue;
                if (str.charAt(i) == str.charAt(j)){
                    cnt++;
                }
            }
        }

        System.out.println("Count : " + cnt);

        System.out.println("9. Count words starting with vowel.");

        str = sc.nextLine().toLowerCase().trim();
        cnt = 0;

        if (!str.isEmpty()) {
            String[] words = str.split("\\s+");

            for (String word : words) {
                ch = word.charAt(0);

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    cnt++;
                }
            }
        }

        System.out.println("Count : " + cnt);


        System.out.println("10. Count words ending with 's'.");
        str = sc.nextLine().toLowerCase().trim();
        cnt = 0;
        if (!str.isEmpty()) {
            String[] words = str.split("\\s+");

            for (String word : words) {
                ch = word.charAt(word.length()-1);

                if (ch == 's') {
                    cnt++;
                }
            }
        }

        System.out.println("Count : " + cnt);

    }

    public void level3(){

        System.out.println("1. Reverse string manually.");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for ( int i = 0; i < ch.length/2; i++){
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        System.out.println("Reverse: "+ new String(ch));

        System.out.println("2. Reverse each word in sentence.");
        str = sc.nextLine();
        String[] words = str.split("\\s+");

        for(String word : words){
            ch = word.toCharArray();
            for ( int i = 0; i < ch.length/2; i++){
                char temp = ch[i];
                ch[i] = ch[ch.length-1-i];
                ch[ch.length-1-i] = temp;
            }
            System.out.print(new String(ch)+ " ");
        }
        System.out.println();

        System.out.println("3. Reverse words in sentence.");
        str = sc.nextLine().toLowerCase();
        words = str.split("\\s+");
        for(int i = 0; i < words.length/2; i++){
            String temp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = temp;
        }
        str = String.join(" ", words);
        System.out.println("String After Reversing words : "+str);

        System.out.println("4. Palindrome string.");
        str = sc.nextLine();
        ch = str.toCharArray();

        for ( int i = 0; i < ch.length/2; i++){
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        if (str.equals(new String(ch))){
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not Palindrome");
        }


        System.out.println("5. Check if two strings are reverse of each other.");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        ch = str1.toCharArray();

        for ( int i = 0; i < ch.length/2; i++){
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        if(str2.equals(new String(ch))){
            System.out.println("Strings are Reverse of each other");
        }
        else {
            System.out.println("Strings are Not Reverse of each other");
        }

        System.out.println("6. Middle character(s) of string.");
        str = sc.nextLine();
        if(str.length()%2 == 0){
            System.out.println("Middle Characters : " + str.charAt(str.length()/2 - 1)+" and "+ str.charAt(str.length()/2));
        }
        else {
            System.out.println("Middle Character : " + str.charAt(str.length()/2));
        }

        System.out.println("7. Second half reverse of string.");
        str = sc.nextLine();
        ch = str.toCharArray();

        int mid = ch.length/2;
        int left = mid;
        int right = ch.length - 1;

        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.println("After half reverse : "+new String(ch));


        System.out.println("8. Remove first and last character.");
        if(str.length() > 1){
           str = str.substring(1, str.length()-1);
        }
        else {
            str = "";
        }

        System.out.println("String after removing chars: " + str);


        System.out.println("9. Reverse only characters keeping digits in place.");
        str = sc.nextLine();
        ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while (i < j) {
            if (!Character.isLetter(ch[i])) {
                i++;
            } else if (!Character.isLetter(ch[j])) {
                j--;
            } else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(new String(ch));


        System.out.println("10. Reverse but preserve spaces.");
        str = sc.nextLine();
        words = str.split(" ");

        for(i = 0; i < words.length; i++){
            ch = words[i].toCharArray();

            for ( j = 0; j < ch.length/2; j++){
                char temp = ch[j];
                ch[j] = ch[ch.length-1-j];
                ch[ch.length-1-j] = temp;
            }
            words[i] = new String(ch);
        }
        System.out.println(String.join(" ",words));
    }
}
