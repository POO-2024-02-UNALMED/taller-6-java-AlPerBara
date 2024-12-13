package vehiculos;

import java.util.*;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static Map<Fabricante, Integer> ventasPorFabricante =new HashMap<>();

    public Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static void registrarVenta(Fabricante fabricante){
        ventasPorFabricante.put(fabricante, ventasPorFabricante.getOrDefault(fabricante, 0)+1);
        Pais.registroDeVenta(fabricante.getPais());
    }

    public static Fabricante fabricaMayorVentas() {
        return ventasPorFabricante.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

    }

}
