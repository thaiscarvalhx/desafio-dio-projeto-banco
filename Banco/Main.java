package EstudosDio.Projetos.Banco;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Stephanie");
        cliente.setCpf(49895806809L);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100d);
        cc.transferir(100d, poupanca);

        cc.extrato();
        poupanca.extrato();

    }
}
