package vehiculos;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected double precio;
    protected double peso;
    protected String traccion;
    protected Fabricante fabricante;
    private static int cantidadVehiculos = 0;
    private static int automoviles = 0;
    private static int camionetas = 0;
    private static int camiones = 0;

    public Vehiculo(String patente, int puertas, int velMax, String nombre, double precio, double peso, String traccion, Fabricante fabricante){
        this.placa=patente;
        this.puertas=puertas;
        this.velocidadMaxima=velMax;
        this.nombre=nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;

        cantidadVehiculos++;
        
        Fabricante.registrarVenta(fabricante);
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }

    public static int getAutomoviles() {
        return automoviles;
    }
    public static void setAutomoviles(int automoviles) {
        Vehiculo.automoviles = automoviles;
    }

    public static int getCamiones() {
        return camiones;
    }
    public static void setCamiones(int camiones) {
        Vehiculo.camiones = camiones;
    }

    public static int getCamionetas() {
        return camionetas;
    }
    public static void setCamionetas(int camionetas) {
        Vehiculo.camionetas = camionetas;
    }



    public static String vehiculosPorTipo(){
        return "Automoviles: "+automoviles+"\n"+
               "Camionetas: "+camionetas+"\n"+
               "Camiones: "+camiones;
    }

    protected static void registrarUnTipo(int tipo){
        switch (tipo) {
            case 1: //Con 1 se registra carro
                automoviles++;
                break;
            case 2: //Con 2 se registra camioneta
                camionetas++;
                break;
            case 3: //con 3 se registra camion
                camiones++;
                break;
            default:
                break;
        }
    }

}
