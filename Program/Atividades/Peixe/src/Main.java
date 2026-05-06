import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double Peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso: "));
        if(Peso > 50) {
            double Excesso = Peso - 50;
            double Multa = Excesso * 4;
            JOptionPane.showMessageDialog(null, "A sua multa é de " + Multa + "R$");
        }
        else{
            JOptionPane.showMessageDialog(null, "Quantidade dentro da lei");
        }
    }
}