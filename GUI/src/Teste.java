package testeGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teste {
    private JPanel panel1;
    private JTextField entradaUser;
    private JPasswordField entradaPass;
    private JButton validarBotao;
    private JTabbedPane abaUm;
    private JPanel abaDois;
    private JTextPane abaUmText;
    private JTextPane abaDoisText;
    private int vezes;

    public Teste() {
        validarBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String password = new String(entradaPass.getPassword());
                String user = new String(entradaUser.getText());
                Integer vez = vezes;
                System.out.println(entradaUser.getText());
                System.out.println(entradaPass.getPassword());
                System.out.println("\n" + user);
                System.out.println(password);
                System.out.println(vezes);

                vezes++;

                if (vez.equals(2)) {
                    abaDoisText.setEnabled(true);
                    abaDois.setEnabled(true);

                } else if (vezes >= 10) {
                    JOptionPane.showMessageDialog(null, "Nao creio que tu ficou fazendo isso mais\nde dez vezes... parabens");

                } else {

                }

                if (user.equals("Teste") && password.equals("31413")) {
                    JOptionPane.showMessageDialog(null, "Bem-vindo usuario " + entradaUser.getText());

                } else if (user.equals("toor") && password.equals("root")) {
                    JOptionPane.showMessageDialog(null, "Bem-vindo usuario ROOT.\nComo voce descobriu?");

                } else {
                    JOptionPane.showMessageDialog(null, "ERRO! coloque algo!");

                }

            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Teste Entrada Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Teste().panel1);
        frame.pack();
        frame.setVisible(true);

    }
}
