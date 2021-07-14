
public class Conta {
	
	private int agencia;
	private int numero;
	private int titular;
	private double saldo;
	
	public double Deposita(double deposito) {
		this.saldo =+ deposito;
		System.out.println("Novo saldo da conta: R$" + this.saldo);
		return deposito;
	}
	
	public void getAgencia() {
		System.out.println("Agencia: " + this.agencia);
	}
	
	
	

}
