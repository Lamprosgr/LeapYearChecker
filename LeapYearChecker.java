public class LeapYearChecker {
    public boolean isLeapYear(int year) {
       // Implement your code here
    }
}
Please ensure your code passes all the test cases, including edge cases, and adheres to the above guidelines. */
public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year == 0) {
            return false;
        } else if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {

        System.out.println(isLeapYear(0));
    }

}
