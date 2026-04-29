//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.*;

public class Atividade3 {
    public static void main(String[] args){

        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso do peixe em kg: "));
        double excesso = peso - 50;
        double multa = excesso * 4;

        if (peso <= 50) {
            JOptionPane.showMessageDialog(null, "Você está dentro do peso");
        }
        if (peso >= 10) {
            JOptionPane.showMessageDialog(null, "Sua multa é: " + "R$" + multa);
        }
    }
}