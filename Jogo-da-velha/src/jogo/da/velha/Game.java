
package jogo.da.velha;

import java.util.Scanner;

public class Game {
    
    private boolean run;
    private boolean option;
    private String choice;
    private int[][] matrix;

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public boolean isOption() {
        return option;
    }

    public void setOption(boolean option) {
        this.option = option;
    }
    
    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Game(int size) {
        
        this.setMatrix(new int[size][size]);
        
    }
    
    

    public void Run() {
        
        this.setOption(true);
        this.setRun(true);
        
        Scanner scanner = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard(this.getMatrix());
        Play play1 = new Play("Jogador 1");
        Play play2 = new Play("Jogador 2");
        SelectPosition selecPosition = new SelectPosition(this.getMatrix(), play1, play2);
        Verification verification = new Verification(this.getMatrix(), play1, play2);
                
        System.out.println("Bem-vindo ao Jogo da velha!");
        
        System.out.println("DICA: Posição de tabuleiro.\n" +
                                "   C O L U M A\n" +
                                "L     X| | \n" +
                                "I    -------\n" +
                                "N      |O|\n" +
                                "H    -------\n" +
                                "A      | |X");
        
        while(this.isOption()){

            System.out.println("Jogador 1 escolha X ou O para começar.(Digite somenta x ou o)");

            this.setChoice(scanner.next()); 

            if("X".equals(this.getChoice()) || "x".equals(this.getChoice())){
                
                play1.setChoice(1);
                play2.setChoice(-1);
                
                this.setOption(false);

            }
            if("O".equals(this.getChoice()) || "o".equals(this.getChoice())){

                play1.setChoice(-1);
                play2.setChoice(1);
                
                this.setOption(false);

            }
            
        }
        while(this.isRun()){
            
            gameBoard.Show();
            
            selecPosition.Turn();
            
            verification.Win();
            
            if(verification.WinValidation()){
                
                gameBoard.Show();
                
                System.out.println("O vencedor é o "+ verification.Winner() +":");
                this.setRun(false);
            }
            
        } 
        
    }
    
}
