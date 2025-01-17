public class BAutomovil implements Comparable<BAutomovil>{

    //los atributos al ponerlos privados unicamente pueden ser accedidos dentro de la misma clase
    private int id;
    private String fabricante;
    private String modelo;
    private DColor color = DColor.GRIS;
    private HMotor motor;
    private IEstanque estanque;
    private GPersona conductor;
    private JRueda[] ruedas;
    private int indiceRuedas;
    private ETipoAutomovil tipo;

    //un atributo o un metodo estatico de una clase no le pertenece a la instancia, no es del objeto en si,
    //sino de la clase. Por lo tanto es compartido por cualquier objeto de esa clase, de tal forma que si
    //un objeto en particular modifica este valor estatico, se va a modificar tambien para todo el resto
    //se puede decir que es un atributo generico, compartido por todas las instancias de la clase
    private static DColor colorPatente = DColor.NARANJA; //cualquier objeto automovil va a tener un color de patente naranja
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoIdAsignado;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120; //finale en java hace referencia a una constante, suelen ser public y static para que hagan referencia a la clase. Se escriben en mayus y las palabras compuestas con _
    public static final int VELOCIDAD_MAX_CIUDAD = 60; //en resumen, las constantes tipicamente son publicas y estaticas

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";

    //constructor: lleva exactamente el mismo nombre que la clase y no se coloca el void
    //sobrecarga de constructores, ademas de uno que reciba parametros puedo tener uno que no reciba nada por ej
    public BAutomovil() {
        this.id = ++ultimoIdAsignado; //genero un id para cada objeto que instancio, y a su vez tengo un atributo estatico para la clase del ultimo id que asigne
        this.ruedas = new JRueda[5];
    }

    public BAutomovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public BAutomovil(String fabricante, String modelo, DColor color){
        this(fabricante, modelo); //el this hace referencia al constructor de arriba, me ayuda a no repetir codigo ya que reutiliza el constrcutor de arriba
        this.color = color;
    }

    public BAutomovil(String fabricante, String modelo, DColor color, HMotor motor) {
        this(modelo, fabricante, color);
        this.motor = motor;
    }

    public BAutomovil(String fabricante, String modelo, DColor color, HMotor motor, IEstanque estanque) {
        this(modelo, fabricante, color, motor);
        this.estanque = estanque;
    }

    public BAutomovil(String fabricante, String modelo, DColor color, HMotor motor, IEstanque estanque, GPersona conductor, JRueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public DColor getColor() {
        return color;
    }

    public void setColor(DColor color) {
        this.color = color;
    }

    public HMotor getMotor() {
        return motor;
    }

    public void setMotor(HMotor motor) {
        this.motor = motor;
    }

    public IEstanque getEstanque() {
        if(this.estanque == null){ //si no se le asigno un estanque, lo creo
            this.estanque = new IEstanque();
        }
        return estanque;
    }

    public void setEstanque(IEstanque estanque) {
        this.estanque = estanque;
    }

    //el atributo colorPatente static tiene que ir de la mano con sus getter y setter tambien static
    public static DColor getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(DColor colorPatente) {
        BAutomovil.colorPatente = colorPatente; //identifico el atributo estatico con el nombre de la clase
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        BAutomovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public ETipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(ETipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public GPersona getConductor() {
        return conductor;
    }

    public void setConductor(GPersona conductor) {
        this.conductor = conductor;
    }

    public JRueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(JRueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public void addRueda(JRueda rueda){
        if(indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
    }

    public String detalle(){ //no pongo sout aca porq no es buena practica que una clase imprima su informacion en pantalla, sino que es mejor que devuelva los datos y se impriman en el main
        String modelo = "otro";

        String detalle = "auto.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo; //si no me refiero al atributo con el this, se llamaria la variable modelo que esta dentro del metodo y no al atributo de la clase, para eso sirve

        if(this.tipo != null){
            detalle += "\nauto.tipo = " + this.tipo.getDescripcion();
        }

        detalle += "\nauto.color = " + this.color +
                "\nauto.colorPatente = " + colorPatente + //el atributo estatico no se accede con el this
                "\nauto.cilindrada = " + this.motor.getCilindrada();

        return detalle;
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarYFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    //sobrecarga de metodos: mismo nombre de metodo pero distinto tipo o distinta cantidad de parametros
    public float calcularConsumo(int kilometraje, float porcentajeBencina){
        return kilometraje/(this.getEstanque().getCapacidad()*porcentajeBencina); //por ejemplo puedo usar get estanque por si el mismo no le fue asignado al objeto, para que el getter lo cree
    }

    public float calcularConsumo(int kilometraje, int porcentajeBencina){
        return kilometraje/(this.estanque.getCapacidad()*(porcentajeBencina/100f)); //hago float al 100 para que el resultado tambien sea con precision, es decir decimal
    }

    public static float calcularConsumoEsttatico(int kilometraje, int porcentajeBencina){
        return kilometraje/(BAutomovil.capacidadEstanqueEstatico*(porcentajeBencina/100f)); //en un metodo estatico no puedo utilizar atributos de la clase que no sean estaticos, por eso creo la version estatica de capacidad
    }

    //click derecho -> generate -> override methods -> equals
    //puedo implementar mi propio metodo equals personalizado para mi clase, yo defino que significa que dos objetos sean iguales para mi
    @Override
    public boolean equals(Object obj) {
        if(this == obj){ //si ambos son iguales por referencia
            return true;
        }
        if(!(obj instanceof BAutomovil)){ //no puedo comparar dos cosas distintas
            return false;
        }
        BAutomovil a = (BAutomovil) obj; //casteo a tipo automovil
        return this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()); //digo que son iguales si coinciden fabricante y modelo
    }

    //click derecho -> generate -> toString()
    @Override
    public String toString() {
        return "BAutomovil{" +
                "id='" + id + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + motor.getCilindrada() +
                ", capacidadEstanque=" + estanque.getCapacidad() +
                '}';
    }

    //click derecho -> generate -> Implement Methods -> compareTo()
    @Override
    public int compareTo(BAutomovil auto) {
        //BAutomovil auto = (BAutomovil) o; //hago un cast a automovil porque estoy recibiendo un tipo generico. E este caso lo comento porque agregue el tipo de dato en la interfaz compprable

        //ordeno por el atributo fabricante
        return this.fabricante.compareTo(auto.fabricante);
    }
}
