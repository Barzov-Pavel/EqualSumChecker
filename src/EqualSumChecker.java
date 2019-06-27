public class EqualSumChecker {

    public static boolean hasEqualSum(int firstAddend, int secondAddend, int sum) {
        int localSum = firstAddend + secondAddend;
        if (localSum == sum) {
            return true;
        } else return false;
    }
}
