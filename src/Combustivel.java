public class Combustivel {
    private static Combustivel Intancia;
    public Combustivel() {
    }

    public int capacidade = 100;

    public void usarCombustivel() {
        capacidade--;
        new NivelCombustivel().getInstancia().Verificar();
    }

    public Combustivel getInstancia() {
        if (Intancia == null) {
            Intancia = new Combustivel();
        }
         return Intancia;
    }

}
