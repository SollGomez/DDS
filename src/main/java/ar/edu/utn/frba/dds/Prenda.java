package ar.edu.utn.frba.dds;

import static java.util.Objects.requireNonNull;

public class Prenda {
  Categoria tipo;
  Material tela;
  Color color;
  Color colorSecundario;

  public Prenda(Categoria tipo, Material tela, Color color) {
    this.tipo = requireNonNull(tipo, "El tipo de prenda es obligatorio");
    this.tela = requireNonNull(tela, "El material de la prenda es obligatorio");
    this.color = requireNonNull(color, "El color principal es obligatorio");
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

}
