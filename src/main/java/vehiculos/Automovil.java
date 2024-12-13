package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;

    public Automovil(String patente, String nombre, double precio, double peso, Fabricante fabricante, int puestos){
        super(patente,4,100,nombre,precio,peso,"FWD",fabricante);

        this.puestos=puestos;

        registrarUnTipo(1);
    }

    public int getPuestos() {
        return puestos;
    }
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

}
