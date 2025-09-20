import java.util.ArrayList;
import java.util.Scanner;
public class bai10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();
        int n = 5;
        System.out.println("Nhập " + n + " phần tử:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Phần tử " + (i + 1) + ": ");
            ds.add(sc.nextInt());
        }
        System.out.println("\nDanh sách ban đầu:");
        for(int i = 0; i < ds.size(); i++)
        {
            System.out.print(ds.get(i) + " ");
        }
        System.out.println("\n\n--- THÊM PHẦN TỬ ---");
        System.out.print("Vị trí thêm (0 đến " + ds.size() + "): ");
        int vitrithem = sc.nextInt();
        if (vitrithem >= 0 && vitrithem <= ds.size())
        {
            System.out.print("Giá trị thêm: ");
            int giatrithem = sc.nextInt();
            ds.add(vitrithem, giatrithem);

            System.out.println("\nDanh sách sau khi thêm:");
            for(int i = 0; i < ds.size(); i++)
            {
                System.out.print(ds.get(i) + " ");
            }

            System.out.println("\n\n--- XÓA PHẦN TỬ ---");
            System.out.print("Vị trí xóa (0 đến " + (ds.size() - 1) + "): ");
            int vitrixoa = sc.nextInt();

            if (vitrixoa >= 0 && vitrixoa < ds.size())
            {
                ds.remove(vitrixoa);
                System.out.println("\nDanh sách sau khi xóa:");

                for(int i = 0; i < ds.size(); i++)
                {
                    System.out.print(ds.get(i) + " ");
                }
            }
            else
            {
                System.out.println("Vị trí không hợp lệ!");
            }
        }
        else
        {
            System.out.println("Vị trí không hợp lệ!");
        }
    }
}