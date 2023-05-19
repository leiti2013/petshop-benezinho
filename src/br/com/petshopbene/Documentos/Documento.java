package br.com.petshopbene.Documentos;

import br.com.petshopbene.Pessoa.Pessoa;

public class Documento {
    private int id;
    private String nome;
    private Pessoa pessoa;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Documento() {
        this.id = id;
        this.nome = nome;
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
