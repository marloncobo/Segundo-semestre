package Seguimiento2.Ejercicio3;

public class Cuentabancaria {
    private String titular;
    private String numerocuenta;
    private double saldo;

    Cuentabancaria(String titular, String numerocuenta, double saldo) {
        this.titular = titular;
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }

    public boolean retirar(double monto){
        if(this.saldo >= monto){
            this.saldo -= monto;
            return true;
        }else {
            return false;
        }
    }

    public void transferencia(Cuentabancaria cuentaDestino, double monto){
        if (this.saldo >= monto){
            this.saldo -= monto;
            cuentaDestino.depositar(monto);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }
    public double getSaldo() {
        return saldo;
    }
}
