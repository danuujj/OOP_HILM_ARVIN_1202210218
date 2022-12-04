public class Handphone extends Perangkat{
    protected boolean fingerprint;


    public Handphone(String drive, int ram, Double processor, boolean fingerprint ){
        super(drive, ram, processor);
        this.fingerprint=fingerprint;
    }

    

    @Override
    public void info(){
        if (fingerprint ==true) {
            System.out.println("Fingerprint = Ya");
        }
        else{
            System.out.println("Fingerprint = Ya");
        }
        System.out.println("Driver : " +drive+"\\ RAM "+ram+" GB \\ Processor "+processor);
    }
    
    public void telepon(String nomor_handphone){
        System.out.println("Handphone berhasil menyambungkan telepon ke nomor "+nomor_handphone);
    }
    public void sms(String nomor_handphone){
        System.out.println("Handphone berhasil mengirim SMS ke nomor "+nomor_handphone);
    }
    public void sms(String nomor_handphone1, String nomor_handphone2){
        System.out.println("Handphone berhasil mengirim SMS ke nomor "+nomor_handphone1+" dan nomor "+nomor_handphone2);
    }

}
