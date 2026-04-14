
package cuentas;
 /*hola */
public class Main {

public static void main(String[] args) {

    CCuenta cuenta1 = new CCuenta("Alejandro", "AK105286468", 1500, 1.5);
    operativa_cuenta(cuenta1);
}



 public static void operativa_cuenta(CCuenta cuenta1, float cantidad) throws Exception {

        cuenta1.ingresar(cantidad);
        cuenta1.retirar(cantidad);
        cuenta1.retirar(cantidad);

        System.out.println("Saldo final: " + cuenta1.estado());
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
        cuenta=cuenta1;
        saldo=sal;
        tipoInterés=tipo
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }


    public double getSaldo() {
        return saldo;
    }


    public double getTipoInteres() {
        return tipoInteres;
    }



    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }



    public double estado()
    {
        return saldo;
    }

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
