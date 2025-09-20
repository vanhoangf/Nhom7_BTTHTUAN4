import java.util.Scanner;
public class bai7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao phan tu thu " + (i + 1));
            a[i] = sc.nextInt();
        }
        int tong;
        tong = 0;
        for (int i = 0; i < n; i++)
            tong = tong + a[i];
        System.out.println("Tổng các phần tử trong mảng là:" + tong);
    }}