package src;

import java.util.ArrayList;
import java.util.List;

import src.Movimiento.Signo;

public class Cuenta { 
    String mNumero; 
    String nTitular; 
    double saldo;
    ArrayList <Movimiento> mMovimientos =new ArrayList<Movimiento>();
    int ingresos=0;
    int retiros=0;
    
    public Cuenta(String mNum, String nTit, double saldo) {
    	this.mNumero=mNum;
    	this.nTitular=nTit;
    	this.saldo=saldo;
    }

public void ingresar(double x) {
	saldo+=x;
	ingresos++;
	String ingreso="ingreso nº: " + ingresos;
	Movimiento m =new Movimiento(x, Signo.S, ingreso);
	mMovimientos.add(m);
}
public void retirar(double x) {
	if(saldo-x<-500f) {
		System.out.println("Error: la cuenta " + mNumero + " (titular: " + nTitular + ") no se puede quedar con 500€ al descubierto");
	}
	else {
		saldo-=x;
		retiros++;
		String retiro="retiro nº: " + retiros;
		Movimiento m =new Movimiento(x, Signo.S, retiro);
		mMovimientos.add(m);
	}
	
}

public double getSaldo() {
	// TODO Auto-generated method stub
	return saldo;
}
}