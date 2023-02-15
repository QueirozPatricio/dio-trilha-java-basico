public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();

        System.out.println("TV ligada? " + smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smarTv.ligada);

        smarTv.baixarVolume();
        smarTv.baixarVolume();
        smarTv.baixarVolume();

        smarTv.aumentarVolume();
        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.mudarCanal(13);
        System.out.println("Canal atual: "  + smarTv.canal);
    }
}
