/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop05;

/**
 * La clase Alumno representa a un estudiante con atributos como nombre, apellido, carrera, etc.
 * También incluye métodos para realizar acciones específicas.
 * @author lilian
 */
public class Alumno {
    // Atributos de la clase

    private String nombre, apellido,carrera,escuela;
    private int edad, semestre;
    private Fecha fNacimiento; // Objeto de la clase Fecha que representa la fecha de nacimiento del alumno

    /**
     * Constructor por defecto de la clase Alumno.
     */
    public Alumno() {
    }
     /**
     * Constructor que inicializa un objeto Alumno con valores específicos.
     * 
     * @param nombre       Nombre del alumno.
     * @param apellido     Apellido del alumno.
     * @param carrera      Carrera del alumno.
     * @param escuela      Escuela del alumno.
     * @param edad         Edad del alumno.
     * @param fNacimiento  Objeto Fecha que representa la fecha de nacimiento del alumno.
     */

    public Alumno(String nombre, String apellido, String carrera, String escuela, int edad, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.edad = edad;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }
    
    // Métodos de acceso (getters y setters) para los atributos de la clase

    /**
     * Obtiene el nombre del alumno.
     * 
     * @return El nombre del alumno.
     */

    public String getNombre() { //regresa el nombre
        return nombre;
    }
    /**
     * Establece el nombre del alumno.
     * 
     * @param nombre El nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo que regresa el apellido del alumno 
     * @return regresa apellido , regresa variable apellido 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del alumno.
     * 
     * @param apellido El nuevo apellido del alumno.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * Metodo que regresa la carrera del alumno 
     * @return regresa carrera 
     */

    public String getCarrera() {
        return carrera;
    }
    /**
     * Establece la carrera del alumno
     * @param carrera La carrera del alumno
     */

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    /**
     * Metodo que regresa la escuela del alumno
     * @return regresa escuela
     */

    public String getEscuela() {
        return escuela;
    }

    /**
     * Establece la escuela del alumno
     * @param escuela la nueva escuela 
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    /**
     * Obtiene la edad de la persona.
     * 
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Establece la edad de la persona.
     * 
     * @param edad La nueva edad de la persona.
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

     /**
     * Obtiene el semestre en el que se encuentra la persona.
     * 
     * @return El semestre de la persona.
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Establece el semestre en el que se encuentra la persona.
     * 
     * @param semestre El nuevo semestre de la persona.
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona.
     * 
     * @return La fecha de nacimiento de la persona.
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     * 
     * @param fNacimiento La nueva fecha de nacimiento de la persona.
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * Imprime un mensaje indicando que el alumno está durmiendo.
     */
    public void dormir(){
        System.out.println("zzzzz");
    }
     /**
     * Imprime un mensaje indicando que el alumno está comiendo.
     */
    public void comer(){
        System.out.println("ñam ñam ");
    }
    /**
     * Imprime un mensaje indicando que el alumno está estudiando.
     */
    public void estudiar(){
        System.out.println("Estoy estudiando ");
    }
      /**
     * Imprime un mensaje indicando que el alumno está trabajando.
     */
    public void trabajar(){
        System.out.println("Estoy trabajando");
    }
    
    /**
     * Imprime un mensaje indicando que el alumno está jugando.
     */
    public void jugar (){
        System.out.println("Estoy jugando");
    }
    /**
     * Convierte el objeto Alumno a una representación de cadena.
     * 
     * @return Una cadena que representa el objeto Alumno.
     */
    @Override
    public String toString() { //retorna elementos 
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", edad=" + edad + ", semestre=" + semestre + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
    
}
    