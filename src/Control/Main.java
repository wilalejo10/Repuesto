package Control;

import Modelo.Empresa;
import Vista.InOut;

public class Main
{
    public static void main(String [] args){
        Empresa Em= new Empresa();
        InOut ob=new InOut();
        int opcion=0;

        do{
            try{
                opcion=ob.solicitarEnteros("""
                                         1.-Comprar repuestos
                                         2.-Mostrar el repuesto más vendido
                                         3.-Mostrar el total recaudado
                                         4.-SALIR
                                         INGRESE SU OPCION""");
                switch(opcion){
                    case 1 -> {
                        Em.registrarRepuestos();
                    }
                    case 2 -> {

                    }
                    case 3-> {
                        Em.mostrarInformacionCompras();
                    }
                }
            }catch(NumberFormatException e){
                ob.mensaje("Error");
            }
        }while(opcion != 4);

    }
}