/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Control;
import java.io.IOException;

/**
 *
 * @author 56936
 */
public class Maiin {
    public static void main(String[] args) throws IOException {
        Control controlador = new Control();
        controlador.loadExamples();
        controlador.loadMenu();
}
}
