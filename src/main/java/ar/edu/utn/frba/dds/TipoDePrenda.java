package ar.edu.utn.frba.dds;


public enum TipoDePrenda {
  REMERA(Categoria.PARTE_SUPERIOR),
  POLLERA(Categoria.PARTE_INFERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  GORRA(Categoria.ACCESORIO),
  CROCS(Categoria.CALZADO),
  BOTAS(Categoria.CALZADO);

  final Categoria categoria;

  TipoDePrenda (Categoria categoria) {
    this.categoria = categoria;
  }
}
