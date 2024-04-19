package ar.edu.utn.frba.dds;


public class Prenda {
  TipoDePrenda tipoPrenda;
  AspectoMaterial aspectoMaterial;


  public Prenda(TipoDePrenda tipoPrenda, AspectoMaterial aspectoMaterial) {
    if (tipoPrenda == null) {
      throw new IllegalArgumentException("Tipo de prenda es Obligatorio");
    }
    this.tipoPrenda = tipoPrenda;
    this.aspectoMaterial = aspectoMaterial;
  }
}



