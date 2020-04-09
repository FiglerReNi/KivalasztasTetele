/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class SzamKereses {
    public static void main(String[]args){
        int[] a=new int[40];
        System.out.print("Számok: ");
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*201)-100;
            System.out.print(a[i]+" ");
        }
        int j=0;
        int x=0;
        while((j<a.length)&&(a[j]!=x)){
            j++;
        }
        System.out.println();
        if(j<a.length){
            System.out.print("A szám helye: "+(j+1));
        }
        else{
            System.out.print("A szám nincs a tömbben");
        }        
    }    
}
