/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author Usuario iTC
 */
public class TransporteMaritimo extends Transporte {

    private String NombreBarco;

    public void establecerNombreBarco(String nombrebarco) {
        NombreBarco = nombrebarco;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 5.00 + 0.80;
    }

    public String obtenerNombreBarco() {
        return NombreBarco;
    }

}