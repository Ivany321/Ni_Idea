/*
 * ITESS-TICS TInvestigacion
*  Agosto - Diciembre 2025
*  Proyecto Niidea
*  Clase Logro: Representa una habilidad adquirida mediante una evidencia
*  Programador: Ivany Israel Rosas Torres
*  Fecha: 02/10/2025
 * 
 */
package tics.itess;

/**
 *
 * @author Lenovo
 */
public class Alumnos {
    private String numControl;
    private String nombre;
    
 /**
 *
 * Constructor de la clase alumnos
 *  @param numControl Número de control del alumno
 * @param nombre Nombre del alumno
 */

    public Alumnos(String numControl, String nombre) {
        this.numControl = numControl;
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de control del alumno.
     *
     * @return número de control como cadena
     */

    public String getNumControl() {
        return numControl;
    }
    
     /**
     * Obtiene el nombre del alumno.
     *
     * @return nombre como cadena
     */

    public String getNombre() {
        return nombre;
    }
    
     /**
     * Establece el número de control del alumno.
     *
     * @param numControl nuevo número de control
     */

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    
    /**
     * Establece el nombre del alumno.
     *
     * @param nombre nuevo nombre del alumno
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    
    
    
}
