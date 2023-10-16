import java.util.Scanner;

/**
 * Deletion
 */
public class Deletion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many no. yo want to add : ");
        int n = sc.nextInt();
        int indexNo;
        int a[] = new int[n];
        int b[] = new int[n - 1];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter No. for " + (i + 1) + " number : ");
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Before Deletion :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "    ");
        }

        System.out.println();
        System.out.print("In which index you want to Delete No : ");
        indexNo = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (i < indexNo) {
                b[i] = a[i];
            } else if (i == indexNo) {
                continue;
            } else {
                b[i - 1] = a[i];
            }
        }

        System.out.println();
        System.out.println("The Data Is :");
        System.out.println("After Deletion :");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "    ");
        }
    }
}