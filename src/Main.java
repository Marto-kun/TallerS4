
public class Main {
    public static void main(String[] args) {
        int opc;
        Sistema sis = new Sistema();
        System.out.println("Crear el perfil medico del paciente: ");
        PerfilMedico pm1 = sis.crearPerfilMedico();

        System.out.println("Crear la factura: ");
        Factura fac = sis.crearFactura();

        opc = Sistema.menu();

        switch (opc){
            case 1:
                //Imprimir Info Vehiculo
                sis.imprimirInfoMedico(v1);
                break;

            case 2:
                //Actualizar Info Vehiculo
                sis.imp(v1);
                break;

            case 3:
                //Imprimir la aceleracion del vehiculo
                sis.imprimirAceleracion(v1);
                break;

            case 4:
                //Imprimir la edad del dueño
                sis.imprirEdadDuenio(v1);
                break;
        }




    }
}