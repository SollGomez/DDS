package ar.edu.utn.frba.dds;

import static java.util.Objects.requireNonNull;

public class Prenda {
  TipoDePrenda tipoPrenda;
  Material tela;
  Color colorPrimario;
  Color colorSecundario;

  // Como usuarie de QuéMePongo, quiero evitar que haya prendas sin tipo, tela, categoría o color primario.
  public Prenda(TipoDePrenda tipoPrenda, Material tela, Color colorPrimario, Color colorSecundario) {
    if (tipoPrenda == null) {
      throw new IllegalArgumentException("Tipo de prenda es Obligatorio");
    }
    if (tela == null) {
      throw new IllegalArgumentException("Tela es Obligatorio");
    }
    if (colorPrimario == null) {
      throw new IllegalArgumentException("Color de prenda es Obligatorio");
    }
    this.tipoPrenda = tipoPrenda;
    this.tela = tela;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
}



