import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd() {
        return (int n) -> n % 2 != 0;
    }

    PerformOperation isPrime() {
        return (int n) -> {
            if (n < 2)
                return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    PerformOperation isPalindrome() {
        return (int n) -> {
            int temp = n;
            int rev = 0;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            return rev == n;
        };
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath ob = new MyMath();

        int T = sc.nextInt();

        while (T-- > 0) {
            int ch = sc.nextInt();
            int num = sc.nextInt();

            PerformOperation op;

            if (ch == 1) {
                op = ob.isOdd();
                System.out.println(MyMath.checker(op, num) ? "ODD" : "EVEN");
            } else if (ch == 2) {
                op = ob.isPrime();
                System.out.println(MyMath.checker(op, num) ? "PRIME" : "COMPOSITE");
            } else if (ch == 3) {
                op = ob.isPalindrome();
                System.out.println(MyMath.checker(op, num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }

        sc.close();
    }
}


output/
  Input (stdin)
5
1 4
2 5
3 898
1 3
2 12
Your Output (stdout)
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
Expected Output
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
