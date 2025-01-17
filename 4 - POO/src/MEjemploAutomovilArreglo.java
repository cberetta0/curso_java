import java.lang.reflect.Array;
import java.util.Arrays;

public class MEjemploAutomovilArreglo {
    public static void main(String[] args) {

        GPersona conductorSubaru = new GPersona("Luci", "Martinez");
        BAutomovil subaru = new BAutomovil("Subaru", "Impreza");
        subaru.setColor(DColor.BLANCO);
        subaru.setMotor(new HMotor(2.0, KTipoMotor.BENCINA));
        subaru.setEstanque(new IEstanque());
        subaru.setTipo(ETipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        GPersona pato = new GPersona("Pato", "Rodriguez");
        BAutomovil mazda = new BAutomovil("Mazda", "BT-50", DColor.ROJO, new HMotor(3.0, KTipoMotor.DIESEL));
        mazda.setEstanque(new IEstanque(45));
        mazda.setTipo(ETipoAutomovil.PICKUP);
        mazda.setConductor(pato);

        GPersona bea = new GPersona("Bea", "Gonzalez");
        BAutomovil nissan = new BAutomovil("Nissan", "Navara", DColor.GRIS, new HMotor(4.0, KTipoMotor.DIESEL), new IEstanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(ETipoAutomovil.PICKUP);

        GPersona lalo = new GPersona("Lalo", "Mena");
        BAutomovil suzuki = new BAutomovil("Suzuki", "Vitara", DColor.GRIS, new HMotor(1.6, KTipoMotor.BENCINA), new IEstanque(50));
        suzuki.setConductor(lalo);
        suzuki.setTipo(ETipoAutomovil.SUV);

        BAutomovil audi = new BAutomovil("Audi", "A3");
        audi.setConductor(new GPersona("Jano", "Perez"));

        BAutomovil[] autos = new BAutomovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos); //me permite ordenar porque Automovil implementa la interfaz comparable y sobreescribe el metodo compareTo
        for (BAutomovil auto : autos) {
            System.out.println(auto.getFabricante());
        }
    }
}
