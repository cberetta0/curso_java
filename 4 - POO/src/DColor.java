public enum DColor {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJA("Naranja");

    //si quiero que cada constante tenga un valor personalizado cada vez que la imprimo (por defecto se imprime en mayuscula)
    //creo un atributo color y un constructor

    private final String color;

    DColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() { //de esta forma automaticamente cada que se imprima una constante del enum, saldra su atributo color personalizado
        return this.color; //para dar una representacion al valor de cada constante
    }
}
