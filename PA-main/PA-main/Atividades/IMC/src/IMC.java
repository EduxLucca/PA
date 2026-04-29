//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.awt.Component;
import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
        String Sexo = JOptionPane.showInputDialog((Component)null, "Digite seu Genero (masculino ou feminino)");
        double peso = (double)0.0F;
        double altura = Double.parseDouble(JOptionPane.showInputDialog((Component)null, "Digite seu altura"));
        if (Sexo == "masculino") {
            peso = 72.7 * altura - (double)58.0F;
        } else {
            peso = 62.1 * altura - 44.7;
        }
        JOptionPane.showMessageDialog((Component)null, "Seu peso ideal e " + peso);
    }
}