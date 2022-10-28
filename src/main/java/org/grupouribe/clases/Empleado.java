package org.grupouribe.clases;

public class Empleado {
    //VARIABLES
    //FUERTES TIPADAS

    //ATRIBUTOS(VARIABLES)
    public String id;
    public String nombre;
    String apellido;
    String email;
    String direccion;
    String telefono;
    String documento;

    char tipoAfiliciacionCajaCompensacion;

    byte edad;
    byte numeroHijos;
    float salario;
    short numeroBeneficiarios;
    double cuotaFondoEmpleado;
    double deduccionGimnasio;
    double deduccionPrestamoVivienda;
    double demandaAlimentos;
    double deduccionSalud;
    double deduccionPension;
    double deduccionCajaCompensacion;
    double auxilioSubsidioCajaCompensacion;
    double subsidioTransporte;
    double dotacion;
    double auxilioEscolar;

    //CONSTRUCTOR
    public Empleado() {

    }



    public  void saludar(){
    System.out.println("ISHHHH");
    }

}
