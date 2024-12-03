/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm504.model;

/**
 *
 * @author migae
 */
public class Viento {
    
    private boolean debil;
    private boolean fuerte;

    public Viento(boolean debil, boolean fuerte) {
        this.debil = debil;
        this.fuerte = fuerte;
    }

    public Viento() {
    }

    public boolean isDebil() {
        return debil;
    }

    public void setDebil(boolean debil) {
        this.debil = debil;
    }

    public boolean isFuerte() {
        return fuerte;
    }

    public void setFuerte(boolean fuerte) {
        this.fuerte = fuerte;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Viento{");
        sb.append("debil=").append(debil);
        sb.append(", fuerte=").append(fuerte);
        sb.append('}');
        return sb.toString();
    }
}
