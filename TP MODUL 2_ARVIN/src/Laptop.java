public class Laptop extends Perangkat{
    protected boolean webcam;


    public Laptop(String drive, int ram, double d, boolean webcam ){
        super(drive, ram, d);
        this.webcam=webcam;
    }

    @Override
    public void info(){
        if (webcam ==true) {
            System.out.println("Webcam = Ya");
        }
        else{
            System.out.println("Webcam = Ya");
        }
        System.out.println("Driver : "+drive+"\\ RAM "+ram+" GB \\ Processor "+processor);
    }
    
    public void game(String gamename){
        System.out.println("Laptop berhasil membuka game "+gamename);
    }
    public void email(String email){
        System.out.println("Laptop berhasil mengirim email ke "+email);
    }
    public void email(String email1, String email2){
        System.out.println("Laptop berhasil mengirim email "+email1+" dan "+email2);
    }

}

    

