public class CEjemploAutomovilStatic {
    public static void main(String[] args) {

        BAutomovil subaru = new BAutomovil("Subaru", "Impreza");
        subaru.setColor(DColor.BLANCO);
        subaru.setMotor(new HMotor(2.0, KTipoMotor.BENCINA));
        subaru.setEstanque(new IEstanque());
        subaru.setTipo(ETipoAutomovil.HATCHBACK);

        BAutomovil mazda = new BAutomovil("Mazda", "BT-50", DColor.ROJO, new HMotor(3.0, KTipoMotor.DIESEL));
        mazda.setEstanque(new IEstanque(45));
        mazda.setTipo(ETipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        BAutomovil nissan = new BAutomovil("Nissan", "Navara", DColor.GRIS, new HMotor(4.0, KTipoMotor.DIESEL), new IEstanque(50));
        nissan.setTipo(ETipoAutomovil.PICKUP);

        BAutomovil nissan2 = new BAutomovil("Nissan", "Navara", DColor.GRIS, new HMotor(3.5, KTipoMotor.BENCINA), new IEstanque(50));
        nissan2.setTipo(ETipoAutomovil.PICKUP);

        BAutomovil.setColorPatente(DColor.AMARILLO); //Se modifica para todos los objetos
        BAutomovil auto = new BAutomovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println("Color de la patente: " + BAutomovil.getColorPatente());
        System.out.println("Kilometros por litros = " + BAutomovil.calcularConsumoEsttatico(300, 60)); //llamo al metodo estatico
        System.out.println("Velocidad maxima carretera: " + BAutomovil.VELOCIDAD_MAX_CARRETERA); //como son static se las llama con el nombre de la clase, y al ser constantes no es posible cambiarles el valor
        System.out.println("Velocidad maxima ciudad: " + BAutomovil.VELOCIDAD_MAX_CIUDAD);

    }
}
