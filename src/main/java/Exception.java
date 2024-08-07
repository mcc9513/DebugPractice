public class Exception {
    int[] numList;

    public static double average(int[] numList) {
        // Introduce NullPointerException
        int sum = 0;
        int length = numList.length; //will throw NullPointerException if numList is null

        // Introduce ArrayIndexOutOfBoundsException
        // Attempting to access an out-of-bounds index
        for (int i = 0; i <= numList.length; i++) { // Change the condition to `i <= numList.length`
            sum += numList[i]; // This will throw ArrayIndexOutOfBoundsException when i == numList.length
        }

        double result = sum / length;
        return result;
    }

    public static void main(String[] args) {
        // creates NullPointerException
        //int[] numList = null;
//        average(numList); //throws NPE

        // Uncomment below lines to trigger ArrayIndexOutOfBoundsException
         int[] numList = {1, 2, 3, 4, 5};
         System.out.println(average(numList)); // This will cause ArrayIndexOutOfBoundsException
    }
}
