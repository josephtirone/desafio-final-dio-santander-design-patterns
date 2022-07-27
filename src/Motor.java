public class Motor {
    NivelCombustivel nc = new NivelCombustivel();

    public Motor(){

    }

    public void Andar(){
        System.out.println("Carro andando, gasolina em:" + new Combustivel().getInstancia().capacidade);
        new Combustivel().getInstancia().usarCombustivel();
    }
}
