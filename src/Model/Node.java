/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Misael Godoi Flores
 */
public class Node {
    public int iData;              // data item (key)

  public Node leftChild;         
   public Node rightChild;        
    public String significado;
    public String clasificacion;
    
    public void displayNode()      // display ourself
      {
      System.out.print('{');
      System.out.print(iData);
      System.out.print(", ");
    
      System.out.print(significado);
      System.out.print(",");
      System.out.print(clasificacion);
      System.out.print(" } ");
      
      
      }
}
