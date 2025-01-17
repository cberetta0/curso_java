public class LEjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        GPersona conductorSubaru = new GPersona("Luci", "Martinez");
        BAutomovil subaru = new BAutomovil("Subaru", "Impreza");
        subaru.setColor(DColor.BLANCO);
        subaru.setMotor(new HMotor(2.0, KTipoMotor.BENCINA));
        subaru.setEstanque(new IEstanque());
        subaru.setTipo(ETipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSubaru);

        JRueda[] ruedasSubaru = new JRueda[5];
        for (int i = 0; i < ruedasSubaru.length; i++) {
            subaru.addRueda(new JRueda("Yokohama", 16, 7.5));
        }

        GPersona pato = new GPersona("Pato", "Rodriguez");
        BAutomovil mazda = new BAutomovil("Mazda", "BT-50", DColor.ROJO, new HMotor(3.0, KTipoMotor.DIESEL));
        mazda.setEstanque(new IEstanque(45));
        mazda.setTipo(ETipoAutomovil.PICKUP);
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMazda);

        JRueda[] ruedasMazda = new JRueda[5];
        for (int i = 0; i < ruedasMazda.length; i++) {
            mazda.addRueda(new JRueda("Michelin", 18, 10.5));
        }

        JRueda[] ruedasNissan = {new JRueda("Pirelli", 20, 11.5),
                new JRueda("Pirelli", 20, 11.5),
                new JRueda("Pirelli", 20, 11.5),
                new JRueda("Pirelli", 20, 11.5),
                new JRueda("Pirelli", 20, 11.5)};

        GPersona bea = new GPersona("Bea", "Gonzalez");
        BAutomovil nissan = new BAutomovil("Nissan", "Navara", DColor.GRIS, new HMotor(4.0, KTipoMotor.DIESEL), new IEstanque(50), bea, ruedasNissan);
        nissan.setTipo(ETipoAutomovil.PICKUP);

        JRueda[] ruedasNissan2 = {new JRueda("Pirelli", 20, 11.5),
                new JRueda("Pirelli", 20, 11.5),
                new JRueda("Pirelli", 20, 11.5),
                new JRueda("Pirelli", 20, 11.5),
                new JRueda("Pirelli", 20, 11.5)};

        GPersona lalo = new GPersona("Lalo", "Mena");
        BAutomovil nissan2 = new BAutomovil("Nissan", "Navara", DColor.GRIS, new HMotor(3.5, KTipoMotor.BENCINA), new IEstanque(50), lalo, ruedasNissan2);
        nissan2.setTipo(ETipoAutomovil.PICKUP);

        BAutomovil.setColorPatente(DColor.AMARILLO);
        BAutomovil auto = new BAutomovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println("Conductor subaru: " + subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for(JRueda rueda: subaru.getRuedas()){
            System.out.println(rueda.getFabricante() + ", aro: " + rueda.getAro() + ", ancho: " + rueda.getAncho());
        }

    }
}
