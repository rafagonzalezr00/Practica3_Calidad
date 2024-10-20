package src;

public class Movimiento {
	double importe;
	Signo signo;
	enum Signo{S, R};
	String detalle;
	
	public Movimiento(double importe, Signo signo, String detalle) {
		this.importe=importe;
		this.signo=signo;
		this.detalle=detalle;
	}
}
