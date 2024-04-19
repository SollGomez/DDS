package ar.edu.utn.frba.dds;

import static ar.edu.utn.frba.dds.Trama.*;
import java.util.Objects;

public class AspectoMaterial {
  Color colorPrimario;
  Color colorSecundario;
  Material tela;
  Trama trama;

  public AspectoMaterial(Color colorPrimario, Color colorSecundario, Material tela, Trama trama) {

    if (tela == null) {
      throw new IllegalArgumentException("Tela es Obligatorio");
    }
    if (colorPrimario == null) {
      throw new IllegalArgumentException("Color de prenda es Obligatorio");
    }
    this.trama = Objects.requireNonNullElse(trama, LISA);
    this.tela = tela;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
}
