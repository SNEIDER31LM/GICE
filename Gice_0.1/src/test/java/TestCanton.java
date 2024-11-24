package test.java.util;

import ec.edu.uce.Canton;

public class TestCanton {

    private static Canton cantonTest;

    public static void main(String[] args) {
        // Crear un canton de prueba
        cantonTest = new Canton("Quito", 1);  // Usando el ID de provincia 1

        // Mostrar detalles del canton creado
        System.out.println("Canton creado:");
        System.out.println("Nombre del Cantón: " + cantonTest.getNombreCanton());
        System.out.println("ID Provincia: " + cantonTest.getIdProvincia());

        // Agregar algunas ciudades al cantón
        cantonTest.agregarCiudad("Ciudad de Quito");
        cantonTest.agregarCiudad("San Antonio");
        cantonTest.agregarCiudad("Cumbayá");

        // Mostrar las ciudades del cantón
        System.out.println("Ciudades en el cantón " + cantonTest.getNombreCanton() + ":");
        cantonTest.obtenerCiudades().forEach(ciudad -> System.out.println(ciudad));
    }
}