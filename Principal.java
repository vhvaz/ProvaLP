// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador("Matteus Amaral"));
        jogadores.add(new Jogador("Maycon Cosmer"));
        jogadores.add(new Jogador("MC Bin Laden"));
        jogadores.add(new Jogador("Michel Nogueira"));
        jogadores.add(new Jogador("Nizam"));
        jogadores.add(new Jogador("Raquele Cardozo"));
        jogadores.add(new Jogador("Rodriguinho"));
        jogadores.add(new Jogador("Thalyta Alves"));
        jogadores.add(new Jogador("Vanessa Lopes"));
        jogadores.add(new Jogador("Vinicius Rodrigues"));
        jogadores.add(new Jogador("Wanessa Camargo"));
        jogadores.add(new Jogador("Yasmin Brunet"));

        String resposta = "";
        do {
            System.out.print("Em quem você vota para sair da casa? (Digite 'sair' para encerrar): ");
            resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("sair")) {
                for (Jogador jogador : jogadores) {
                    if (jogador.getNome().equalsIgnoreCase(resposta)) {
                        jogador.incrementaUmVoto();
                        break;
                    }
                }
            }
        } while (!resposta.equalsIgnoreCase("sair"));

        Jogador jogadorEliminado = null;
        int maiorVotos = -1;

        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > maiorVotos) {
                maiorVotos = jogador.getVotos();
                jogadorEliminado = jogador;
            }
        }

        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir\n" +
                "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu\n" +
                "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu\n" +
                "vou conseguir te eliminar com alegria. Com " + jogadorEliminado.getVotos() + " voto(s), é você quem sai "
                + jogadorEliminado.getNome());
    }
}
