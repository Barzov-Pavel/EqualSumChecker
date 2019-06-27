public class Main {

    public static void main(String[] args) {
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1) + " should return false");
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2) + " should return true");
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0) + " should return true");
    }
}
