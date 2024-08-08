public class SmartTv {
        boolean ligada = false;
        int volume = 25;
        int canal = 1;

        public void ligarTv(){
            ligada = true;
    }

    public void abaixarVolume(){
            volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarVolume(){
            volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
            canal = novoCanal;
    }

    public void aumentarCanal(){
            canal++;
        System.out.println("Você mudou o canal para: " + canal);
    }

    public void diminuirCanal(){
            canal--;
        System.out.println("Você mudou o canal para: " + canal);
    }
}
