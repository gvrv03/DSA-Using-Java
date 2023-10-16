import java.util.Scanner;

/**
 * Insertion
 */
public class Insertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many no. yo want to add : ");
        int n = sc.nextInt();
        int indexNo, newValue;
        int a[] = new int[n];
        int b[] = new int[n + 1];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter No. for " + (i + 1) + " number : ");
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Before Insertion :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "    ");
        }

        System.out.println();
        System.out.print("In which index you want to add No : ");
        indexNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the value : ");
        newValue = sc.nextInt();

        for (int i = 0; i < b.length; i++) {
            if (i < indexNo) {
                b[i] = a[i];
            }else if(i == indexNo){
                b[i] = newValue;
            }else{
                b[i]=a[i-1];
            }
        }

        System.out.println();
        System.out.println("The Data Is :");
        System.out.println("After Insertion :");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "    ");
        }
    }
}