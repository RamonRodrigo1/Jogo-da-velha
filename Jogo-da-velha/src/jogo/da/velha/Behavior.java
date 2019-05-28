
package jogo.da.velha;

import java.util.Scanner;

/**
 *
 * @author Ramon Rodrigo
 */

public class Behavior {
    
    private int[][] gameBoard = new int [3][3];
    private boolean option = true;
    private boolean run = true;
    private int play1;
    private int play2;
    private String choice;
    
    public void game(){
        
        while(run){
            
            System.out.println("Bem-vindo ao Jogo da velha!");
            
            if(option){
                
                System.out.println("Jogador 1 escolha X ou O para começar.(Digite somenta x ou o)");
                
                Scanner sc = new Scanner(System.in);
                choice = sc.next();
                
                if("X".equals(choice) || "x".equals(choice)){
                    
                    play1 = 1;
                    play2 = -1;
                    option = false;
                    
                }
                if("O".equals(choice) || "o".equals(choice)){ 
                    
                    play1 = -1;
                    play2 = 1;
                    option = false;
                    
                }
            
            }
            
        
            
        }
    
    }
    
}
