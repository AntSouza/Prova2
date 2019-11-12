public class Servidor {
    private String  nome;
    
    public Servidor(String n){
        this.setNome(n);
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
}
