package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;

    public Camioneta(String patente, int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco) {
        super(patente,puertas,90,nombre,precio,peso,"4X4",fabricante);

        this.volco = volco;

        registrarUnTipo(2);
    }

    public boolean isVolco() {
        return volco;
    }
    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
