import java.util.Scanner;

public class Main {
        //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


            public static void main(String[] args) {
                Scanner digite = new Scanner(System.in);
                System.out.println("Digite sua renda per capita: ");
                int renda = digite.nextInt();
                double impostoDeRenda = (double)renda * 0.18;
                System.out.println("Digite seus patrimônios ativos: ");
                int ativos = digite.nextInt();
                System.out.println("Digite seus patrimônios passivos: ");
                int passivos = digite.nextInt();
                int patrimonio = ativos - passivos;
                double inpostoDoSeuPatrimonio = (double)patrimonio * 0.03;
                System.out.println("Preço do produto que você irá comprar: ");
                double precoDoProduto = digite.nextInt();
                double dolar = precoDoProduto / 5.48;
                double taxaDeImportacaoAte50 = precoDoProduto * 0.2;
                double taxaDeImportacaoMaisDe50 = precoDoProduto * 0.6;
                System.out.println("=====================================================");
                System.out.println("                    TABELA DE IMPOSTOS");
                System.out.println("                    Feita por: Taxad");
                if (2259.2 < (double)renda) {
                    System.out.println("===============IMPOSTO DE RENDA==================");
                    System.out.println("Opa! vi que sua renda é de: " + renda);
                    System.out.println("Então...");
                    System.out.println("Você vai pagar imposto seu fudido!!!");
                    System.out.println("Segue a baixo o valor da taxa de imposto que voce vai pagar");
                    System.out.println("Total a pagar: " + impostoDeRenda);
                } else {
                    System.out.println("Que drogaaa!");
                    System.out.println("É companheiro parece que você infelizmente será insento ");
                    System.out.println("=(");
                }

                System.out.println("=====================================================");
                System.out.println("================TAXA DE PATRIMÔNIO===================");
                System.out.println("Vi que você tem um patrimôniozinho ai companheiro!!!");
                System.out.println("Tá na hora de ser taxado hein =)");
                System.out.println("O dinheiro que eu vou te roubar será de: R$" + inpostoDoSeuPatrimonio + " do teu patrimonio =)");
                System.out.println("======================================================");
                System.out.println("================IMPOSTO DA SHOPEE=====================");
                double precoDe50MaisFinal;
                double precoComDesconto;
                if (dolar <= 50.0) {
                    System.out.println("Preço do produto: " + precoDoProduto);
                    System.out.println("Oba mais um imposto graças ao papai Lule =)");
                    System.out.println("A taxa de importação vai ser de: R$" + taxaDeImportacaoAte50);
                    precoDe50MaisFinal = precoDoProduto + taxaDeImportacaoAte50;
                    precoComDesconto = precoDe50MaisFinal / 0.83;
                    System.out.println("Ao total seu produto vai ficar com o acréscimo no valor de: " + precoComDesconto);
                }

                if (dolar > 50.0 && dolar <= 3000.0) {
                    precoDe50MaisFinal = precoDoProduto + taxaDeImportacaoMaisDe50;
                    precoComDesconto = precoDe50MaisFinal - 115.0;
                    double precoFinalMaisDe50 = precoComDesconto / 0.83;
                    System.out.println("Preço do produto: " + precoDoProduto);
                    System.out.println("Não queria falar companheiro mas, você se lascou bonito =)");
                    System.out.println("Os impostos que você vai pagar vão ser os seguintes: ");
                    System.out.println("Taxa de importação de 60%: R$" + taxaDeImportacaoMaisDe50);
                    System.out.println("Taxa de ICMS de 17% ");
                    System.out.println("Ao total de: R$" + precoFinalMaisDe50);
                }

                if (dolar > 3000.0) {
                    System.out.println("Catapimbas companheiro :(");
                    System.out.println("Você vai ser isento do imposto do amor :/");
                    System.out.println("E vai pagar o valor de: R$" + precoDoProduto);
                }

            }
        }
