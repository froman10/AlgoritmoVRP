/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skorp
 */
public class Basura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmoVRP vrp =  new AlgoritmoVRP(30, "papel.txt");
        vrp =  new AlgoritmoVRP(30, "plastico.txt");
        vrp = new AlgoritmoVRP(30, "metal.txt");
        vrp = new AlgoritmoVRP(50, "organico.txt");
        vrp = new AlgoritmoVRP(30, "vidrio.txt");
    }
    
}
