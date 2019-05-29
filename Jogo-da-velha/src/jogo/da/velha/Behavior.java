
package jogo.da.velha;

import java.util.Scanner;

/**
 *
 * @author Ramon Rodrigo
 */

public class Behavior {
    
    private int[][] resultBoard = new int [3][3];
    private boolean play = true;
    private boolean option = true;
    private boolean run = true;
    private boolean turn= true;
    private int play1;
    private int play2;
    private String choice;
    
    public void game(){
        
        for(int i = 0; i < resultBoard.length; i++){
                    
            for(int j = 0; j < resultBoard[0].length; j++){
                        
                resultBoard[i][j] = 0;
                        
            }
                
        }
        
        while(run){
            
            if(option){
                
                System.out.println("Bem-vindo ao Jogo da velha!");
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
            
            if(play){
                
                System.out.println("Jogo da Velha:");
                
                for(int i = 0; i < resultBoard.length; i++){
                    
                    for(int j = 0; j < resultBoard[0].length; j++){
                        
                        if(resultBoard[i][j] == 1){
                            
                            System.out.print("X");
                        
                        }if(resultBoard[i][j] == -1){
                            
                            System.out.print("O");
                        
                        }else{
                            
                            System.out.print(" ");
                            
                        }
                        
                        if(j == 0 || j == 1){
                            
                            System.out.print("|");
                        
                        }else{
                            
                            System.out.println("");
                            if(i == 0 ||i == 1){
                            
                            System.out.println("_____");
                        
                           }
                            
                        }
                       
                    }
                
                }
                
                if(turn){
                    
                    System.out.println("Jogador 1 escolha sua posição.(linhas 1,2,3 colunas A,B,C)");
                    
                }
                
                run = false;
            }
            
        }
    
    }
    
}
