public class Main {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);

        System.out.println( "A televisão está ligada? " + smartTv.ligada);
        System.out.println("O canal da Tv é o: " + smartTv.canal);
        System.out.println("O volume está no: " + smartTv.volume);

    }
}