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
public class Familiar {
    
    private String nombre;
    private String matriculaParentesco;
    
    /**
     * Constructor de la clase Familiar.
     *
     * @param nombre Nombre del familiar
     * @param matriculaParentesco Matrícula o parentesco asociado al familiar
     */

    public Familiar(String nombre, String matriculaParentesco) {
        this.nombre = nombre;
        this.matriculaParentesco = matriculaParentesco;
    }

    
    /**
     * Obtiene el nombre del familiar.
     *
     * @return nombre del familiar
     */
    public String getNombre() {
        return nombre;
    }
    
     /**
     * Establece el nombre del familiar.
     *
     * @param nombre nuevo nombre del familiar
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene la matrícula o parentesco del familiar.
     *
     * @return matrícula o parentesco
     */

    public String getMatriculaParentesco() {
        return matriculaParentesco;
    }
    
    /**
     * Establece la matrícula o parentesco del familiar.
     *
     * @param matriculaParentesco nueva matrícula o parentesco
     */

    public void setMatriculaParentesco(String matriculaParentesco) {
        this.matriculaParentesco = matriculaParentesco;
    }
    
    
    
}
