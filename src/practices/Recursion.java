package practices;

class Recursion{
    public static void main(String[] args){
        System.out.println(factorial(0));
        System.out.println(factorial(5));

        int[] data = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,20,21,22};
        System.out.println(binarySearch(data, 16, 0, 18));
        System.out.println(binarySearch(data, 3, 0, 18));

        System.out.println(linearSum(data, 5));

    }


    /*
    * It calculates factorial with recursion method.
    */
    public static int factorial(int n) throws IllegalArgumentException{
        if(n<0){ // Argument must be nonnegative.
            throw new IllegalArgumentException();
        }
        if(n == 0){
            return 1; // Base case
        }

        return n*factorial(n-1);
    }

    /*
    * Returns true if the target value is found in the indicated portion
    of the data array.
    * This search only considers the array portion from data[low] to
    data[high] inclusive.
    */ 
    public static boolean binarySearch(int[] data, int target, int low, int high){
        if(low > high){
            return false; // Interval empty; no match.
        }else{
            int mid = (low + high) / 2;
            if(target == data[mid]){
                return true; // Found a match.
            }else if(target < data[mid]){
                // Recur left of the middle.
                return binarySearch(data, target, low, mid-1);
            }else{
                // Recur right of the middle.
                return binarySearch(data, target, mid+1, high);
            }
        }
    }

    public static int binarySum(int[] data, int low, int high){
        if(low > high){
            return 0;
        }else if(low == high){
            return data[low];
        }else{
            int mid = (low+high) / 2;
            return binarySum(data, low, mid) + binarySum(data, mid+1, high) 
        }
    }

    /*
     * It adds values up to the nth number.
     */
    public static int linearSum(int[] data, int n){
        if(n==0){
            return 0;
        }else{
            return linearSum(data, n-1) + data[n-1];
        }
    }
    
    /*
     * It reverses the contents of subarray data[begin] through data[high] inclusive.
     */
    public static void reverseArray(int[] data, int begin, int end){
        if(begin<end){
            int temp = data[begin]; // Swap data.
            data[begin] = data[end];
            data[end] = temp;
            reverseArray(data, begin+1, end-1);
        }
    }

    /*
     * Computes the value of x raised to the nth power, for nonnegative integer
     */
    public static double power(double x,double n){
        if(n == 0){
            return 1;
        }else{
            return n * power(x,n-1);
        }
    }

    /** Inefficient recursion for computing fibonacci numbers */
    public static int binaryFib(int n){
        if(n==1){
            return n;
        }else{
            return binaryFib(n-1) + binaryFib(n-2);
        }
    }

    




}

