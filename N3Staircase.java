<<<<<<< HEAD
package tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class N3Staircase {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, t;
        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                n = Integer.parseInt(a[0]);
                t = Integer.parseInt(a[1]);
                if (n < 2 || t > 100) System.out.println("����� ����������� ������ ���� �� ������ 2, � ����� ����� ������ ���� �� ������ 100");
                else break;
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� 2 ����� ������������� �����");
            }
        }

        int[] arr = new int[n];
        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                for (int i=0; i<a.length; i++) {
                    arr[i] = Integer.parseInt(a[i]);
                    if (arr[i]<=0) throw new Exception();
                }
                if (a.length!=n) throw new Exception();
                else break;
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� ����� ������������� �����, ����������� ��������, �� ���������� �����������");
            }
        }

        int big_pot;
        while (true) {
            try {
                String s = scan.next();
                int x = Integer.parseInt(s);
                if (x>n || x<1) System.out.println("���-�� �� �������. �� ���� ����� ���������� � ����� �������");
                else {
                    big_pot = arr[x-1];
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� ����� ������������� �����");
            }
        }

        Arrays.sort(arr);
        int max = arr[n-1];
        int min = arr[0];
        int floors;
        if (big_pot-min < t || max-big_pot < t) floors = max-min;
        else if (big_pot-min < max-big_pot) floors = big_pot-min + (max-min);
        else floors = max-big_pot + (max-min);

        System.out.println(floors);
    }
}
=======
package tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class N3Staircase {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, t;
        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                n = Integer.parseInt(a[0]);
                t = Integer.parseInt(a[1]);
                if (n < 2 || t > 100) System.out.println("����� ����������� ������ ���� �� ������ 2, � ����� ����� ������ ���� �� ������ 100");
                else break;
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� 2 ����� ������������� �����");
            }
        }

        int[] arr = new int[n];
        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                for (int i=0; i<a.length; i++) {
                    arr[i] = Integer.parseInt(a[i]);
                    if (arr[i]<=0) throw new Exception();
                }
                if (a.length!=n) throw new Exception();
                else break;
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� ����� ������������� �����, ����������� ��������, �� ���������� �����������");
            }
        }

        int big_pot;
        while (true) {
            try {
                String s = scan.next();
                int x = Integer.parseInt(s);
                if (x>n || x<1) System.out.println("���-�� �� �������. �� ���� ����� ���������� � ����� �������");
                else {
                    big_pot = arr[x-1];
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("������������ ���� ������. ������� ����� ������������� �����");
            }
        }

        Arrays.sort(arr);
        int max = arr[n-1];
        int min = arr[0];
        int floors;
        if (big_pot-min < t || max-big_pot < t) floors = max-min;
        else if (big_pot-min < max-big_pot) floors = big_pot-min + (max-min);
        else floors = max-big_pot + (max-min);

        System.out.println(floors);
    }
}
>>>>>>> 994c5dc121fb6bdc620729394f73ae9a04ea1d0b
