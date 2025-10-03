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
public class Coordinador {
    
    private String nombre;
    private String especializacion;
    
    /**
     * Constructor de la clase Coordinador.
     *
     * @param nombre Nombre del coordinador
     * @param especializacion Especialización del coordinador
     */

    public Coordinador(String nombre, String especializacion) {
        this.nombre = nombre;
        this.especializacion = especializacion;
    }
    
    /**
     * Obtiene el nombre del coordinador.
     *
     * @return nombre del coordinador
     */

    public String getNombre() {
        return nombre;
    }

    
    /**
     * Establece el nombre del coordinador.
     *
     * @param nombre nuevo nombre del coordinador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene la especialización del coordinador.
     *
     * @return especialización del coordinador
     */

    public String getEspecializacion() {
        return especializacion;
    }
    
    /**
     * Establece la especialización del coordinador.
     *
     * @param especializacion nueva especialización del coordinador
     */

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
    
    
    
}
