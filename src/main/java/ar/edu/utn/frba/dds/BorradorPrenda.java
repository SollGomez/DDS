package ar.edu.utn.frba.dds;

public class BorradorPrenda {
  private TipoDePrenda tipoPrenda;
  private AspectoMaterial aspectoMaterial;

  public void setTipoPrenda (TipoDePrenda tipoPrenda) {
    if (tipoPrenda == null) {
      throw new IllegalArgumentException("Tipo de prenda es Obligatorio");
    }
    this.tipoPrenda = tipoPrenda;
  }

  public void setAspectoMaterial (AspectoMaterial aspectoMaterial) {
    if (aspectoMaterial == null) {
      throw new IllegalArgumentException("Aspecto de material es Obligatorio");
    }
    this.aspectoMaterial = aspectoMaterial;
  }

  public Prenda crearPrenda() {
    //Si verifico aca tambien es repetir, pero si no lo hago se puede crear prenda invalida?
    if (tipoPrenda == null) throw new IllegalArgumentException("Faltó definir el Tipo de Prenda");
    if (aspectoMaterial == null) throw new IllegalArgumentException("Faltó definir el Aspecto de la Prenda");

    return new Prenda(tipoPrenda,aspectoMaterial);
  }
}
