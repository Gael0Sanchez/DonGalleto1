/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm504.controller;

import org.utl.dsm504.model.Cielo;
import org.utl.dsm504.model.Humedad;
import org.utl.dsm504.model.Viento;

/**
 *
 * @author migae
 */
public class DecisionDeJuego {

    public boolean decidir(Cielo c, Humedad h, Viento v) {

        boolean r = false;
        if (c.isSoleado()) {
            if (h.isAlta()) {
                r = false;
            } else if (h.isNormal()) {
                r = true;
            }
        } else if (c.isNublado()) {
            r = true;
        } else if (c.isLluvioso()) {
            if (v.isDebil()) {
                r = true;
            } else if (v.isFuerte()) {
                r = false;
            }
        }
        return r;
    }

}
