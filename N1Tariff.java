<<<<<<< HEAD
package tinkoff;

import java.util.Scanner;

public class N1Tariff {
    public static void main (String[] args) {

        int tariff, limit, excess, traffic, cost;

        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                tariff = Integer.parseInt(a[0]);
                limit = Integer.parseInt(a[1]);
                excess = Integer.parseInt(a[2]);
                traffic = Integer.parseInt(a[3]);
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод данных. Необходимо ввести 4 целых числа через пробел");
            }
        }

        if (traffic<limit) cost = tariff;
        else cost = tariff + (traffic - limit)*excess;

        System.out.println(cost);
    }
}
=======
package tinkoff;

import java.util.Scanner;

public class N1Tariff {
    public static void main (String[] args) {

        int tariff, limit, excess, traffic, cost;

        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                tariff = Integer.parseInt(a[0]);
                limit = Integer.parseInt(a[1]);
                excess = Integer.parseInt(a[2]);
                traffic = Integer.parseInt(a[3]);
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод данных. Необходимо ввести 4 целых числа через пробел");
            }
        }

        if (traffic<limit) cost = tariff;
        else cost = tariff + (traffic - limit)*excess;

        System.out.println(cost);
    }
}
>>>>>>> 994c5dc121fb6bdc620729394f73ae9a04ea1d0b
