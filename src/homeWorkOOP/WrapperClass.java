package homeWorkOOP;

public class WrapperClass {
    public static void main(String[] args){
        int[] arr1 = new int[6];
        addValue(arr1,2,5);
        addValue(arr1,7,3);


    }

    /** Give two examples of Java code fragments for Nested Static and Nested Non-Static classes.
     */

    // Static Class
    public static class NestedClass { }
    // For create new object, WrapperClass.NestedClass obj = new WrapperClass.NestedClass();

    //Non-Static Class
    public class NestedClass2 {}
    /* For create new object
     * WrapperClass wrapper = new WrapperClass();
     * WrapperClass.NestedClass2 obj2 = wrapper.new NestedClass()
     */


    /** Give an example of a Java code fragment that performs an array reference that is
     * possibly out of bounds, and if it is out of bounds, the program catches that exception
     * and prints the following error message: Dont try buffer overflow attacks in Java!
     *
     */
    public static void addValue(int[] arr, int index, int value){
        try{
            arr[index] = value;
            System.out.println("The value stored at " + index + ".");
            System.out.println("Stored value: " + value);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Dont try buffer overflow attacks in Java");
        }
    }
}
