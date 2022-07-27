public class Carro {

    public Motor motor = new Motor();
    public boolean andando = false;

    public NivelCombustivel nivelCombustivel = new NivelCombustivel();

    public Combustivel combustivel = new Combustivel();
    private static Carro Intancia;

    public static void main(String[] args) {

        new Carro().dirigir();

    }

    public void dirigir() {
        new Carro().Ligar();
        while (nivelCombustivel.getInstancia().Verificar()) {
            motor.Andar();
        }
    }

    public Carro getInstancia() {
        if (Intancia == null) {
            Intancia = new Carro();
        }
        return Intancia;
    }

    public boolean Ligar(){

        boolean condicaoLigar = new NivelCombustivel().getInstancia().Verificar();

      if(condicaoLigar){
         new Carro().getInstancia().andando= true;
          System.out.println("Carro ligando");
         return  true;
      }
      return false;
    }

    public void Desligar(){
        if (new Carro().getInstancia().andando) {
            System.out.println("Carro desligando");
            new Carro().getInstancia().andando= false;
        }
    }
}
