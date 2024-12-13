package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;

    public Camion(String patente, String nombre, double precio, double peso, Fabricante fabricante, int ejes){
        super(patente,2,80,nombre,precio,peso,"4X2",fabricante);

        this.ejes=ejes;

        registrarUnTipo(3);

    }

    public int getEjes() {
        return ejes;
    }
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

}
