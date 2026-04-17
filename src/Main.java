
public class Main {
    public static void main(String[] args) {
        int opc;
        Sistema sis = new Sistema();
        System.out.println("Crear el perfil medico del paciente: ");
        PerfilMedico pm1 = sis.crearPerfilMedico();

        System.out.println("Crear la factura: ");
        Factura fac = sis.crearFactura();

        do {
            opc = Sistema.menu();

            switch (opc) {
                case 1:
                    //Imprimir Info Perfil Medico
                    sis.imprimirInfoMedico(pm1);
                    break;

                case 2:
                    //Edad del paciente
                    sis.imprimirEdad(pm1);
                    break;

                case 3:
                    //Frecuencia Maxima
                    sis.imprimirFrecuenciaCardiaca(pm1);
                    break;

                case 4:
                    //IMC
                    sis.imprimirIMC(pm1);
                    break;

                case 5:
                    sis.mostrarDatosFactura(fac);
                    break;

                case 6:
                    //Salir
                    System.out.println("Gracias por usar nuestro sistema... Saliendo.");
                    break;

                default:
                    //Opcion Invalida
                    System.out.println("Opcion inválida, intentalo otra vez...");

                    break;
            }
        } while (opc != 6);


    }
}