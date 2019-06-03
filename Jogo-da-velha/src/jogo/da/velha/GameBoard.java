
package jogo.da.velha;

public final class GameBoard {
    
    private int[][] matrixInt;
    private String[][] matrixString;

    public int[][] getMatrixInt() {
        return matrixInt;
    }

    public void setMatrixInt(int[][] matrixInt) {
        this.matrixInt = matrixInt;
    }

    public String[][] getMatrixString() {
        return matrixString;
    }

    public void setMatrixString(String[][] matrixString) {
        this.matrixString = matrixString;
    }
    
    public GameBoard(int[][] matrixInt) {
        
        this.setMatrixInt(matrixInt);
        this.setMatrixString(new String[this.getMatrixInt().length][this.getMatrixInt()[0].length]);
        
    }
    
    private void Converter(){
        
        for(int i = 0; i <this.getMatrixInt().length; i++){

            for(int j = 0; j < this.getMatrixInt()[0].length; j++){
                
                switch(this.getMatrixInt()[i][j]){
                    
                    case 1:
                        this.matrixString[i][j] = "X";
                        break;
                    case -1:
                        this.matrixString[i][j] = "O";
                        break;
                    case 0:
                        this.matrixString[i][j] = " ";
                        break;
                
                }
                
            }
            
        }
        
    }
    
    public void Show(){
        
        Converter();
        
        for(int i = 0; i <this.getMatrixString().length; i++){
            
            if(i != 0){
                
                System.out.println("");
                
            for(int x = 0; x < ((2 * this.getMatrixString()[0].length) - 1); x++){
                    
                    System.out.print("-");
                    
                }
                
                System.out.println("");
                
            }
            
            for(int j = 0; j < this.getMatrixString()[0].length; j++){
                
                System.out.print(this.getMatrixString()[i][j]);
                
                if(j < (this.getMatrixString()[0].length - 1)){
                    
                    System.out.print("|");
                    
                }
                
            }
            
        }
        
        System.out.println("\n\n----------------------------");
        
        
    }
    
}
    
