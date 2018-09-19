/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class BusquedaBinaria {

    static int busqueda(int a[], int izq, int der, int key, int c) {
        
        

        if (izq > der) {
            c=c+2;
            System.out.println("Por contador: "+c);
            return 1;
        }

        int m = ((izq + der) / 2);
        c=c+3;

        if (key < a[m]) {
            c=c+5;
            return busqueda(a, izq, m - 1, key,c);
            
        } else if (key > a[m]) {
            c=c+5;
            return busqueda(a, m + 1, der, key,c);
        } else {
            c=c+1;
            System.out.println("Por contador: "+c);
            return m;
        }
    }

    static int[] burbuja(int arreglo[]) {

        
        return arreglo;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int pos, key, c;
        int n=100;
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el tamaño: ");
        //n = teclado.nextInt();
        
        int a[] = new int[n];
        
        System.out.print("Ingrese la posición: ");
        //pos = teclado.nextInt();
        
        for(int i=0; i<n; i++){
            a[i] = random.nextInt(99)+1; 
            
        }
        
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {

                    int tmp = a[j + 1];

                    a[j + 1] = a[j];

                    a[j] = tmp;

                }

            }

        }
        
        
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
            
        }
        
        //key = a[pos-1];
        //System.out.println(key);
        
        c=1;
        System.out.println(busqueda(a,0,n-1,50,c));
        
        
    }

}
