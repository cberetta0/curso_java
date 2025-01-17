public class AEjemploAutomovil {
    public static void main(String[] args) {

        //clase principal del ejemplo, es la que tiene el main

        //instncio un objeto
        BAutomovil subaru = new BAutomovil("Subaru", "Impreza");
        subaru.setColor(DColor.BLANCO);;//subaru.color = "blanco"; como mis atributos son private no los puedo modificar directamente desde fuera de la clase
        subaru.setMotor(new HMotor(2.0, KTipoMotor.BENCINA));
        subaru.setEstanque(new IEstanque());

        //atributos del objeto
        System.out.println(subaru.detalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.calcularConsumo(300, 0.75f)); //sobrecarga de metodos
        System.out.println(subaru.calcularConsumo(300, 75));

        //puedo instanciar muchos objetos de tipo automovil
        BAutomovil mazda = new BAutomovil("Mazda", "BT-50", DColor.ROJO, new HMotor(3.0, KTipoMotor.DIESEL));
        mazda.setEstanque(new IEstanque(45));
        //mazda.fabricante = "Mazda";
       // mazda.modelo = "BT-50";

        System.out.println("mazda.fabricante: " + mazda.getFabricante());
        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerarYFrenar(4000));

        BAutomovil nissan = new BAutomovil("Nissan", "Navara", DColor.GRIS, new HMotor(4.0, KTipoMotor.DIESEL), new IEstanque(50));
        System.out.println(nissan.detalle());
        System.out.println(subaru.calcularConsumo(300, 60));
        System.out.println("nissan = " + nissan); //por debajo cuando quiero imprimir un objeto se invoca el metodo toString() que imprime el nombre de la clase y lo concatena con una @HashCore, siendo hashcore un numero identificador del objeto en hexa: BAutomovil@49097b5d
        //ahora como el metodo esta sobreescrito se representa el objeto en una salida de cadena

        BAutomovil nissan2 = new BAutomovil("Nissan", "Navara", DColor.GRIS, new HMotor(3.5, KTipoMotor.BENCINA), new IEstanque(50));
        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales? " + nissan.equals(nissan2)); //tmb es false ya que equals implementa el == por debajo (antes de sobreescribir el metodo)
    }
}
