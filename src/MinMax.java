/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class MinMax {
    public static void main(String[]args){
        int[] a=new int[30];
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*201)-100;
            System.out.print(a[i]+" ");
        }
        int max=a[0];
        int min=a[0];
        int indexmax=0;
        int indexmin=0;
        for(int i=1; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
                indexmax=i;
            }
        }
        System.out.println();
        System.out.println("A legnagyobb szám: "+max);
        System.out.println("A legnagyobb szám helye: "+(indexmax+1));
        for(int i=1; i<a.length; i++){
            if(min>a[i]){
                min=a[i];
                indexmin=i;
            }
        }
        System.out.println("A legkisebb szám: "+min);
        System.out.println("A legkisebb szám helye: "+(indexmin+1));        
    }   
}
