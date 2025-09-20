
package com.mycompany.bai2;
import java.util.Scanner;

public class Bai2 {
    static int a[];
    static int n;
    static Scanner sc = new Scanner(System.in);
    static void Nhap()
    {
        System.out.println("Nhap so phan tu co trong mang:");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Nhap phan tu:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }        
    static void Xuat()
    {
        System.out.println("Mang vua nhap: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }   
    static void Timsonhonhat()
    {
        int min=a[0];
        for(int i=0;i<n;i++)
            if(a[i]<min)
                min=a[i];
        System.out.println("\nSo nho nhat trong mang la:  "+min  );
    }        
    public static void main(String[] args) {
        Nhap();
        Xuat();
        Timsonhonhat();
        
    }
}
