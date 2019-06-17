/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dingetje;

/**
 *
 * @author adeliae
 */
public class Dingetje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println("Dit is een expressie.");
        
        int result = 1;
        
        result *= 3;
        result = result / 4;
        
        /*for(int i = 0; i < 5; i += 1){
            result = result * i;   
        }
        
        System.out.println("Het resultaat is: " + result); */
        
        //drawSquare(5);
        ayyLmaoo(1);
        
        //PC is regel v/d code dat uitgevoerd wordt
        //als hij op een regel staat moet hij het nog uitvoeren (!)
    }
    
    public static void drawSquare(int size){
        for(int line = size; line > 0; line--){
            for(int column = size; column > 0; column--){
                System.out.print("X "); 
                if(line == 2 && column == 2){
                    System.out.print("O ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void drawSquare2(int size, int oLineNumber, int oColumNumber){
        for(int line = size; line > 0; line--){
            for(int column = size; column > 0; column--){
                System.out.print("X "); 
                if(line == 2 && column == 2){
                    System.out.print("O ");
                } else{
                    System.out.print("X ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void ayyLmaoo(int size){
        System.out.print("X ");
        System.out.print("X ");
        System.out.print("X ");
        System.out.print("X ");
        System.out.println();
        
        System.out.print("X ");
        System.out.print("X ");
        System.out.print("X ");
        System.out.print("X ");
        System.out.println();
        
        System.out.print("X ");
        System.out.print("X ");
        System.out.print("X ");
        System.out.print("X ");
        System.out.println();
        
        System.out.print("X ");
        System.out.print("X ");
        System.out.print("X ");
        System.out.print("X ");
        System.out.println();
    }   
}
