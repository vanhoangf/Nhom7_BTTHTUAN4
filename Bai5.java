/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai5;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai5 {
   
    public static void main(String[] args) {
        int x;
        int dem=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen:");
        x=sc.nextInt();
        if(x<2)
            System.out.println("so " + x + " khong phai la so nguyen to");
        else
        {    
        for(int i=1;i<=Math.sqrt(x);i++)
            if(x%i==0)
                dem=dem+1;
        if(dem==1)
            System.out.println("so "+ x +" la so nguyen to");
        else
            System.out.println("so "+ x +" khong phai la so nguyen to");
        }
    }
}
