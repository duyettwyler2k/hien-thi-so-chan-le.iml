public class Main {
    public static void main(String[] args) {
        SoChan soChan=new SoChan();
        Thread t=new Thread(soChan);
        t.run();
        SoLe soLe=new SoLe();
        Thread t1=new Thread(soLe);
        t1.run();
    }




}
