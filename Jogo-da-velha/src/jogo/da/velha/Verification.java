
package jogo.da.velha;

public final class Verification {
    
    private int[][] matrix;
    private int add;
    private Play play1;
    private Play play2;
    private String nameWinner;
    private boolean validation;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
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

    public String getNameWinner() {
        return nameWinner;
    }

    public void setNameWinner(String nameWinner) {
        this.nameWinner = nameWinner;
    }

    public boolean isValidation() {
        return validation;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }
    
    public Verification(int[][] matrix, Play play1, Play play2) {
        
        this.matrix = matrix;
        this.setPlay1(play1);
        this.setPlay2(play2);
        
    }
    
    public void Win(){
        
        this.setValidation(false);
        this.VerificationHorizontal();
        this.VerificationVertical();
        this.VerificationTransversal();
        
    }
    
    public String Winner(){
        
        return this.getNameWinner();
    
    }
    
    public boolean WinValidation(){
        
        return this.isValidation();
        
    }
    
    private void VerificationHorizontal(){
        
        for(int i = 0; i <this.getMatrix().length; i++){
            
            if(this.add == this.getPlay1().getChoice() * this.getMatrix().length){
                
                this.setNameWinner(this.getPlay1().getNome());
                this.setValidation(true);
                
            }
            if(this.add == this.getPlay2().getChoice() * this.getMatrix().length){
                
                this.setNameWinner(this.getPlay2().getNome());
                this.setValidation(true);
                   
            }
            
            this.setAdd(0);

            for(int j = 0; j < this.getMatrix()[0].length; j++){
                
                this.add += this.getMatrix()[i][j];
                //System.out.println(this.add);
                
            }
            
        }
        
    }
    
    private void VerificationVertical(){
        
        for(int i = 0; i <this.getMatrix()[0].length; i++){
            
            if(this.add == this.getPlay1().getChoice() * this.getMatrix()[0].length){
                
                this.setNameWinner(this.getPlay1().getNome());
                this.setValidation(true);
                
            }
            if(this.add == this.getPlay2().getChoice() * this.getMatrix()[0].length){
                
                this.setNameWinner(this.getPlay2().getNome());
                this.setValidation(true);
                   
            }
            
            this.setAdd(0);

            for(int j = 0; j < this.getMatrix().length; j++){
                
                this.add += this.getMatrix()[j][i];
                //System.out.println(this.add);
                
            }
            
        }
        
    }
    
    private void VerificationTransversal(){
        
        for(int i = 0; i < 2; i++){
            
            this.setAdd(0);

            for(int j = 0; j < this.getMatrix().length; j++){
                
                if(0 == i){
                    
                    this.add += this.getMatrix()[j][j];
                    
                } else {
                    
                    this.add += this.getMatrix()[j][(this.getMatrix().length - 1) - j];
                    
                }
                
            }
            
            if(this.add == this.getPlay1().getChoice() * this.getMatrix()[0].length){
                
                this.setNameWinner(this.getPlay1().getNome());
                this.setValidation(true);
                
            }
            if(this.add == this.getPlay2().getChoice() * this.getMatrix()[0].length){
                
                this.setNameWinner(this.getPlay2().getNome());
                this.setValidation(true);
                   
            }
            
        }
    
    }
    
}
