public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, String conta, Cliente titular) {
        super(agencia, conta, titular);
    }

    public int getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        super.deposita(valor);
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("sacado " + valor + " Da conta de " + this.titular.nome + " Com sucesso!");
            this.saldo -= 1.90;
            System.out.println("Cobrado taxa de R$ 1,90 da conta de " + this.titular.nome + ".");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Transferiod " + valor + " Da conta de " + this.titular.nome + " para conta de "
                    + destino.titular.nome + " com sucesso!");
            destino.deposita(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
