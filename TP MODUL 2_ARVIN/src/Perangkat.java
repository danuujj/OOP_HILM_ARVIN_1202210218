public class Perangkat {
    protected String drive;
    protected int ram;
    protected Double processor;

    public Perangkat(String drive, int ram, Double processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;

    }

    public void info(){
        System.out.println("Perangkat tidak mengenali driver tipe"+drive+"dengan RAM"+ram+"GB dan processor "+processor);
    }


}