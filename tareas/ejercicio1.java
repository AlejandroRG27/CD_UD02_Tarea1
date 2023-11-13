/*
 * Signo del zodíaco
 * Crea que al introducir el año que naciste te devuelva
tu signo del zodíaco chino.
Para conocer el signo del horóscopo chino, debemos
dividir el año de nacimiento entre 12. El resto, entre
0 y 11, está asociado a un signo según la siguiente
tabla:

0 -Mono
1- Gallo
2 -Perro
2 - Cerdo
4 -Rata 
5- Buey 
6 - Tigre
7 - Conejo
8 - Dragón
9 -Serepiente
10- Caballo
11 - Cabra 

 */

import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Introduce el año de nacimento:");
        int año =sca.nextInt();

        int resto=año%12;

        if(resto==0){
            System.out.println("Mono");
        }else if(resto==1){
            System.out.println("Gallo");
        }else if(resto==2){
            System.out.println("Perro");
        }else if (resto==3){
            System.out.println("Cerdo");
        }else if (resto==4){
            System.out.println("Rata");
        }else if(resto==5){
            System.out.println("Buey");
        }else if(resto==6){
            System.out.println("Tigre");
        }else if(resto==7){
            System.out.println("Conejo");
        }
        else if(resto==8){
            System.out.println("Dragón");
        }else if(resto==9){
            System.out.println("Serpiente");
        }else if (resto == 10){
            System.out.println("Caballo");
        }else if(resto==11){
            System.out.println("Cabra");
        }

        

    }
}