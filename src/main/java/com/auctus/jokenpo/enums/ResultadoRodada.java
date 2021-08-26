package com.auctus.jokenpo.enums;

public enum ResultadoRodada {
    VITORIA("vitória"),
    EMPATE_VITORIOSO("empate vitorioso"),
    EMPATE_NAO_CONCLUSIVO("empate nao conclusivo");

    private String descricao;

    ResultadoRodada(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
