public class Palestra {
    private Luz l;

    public Palestra(Luz l) {
        this.l = l;
    }

    public Luz getLuz() {
        return l;
    }

    public void verificarDisponibilidade() {
        switch(l) {
            case VERMELHO:
                System.out.println("VERMELHO: Palestra indisponível");
                break;
            case AMARELO:
                System.out.println("AMARELO: Palestra sendo liberada");
                break;
            case VERDE:
                System.out.println("VERDE: Palestra disponível");
                break;
        }
    }
}
