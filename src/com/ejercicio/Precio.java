package com.ejercicio;

import javax.swing.*;

public class Precio {

        public static double getPrecioConIva() throws PrecioDemasiadoAltoException {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio sin IVA: "));
            double precioConIva = precio * 1.21;
            if (precioConIva > 100) {
                throw new PrecioDemasiadoAltoException(precioConIva);
            }
            return precioConIva;
        }


    }

    class PrecioDemasiadoAltoException extends Exception {
        public PrecioDemasiadoAltoException(double precioConIva) {
            super("El precio con IVA (" + precioConIva + " euros) es demasiado alto.");
        }
    }

















    //  double valor;
  //  final double IVA=1.21;


  //  public double getPrecioConIva() throws PrecioDemasiadoAltoEsception {

      //  double PrecioConIva = valor * 1.21;

        //double valor= Double.parseDouble(JOptionPane.showInputDialog("Introduzca un precio"));


       // if(PrecioConIva>100){
          //  throw new PrecioDemasiadoAltoEsception();

      //  }
      //  return PrecioConIva;
   // }

  //((  public class PrecioDemasiadoAltoEsception extends Exception{

   // }

  //  public double getValor() {
      //  return valor;


