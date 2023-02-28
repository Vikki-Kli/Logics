<<<<<<< HEAD
package tinkoff;

import java.util.Scanner;

public class N5Tests {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long l, r;
        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                l = Long.parseLong(a[0]);
                r = Long.parseLong(a[1]);
                if (l < 1 || l > 10E18 || r < 1 || r > 10E18 || l>=r) System.out.println
                        ("����������� �� ����� ������ ������ � ��������� �� 1 �� 10^18. ������ ����� ������ ���� ������ �������");
                else break;
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� 2 ����� ������������� ����� � ��������� �� 1 �� 10^18");
            }
        }

        byte digitL = (byte) (Math.floor(Math.log(l)/Math.log(10))+1);
        byte digitR = (byte) (Math.floor(Math.log(r)/Math.log(10))+1);
        short count = 0;
        long test = 0;


        for (byte digitTest = digitL; digitTest <= digitR; digitTest++) {
            for (byte numeral = 1; numeral <= 9; numeral++) {
                for (byte power = (byte) (digitTest - 1); power >= 0; power--) {
                    test += (long) Math.pow(10, power) * numeral;
                    if (power == 0) {
                        if (test >= l && test <= r) {
                            count++;
                        }
                        test = 0;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
=======
package tinkoff;

import java.util.Scanner;

public class N5Tests {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long l, r;
        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                l = Long.parseLong(a[0]);
                r = Long.parseLong(a[1]);
                if (l < 1 || l > 10E18 || r < 1 || r > 10E18 || l>=r) System.out.println
                        ("����������� �� ����� ������ ������ � ��������� �� 1 �� 10^18. ������ ����� ������ ���� ������ �������");
                else break;
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� 2 ����� ������������� ����� � ��������� �� 1 �� 10^18");
            }
        }

        byte digitL = (byte) (Math.floor(Math.log(l)/Math.log(10))+1);
        byte digitR = (byte) (Math.floor(Math.log(r)/Math.log(10))+1);
        short count = 0;
        long test = 0;


        for (byte digitTest = digitL; digitTest <= digitR; digitTest++) {
            for (byte numeral = 1; numeral <= 9; numeral++) {
                for (byte power = (byte) (digitTest - 1); power >= 0; power--) {
                    test += (long) Math.pow(10, power) * numeral;
                    if (power == 0) {
                        if (test >= l && test <= r) {
                            count++;
                        }
                        test = 0;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
>>>>>>> 994c5dc121fb6bdc620729394f73ae9a04ea1d0b
