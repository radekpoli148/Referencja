/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package referencja;

public class Referencja {

    public static void main(String[] args) {
        
        int a= 53;
        int b = a;
        
        b= 30;
        
        System.out.println(a);
        
        Test x = new Test();
        
        Test y = x;
        
        y.a = 40;
        
        System.out.println(x.a);
        
        String imie = "Radosław";
        String imie2 = imie;
        
        imie2 = "TRALALA";
        
        System.out.println(imie);
        
        //porównanie stringów
        String pierwszy = "Radosław";
        String drugi = "Radosław";
        
        if(pierwszy.equals(drugi)) // zamiast if(pierwszy == drugi)
            System.out.println("Są sobie równe");
    }
    
}

class Test
{
    int a = 34;
}