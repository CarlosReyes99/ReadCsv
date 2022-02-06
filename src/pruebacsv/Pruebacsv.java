/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacsv;

/**
 *
 * @author MrX044
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
public class Pruebacsv {

    
    // muestra el cuadro de diálogo de archivos, para que el usuario pueda elegir el archivo a abrir
JFileChooser selectorArchivos = new JFileChooser();



// indica cual fue la accion de usuario sobre el jfilechooser


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException {
          //manda a llamar a clase clientes
         DatosClientes clientes = new DatosClientes();
         
         
         int opc=0;  
         
         //CON ESTO OBTENEMOS LA RUTA DEL ARCHIVO
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        String ruta = fileChooser.getSelectedFile().getAbsolutePath(); 
        
        //SE USA PARA PODER LEER Y TENER EN MEMORIA LOS DATOS
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        
        //FUNCION QUE LEE Y RECORRE EL CSV
    try {
        while((line = br.readLine()) != null){
           
            String values[]= line.split(";"); //COMO NO ME DABA CON COMA POR USO DE EXCEL, LO USÉ CON ;
           
           //ACÁ GUARDO LOS DATOS EN LA CLASE DE CLIENTES
           
            clientes.setIdCliente(values[0].toString().split(line)); //POSICION 0 ES DE ID
            clientes.setNombre(values[0].toString()); //POSICION 1 ES DE NOMBRE
            clientes.setEdad(values[0].toString()); //POSICION 2 ES DE EDAD
            clientes.setDir(values[0].toString()); //POSICION 3 ES DE DIRECCION
            clientes.setTel(values[0].toString()); //POSICION 4 ES DE TELEFONO
            clientes.setCel(values[0].toString()); //POSICION 5 ES DE CELULAR
            clientes.setSaldo(values[0].toString()); //POSICION 6 ES SALDO
            
            String datosclientes[]= clientes.getIdCliente();
            System.out.println("id cliente perra: " + datosclientes[0] +"\n\n\n");
             opc=opc+1;
           //System.out.println("[iD: \t"+ values[0]+"\tNombre: "+ values[1]+"\tEdad:"+ values[2]+"\tDireccion: "+ values[3]+"\t Numcel: "+ values[4]+"\t Telefono: "+ values[5]+"\tSaldo: "+ values[6]+"]");
           
           switch(opc){
                
               case 1: 
                   
           
           }
           
        
        }        
    } catch (IOException ex) {
        Logger.getLogger(Pruebacsv.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
       
                                             
            
        //FALTA POR HACER
        //CONVERTIR EN ARRAY LOS DATOS DE LA CLASE CLIENTES Y QUE LOS ACEPTE
        
    }//fin metodo main
    
    
}//fin clase main
