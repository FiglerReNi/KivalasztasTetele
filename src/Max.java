/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class Max {
    public static void main(String[]args){
        int[] a=new int[25];
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*101);
            System.out.print(a[i]+" ");
        }
        int index=0;
        int b=a[0];
        for(int i=1; i<a.length; i++){
            if(b<a[i])
            {
                b=a[i];
                index=i;
            }
    }
        System.out.println();
        System.out.println("A legnagyobb szám: "+b);
        System.out.println("A legnagyobb szám helye: "+(index+1));
    }
}
