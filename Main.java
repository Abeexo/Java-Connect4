import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Game g1 = new Game();
        System.out.println("\u001B[34m" + "\nCONNECT FOUR!!!\n" + "\u001B[0m");
        System.out.println(g1);

        while (!g1.checkWin()) {
            System.out.println("set column\n");
            g1.setPosition(input.nextInt());
            System.out.println(g1);
        }
        System.out.println("the winner is the player " + g1.getCurrent() + "\n");
    }
}