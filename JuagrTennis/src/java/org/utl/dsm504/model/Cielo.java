/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm504.model;

/**
 *
 * @author migae
 */
public class Cielo {
    
    private boolean soleado;
    private boolean nublado;
    private boolean lluvioso;

    public Cielo(boolean soleado, boolean nublado, boolean lluvioso) {
        this.soleado = soleado;
        this.nublado = nublado;
        this.lluvioso = lluvioso;
    }

    public Cielo() {
    }

    public boolean isSoleado() {
        return soleado;
    }

    public void setSoleado(boolean soleado) {
        this.soleado = soleado;
    }

    public boolean isNublado() {
        return nublado;
    }

    public void setNublado(boolean nublado) {
        this.nublado = nublado;
    }

    public boolean isLluvioso() {
        return lluvioso;
    }

    public void setLluvioso(boolean lluvioso) {
        this.lluvioso = lluvioso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cielo{");
        sb.append("soleado=").append(soleado);
        sb.append(", nublado=").append(nublado);
        sb.append(", lluvioso=").append(lluvioso);
        sb.append('}');
        return sb.toString();
    } 
}
