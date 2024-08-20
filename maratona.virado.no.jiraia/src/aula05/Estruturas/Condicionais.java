package aula05.Estruturas;
//Impostos pagos no Brasil
public class Condicionais {
    public static void main(String[] args) {
        int renda = 3000;
        double impostoDeRenda = renda * 0.18D;
        int ativos = 500000;
        int passivos = 300000;
        int patrimonio = ativos - passivos;
        double inpostoDoSeuPatrimonio = patrimonio* 0.03;
        double precoDoProduto = 100;
        double dolar = precoDoProduto/5.75;
        double taxaDeImportacaoAte50 = precoDoProduto * 0.2;
        double taxaDeImportacaoMaisDe50 = precoDoProduto * 0.6;
        //renda imposto
        System.out.println("==============================================");
        System.out.println("Tabela de Impostos");
        System.out.println("Feita por: Taxad");
        System.out.println("==============================================");
        if (2259.20<renda){
            System.out.println("Opa! vi que sua renda é de: " + renda);
            System.out.println("Então...");
            System.out.println("Você vai pagar imposto seu fudido!!!");
            System.out.println("Segue a baixo o valor da taxa de imposto que voce vai pagar");
            System.out.println("Total a pagar: " + impostoDeRenda);
        }else {
            System.out.println("Que drogaaa!");
            System.out.println("É companheiro parece que você infelizmente será insento ");
            System.out.println("=(");
        }
        System.out.println("==========================================");
        System.out.println("Vi que você tem um patrimoniozinho ai companheiro!!!");
        System.out.println("Tá na hora de ser taxado hein =)");
        System.out.println("O dinheiro que eu vou te roubar será de: " + inpostoDoSeuPatrimonio + " do teu patrimonio =)");
        System.out.println("==========================================");

        if (dolar<=50){
            System.out.println("Oba mais um imposto graças ao papai Lule =)");
            System.out.println("A taxa de importação vai ser de: " + taxaDeImportacaoAte50);
            double precoDoProdutoFinal = precoDoProduto + taxaDeImportacaoAte50;
            double precoComIcms = precoDoProdutoFinal / 0.83;
            System.out.println("Ao total seu produto vai ficar com o acréscimo no valor de: " + precoComIcms);
        }if (dolar>50){
            System.out.println("Não queria falar companheiro mas, você se lascou bonito =)");
            System.out.println("Os impostos que você vai pagar vão ser os seguintes: ");
            System.out.println("Taxa de importação de 60%");
            System.out.println("Taxa de ICMS");
        }
    }
}
