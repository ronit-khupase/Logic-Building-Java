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
}
