package Questao2;

import javax.swing.*;

public class main {

    public class Encontrar {
        public static void main(String[] args) {
            AchadoPerdido item = new AchadoPerdido("Carteira", "Carteira marrom contendo documentos pessoais", "Praça central", "foto1.jpg", "Objeto Pessoal", "Encontrado");

            String tituloBuscado = JOptionPane.showInputDialog("Digite o título do item que deseja buscar:");
            String resultadoBusca = item.buscarTitulo(tituloBuscado);
            JOptionPane.showMessageDialog(null, resultadoBusca);

            item.visualizaDetalhes();
        }
    }
}
