package gestion_habitats;

public class Acuatico extends Habitat {
    private String tipoAgua;

    public Acuatico(String nombre, double tamaño, String tipoAgua) {
        super(nombre, tamaño);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public String getTipo() {
        return "Acuático";
    }

    public String getTipoAgua() {
        return tipoAgua;
    }
}