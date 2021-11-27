/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Node;

/**
 *
 * @author Misael Godoi Flores
 */
public class Control {
        private Tree theTree;
    private int value;
    private String palabra;
    private String significado;
    private String clasificacion;

    public Control() throws IOException{
        theTree = new Tree();
    }
// -------------------------------------------------------------
    public static String getString() throws IOException {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
// -------------------------------------------------------------
    public static char getChar() throws IOException {
      String s = getString();
      return s.charAt(0);
      }
//-------------------------------------------------------------
    public static int getInt() throws IOException {
      String s = getString();
      return Integer.parseInt(s);
      }
// -------------------------------------------------------------
    public void loadExamples() {
      theTree.insert("Comer","ingerir alimentos","Verbo");
      theTree.insert("Abril","mes del año", "Sustantivo");
      theTree.insert("correr","avanzar de forma rapida", "Verbo");
      theTree.insert("Nadar","avanzar en el agua con el movimiento de las manos ","Verbo");
      theTree.insert("Disco","forma circular plana","Sustantivo");
      theTree.insert("Hervir","ebullir un liquido","Verbo");
      theTree.insert(" Volar","desplazarse por el aire ya sea con alas propias o artificiales ","Verbo");
      theTree.insert("Saturno","Planeta","Sustantivo");
      theTree.insert("Marzo","mes del año","Sustantivo");
      theTree.insert("Lunes","dia de la ","Sustantivo");
      
     
      
     

   }
// -------------------------------------------------------------
    public void loadMenu() throws IOException{
        while(true)
         {
         System.out.print("Enter first letter of show, ");
         System.out.print("insert, find, delete, or traverse: ");
         int choice = getChar();
         switch(choice)
            {
            case 's':
               theTree.displayTree();
               break;
            case 'i':
               System.out.print("Enter word to insert: ");
               palabra = getString();
               System.out.print("Enter word meaning to insert: ");
               significado = getString();
               System.out.print("Enter word clasification to insert: ");
               clasificacion = getString();
               theTree.insert(palabra, significado,clasificacion);
               break;
            case 'f':
               System.out.print("Enter value to find: ");
               palabra = getString();
               Node found = theTree.find(palabra);
               if(found != null)
                  {
                  System.out.print("Found: ");
                  found.displayNode();
                  System.out.print("\n");
                  }
               else
                  System.out.print("Could not find ");
                  System.out.print(palabra + '\n');
               break;
            case 'd':
               System.out.print("Enter value to delete: ");
               palabra = getString();
               boolean didDelete = theTree.delete(palabra);
               if(didDelete)
                  System.out.print("Deleted " + palabra + '\n');
               else
                  System.out.print("Could not delete ");
                  System.out.print(palabra + '\n');
               break;
            case 't':
               System.out.print("Enter type 1, 2 or 3: ");
               value = getInt();
               theTree.traverse(value);
               break;
            default:
               System.out.print("Invalid entry\n");
            }  
         }  
}
    
}
