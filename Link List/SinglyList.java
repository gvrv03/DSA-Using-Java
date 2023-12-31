import java.util.Scanner;

public class SinglyList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter Data : ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.print("Do u want to add more data. If yes, press (1) : ");
            n = sc.nextInt();

        } while (n == 1);
        sc.close();
    }

    public void traverser() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkList does not exist");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        SinglyList l1 = new SinglyList();
        l1.creation();
        l1.traverser();

    }
}
