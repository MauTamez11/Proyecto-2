import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Unidad2 {
public static void lee(String path){
    ArrayList<String>lista = new ArrayList<String>();
}
    
         public static ArrayList<String> leerArchivo() {
             ArrayList<String> tokens = new ArrayList<>();
        try{
          FileReader fr= new FileReader("C:\\Users\\Respaldo\\Desktop\\proyecto2.txt");
            BufferedReader br= new BufferedReader(fr);
          String linea;
          String token;
          
          while ((linea = br.readLine())!= null){
              StringTokenizer st = new StringTokenizer(linea,":/./?/",true);
              while(st.hasMoreTokens());{
              token = st.nextToken();
              tokens.add(token);
              System.out.println(token);
          }
        }
        }catch(FileNotFoundException e){
            
        } catch (IOException ex) {
           System.out.println("Error en la apertura del archivo" + ex.toString());
        }
        return (tokens);
       
    }
         public static boolean isoperador(String operador,String[] Operador){
        for(int i=0;i<6;i++){
            if(Operador[i].equals(operador)){
                return true;
            }
        }
        
        return false;
        
    }
    
    public static boolean ispuntuacion(String punt,String[] signosDePuntuacion){
        for(int i=0;i<7;i++){
            if(signosDePuntuacion[i].equals(punt)){
                return true;
            }
        }
        
        return false;
    }
     public void cuadruplor (String not_pref){
        int i=0;
        char  item1, item2, operador;
        String[] operando = {"+","-","*","/"};
        while (i<= not_pref.length()) {
            item1 = not_pref.charAt(i);
            for(int j=0;i<4;i++){
            if(operando[i].equals(item1)){
                operador = item1;
                item2 = not_pref.charAt(i+1);
            }
            
        }
       }
     }      
      public static boolean isNumero(String numero){
        double num;
         try{
             num = Double.parseDouble(numero);
         }
         catch(Exception e){
             return(false);
         }
             return(true);
    }
    
     
       public static void main(String[] args){
           String[] operadores = {"+","-","*","/"};
           String[] signopuntacion = {":",".",";","´"};
           String[] palabrasreservadas = {"if","while","double","for","private","main","int","float","String"};
           String[][] identificadores = {{"01","operador"},
                                        {"02","reservadas"},
                                        {"03","numero"},
                                        {"04","espacio en blanco"},
                                        {"05","identificador"},
                                        {"06","puntuacion"}};
           ArrayList<String>Regreso=new ArrayList<>();
           Regreso = leerArchivo();
       }
}