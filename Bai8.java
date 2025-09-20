
package com.mycompany.bai8;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Bai8 {
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
            System.out.println(a[i]+" ");
    }   
    static void TimTatCaXHNhieuNhat() 
    {
        HashMap<Integer, Integer> tanSuat = new HashMap<>();
        for (int ptu : a) 
            tanSuat.put(ptu, tanSuat.getOrDefault(ptu, 0) + 1); 
        int SolanMax = 0;
        for (int value : tanSuat.values()) 
            if (value > SolanMax) 
                SolanMax = value;
        System.out.println("Cac phan tu xuat hien nhieu nhat (" + SolanMax + " lan):");
        for (Map.Entry<Integer, Integer> entry : tanSuat.entrySet()) 
            if (entry.getValue() == SolanMax) 
                System.out.print(entry.getKey() + " ");
    System.out.println();
    }
    public static void main(String[] args) 
    {
        Nhap();
        Xuat();
        TimTatCaXHNhieuNhat();
        
    }
}
