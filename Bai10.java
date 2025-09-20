import java.util.Scanner;
public class Bai10
{ 
    static Scanner sc = new Scanner(System.in);
    static int [] a;
    static void Nhap(int n)
    {
        a = new int[10000];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Nhap vao phan tu thu " + (i+1) + ": ");
                a[i] = sc.nextInt();
        }
    }
    static void Xuat(int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    static int Them(int n, int a[])
    {
        System.out.print("Nhap vao vi tri muon them: ");
        int vtt = sc.nextInt();
        if (vtt > 0 && vtt <=n+1)
        {
            System.out.print("Nhap vao so muon them: ");
            int so = sc.nextInt();
            if (vtt == n+1)
            {
                a[n] = so;
                n++;
            }
            else
            {
                for(int i = 0; i < n; i++)
                    if (i == vtt-1)
                    {
                        n++;
                        for(int j = n-1; j > i; j--)
                            a[j] = a[j-1]; 
                        a[i] = so;
                    }
            }
        }
        else
        {
            System.out.println("Nhap sai vi tri them! Vui long nhap lai");
            n = Them(n, a);
        }
        return n;
    }
    static int Xoa(int n, int a[])
    {
        System.out.print("\nNhap vao vi tri muon xoa: ");
        int vtx = sc.nextInt();
        if (vtx > 0 && vtx <=n)
        {
            for (int i = 0; i < n; i++)
                if (i == vtx-1)
                {
                    for (int j = i; j < n-1; j++)
                        a[j] = a[j+1];
                    n--;
                }
        }
        else
        {
            System.out.println("Nhap sai vi tri xoa! Vui long nhap lai");
            n = Xoa(n, a);
        }
        return n;
    }
    public static void main(String[] args) 
    {
        System.out.print("Nhap vao so luong phan tu cua danh sach: ");
        int n = sc.nextInt();
        Nhap(n);
        n = Them(n, a);
        System.out.print("Day sau khi them la: ");
        Xuat(n);
        n = Xoa(n, a);
        System.out.print("Day sau khi xoa la: ");
        Xuat(n);    
    }
}
