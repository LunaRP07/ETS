package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } 
        catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}





public class CCuenta {

    private String nombre;
    private String cuenta1;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cuenta1, double sal, double tipo)
    {
        nombre=nom;
        cuenta1=cuenta1;
        saldo=sal;
        tipoInterés=tipo
    }

   /**
     * Obtiene el nombre del titular.
     * @return nombre del titular
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular.
     * @param nombre nuevo nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   /**
     * Obtiene el número de cuenta.
     * @return número de cuenta
     */

    public String getCuenta() {
        return cuenta1;
    }

/**
     *
     * Establece el número de cuenta.
     * @param cuenta1 nuevo número de cuenta
     */

    public void setCuenta(String cuenta1) {
        this.cuenta1 = cuenta1;
    }

 /**
     * Obtiene el saldo actual.
     * @return saldo disponible
     */

    public double getSaldo() {
        return saldo;
    }

  /**
     * Obtiene el tipo de interés.
     * @return tipo de interés
     */

    public double getTipoInteres() {
        return tipoInteres;
    }

/**
     * Establece el tipo de interés.
     * @param tipoInteres nuevo tipo de interés
     */

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

/**
     * Devuelve el estado actual de la cuenta (saldo).
     * @return saldo actual
     */

    public double estado()
    {
        return saldo;
    }

/**
     * Ingresa una cantidad en la cuenta.
     * 
     * @param cantidad dinero a ingresar
     * @throws Exception si la cantidad es negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

}