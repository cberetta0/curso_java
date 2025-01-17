public class EConversionDeTipos {

    public static void main(String[] args) {

        // de string a tipos primitivos

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realdouble = Double.parseDouble(realStr);
        System.out.println("realdouble = " + realdouble);

        String logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // de tipos primitivos a strings

        int otroNumeroInt = 100;
        String otroNumeroStr = Integer.toString(otroNumeroInt); //forma 1 de conversion con la clase Integer
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        otroNumeroStr = String.valueOf(otroNumeroInt); //forma 2 de conversion con la clase String
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        // conversiones entre tipos primitivos

        int i = 1000;
        short s = (short) i; //si no hago el casteo me tira error, el short es mas pequeño que el int, por lo q puede haber perdida de informacion
        long l = i; // no me tira error dado que el long es mas grande que el int
    }
}
