package org.grupouribe;

import org.grupouribe.clases.Empleado;

public class Main {
    public static void main(String[] args) {
        //PARA USAR UNA CLASE
        //DEBO CREAR UN OBJETO DE LA CLASE


        Empleado objeto = new Empleado ();
        Heroe objeto2 = new Heroe();
       //USAR UNA CLASE ES ACCEDER A UN ATRIBUTO Y METODOS
        //ACCEDO A UN ATRIBUTO PARA ALMACENAR EN UNA MEMORIA
        System.out.println(objeto.nombre);

        //ACCEDER A UN METODO
        objeto.saludar();


    }
}