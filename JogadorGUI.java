import javax.swing.*;
import java.util.ArrayList;

public class JogadorGUI {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        initializeJogadores(jogadores);

        while (true) {
            String votoEm = JOptionPane.showInputDialog(null, "Em quem você vota para sair da casa? (Digite 'sair' para encerrar)");
            if (votoEm == null || votoEm.equalsIgnoreCase("sair")) {
                break;
            }

            boolean found = false;
            for (Jogador jogador : jogadores) {
                if (jogador.getNome().equalsIgnoreCase(votoEm)) {
                    jogador.incrementaUmVoto();
                    found = true;
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Jogador não encontrado: " + votoEm);
            }
        }

        int confirm = JOptionPane.showConfirmDialog(null, "Deseja apurar o resultado agora?", "Apurar Resultado", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Jogador jogadorEliminado = findJogadorEliminado(jogadores);
            if (jogadorEliminado != null) {
                JOptionPane.showMessageDialog(null, criarMensagemEliminacao(jogadorEliminado),
                        "Resultado da Eliminação", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static void initializeJogadores(ArrayList<Jogador> jogadores) {
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
    }

    private static Jogador findJogadorEliminado(ArrayList<Jogador> jogadores) {
        Jogador jogadorEliminado = null;
        int maiorVotos = -1;
        for (Jogador jogador : jogadores) {
            if (jogador.getVotos() > maiorVotos) {
                maiorVotos = jogador.getVotos();
                jogadorEliminado = jogador;
            }
        }
        return jogadorEliminado;
    }

    private static String criarMensagemEliminacao(Jogador jogadorEliminado) {
        return "Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir\n" +
                "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu\n" +
                "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu\n" +
                "vou conseguir te eliminar com alegria. Com " + jogadorEliminado.getVotos() + " voto(s), é você quem sai, " +
                jogadorEliminado.getNome() + ".";
    }
}
