package com.ejercicio;

import static com.ejercicio.Precio.getPrecioConIva;

public class MainClass {
    public static void main(String[] args) {

            try {
                double precioConIva = getPrecioConIva();
                System.out.println("El precio con IVA es: " + precioConIva);
            } catch (PrecioDemasiadoAltoException e) {
                System.out.println(e.getMessage());
            }
        }


    }

