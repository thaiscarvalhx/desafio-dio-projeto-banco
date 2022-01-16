package EstudosDio.Projetos.Banco;

public class Cliente {

    private
    String nome;
    Long cpf;

    public Cliente(String nome, Long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
