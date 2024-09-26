package Model;

import java.util.List;

public class Save {private Integer idSave;
    private Cena cenaAtual;
    private List<Item> inventario;

    public Integer getIdSave() {
        return idSave;
    }

    public void setIdSave(Integer idSave) {
        this.idSave = idSave;
    }

    public Cena getCenaAtual() {
        return cenaAtual;
    }


    public void setCenaAtual(Cena cenaAtual) {
        this.cenaAtual = cenaAtual;


    }

    public List<Item> getInventario() {
        return inventario;
    }

    public void setInventario(List<Item> inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Save{" +
                "idSave=" + idSave +
                ", cenaAtual=" + cenaAtual +
                ", itens=" + inventario +
                '}';
    }
}

