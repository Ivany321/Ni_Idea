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
public class Portafolio {
    
    private String nombre;
    private String curso;
    
    /**
     * Constructor de la clase Portafolio.
     *
     * @param nombre Nombre del portafolio
     * @param curso Curso al que pertenece el portafolio
     */

    public Portafolio(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    
    /**
     * Obtiene el nombre del portafolio.
     *
     * @return nombre del portafolio
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre del portafolio.
     *
     * @param nombre nuevo nombre del portafolio
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el curso al que pertenece el portafolio.
     *
     * @return curso del portafolio
     */

    public String getCurso() {
        return curso;
    }
    
    /**
     * Establece el curso al que pertenece el portafolio.
     *
     * @param curso nuevo curso del portafolio
     */

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
