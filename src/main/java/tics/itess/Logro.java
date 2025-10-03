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

    public Logro(int id, String categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
