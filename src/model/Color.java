package model;

public enum Color {

    NEGRO(1), BLANCO(2), AZUL(3), VERDE(4), GRIS(5);

    private final int option;

    Color(int option){
        this.option = option;
    }

    public int getOption() {
        return option;
    }

}