package Model;

public class Inventario {
  private Integer id_item;
  private Integer id_save;

  public Integer getId_item() {
    return id_item;
  }

  public void setId_item(Integer id_item) {
    this.id_item = id_item;
  }

  public Integer getId_save() {
    return id_save;
  }

  public void setId_save(Integer id_save) {
    this.id_save = id_save;
  }

  @Override
  public String toString() {
    return "Inventario{" +
            "id_item=" + id_item +
            ", id_save=" + id_save +
            '}';
  }
}
