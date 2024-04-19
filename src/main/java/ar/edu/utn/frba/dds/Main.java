package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.TipoDePrenda.*;


public class Main {
  public static void main(String[] args) {

    // Prenda(TipoDePrenda tipoPrenda, AspectoMaterial aspectoMaterial)
    // AspectoMaterial(Color colorPrimario, Color colorSecundario, Material tela, Trama trama)

      Prenda polleraAmarilla = new Prenda(POLLERA, new AspectoMaterial(Color.AMARRILLO, null, Material.ALGODON, null));

    System.out.println(polleraAmarilla.aspectoMaterial.trama);

  }
}