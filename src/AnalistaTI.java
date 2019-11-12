public class AnalistaTI extends Analista{
    private String codAut;
    
    public AnalistaTI(String n, Servidor s, String ca){
        super(n,s);
        this.setCodAut(ca);
    }
    public void setCodAut(String ca){
        this.codAut = ca;
    }
    public String getCodAut(){
        return this.codAut;
    }
}
