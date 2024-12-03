/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm504.model;

/**
 *
 * @author migae
 */
public class Humedad {
    
    private boolean alta;
    private boolean normal;

    public Humedad(boolean alta, boolean normal) {
        this.alta = alta;
        this.normal = normal;
    }

    public Humedad() {
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Humedad{");
        sb.append("alta=").append(alta);
        sb.append(", normal=").append(normal);
        sb.append('}');
        return sb.toString();
    }
}
