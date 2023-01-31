package practices;

public class ArrayPractice {
    public static void main(String[] args){
        createRandomArr();
        printArr(createRandomArr());
        maxValue(createRandomArr());

    }

    /** Create an array with random values */
    public static double[] createRandomArr(){
        double[] arr = new double[10];
        for(int i=0; i<arr.length; i++){
            arr[i] = Math.random();
        }
        return arr;
    }

    /** Print the array values one per line */
    public static void printArr(double[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    /** Find maximum of the array values */
    public static double maxValue(double[] arr){
        double max = Double.NEGATIVE_INFINITY;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    /** Reverse the elements within an array */
    public static void reverseArr(double[] arr){
        for(int i=0; i<arr.length/2; i++){
            double temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    /** Insertion-sort of an array of characters into nondecreasing order */
    public static void insertionSort(char[] data){
        int n = data.length;
        for(int k=1; k<n; k++){
            char chr = data[k];
            int j = k;
            while(j>0 && data[j-1]>chr){
                data[j] = data[j-1];
                j--;
            }
            data[j] = chr;
        }
    }



}
