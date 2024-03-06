package gestion_habitats;

public class Aviario extends Habitat {
    private String tipoClima;

    public Aviario(String nombre, double tamaño, String tipoClima) {
        super(nombre, tamaño);
        this.tipoClima = tipoClima;
    }

    @Override
    public String getTipo() {
        return "Aviario";
    }

    public String getTipoClima() {
        return tipoClima;
    }
}