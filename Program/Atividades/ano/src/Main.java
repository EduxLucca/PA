import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano atual:"));
        int nas = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano de nascimento:"));
        int idade = ano - nas;
        if(idade >= 18){
            JOptionPane.showMessageDialog(null, "Atingiu a maioridade! A idade é " + idade );
        }
        else{
            JOptionPane.showMessageDialog(null, "Não atingiu a maioridade! A idade é " + idade);
        }
    }
}