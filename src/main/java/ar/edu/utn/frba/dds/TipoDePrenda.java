package ar.edu.utn.frba.dds;


// Como usuarie de QuéMePongo, quiero evitar que haya prendas cuya categoría no
// se condiga con su tipo. (Ej, una remera no puede ser calzado).
public class TipoDePrenda {
  Categoria categoria;

  public TipoDePrenda (Categoria categoria) {
    this.categoria = categoria;
  }
}
