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
public class TransporteTransvia extends Transporte {

    private String NombreTren;

    public void establecerNombreTren(String nombreTren) {
        NombreTren = nombreTren;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 7.00 + 0.70;
    }

    public String obtenerNombreTren() {
        return NombreTren;
    }

}
