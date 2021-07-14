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
        t3.establecerNombreTren("Ganchuca Garza");
        t3.establecerTarifa();

        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerAerolinea("Iberia Express");
        aereo.establecerTarifa();

        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerNombreBarco("El Manantial");
        mar.establecerTarifa();

        ArrayList <Transporte> transportes = new ArrayList();
        transportes.add(bus);
        transportes.add(taxi);
        transportes.add(t3);
        transportes.add(aereo);
        transportes.add(mar);

        TiposTransporte tipos = new TiposTransporte();

        tipos.establecerTransportes(transportes);

        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f\n",
                tipos.obtenerPromedioTarifas());
    }
}