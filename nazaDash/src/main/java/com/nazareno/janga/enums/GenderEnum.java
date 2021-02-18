package com.nazareno.janga.enums;
public enum GenderEnum {

    MALE("male"),
    FEMALE("female");

    private String descricao;

    GenderEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}