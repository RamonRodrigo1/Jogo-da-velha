
package jogo.da.velha;

import java.util.Scanner;

public final class SelectPosition {
    
    private int[][] matrix;
    private int row;
    private int col;
    private Play play1;
    private Play play2;
    private boolean turn = true;

    public int[][] getMatrix() {
        return matrix;
    }
    
    public int getMatrixUnit(int row, int column) {
        return matrix[row][column];
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public void setMatrixUnit(int row, int column, int unit) {
        this.matrix[row][column] = unit;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Play getPlay1() {
        return play1;
    }

    public void setPlay1(Play play1) {
        this.play1 = play1;
    }

    public Play getPlay2() {
        return play2;
    }

    public void setPlay2(Play play2) {
        this.play2 = play2;
    } 

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }
    
    

    public SelectPosition(int[][] matrix, Play play1, Play play2) {
        this.setMatrix(matrix);
        this.setPlay1(play1);
        this.setPlay2(play2);
    }
    
    public void Turn(){
        
        if(this.turn){
            
            Choice(this.getPlay1());
            
        }else{

            Choice(this.getPlay2());

        }
        if(this.getMatrixUnit(this.getRow(), this.getCol()) == 0){
            
            if(turn){

            this.setMatrixUnit(this.getRow(), this.getCol(), play1.getChoice());
            this.setTurn(false);

            }else{

            this.setMatrixUnit(this.getRow(), this.getCol(), play2.getChoice());
            this.setTurn(true);

            }
            
        }else{
            
            System.out.println("Posicão já esta ocupada.");
            
        }
        
        
    }
    
    private void Choice(Play play){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(play.getNome()+" escolha sua posição.");

            System.out.println("Coluna:");
            this.setCol(scanner.nextInt() - 1);

            System.out.println("Linha:");
            this.setRow(scanner.nextInt() - 1);
        
    }
    
}
