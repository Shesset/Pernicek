import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kolik perníčku chceš upéct? ");
        int x = sc.nextInt();


        System.out.print("Kolik gramů citronu chceš použít na jeden perníček? ");
        int y = sc.nextInt();

        System.out.print("Kolik gramů cukru chceš do jednoho perníčku? ");
        int z = sc.nextInt();
        if (z > 10) {
            System.out.println(" Fuj, bude to přeslazené, zkus příště méně cukru :)");
            return;
        }

        if (x >= 5) {
            System.out.println("Potřebuješ " + (x * y) + " gramů citronu na " + x + " perníčků");
            System.out.println("Potřebuješ " + (x * z) + " gramů cukru na " + x + " perníčků");
        } else if (x > 1) {
            System.out.println("Potřebuješ " + (x * y) + " gramů citronu na " + x + " perníčky");
            System.out.println("Potřebuješ " + (x * z) + " gramů cukru na " + x + " perníčky");
        } else if (x == 1) {
            System.out.println("Potřebuješ " + (x * y) + " gramů citronu na " + x + " perníček");
            System.out.println("Potřebuješ " + (x * z) + " gramů cukru na " + x + " perníček");
        }


    }
}