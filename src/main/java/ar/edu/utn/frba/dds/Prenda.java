package ar.edu.utn.frba.dds;

import static java.util.Objects.requireNonNull;

public class Prenda {
  TipoDePrenda tipo;
  Material tela;
  Color color;

  public Prenda(Categoria tipo, Material tela, Color color) {
    this.tipo = requireNonNull(tipo, "El tipo de prenda es obligatorio");
    this.tela = requireNonNull(tela, "El material de la prenda es obligatorio");
    this.color = requireNonNull(color, "El color principal es obligatorio");
  }

}