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
        double valorAsacar = valor + 1.9;
        super.sacar(valorAsacar);
        System.out.println("sacado " + valor + " Da conta de " + this.titular.nome + " Com sucesso!");
        System.out.println("Cobrado taxa de R$ 1,90 da conta de " + this.titular.nome + ".");
    }

    public void transfere(double valor, Conta destino) {
        super.transfere(valor, destino);
    }
}
