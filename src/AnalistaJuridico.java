public class AnalistaJuridico extends Analista{
    private String especialidade;
    
    public AnalistaJuridico(String n, Servidor s, String e){
        super(n,s);
        this.setEspecialidade(e);
    }
    
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }
    
}
