package src;

import java.util.List;

public class Cuenta { 
    String mNumero; 
    String nTitular; 
    double saldo;
    List <Movimiento> mMovimientos;
    
    public Cuenta(String mNum, String nTit, double saldo) {
    	this.mNumero=mNum;
    	this.nTitular=nTit;
    	this.saldo=saldo;
    }

public void ingresar(double x) {
	saldo+=x;
}
public void retirar(double x) {
	saldo-=x;
}

public double getSaldo() {
	// TODO Auto-generated method stub
	return -250;
}
}