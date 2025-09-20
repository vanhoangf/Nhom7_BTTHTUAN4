import java.util.Scanner;

public class bai6
{
    public static int UCLN(int x, int y)
    {
        while (x != y) 
        {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Nhap so thu nhat:");
        int a = scanner.nextInt();

        System.out.print ("Nhap so thu hai: ");
        int b = scanner.nextInt();

        int ucln = UCLN(a, b);
        System.out.println("U chung lon nhat cua "+ a +" va " + b + " la: " + ucln);

        int bcnn = (a * b) / ucln;
        System.out.println("Boi chung nho nhat cua "+ a +" va + " + b + " la: " + bcnn);

        scanner.close();
    }
}
