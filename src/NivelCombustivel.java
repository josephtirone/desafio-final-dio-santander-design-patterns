public class NivelCombustivel {

    private static NivelCombustivel Intancia;

    Combustivel teste = new Combustivel();
    public NivelCombustivel() {

    }

    public NivelCombustivel getInstancia() {
        if (Intancia == null) {
            Intancia = new NivelCombustivel();
        }
        return Intancia;
    }

    public boolean Verificar() {
        int nivelAtual = new Combustivel().getInstancia().capacidade;

        if(nivelAtual == 0)
        {
            new Carro().getInstancia().Desligar();
            return  false;
        }

        return true;

    }
}

