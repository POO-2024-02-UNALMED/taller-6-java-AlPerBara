package vehiculos;

import java.util.*;

public class Pais {
    private String nombre;
    private static Map<Pais, Integer>ventasPerPais = new HashMap<>();

    public Pais(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void registroDeVenta(Pais paisVendedor){
        ventasPerPais.put(paisVendedor, ventasPerPais.getOrDefault(paisVendedor, 0)+1);
    }

    public static Pais paisMasVendedor(){
        return ventasPerPais.entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse(null);
    }

}
