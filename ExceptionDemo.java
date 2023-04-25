public class ExceptionDemo {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int n = Integer.parseInt(arg);
                System.out.println("Factorial of " + n + " is " + factorial(n));
            } catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid integer");
            } catch (FactorialException e) {
                System.out.println("FactorialException: " + e);
            }
        }
    }

    public static int factorial(int n) throws FactorialException {
        if (n < 0 || n > 15) {
            throw new FactorialException(n);
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}