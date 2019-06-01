/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.velha;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usúario
 */
public class Game {
    
    private boolean run;
    private boolean option;
    private boolean turn;
    private String choice;
    private int[][] matrix;
    private int row;
    private int col;

    public Game() {
        
        option = true;
        run = true;
        turn = true;
        matrix = new int[3][3];
        
        Scanner scanner = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard(matrix);
        Play play1 = new Play("Jogador 1");
        Play play2 = new Play("Jogador 2");
        Verification verification = new Verification(matrix, play1, play2);
                
        System.out.println("Bem-vindo ao Jogo da velha!");
        
        while(option){
            
            System.out.println("DICA: Posição de tabuleiro.\n" +
                                "   C O L U M A\n" +
                                "L     X| | \n" +
                                "I    -------\n" +
                                "N      |O|\n" +
                                "H    -------\n" +
                                "A      | |X");

            System.out.println("Jogador 1 escolha X ou O para começar.(Digite somenta x ou o)");

            choice = scanner.next();

            if("X".equals(choice) || "x".equals(choice)){
                
                play1.setChoice(1);
                play2.setChoice(-1);
                
                option = false;

            }
            if("O".equals(choice) || "o".equals(choice)){

                play1.setChoice(-1);
                play2.setChoice(1);
                option = false;

            }
            
        }
        while(run){
            
            gameBoard.Show();
            
            if(turn){

                System.out.println(play1.getNome()+" escolha sua posição.");

                System.out.println("Coluna:");
                col = scanner.nextInt() - 1;

                System.out.println("Linha:");
                row = scanner.nextInt() - 1;
            }else{

                System.out.println(play2.getNome()+" escolha sua posição.");

                System.out.println("Coluna:");
                col = scanner.nextInt() - 1;

                System.out.println("Linha:");
                row = scanner.nextInt() - 1;

            }
            
            if(turn){

                matrix[row][col] = play1.getChoice();
                turn = false;

            }else{

                matrix[row][col] = play2.getChoice();
                turn = true;

            }
            //System.out.println(Arrays.deepToString(matrix));
            verification.Win();
            //System.out.println(verification.Winner());
            
            if(verification.WinValidation()){
                
                gameBoard.Show();
                
                System.out.println("O vencedor é o "+ verification.Winner() +":");
                run = false;
            }
            
        } 
        
    }
    
}
