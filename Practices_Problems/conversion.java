import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int f = (c * 9/5) + 32;
        System.out.println(f);
    }
}
