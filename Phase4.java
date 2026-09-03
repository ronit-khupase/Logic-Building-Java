import java.util.Arrays;
import java.util.Scanner;

public class Phase4 {

    Scanner sc = new Scanner(System.in);
    public void level1(){

        System.out.println("1. Input and print array.");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");

        System.out.println("2. Sum array elements.");
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        System.out.println("Sum is : "+sum);

        System.out.println("3. Average.");
        System.out.println("Average : "+ sum/n);

        System.out.println("4. Maximum.");
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println("Max is : "+max);

        System.out.println("5. Minimum.");
        int min = arr[0];
        for(int i = 1; i < n; i++){
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println("Min is : "+min);

        System.out.println("6. Count positive/negative/zero.");
        int pos = 0, neg = 0, zero = 0;
        for(int i = 0; i < n; i++)
            if(arr[i] < 0) neg++;
            else if(arr[i] > 0) pos++;
            else zero++;

        System.out.println("Positive: "+pos+"\nNegative: "+neg+"\nZeros: "+zero);

        System.out.println(" 7. Count even/odd.");
        int even = 0, odd = 0;
        for(int i = 0; i < n; i++)
            if(arr[i] % 2 == 0 ) even ++;
            else odd++;

        System.out.println("Even : "+even+"\nOdd : "+odd);

        System.out.println("8. Index of maximum.");
        int maxIdx = 0;
        for(int i = 0; i < n; i++)
            if(arr[i] == max) maxIdx = i;

        System.out.println("Index of Max: "+ maxIdx);

        System.out.println("9. Index of minimum.");
        int minIdx = 0;
        for(int i = 0; i < n; i++)
            if(arr[i] == min) minIdx = i;

        System.out.println("Index of Min: "+ minIdx);

        System.out.println("10. Print elements greater than k.");
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] > k)
                System.out.println(arr[i] +" ");
        }
    }

    public void level2(){
        System.out.println("Number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(" 1. Search element.");
        int num = sc.nextInt();
        for(int i = 0; i < n; i++)
            if(arr[i] == num)
                System.out.println("Number found at index : "+i);

        System.out.println(" 2. Count occurrences.");
        num = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++)
            if(arr[i] == num)
                cnt++;
        System.out.println("Number of occurrences is: "+cnt);

        System.out.println(" 3. First occurrence.");
        num = sc.nextInt();
        for(int i = 0; i < n; i++)
            if(arr[i] == num) {
                System.out.println("First occurrence is at index: " + i);
                break;
            }

        System.out.println(" 4. Last occurrence.");
        num = sc.nextInt();
        int last = 0;
        for(int i = 0; i < n; i++)
            if(arr[i] == num) {
                last = i;
            }
        System.out.println("Last occurrence is at index: "+last);

        System.out.println(" 5. Check if all unique of array are unique.");
        boolean unique = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            if(!unique)
                break;
        }
        if(unique)
            System.out.println("All elements are unique.");
        else
            System.out.println("Not Unique");

        System.out.println(" 6. Sum even elements.");
        int sum = 0;
        for (int i = 0; i < n; i++)
            if(arr[i]%2 == 0)
                sum += arr[i];
        System.out.println("Sum of even : "+sum);

        System.out.println(" 7. Sum odd elements.");
        sum = 0;
        for (int i = 0; i < n; i++)
            if(arr[i]%2 != 0)
                sum += arr[i];
        System.out.println("Sum of odd : "+sum);

        System.out.println(" 8. Count prime numbers.");
        cnt = 0;
        for(int i = 0; i < n; i++)
            if(isPrime(arr[i]))
                cnt++;
        System.out.println("Prime number count is : "+ cnt);

        System.out.println(" 9. Count numbers divisible by 3 and 5.");
        cnt = 0;
        for(int i = 0; i < n; i++)
            if(arr[i]%3 == 0 && arr[i]%5 == 0)
                cnt++;
        System.out.println("Numbers divisible by 3 and 5 are : "+cnt);

        System.out.println(" 10. Count perfect squares.");
        int sqrt = 0;
        for(int i = 0; i < n; i++){
            sqrt = (int)Math.sqrt(arr[i]);
            if(sqrt*sqrt == arr[i])
                cnt++;
        }
        System.out.println("Number of Perfect Square :"+ cnt);
    }

    public boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        if(n == 2) return true;
        for(int i = 2; i < Math.sqrt(n); i++)
            if(n%i == 0)
                return false;
        return true;
    }

    public void level3(){

        System.out.println("Number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("1. New Array of Square all numbers.");
        int[] arrSq = new int[n];
        for(int i = 0; i < n; i++)
            arrSq[i] = (int)Math.pow(arr[i],2);

        System.out.println(Arrays.toString(arrSq));


        System.out.println("2. New array of even elements.");
        int[] arrEven = new int[n];
        for(int i = 0; i < n; i++)
            if(arr[i]%2 == 0)
                arrEven[i] = arr[i];

        System.out.println(Arrays.toString(arrEven));


        System.out.println("3. Replace negatives with 0.");
        for(int i = 0; i < n; i++)
            if(arr[i] < 0)
                arr[i] = 0;

        System.out.println(Arrays.toString(arr));


        System.out.println("4. Replace even with 1 and odd with 0.");
        System.out.println("Enter Array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));


        System.out.println("5. Swap first and last.");
        System.out.println("Enter Array");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));


        System.out.println("6. Reverse array manually.");
        System.out.println("Enter Array");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Original Array : "+ Arrays.toString(arr));
        int len = arr.length;
        for(int i = 0; i <= len/2; i++){
            temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp;
        }
        System.out.println("Reversed Array : "+ Arrays.toString(arr));


        System.out.println("7. Left rotation by 1 position.");
        System.out.println("Enter Array");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Original Array : "+ Arrays.toString(arr));
        int first = arr[0];
        for(int i = 0; i < n-1; i++)
            arr[i] = arr[i+1];
        arr[n-1] = first;

        System.out.println("Array After Rotation: "+ Arrays.toString(arr));

        System.out.println("8. Right rotation by 1 position.");
        System.out.println("Enter Array");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Original Array : "+ Arrays.toString(arr));
        int last = arr[n-1];
        for(int i = n-1; i >= 1; i--)
            arr[i] = arr[i-1];
        arr[0] = last;

        System.out.println("Array After Rotation: "+ Arrays.toString(arr));


        System.out.println("9. Swap alternate elements(1 <-> 2, 3 <-> 4).");
        System.out.println("Enter Array");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Original Array : "+ Arrays.toString(arr));
        for(int i = 0; i < n-1; i+=2) {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println("Array After Swap: "+ Arrays.toString(arr));


        System.out.println("10. Copy one array to another manually.");
        System.out.println("Enter Array");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            copy[i] = arr[i];

        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Copied Array: "+Arrays.toString(copy));
    }

    public void level4(){

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter Array 1");
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter Array 2");
        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();

        System.out.println("1. Compare arrays (same order).");
        boolean same = true;
        for(int i = 0; i < n; i++)
            if (arr1[i] != arr2[i]) {
                same = false;
                break;
            }

        if(same)
            System.out.println("Arrays are same.");
        else
            System.out.println("Arrays are not same.");


        System.out.println("2. Compare arrays (ignore order).");
        same = true;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            boolean found = false;

            for(int j = 0; j < n; j++)
                if(arr1[i] == arr2[j] && !visited[j]){
                    found = true;
                    visited[j] = true;
                    break;
                }
            if(!found){
                same = false;
                break;
            }
        }
        if(same)
            System.out.println("Arrays are same");
        else
            System.out.println("Arrays are not same");


        System.out.println("3. Merge 2 arrays into third array.");
        int[] arr = new int[n+n];
        for(int i = 0; i < n; i++){
            arr[i] = arr1[i];
        }
        for(int i = 0; i < n; i++){
            arr[n+i] = arr2[i];
        }
        System.out.println("Merged Array: "+Arrays.toString(arr));

        System.out.println("4. Common elements are : ");
        boolean[] visit = new boolean[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr1[i] == arr2[j] && !visit[j]){
                    visit[j] = true;
                    System.out.print(arr1[i]+" ");
                }
            }

        }


        System.out.println("5. Elements present in first but not second.");

        for(int i = 0; i < n; i++){
            boolean common = false;
            for(int j = 0; j < n; j++){
                if(arr1[i] == arr2[j]){
                    common = true;
                    break;
                }
            }
            if(!common)
                System.out.println(arr1[i]+" ");
        }


        System.out.println("6. Count common elements.");
        boolean[] visit1 = new boolean[n];
        int cnt = 0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr1[i] == arr2[j] && !visit1[i]){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(" Number of Common Elements: "+ cnt);

        System.out.println("7. Element-wise sum (A[i] + B[i]).");
        int sum;
        for(int i = 0; i < n; i++){
            sum = arr1[i] + arr2[i];
            System.out.println(sum+" ");
        }

        System.out.println("8. Element-wise product (A[i] * B[i]).");
        int prod = 1;
        for(int i = 0; i < n; i++){
            prod = arr1[i] * arr2[i];
            System.out.println(prod+" ");
        }


        System.out.println("9. Frequency array for each number.");
        System.out.println("Enter Array");
        int[] array = new int[n];
        for (int i =0; i < n; i++)
            array[i] = sc.nextInt();

        int[] freq = new int[n];

        boolean[] visit2 = new boolean[n];
        for(int i = 0; i < n; i++){
            if(visit2[i])
                continue;

            int c = 1;
            for(int j = i+1; j < n; j++){
                if(array[i] == array[j] && !visit2[j]){
                    c++;
                    visit2[j] = true;
                }
            }
            visit2[i] = true;
            freq[i] = c;
        }

        System.out.println("Frequency Array : "+ Arrays.toString(freq));


        System.out.println("10. Print duplicates.");
        boolean[] visit3 = new boolean[n];
        for (int i = 0; i < n; i++){
            if(visit3[i])
                continue;
            for(int j = i+1; j < n; j++){
                if(array[i] == array[j] && !visit3[j]){
                    visit3[j] = true;
                    System.out.println(array[i]+" ");
                    break;
                }
            }
        }
    }

    public void level5(){

        System.out.println("Enter Number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("1. Check ascending order.");
        boolean asc = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
                asc = false;
                break;
            }
        }
        if(asc)
            System.out.println("Array is in Ascending Order");
        else
            System.out.println("Array is not in Ascending Order");


        System.out.println("2. Check descending order.");
        boolean desc = true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] < arr[i+1]){
                desc = false;
                break;
            }
        }
        if(desc)
            System.out.println("Array is in Descending Order");
        else
            System.out.println("Array is not in Descending Order");


        System.out.println(" 3. Second largest element.");
        int lar = arr[0];
        int secLar = Integer.MIN_VALUE;;

        for(int i = 1; i < n; i++){
            if(lar < arr[i]){
                secLar = lar;
                lar = arr[i];
            } else if (secLar < arr[i] && arr[i] != lar) {
                secLar = arr[i];
            }
        }
        System.out.println("Second Largest : "+ secLar);

        System.out.println("4. Second smallest element.");
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(small > arr[i]){
                secSmall = small;
                small = arr[i];
            } else if (secSmall > arr[i] && arr[i] != small) {
                secSmall = arr[i];
            }
        }
        System.out.println("Second Smallest : "+ secSmall);


        System.out.println(" 5. Difference between max and min.");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int sum = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
            sum += arr[i];
        }
        System.out.println("Difference between max and min is : "+ (max-min));

        System.out.println("6. Sum excluding largest and smallest.");
        System.out.println("Sum is : " + (sum-(max+min)));


        System.out.println("7. Count pairs with sum = k.");
        int cnt = 0;
        System.out.println("Enter Sum K : ");
        int sumK = sc.nextInt();

        for (int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]+arr[j] == sumK){
                    cnt++;
                }
            }
        }
        System.out.println("Total Pairs are : "+cnt);


        System.out.println("8. Count elements greater than average.");
        double avg = (double)sum/n;
        cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > avg)
                cnt++;
        }
        System.out.println("Count of Elements Greater than Average is : "+cnt);


        System.out.println("9. Frequency of distinct elements.");
        boolean[] visit = new boolean[n];
        for(int i = 0; i < n; i++){
            if (visit[i])
                continue;
            int count = 1;
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visit[j] = true;
                }
            }
            System.out.println(arr[i]+" -> "+ count);
        }


        System.out.println("10. Print unique elements.");

        boolean[] visit1 = new boolean[n];
        for(int i = 0; i < n; i++){
            if(visit1[i])
                continue;

            boolean uni = true;

            for (int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    visit1[j] = true;
                    uni = false;
                }
            }
            if(uni)
                System.out.print(arr[i]+" ");
        }
    }

}
