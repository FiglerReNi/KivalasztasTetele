/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Kivalasztastetele {
    public static void main(String[]args){
        int[] a=new int[25];
        for(int i=0; i<a.length; i++){
            a[i]=(i*2)+2;
            System.out.print(a[i]+" ");
        }
        int i=0;
        while(a[i]!=20){
            i++;
        }
        System.out.println();
        System.out.println("A keresett szám helye: "+(i+1));       
    }    
}
