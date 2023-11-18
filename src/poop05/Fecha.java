/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop05;

/**
 * La clase Fecha representa una fecha con día, mes y año.
 * @author lilian
 */
public class Fecha {
    // Atributos para almacenar el día, mes y año de la fecha
    private int dia, mes, anio;
    /**
     * Constructor predeterminado de la clase Fecha.
     * Inicializa los atributos en 0.
     */
    public Fecha() {
    }
    /**
     * Constructor que permite crear una instancia de Fecha con valores específicos.
     * 
     * @param dia El día de la fecha.
     * @param mes El mes de la fecha.
     * @param anio El año de la fecha.
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * Obtiene el valor del día.
     * 
     * @return El día de la fecha.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Establece el valor del día.
     * 
     * @param dia El nuevo valor para el día.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Obtiene el valor del mes.
     * 
     * @return El mes de la fecha.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Establece el valor del mes.
     * 
     * @param mes El nuevo valor para el mes.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

     /**
     * Obtiene el valor del año.
     * 
     * @return El año de la fecha.
     */
    public int getAnio() {
        return anio;
    }
     /**
     * Establece el valor del año.
     * 
     * @param anio El nuevo valor para el año.
     */

    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Devuelve una representación de cadena de la fecha en el formato "dia/mes/año".
     * 
     * @return La representación de cadena de la fecha.
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
    