package ar.edu.utn.frba.dds;


public class Prenda {
  TipoDePrenda tipoPrenda;
  AspectoMaterial aspectoMaterial;


  public Prenda(TipoDePrenda tipoPrenda, AspectoMaterial aspectoMaterial) {
    this.tipoPrenda = tipoPrenda;
    this.aspectoMaterial = aspectoMaterial;
  }

  public TipoDePrenda getTipoDePrenda() {
    return tipoPrenda;
  }

}



