public class AnalistaAdHoc extends Analista{
    private int horasTrab;
    
    public AnalistaAdHoc(String n, Servidor s, int ht){
        super(n,s);
        this.setHorasTrab(ht);
    }
    
    public void setHorasTrab(int ht){
        this.horasTrab = ht;
    }
    
    public int getHorasTrab(){
        return this.horasTrab;
    }
}
