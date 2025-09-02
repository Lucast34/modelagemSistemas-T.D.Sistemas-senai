package br.com.edukacode.api;

public record DadosListagemLead(String nome, String email, String telefone) {

    public DadosListagemLead() {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
    }


}
