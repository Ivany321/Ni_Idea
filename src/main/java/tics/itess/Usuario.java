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
public class Usuario {
    
    private String nombre;
    
    /**
     * Constructor de la clase Usuario.
     *
     * @param nombre Nombre del usuario
     */

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el nombre del usuario.
     *
     * @return nombre del usuario
     */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre del usuario.
     *
     * @param nombre nuevo nombre del usuario
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
