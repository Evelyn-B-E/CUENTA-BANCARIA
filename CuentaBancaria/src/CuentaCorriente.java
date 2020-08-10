
public class CuentaCorriente extends CuentaBancaria {
	@Override
	public void deposito(double dinero) {
		
		double interes = 0;
		if(dinero < 1000) {
			interes = dinero*0.01;			
		}
		double totalDeposito = dinero + interes;
		this.saldo += totalDeposito;


	}

}
