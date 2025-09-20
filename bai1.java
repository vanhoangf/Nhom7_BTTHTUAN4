import java.util.Scanner;

public class bai1
{
    public static void main (String[] args )
    {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("nhap so ban muon kiem tra: ");
        float so = scanner.nextFloat();
        if (so > 0)
        {
            System.out.print ("so ban vua nhap la so duong");
        }
        else 
            if (so < 0)
            {
                System.out.print ("so ban vua nhap la so am");
            }
            else 
            {
                System.out.print ("so ban vua nhap la so 0");
        }
        scanner.close();
    }
}