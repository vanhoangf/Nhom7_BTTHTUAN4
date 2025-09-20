import java.util.Scanner;

public class bai3
{
    public static float [] nhap (Scanner scanner)
    {
        System.out.print ("nhap so thu nhat: ");
        float a = scanner.nextFloat();
        System.out.print ("nhap so thu hai: ");
        float b = scanner.nextFloat();
        return new float[] {a, b};
    }

    public static void main (String[] args )
    {
        Scanner scanner = new Scanner (System.in);
        int luachon;

        do 
        {
            System.out.println ("Menu");
            System.out.println ("1. Cong hai so");
            System.out.println ("2. Tru hai so");
            System.out.println ("3. Nhan hai so");
            System.out.println ("4. Chia hai so");
            System.out.println ("5. Thoat");
            System.out.print ("Nhap lua chon cua ban: ");
            luachon = scanner.nextInt();
            switch (luachon)
            {
                case 1:
                    float[] cong = nhap(scanner);
                    System.out.println ("Ket qua: " + (cong[0] + cong[1]));
                    break;
                case 2:
                    float[] tru = nhap(scanner);
                    System.out.println ("Ket qua: " + (tru[0] - tru[1]));
                    break;
                case 3:
                    float[] nhan = nhap(scanner);
                    System.out.println ("Ket qua: " + (nhan[0] * nhan[1]));
                    break;

                case 4:
                    float[] chia = nhap(scanner);      
                    if (chia[1] == 0)
                    {
                        System.out.println ("Khong the chia cho 0");
                    }
                    else 
                    {
                        System.out.println ("Ket qua: " + (chia[0] / chia[1]));
                    }
                    break;
                case 5:
                    System.out.println ("Thoat chuong trinh");
                    break;
                default:
                    System.out.println ("Lua chon khong hop le");
                    break;
            }
        }
        while (luachon != 5);
        
        scanner.close();
    }
}