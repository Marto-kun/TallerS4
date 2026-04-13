import java.time.LocalDate;

public class PerfilMedico {

    private String nombre;
    private String apellido;
    private int sexo;      //(M)asculino o (F)emenino
    private int anio;
    private int mes;
    private int dia;
    private double altura;   //En centimetros
    private double peso;  //En kilogramos


    /*
    Constuctor:
     */
    public PerfilMedico(String nombre, String apellido, int sexo,
                        int anio, int mes, int dia, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.altura = altura;
        this.peso = peso;
    }


    public int calcularEdad(){

        LocalDate fechaAct = LocalDate.now();       //Fecha actual obtenida desde el sistema

        int anioAc = fechaAct.getYear() * 365;         //En dias
        int mesAc = fechaAct.getMonthValue() * 30;     //En dias
        int diaAc = fechaAct.getDayOfMonth();

        //Fechas en dias
        int fechaUsrDias = this.anio * 365 + this.mes * 30 + this.dia;
        int fechaActDias = anioAc + mesAc + diaAc;

        //Calculo de edad en dias
        int edadEnDias = fechaActDias - fechaUsrDias;

        //Calculo en años
        int edadAnios = edadEnDias / 365;

        return edadAnios;
    }

    public int calcularFreCardiacaMaxima(){

        int edad = calcularEdad();      //Llamada al metodo de calcular edad

        int frecuenciaMax = 220 - edad;

        return frecuenciaMax;
    }

    public String calcularFreCardiacaEsperada(){

        int freMax = calcularFreCardiacaMaxima();           //Llamada al metodo de frecuencia cardiaca maxima
        double freEspMin = freMax * 0.5;
        double freEspMax = freMax * 0.85;

        String rango = "Rango: \nFrecuencia Minima: " + freEspMin + "\nFrecuencia Maxima: " + freEspMax;   //Cadena que muestra el rango de valores
                                                                                                            // de frecuencias recomendadas

        return rango;
    }

    public double calcularIMC(){

        double alturaMetros = altura / 100;

        double imc = peso / (Math.pow(alturaMetros, 2));     //Formula de IMC con clase Math

        return imc;
    }

    /*
    Getters y Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
