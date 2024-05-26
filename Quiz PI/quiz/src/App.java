import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Bem Vindo ao QUIZ ASTRONOMICO!!");

        int acertos = 0;
        int q1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Qual o nome do centro de um buraco negro:\n 1: Disco de acreção\n 2: Horizonte de eventos\n 3: Centro gravitacional\n 4: Singularidade",
                "QUIZ ASTRONOMICO", -1));
        if (q1 == 4) {
            JOptionPane.showMessageDialog(null, "Você acertou!");
            acertos += 1;
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
        }

        int q2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "qual a velocidade da luz?:\n 1: 400 m/s\n 2: 299.792.458 m/s\n 3: 350.452.233 m/s\n 4: 150 km/h",
                "QUIZ ASTRONOMICO", -1));
        if (q2 == 2) {
            JOptionPane.showMessageDialog(null, "Você acertou!");
            acertos += 1;
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
        }

        int q3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Qual é o nome do buraco negro mais prómixo do planeta Terra?:\n 1: Sagittarius A estrela\n 2: Alpha Centauri\n 3: Phoenix C-44\n 4: Cygnus X-1",
                "QUIZ ASTRONOMICO", -1));
        if (q3 == 1) {
            JOptionPane.showMessageDialog(null, "Você acertou!");
            acertos += 1;
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
        }

        int q4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Quantas luas orbitam Júpiter:\n 1: 10\n 2: 44\n 3: 85\n 4: 53",
                "QUIZ ASTRONOMICO", -1));
        if (q4 == 4) {
            JOptionPane.showMessageDialog(null, "Você acertou!");
            acertos += 1;
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
        }

        switch (acertos) {
            case 0:
                JOptionPane.showMessageDialog(null, "Errou tudo ta maluco, burro demais.");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Acertou uma só, da pra melhorar.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Acertou duas, ta ok.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Acertou tres! Foi bem!.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Acertou todas!! Sabe muito.");
                break;
            default:
                break;
        }

    }
}
