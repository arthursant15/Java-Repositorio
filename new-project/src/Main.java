public class Main {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(13);
        smartTv.ligarTv();
        smartTv.abaixarVolume();

        System.out.println("A televisão está ligada? " + smartTv.ligada);
        System.out.println("O volume está em: " + smartTv.volume);
        System.out.println("O seu canal está em: " + smartTv.canal);

    }
}