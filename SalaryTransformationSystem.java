import java.util.*;

public class SalaryTransformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int salary = sc.nextInt();
            int updatedSalary = salary + salary / 10;
            System.out.print(updatedSalary + " ");
        }

        sc.close();
    }
}