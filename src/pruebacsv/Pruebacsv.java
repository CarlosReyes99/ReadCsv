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
import java.util.Arrays;
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
     //variable que suma todos los saldos
    static int saldosuma = 0;
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
           
            clientes.setIdCliente(values[0].split(line)); //POSICION 0 ES DE ID
            clientes.setNombre(values[1].split(line)); //POSICION 1 ES DE NOMBRE
            clientes.setEdad(values[2].split(line)); //POSICION 2 ES DE EDAD
            clientes.setDir(values[3].split(line)); //POSICION 3 ES DE DIRECCION
            clientes.setTel(values[4].split(line)); //POSICION 4 ES DE TELEFONO
            clientes.setCel(values[5].split(line)); //POSICION 5 ES DE CELULAR
            clientes.setSaldo(values[6].split(line)); //POSICION 6 ES SALDO
            
            String datosclientes[]= clientes.getIdCliente();
            String saldototal[]= clientes.getSaldo();
            
            for(int i=saldototal[0].length(); i<=saldototal[0].length(); i++ ){
                 saldosuma= saldosuma+Integer.parseInt(saldototal[0]);
            }
           
            System.out.println("Saldo total:"+saldosuma+ "\n\n\n");
            System.out.println("id cliente: " + datosclientes[0] +"\tNombre cliente: "+ Arrays.toString(clientes.getNombre())+"Edad de cliente: " + clientes.getEdad()+"Direccion: " + clientes.getDir()+"Telefono: " + clientes.getTel()+"Celular: " + clientes.getCel()+"Saldo: " + saldototal[0]);
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
