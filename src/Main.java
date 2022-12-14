public class Main {

    public static void main(String[] args) {

        // Criando clientes:
        Cliente cliente01 = new Cliente("Luiz Antonio", "111.222.333-00", "programador");
        Cliente cliente02 = new Cliente("Mirely Masieiro", "222.333.444-01", "professora");

        // Criando contas:
        Conta conta01 = new ContaCorrente(101, "224466-01", cliente01);
        Conta conta02 = new ContaPoupanca(101, "335566-02", cliente02);

        // Executando Métodos:
        conta01.deposita(1000);
        conta02.deposita(2000);
        conta02.sacar(250);
        conta01.sacar(150);
        conta02.transfere(200, conta01);
        conta01.sacar(10000); // Testando exception.

        System.out.println("Conta de " + conta01.getTitular().nome + " tem: " + conta01.getSaldo());
        System.out.println("Conta de " + conta02.getTitular().nome + " tem: " + conta02.getSaldo());

    }

}
