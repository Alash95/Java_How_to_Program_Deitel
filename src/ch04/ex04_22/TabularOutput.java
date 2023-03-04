package ch04.ex04_22;

public class TabularOutput {

    public static void main(String[] args) {

        int n = 5, i = 1;


        System.out.print("n\t n2\t n3\t n4\n");

        while (i <= n) {
            System.out.printf("%d\t %d\t %d\t %d\n", i, i*i, i*i*i, i*i*i*i);
            System.out.print("\n");
            i++;
        }
    }
}

/*
N       N2      3N      N4

1       1       1       1
2       4       8       16
3       9       27      81
4       16      64      256
5       25      125     625
 */
