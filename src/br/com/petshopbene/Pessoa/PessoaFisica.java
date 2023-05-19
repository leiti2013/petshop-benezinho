package br.com.petshopbene.Pessoa;

import br.com.petshopbene.Sexo.Sexo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private Collection<PessoaFisica> filhos = new Vector<>();

    private Sexo sexo;

    public PessoaFisica addFilho(PessoaFisica filho) {
        this.filhos.add(filho);
        return this;
    }

    public PessoaFisica removeFilho(PessoaFisica filho) {
        this.filhos.remove(filho);
        return this;
    }

    public  Collection<Pessoa> getFilhos(){return Collections.unmodifiableCollection(this.filhos);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica() {
    }

    public PessoaFisica(long id, String nome, String cpf, Sexo sexo, Collection<PessoaFisica> filhos) {
        super(id, nome);
        this.cpf = cpf;
        this.sexo = sexo;
        this.filhos = filhos;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", filhos=" + filhos +
                ", sexo=" + sexo +
                "} " + super.toString();
    }
}