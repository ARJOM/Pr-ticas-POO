package com.ifpb.pagamento.modelo;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private String titulacao;
    private int cargaHoraria;

    public Professor(String cpf, String nome, float salario, LocalDate nascimento, String titulacao, int cargaHoraria){
        super(cpf, nome, salario, nascimento);
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public float calcularPagamento(){
        return getSalario()+(10*cargaHoraria);
    }
}
