package jogos;

import java.util.Random;
import java.util.Scanner;

public class jokenpoh {
    public static void main(String[] args) {
            String jogada_comp = "";
            String jogada_pessoa = "";
            Random x = new Random();
            int numero = x.nextInt(3);
            switch(numero) {
                case 0:
                    jogada_comp = "pedra";
                    break;
                case 1:
                    jogada_comp = "papel";
                    break;
                case 2:
                    jogada_comp = "tesoura";
                    break;
                default:
                    System.out.println("invalido");
            }

            System.out.println("menu de opções:\n[0] pedra\n[1] papel\n[2] tesoura\n");
            Scanner teclado = new Scanner(System.in);
            int opcao = teclado.nextInt();
            byte var8;
            label78:
            switch(opcao) {
                case 0:
                    jogada_pessoa = "pedra";
                    var8 = -1;
                    switch(jogada_comp.hashCode()) {
                        case -1422583369:
                            if (jogada_comp.equals("tesoura")) {
                                var8 = 2;
                            }
                            break;
                        case 106434950:
                            if (jogada_comp.equals("papel")) {
                                var8 = 1;
                            }
                            break;
                        case 106542974:
                            if (jogada_comp.equals("pedra")) {
                                var8 = 0;
                            }
                    }

                    switch(var8) {
                        case 0:
                            System.out.println("empate");
                            break label78;
                        case 1:
                            System.out.println("voce perdeu");
                            break label78;
                        case 2:
                            System.out.println("voce ganhou");
                        default:
                            break label78;
                    }
                case 1:
                    jogada_pessoa = "papel";
                    var8 = -1;
                    switch(jogada_comp.hashCode()) {
                        case -1422583369:
                            if (jogada_comp.equals("tesoura")) {
                                var8 = 2;
                            }
                            break;
                        case 106434950:
                            if (jogada_comp.equals("papel")) {
                                var8 = 1;
                            }
                            break;
                        case 106542974:
                            if (jogada_comp.equals("pedra")) {
                                var8 = 0;
                            }
                    }

                    switch(var8) {
                        case 0:
                            System.out.println("voce ganhou");
                            break label78;
                        case 1:
                            System.out.println("empate");
                            break label78;
                        case 2:
                            System.out.println("voce perdeu");
                        default:
                            break label78;
                    }
                case 2:
                    jogada_pessoa = "tesoura";
                    var8 = -1;
                    switch(jogada_comp.hashCode()) {
                        case -1422583369:
                            if (jogada_comp.equals("tesoura")) {
                                var8 = 2;
                            }
                            break;
                        case 106434950:
                            if (jogada_comp.equals("papel")) {
                                var8 = 1;
                            }
                            break;
                        case 106542974:
                            if (jogada_comp.equals("pedra")) {
                                var8 = 0;
                            }
                    }

                    switch(var8) {
                        case 0:
                            System.out.println("voce perdeu");
                            break label78;
                        case 1:
                            System.out.println("voce ganhou");
                            break label78;
                        case 2:
                            System.out.println("empate");
                        default:
                            break label78;
                    }
                default:
                    jogada_pessoa = "invalido";
                    System.out.println("invalido");
            }

            System.out.println("o computador escolheu " + jogada_comp);
            System.out.println("voce escolheu " + jogada_pessoa);
        }
}

