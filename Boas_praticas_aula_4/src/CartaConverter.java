import javax.swing.JOptionPane;

public class CartaConverter {

    public int converteCartaParaInt(String carta) {
        switch (carta.toUpperCase()) {
            case "A":
                return 1;
            case "2", "3", "4", "5", "6", "7", "8", "9":
                return Integer.parseInt(carta);
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        CartaConverter converter = new CartaConverter();

        String input = JOptionPane.showInputDialog("Digite o valor da carta:");
        if (input != null) {
            int resultado = converter.converteCartaParaInt(input);
            if (resultado != -1) {
                JOptionPane.showMessageDialog(null, "O valor da carta é: " + resultado);
            } else {
                JOptionPane.showMessageDialog(null, "Carta inválida!");
            }
        }
    }
}

