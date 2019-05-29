
package jogo.da.velha;

import java.util.Scanner;

/**
 *
 * @author Ramon Rodrigo
 */

public class Behavior {
    
    private int[][] gameBoard = new int [3][3];
    private boolean play = true;
    private boolean option = true;
    private boolean run = true;
    private boolean turn= true;
    private int col;
    private int row;
    private int play1;
    private int play2;
    private String choice;
    
    public void game(){
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < gameBoard.length; i++){
                    
            for(int j = 0; j < gameBoard[0].length; j++){
                        
                gameBoard[i][j] = 0;
                        
            }
                
        }
        
        System.out.println("Bem-vindo ao Jogo da velha!");
        
        while(run){
            
            if(option){
                
                System.out.println("Jogador 1 escolha X ou O para começar.(Digite somenta x ou o)");
                
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
            
            if(!option){
            
                if(play){

                    System.out.println("Jogo da Velha:");

                    for(int i = 0; i < gameBoard.length; i++){

                        for(int j = 0; j < gameBoard[0].length; j++){

                            if(gameBoard[i][j] == 1){

                                System.out.print("X");

                            }if(gameBoard[i][j] == -1){

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

                    System.out.println("DICA: Posição de tabuleiro.\n" +
                                        "\n" +
                                        " 1 2 3\n" +
                                        "1X| |    11 x\n" +
                                        "_______\n" +
                                        "2 |O|    22 o\n" +
                                        "_______\n" +
                                        "3 |x|    23 x");

                    if(turn){

                        System.out.println("Jogador 1 escolha sua posição.");

                        System.out.println("Coluna:");
                        col = sc.nextInt() - 1;

                        System.out.println("Linha:");
                        row = sc.nextInt() - 1;
                    }else{

                        System.out.println("Jogador 2 escolha sua posição.");

                        System.out.println("Coluna:");
                        col = sc.nextInt() - 1;

                        System.out.println("Linha:");
                        row = sc.nextInt() - 1;

                    }

                    if(turn){

                        gameBoard[row][col] = play1;
                        turn = false;

                    }else{

                        gameBoard[row][col] = play2;
                        turn = true;

                    }
                }    
                //run = false;
            }
            
        }
    
    }
    
}
