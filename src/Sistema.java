import java.sql.SQLOutput;
import java.util.Scanner;

public class Sistema {

    private Scanner sc;

    //Constructor de la clase
    public Sistema() {
        sc = new Scanner(System.in);
    }

    //Metodo de creacion de objeto tipo PerfilMedico
    public PerfilMedico crearPerfilMedico(){

        System.out.println("Ingrese los datos del paciente: ");
        System.out.print("Nombre: ");
        String nombre = sc.next();

        System.out.print("Apellido: ");
        String apellido = sc.next();

        System.out.print("Sexo (M o F): ");
        int sexo = sc.nextInt();

        System.out.print("Año de Nacimiento: ");
        int anio = sc.nextInt();

        System.out.print("Mes de Nacimiento: ");
        int mes = sc.nextInt();

        System.out.print("Dia de Nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Altura (en centimetros): ");
        double altura = sc.nextDouble();

        System.out.print("Peso (en kilogramos): ");
        double peso = sc.nextDouble();

        PerfilMedico pm = new PerfilMedico(nombre, apellido, sexo, anio, mes, dia, altura, peso);

        return pm;
    }

    public void imprimirInfoMedico(PerfilMedico pm){
        System.out.println("---- Infomarcion Paciente ----");
        System.out.println("Nombre: "+ pm.getNombre());
        System.out.println("Apellido: "+ pm.getApellido());

        if (pm.getSexo() == 1){
            System.out.println("Sexo: Masculino");
        }else{
            System.out.println("Sexo: Femenino");
        }

        System.out.println("Altura: "+ pm.getAltura() + "cm");
        System.out.println("Peso: "+ pm.getPeso()+ "kg");

        System.out.println("Edad: "+ pm.calcularEdad());
        System.out.println("Frecuencia caridaca maxima: "+pm.calcularFreCardiacaMaxima());

        System.out.println("IMC: "+pm.calcularIMC());
        System.out.println("Tabla de IMC: ");
        System.out.println("VALORES DE IMC:\n Bajo peso: menos de 18.5 " +
                "Normal: entre 18.5 y 24.9 Sobrepeso: entre 25 y 29.9 Obeso: 30 o más");

    }


    public Factura crearFactura(){

        System.out.println("Ingrese los datos de la pieza: ");
        System.out.print("Numero de pieza: ");
        String numPieza = sc.next();

        System.out.print("Descripcion de la pieza: ");
        String descripcionPieza = sc.next();

        System.out.print("Cantidad producto: ");
        int cantidadProducto = sc.nextInt();

        System.out.println("Precio: ");
        double precio = sc.nextDouble();

        Factura fac = new Factura(numPieza, descripcionPieza, cantidadProducto, precio);

        return fac;
    }

    public void imprimirInfoFactura(Factura fac){
        System.out.println("---- Datos de la Factura ----");
        System.out.println("Numero de pieza: "+fac.getNumPieza());
        System.out.println("Descripcion de la Pieza: "+fac.getDescripcionPieza());
        System.out.println("Cantidad: "+fac.getCantidadProducto());
        System.out.println("Precio: "+fac.getPrecio());


    }

    //Metodo de menu

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("---- Menu Principal ----");
        System.out.println("Ingrese la opcion deseada: ");
        System.out.println("1) Imprimir Informacion del Paciente");
        System.out.println("2) Imprimir Informacion de la Factura");
        System.out.println("3) Salir");
        System.out.print(">>> ");
        opc = sc.nextInt();
        return opc;

    }

}
