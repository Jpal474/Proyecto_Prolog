/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prologsoftware;

import org.jpl7.Query;



public class PrologSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                     
        
            String conexion = "consult('DatosProlog.pl')";
            Query ql = new Query(conexion);
            System.out.println(conexion + "" + (ql.hasMoreSolutions()?"Conexión exitosa":"Conexión fallida"));
            
            Interfaz interfaz = new Interfaz();
            interfaz.setVisible(true);
    }
    
}
