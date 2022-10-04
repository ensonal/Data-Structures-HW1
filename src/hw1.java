import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class hw1 {

    public static void main(String[] args){
        char[] attempt = {'a','a','a','e','e','i','u','b','c','d','f'};
        System.out.println(countChar(attempt));

        randomArray();
    }

    /* Write a method that takes an array containing the set of all integers in the range 1 to 52 and shuffles it into
    random order. Your method should output each possible order with equal probability. */

    static void randomArray(){
        int[] arr = new int[52];
        int temp = 1;
        for(int i=0; i<arr.length; i++){
            arr[i] = temp;
            temp++;
        }
        System.out.println(Arrays.toString(arr));

        Random rnd = new Random();
        for(int i=0; i<arr.length; i++){
            int tempIndex = rnd.nextInt(52);
            int temp2 = arr[tempIndex];
            arr[tempIndex] = arr[i];
            arr[i] = temp2;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Write a short method in any language that counts the number of a,e,i,u characters in a given character string.



    static String countChar(char[] charArr){
        HashMap<Character,Integer> totalCount = new HashMap<>();
        int[] arrForCount = {0,0,0,0};

        for(char c : charArr){
            if(c == 'a'){
                arrForCount[0]++;
            }else if(c == 'e'){
                arrForCount[1]++;
            }else if(c == 'i'){
                arrForCount[2]++;
            }else if(c == 'u'){
                arrForCount[3]++;
            }
        }

        totalCount.put('a', arrForCount[0]);
        totalCount.put('e', arrForCount[1]);
        totalCount.put('i', arrForCount[2]);
        totalCount.put('u', arrForCount[3]);

        return totalCount.get('a') + "\n" + totalCount.get('e') + "\n" + totalCount.get('i') + "\n" + totalCount.get('u');
    }
}
