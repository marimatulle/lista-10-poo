enum Luz {
    VERMELHO, AMARELO, VERDE
}

public class Teste {
    public static void main(String[] args) throws Exception {
        Palestra p1 = new Palestra(Luz.VERMELHO);
        p1.verificarDisponibilidade();

        Palestra p2 = new Palestra(Luz.AMARELO);
        p2.verificarDisponibilidade();

        Palestra p3 = new Palestra(Luz.VERDE);
        p3.verificarDisponibilidade();
    }
}
