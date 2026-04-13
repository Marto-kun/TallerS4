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

    public Factura crearFactura(){

        System.out.println("Ingrese los datos del paciente: ");
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


}
