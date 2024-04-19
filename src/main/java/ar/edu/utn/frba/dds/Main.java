package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.Categoria.*;
import static ar.edu.utn.frba.dds.Material.*;
import static ar.edu.utn.frba.dds.Color.*;


public class Main {
  public static void main(String[] args) {

    //  Prenda(TipoDePrenda tipoPrenda, Material tela, Color colorPrimario, Color colorSecundario)

    TipoDePrenda pollera = new TipoDePrenda(Categoria.PARTE_INFERIOR);
    TipoDePrenda remera = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    TipoDePrenda gorra = new TipoDePrenda(Categoria.ACCESORIO);

    Prenda miPolleraAmarilla = new Prenda (pollera, ALGODON, AMARRILLO, null);

}
}