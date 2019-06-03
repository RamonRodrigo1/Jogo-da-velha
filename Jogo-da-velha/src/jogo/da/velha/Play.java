
package jogo.da.velha;

public final class Play {
    
    private String nome;
    private int choice;
    private int win;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }
    
    public Play(String nome){
        
        this.setNome(nome);
        
    }
    
}
