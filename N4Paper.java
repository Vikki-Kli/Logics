<<<<<<< HEAD
package tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class N4Paper {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, k;
        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                n = Integer.parseInt(a[0]);
                k = Integer.parseInt(a[1]);
                if (n < 1 || n > 1000 || k < 1 || k > 10000) System.out.println("���������� ����� ������ ���� �� 1 �� 1000, � ����� �������� - �� 1 �� 10000");
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
                System.out.println("������������ ���� ������. ������� ����� ������������� �����, ����������� ��������, �� ����������, ������� ������� ����");
            }
        }

        Arrays.sort(arr);
        int sum = 0;
        byte digit = (byte) (Math.floor(Math.log(arr[arr.length-1])/Math.log(10))+1);

        while (k != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (Math.floor(arr[i]/Math.pow(10.0, digit-1)) != 0) {
                    if (Math.floor(arr[i]/Math.pow(10.0, digit-1)) != 9) {
                        sum+= 9*Math.pow(10, digit-1) - Math.floor(arr[i]/Math.pow(10.0, digit-1))*Math.pow(10.0, digit-1);
                        k--;
                    }
                    arr[i] = (int) (arr[i]%Math.pow(10.0, digit-1));
                }
                if (i == arr.length-1 && k != 0) {
                    i = -1;
                    digit-=1;
                    Arrays.sort(arr);
                }
                if (k==0) break;
            }
        }

        System.out.println(sum);
    }
}

=======
package tinkoff;

import java.util.Arrays;
import java.util.Scanner;

public class N4Paper {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, k;
        while (true) {
            try {
                String s = scan.nextLine();
                String[] a = s.split(" ");
                n = Integer.parseInt(a[0]);
                k = Integer.parseInt(a[1]);
                if (n < 1 || n > 1000 || k < 1 || k > 10000) System.out.println("���������� ����� ������ ���� �� 1 �� 1000, � ����� �������� - �� 1 �� 10000");
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
                System.out.println("������������ ���� ������. ������� ����� ������������� �����, ����������� ��������, �� ����������, ������� ������� ����");
            }
        }

        Arrays.sort(arr);
        int sum = 0;
        byte digit = (byte) (Math.floor(Math.log(arr[arr.length-1])/Math.log(10))+1);

        while (k != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (Math.floor(arr[i]/Math.pow(10.0, digit-1)) != 0) {
                    if (Math.floor(arr[i]/Math.pow(10.0, digit-1)) != 9) {
                        sum+= 9*Math.pow(10, digit-1) - Math.floor(arr[i]/Math.pow(10.0, digit-1))*Math.pow(10.0, digit-1);
                        k--;
                    }
                    arr[i] = (int) (arr[i]%Math.pow(10.0, digit-1));
                }
                if (i == arr.length-1 && k != 0) {
                    i = -1;
                    digit-=1;
                    Arrays.sort(arr);
                }
                if (k==0) break;
            }
        }

        System.out.println(sum);
    }
}

>>>>>>> 994c5dc121fb6bdc620729394f73ae9a04ea1d0b
