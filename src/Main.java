import br.com.petshopbene.Animal.Animal;
import br.com.petshopbene.Documentos.Documento;
import br.com.petshopbene.Pessoa.Pessoa;
import br.com.petshopbene.Pessoa.PessoaFisica;
import br.com.petshopbene.Pessoa.PessoaJuridica;
import br.com.petshopbene.Servico.Servico;
import br.com.petshopbene.Sexo.Sexo;

import javax.swing.*;

public class Main {
    public static PessoaFisica novaPessoa(Long id, String nome, String CPF, Sexo sexo) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome(nome);
        pf.setCpf(CPF);
        pf.setId(id);
        pf.setSexo(sexo);
        return pf;
    }

    public static PessoaJuridica novaPessoaJuridica(Long id, String nome, String CNPJ) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome(nome);
        pj.setId(id);
        pj.setCnpj(CNPJ);
        return pj;
    }

    public static Servico novoServico(int id, String nome, double valor, String descricao, String observacao){
        Servico servico = new Servico();
        servico.setId(id);
        servico.setNome(nome);
        servico.setValor(valor);
        servico.setDescricao(descricao);
        servico.setObservacao(observacao);
        return servico;
    }

    public static Animal novoAnimal(long id, String nome, String raca, String descricao){
        Animal animal = new Animal();
        animal.setId(id);
        animal.setNome(nome);
        animal.setRaca(raca);
        animal.setDescricao(descricao);
        return animal;
    }
    public static Documento novoDocumento(int id, String nome, Pessoa pessoa){
        Documento doc = new Documento();
        doc.setId(id);
        doc.setNome(nome);
        doc.setPessoa(pessoa);
        return doc;
    }


    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Insira seu nome: ");
        String id = "32324423";
        Long idf = Long.parseLong(JOptionPane.showInputDialog("Insira seu ID: "));
        String cpf = JOptionPane.showInputDialog("Insira o CPF: ");

        PessoaFisica leo = novaPessoa(idf, nome, cpf, Sexo.M);

        int ids = 777;
        String nomeservico = JOptionPane.showInputDialog("Nome do serviço: ");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor: "));
        String desc = JOptionPane.showInputDialog("Insira a descrição do serviço: ");
        String observ = JOptionPane.showInputDialog("Insira observação: ");

        Servico servico = novoServico(ids, nomeservico, valor, desc, observ);

        int idanim = 5;
        String nomeani = JOptionPane.showInputDialog("Nome do pet: ");
        String raca = JOptionPane.showInputDialog("Raça do pet: ");
        String descani = JOptionPane.showInputDialog("Descrição do pet: ");
        String obserani = JOptionPane.showInputDialog("Observações do animal: ");

        Animal animal = novoAnimal(idanim, nomeani, descani, obserani);

        System.out.println(leo);
        System.out.println(servico);
        System.out.println(animal);
    }

}