package reforzamiento2022java;

import java.util.Scanner;

/**
 * Ejercicios
 */
public class Ejercicios {
    public static void mostrarcursoDia() {
        //Definir variable
        int diaSem;
        String mensaje;
        //leer datos 
        Scanner leerT=new Scanner(System.in);
        System.out.println("ingrese un dia de la semana:\n1=Dom"+"'\n2=Lun\n3=Mar\n4=Mie\n5=jue\n6=vie\n7=sab");
        diaSem=leerT.nextInt();
        //proceso
        if(diaSem==1) {
            mensaje="No hay clases";
        }else if(diaSem==2){
                mensaje="matematica";
        }else if(diaSem==3){
                    mensaje="Fundamentos de programacion";
                }else if(diaSem==4){
                    mensaje="Capacidades comunicativas";
                }else if(diaSem==5){
                    mensaje="Introducion a la ingenieria de sistemas";
                }else{
                    mensaje="El dia toca que coloco no existe";
                }
                //datos de salida 
                System.out.println("Ese dia toca el curso de: "+mensaje); 
               
    }
    public static void main(String[] args) {
        mostrarcursoDia();
    }
}
