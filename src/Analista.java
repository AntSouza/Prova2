public class Analista extends Servidor{
    private Servidor chefeImediato;
    
    public Analista(String n, Servidor s){
        super(n);
        this.setChefeImediato(s);        
    }
    
    public void setChefeImediato(Servidor s){
        this.chefeImediato = s;        
    }
    public Servidor getChefeImediato(){
        return this.chefeImediato;
    }
}
