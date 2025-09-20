import java.util.Scanner;
public class bai8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n=sc.nextInt();
        int [] a=new int [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap phan tu thu:"+(i+1));
            a[i]=sc.nextInt();
        }
        int solanxuathienmax=0;
        int ptxuathienmax=a[0];
        for(int i=0;i<n;i++)
        {
            int solanxuathien=0;
            for(int j=0;j<n;j++)
                if(a[i]==a[j])
                    solanxuathien++;
            if(solanxuathien>solanxuathienmax)
            {
                solanxuathienmax=solanxuathien;
                ptxuathienmax=a[i];
            }
        }
        System.out.println("phan tu xuat hien nhieu nhat la:"+ptxuathienmax);
        System.out.println("so lan xuat hien:"+solanxuathienmax);
    }
}