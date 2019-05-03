package com.soaint.fogacoop.commons.enums;

public enum Cargo {

    IMPLEMENTADOR(0, "Implementador"),
    FUNCIONAL (1,"Funcional"),
    TESTER(2,"Tester"),
    LIDER_TECNICO(3, "Lider Técnico");

    private Integer codigo;
    private String cargo;

    Cargo(Integer codigo, String cargo) {
        this.codigo = codigo;
        this.cargo = cargo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getCargo() {
        return cargo;
    }

}
