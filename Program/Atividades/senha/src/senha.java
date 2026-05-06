//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;

public class senha {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog(null, "Crie sua senha: ");
        String tentativas = JOptionPane.showInputDialog(null, "Digite a senha que você digitou: ");

        if (senha.equals(tentativas)) {
            JOptionPane.showMessageDialog(null, "Senha correta");
        }
           else{
            JOptionPane.showMessageDialog(null, "Digite novamente");
        }

    }

}