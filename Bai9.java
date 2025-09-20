import java.util.Scanner;
public class Bai9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu cua danh sach: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Nhap vao phan tu thu " + (i+1) + ": ");
            a[i] = sc.nextInt();
        } 
        System.out.print("Cac phan tu cua danh sach la: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
