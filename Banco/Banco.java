package EstudosDio.Projetos.Banco;

/* DESCRIÇÃO
Reforce seu conhecimento em Programação Orientada a Objetos (POO) em Java com
um desafio de projeto totalmente prático. Para isso, os pilares da orientação
a objetos são devidamente explorados no contexto bancário, onde o expert implementa
um projeto de referência (disponibilizado no GitHub) de forma prática e interativa.
Sendo assim, você poderá desenvolver sua capacidade de abstração reproduzindo
essa solução. Além disso, caso queira ir além, implemente suas próprias evoluções e melhorias ;-)
 */

import java.util.List;

public class Banco {

    private
    String nome;
    List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
