/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tics.itess;

/**
 *
 * @author Lenovo
 */
public class Familiar {
    
    private String nombre;
    private String matriculaParentesco;

    public Familiar(String nombre, String matriculaParentesco) {
        this.nombre = nombre;
        this.matriculaParentesco = matriculaParentesco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaParentesco() {
        return matriculaParentesco;
    }

    public void setMatriculaParentesco(String matriculaParentesco) {
        this.matriculaParentesco = matriculaParentesco;
    }
    
    
    
}
