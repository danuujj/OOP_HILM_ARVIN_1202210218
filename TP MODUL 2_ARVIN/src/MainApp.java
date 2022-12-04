public class MainApp {
    
    public static void main(String[] args) throws Exception {
        Perangkat perangkat_ = new Perangkat("Asus ", 16, 3.00);
        perangkat_.info();
        System.out.println("=======================================");
        Laptop laptop_ = new Laptop("Asus TUF Gaming 15 ", 16, 5.60, true);
        laptop_.info();
        laptop_.game("Mafia Definitive Edition");
        laptop_.email("danujiwo075@gmail.com");
        laptop_.email("danujiwo075@gmail.com", "anakinskywalker@gmail.com");
        System.out.println("=======================================");
        Handphone handphone_ = new Handphone("Poco X3 GT ", 8, 5.60, true);
        handphone_.info();
        handphone_.telepon("081234567891");
        handphone_.sms("089876543210");
        handphone_.sms("081234567891", "089876543210");
        System.out.println("=======================================");;
}
}
