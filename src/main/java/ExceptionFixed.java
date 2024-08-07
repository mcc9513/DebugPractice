public class ExceptionFixed {
    int[] numList;

    public static double average(int[] numList) {

        int sum = 0;
        int length = numList.length;//created a breakpoint on this line and ran debugger, debugger showed a null point exception

        // Reran debugger and got the message:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //showed errors at lines 12(sum+=numList[i]) and 22(sys.out), when the method was being called
        for (int i = 0; i < numList.length; i++) { // Changed the condition back to `i < numList.length` to remain within bounds
            sum += numList[i];
        }

        double result = sum / length;
        return result;
    }

    public static void main(String[] args) {

        int[] numList = {1, 2, 3, 4, 5}; //removed null and replaced values from assignment to fix bug
        System.out.println(average(numList));

    }
}
//runs as normal again
