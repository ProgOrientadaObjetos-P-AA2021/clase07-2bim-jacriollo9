/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();

        TransporteTransvia t3 = new TransporteTransvia();
        t3.establecerNombreTren("Chu Chu");
        t3.establecerTarifa();

        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerAerolinea("Iberia Express");
        aereo.establecerTarifa();

        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerNombreBarco("El Manantial");
        mar.establecerTarifa();

        ArrayList<Transporte> tipos = new ArrayList();
        tipos.add(bus);
        tipos.add(taxi);
        tipos.add(t3);
        tipos.add(aereo);
        tipos.add(mar);

        TiposTransporte tiposTrans = new TiposTransporte();

        tiposTrans.establecerTransportes(tipos);

        tiposTrans.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f\n",
                tiposTrans.obtenerPromedioTarifas());
    }
}