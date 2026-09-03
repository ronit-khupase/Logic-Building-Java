import java.util.Locale;
import java.util.Scanner;

public class Phase5 {

    public void level1(){

        Scanner sc = new Scanner(System.in);
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
        System.out.println("Length Without Spacces is : "+cnt);

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
}
