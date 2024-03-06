package gestion_habitats;

public class Terrestre extends Habitat {
    private String tipoTerreno;

    public Terrestre(String nombre, double tamaño, String tipoTerreno) {
        super(nombre, tamaño);
        this.tipoTerreno = tipoTerreno;
    }

    @Override
    public String getTipo() {
        return "Terrestre";
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }
}