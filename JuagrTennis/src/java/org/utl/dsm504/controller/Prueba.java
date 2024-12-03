package org.utl.dsm504.controller;

import javax.swing.JOptionPane;
import org.utl.dsm504.model.Cielo;
import org.utl.dsm504.model.Humedad;
import org.utl.dsm504.model.Viento;

public class Prueba {

    public static void main(String[] args) {
        
        // Preguntar al usuario sobre las condiciones climáticas usando JOptionPane
        String[] cieloOptions = {"Soleado", "Nublado", "Lluvioso"};
        String cieloInput = (String) JOptionPane.showInputDialog(null, "¿Cómo está el cielo?", "Condiciones climáticas",
                JOptionPane.QUESTION_MESSAGE, null, cieloOptions, cieloOptions[0]);

        String[] humedadOptions = {"Alta", "Normal"};
        String humedadInput = (String) JOptionPane.showInputDialog(null, "¿Cómo está la humedad?", "Condiciones climáticas",
                JOptionPane.QUESTION_MESSAGE, null, humedadOptions, humedadOptions[0]);

        String[] vientoOptions = {"Debil", "Fuerte"};
        String vientoInput = (String) JOptionPane.showInputDialog(null, "¿Cómo está el viento?", "Condiciones climáticas",
                JOptionPane.QUESTION_MESSAGE, null, vientoOptions, vientoOptions[0]);
        
        String a = "Si puedes salir";
        String rr = "";
        String b = "No debes salir";

        // Convertir las respuestas del usuario a valores booleanos
        boolean cieloSoleado = cieloInput.equals("Soleado");
        boolean cieloNublado = cieloInput.equals("Nublado");
        boolean cieloLluvioso = cieloInput.equals("Lluvioso");
        boolean humedadAlta = humedadInput.equals("Alta");
        boolean humedadNormal = humedadInput.equals("Normal");
        boolean vientoDebil = vientoInput.equals("Debil");
        boolean vientoFuerte = vientoInput.equals("Fuerte");

        // Crear instancias de Cielo, Humedad y Viento con los valores ingresados por el usuario
        Cielo cielo = new Cielo();
        Humedad humedad = new Humedad();
        Viento viento = new Viento();

        cielo.setSoleado(cieloSoleado);
        cielo.setNublado(cieloNublado);
        cielo.setLluvioso(cieloLluvioso);
        humedad.setAlta(humedadAlta);
        humedad.setNormal(humedadNormal);
        viento.setDebil(vientoDebil);
        viento.setFuerte(vientoFuerte);

        // Crear instancia de DecisionDeJuego
        DecisionDeJuego ddj = new DecisionDeJuego();

        // Llamar al método decidir con los valores ingresados por el usuario
        boolean r = ddj.decidir(cielo, humedad, viento);
        
        if (r == false){
            rr = b;
        }else{
            rr = a;
        } 

        // Mostrar el resultado al usuario
        JOptionPane.showMessageDialog(null, "¿Puedes salir a Jugar Tennis? \n" + rr);
    }
}