/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * Este programa es un ejemplo básico de uso de clases en Java.
 * Define la clase Alumno y la clase Fecha, y demuestra su uso en el método main.
 */
package poop05;

/**
 * La clase principal que contiene el método main para ejecutar el programa.
 * @author lilian
 */
public class POOP05 {
    /**
     * El método principal que se ejecuta al iniciar el programa.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este ejemplo).
     */

   
    public static void main(String[] args) {
        // Se crea un objeto Alumno llamado 'alumno' y se inicializa con NULL (ausencia de valor).
        Alumno alumno = new Alumno(); //se inicializa con NULL ausencia de valor
        alumno.setNombre("Lilian"); //acede a las cosas de la variable alumno
        alumno.setApellido("De la Peña");
        
        // Se crea un objeto Fecha llamado 'fecha' con la fecha 29/9/2023.
        Fecha fecha = new Fecha (29, 9, 2023 );
        
        // Se crea un nuevo objeto Alumno llamado 'alu2' con valores específicos.
        Alumno alu2 = new Alumno("Lilian", "De la Peña","Computación","UNAM", 4 , fecha );
        
        // Se obtiene la representación en cadena del objeto 'alumno' y se imprime.
        String var= alumno.toString();
        System.out.println(var);
        
        // Se imprime la representación en cadena del objeto 'alumno'.
        System.out.println(alumno.toString());
        
        // Se imprime la representación en cadena del objeto 'alu2'.
        System.out.println(alu2);
    }
}