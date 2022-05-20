package reforzamiento2022java;

import java.util.Scanner;

/**
 * Ejercicios
 */
public class Ejercicios {
    static Scanner leerT=new Scanner(System.in);
    public static void Saludosegunhora() {
        //Variables
        int hora;
        String Saludo;
        //datos de entrada
        System.out.println("ingrese la hora");
        hora=leerT.nextInt();
        //proseco
        if(hora>=6 && hora <= 12){
            Saludo="buenos dias";
        }else if(hora>=13 && hora<=20){
            Saludo="buenas tardes";
        }else if((hora>=21 && hora <=23) || (hora>=0 && hora<=5)){
            Saludo="buenas tardes";
        }else{
            Saludo="esa hora no existe";
        }
        //datos de salida
        System.out.println(Saludo);
    }
    public static void mostrarcursoDia() {
        //Definir variable
        int diaSem;
        String mensaje;
        //leer datos 
        
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
        //mostrarcursoDia();
        Saludosegunhora();
    }

}
