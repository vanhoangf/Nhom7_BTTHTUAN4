import java.util.Scanner; 
public class Bai4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int n, tg = 0;
        System.out.print("Nhap vao gia tri n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            tg = tg + i;
        System.out.print("Tong cac so tu 1 den " + n + " la: " + tg);       
    }
}
