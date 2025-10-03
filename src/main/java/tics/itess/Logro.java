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
public class Logro {
    
    private int id;
    private String categoria;
    private String descripcion;
    
     /**
 *
 * Constructor de la clase Logro
 *  @param id ID del logro
 * @param categoria Categoria del logro
 * @param descripcion Descripcion del logro
 */

    public Logro(int id, String categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
    
    /**
     * Obtiene el id del logro.
     *
     * @return id
     */

    public int getId() {
        return id;
    }
    
    
    /**
     * Establece el id del logro.
     *
     * @param id nuevo id del logro
     */

    public void setId(int id) {
        this.id = id;
    }
    
    
    /**
     * Obtiene la categoría del logro.
     *
     * @return categoría del logro
     */

    public String getCategoria() {
        return categoria;
    }
    
    /**
     * Establece la categoría del logro.
     *
     * @param categoria nueva categoría del logro
     */

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    /**
     * Obtiene la descripción del logro.
     *
     * @return descripción del logro
     */

    public String getDescripcion() {
        return descripcion;
    }

    
    /**
     * Establece la descripción del logro.
     *
     * @param descripcion nueva descripción del logro
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
