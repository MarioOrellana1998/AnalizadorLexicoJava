/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.io.File;

/**
 *
 * @author mario
 */
public class Principal {
    
    public static void main(String[] args) {
        
      // Direccion en la cual se encuentran las reglas del analizador lexico  
        String ruta = "C:/Users/mario/Documents/NetBeansProjects/analizadorLexicoGrupal/src/codigo/Lexer.flex";
      //Genera el código necesario para el analizador léxico, tomando en consideración las reglas presentes en el archivo Lexer.flex, esto es 
      //realizado de manera automática por la librería JFlex.
        generarLexer(ruta);
    }
    
    //Método que recibe la ruta en las cual están contenidas las reglas del analizador léxico y genera un archivo con todo el proceso
    //necesario para el análisis léxico de una cadena de caracteres 
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
    
    
}
