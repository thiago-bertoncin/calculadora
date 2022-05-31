package com.thiaguinho;

public enum Operacao {
    SOMAR("+") {
        @Override
        public double ExecutarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAIR("-") {
        @Override
        public double ExecutarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR("*") {
        @Override
        public double ExecutarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDIR("/") {
        @Override
        public double ExecutarOperacao(double x, double y) {
            return x/y;
        }
    };

    private String simbolo;

    private Operacao(String simbolo) {
        this.simbolo = simbolo;
    }

    public String toString() {
        return this.simbolo;
    }

    public abstract double ExecutarOperacao(double x, double y);


}
