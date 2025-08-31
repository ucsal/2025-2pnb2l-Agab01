package br.com.mariojp.solid.lspaccounts;

public abstract class WithdrawableAccount extends Account {
	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Valor invalido");
		} else if (balance < amount) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		this.balance -= amount;
	}
}
