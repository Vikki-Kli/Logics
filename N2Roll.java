<<<<<<< HEAD
package tinkoff;

import java.util.Scanner;

public class N2Roll {
    public static void main (String[] args) {

        //������ ���� �������� ���������� ������?

        int n;

        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                String s = scan.next();
                n = Integer.parseInt(s);
                if (n<1) System.out.printf("��� ����� �������� ����� �� %d ������? ������� ��� ��� \n", n);
                else break;
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� ���� ����� ����� �� ������ 2�10^9");
            }
        }

        double cuts = Math.log(n)/Math.log(2);
        System.out.println((int)Math.ceil(cuts));
    }
}
=======
package tinkoff;

import java.util.Scanner;

public class N2Roll {
    public static void main (String[] args) {

        //������ ���� �������� ���������� ������?

        int n;

        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                String s = scan.next();
                n = Integer.parseInt(s);
                if (n<1) System.out.printf("��� ����� �������� ����� �� %d ������? ������� ��� ��� \n", n);
                else break;
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� ���� ����� ����� �� ������ 2�10^9");
            }
        }

        double cuts = Math.log(n)/Math.log(2);
        System.out.println((int)Math.ceil(cuts));
    }
}
>>>>>>> 994c5dc121fb6bdc620729394f73ae9a04ea1d0b
