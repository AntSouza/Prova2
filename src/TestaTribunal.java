public class TestaTribunal {
    public static void main(String[] args){
        Servidor chefe = new Servidor("Red");
        AnalistaTI ti_1 = new AnalistaTI("Black", chefe, "K002");
        AnalistaJuridico jur_1 = new AnalistaJuridico("White", chefe, "xyz");
        AnalistaAdHoc adhoc_1 = new AnalistaAdHoc("Blue", chefe, 150);
        Assistente as_1 = new Assistente("Yellow", "RH");        
    }
}
