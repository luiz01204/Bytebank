# Projeto Bytebank #

A ideia desse projeto é praticar orientação a objeto usando Java, usei elemtentos da **herança** e **polimorfismo** para simular funcioanemnto de contas bancarias.

### Executando projeto ###

Deixei na classe Main do projeto diveros métudos instanciados para melhor visualziar a funcionalidade de cada classe e seus métodos.

ˋˋˋ
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

     System.out.println("Conta de " + conta01.getTitular().nome + " tem: " + conta01.getSaldo());
     System.out.println("Conta de " + conta02.getTitular().nome + " tem: " + conta02.getSaldo());
ˋˋˋ

Obrigado pelo interese! 
