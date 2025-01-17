public class FEjemploAutomovilEnum {
    public static void main(String[] args) {

        BAutomovil.setCapacidadEstanqueEstatico(45);
        BAutomovil subaru = new BAutomovil("Subaru", "Impreza");
        subaru.setColor(DColor.BLANCO);
        subaru.setMotor(new HMotor(2.0, KTipoMotor.BENCINA));
        subaru.setEstanque(new IEstanque());
        subaru.setTipo(ETipoAutomovil.HATCHBACK);

        BAutomovil mazda = new BAutomovil("Mazda", "BT-50", DColor.ROJO, new HMotor(3.0, KTipoMotor.DIESEL));
        mazda.setEstanque(new IEstanque(45));
        mazda.setTipo(ETipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        ETipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("tipo descripcion subaru: " + tipoSubaru.getDescripcion());


        //Enum con sentencia switchcase
        switch (tipoSubaru){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil grande, con maleta grande...");
                break;
        }

        //los enum tambien son iterables
        ETipoAutomovil[] tipos = ETipoAutomovil.values(); //values retorna un arreglo con las constantes del numerador
        for(ETipoAutomovil ta: tipos){
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuertas());
            System.out.println();
        }
    }
}
