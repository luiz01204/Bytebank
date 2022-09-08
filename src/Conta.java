abstract class Conta {

    protected final int agencia;
    protected final String conta;
    protected final Cliente titular;
    protected double saldo;

    public Conta(int agencia, String conta, Cliente titular) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        System.out.println("Conta " + this.conta + " criada com sucesso!");
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
        this.saldo = this.saldo + valor;
        System.out.println("Depositado " + valor + " na conta de " + this.titular.nome + " Com sucesso!");
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("sacado " + valor + " Da conta de " + this.titular.nome + " Com sucesso!");
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
