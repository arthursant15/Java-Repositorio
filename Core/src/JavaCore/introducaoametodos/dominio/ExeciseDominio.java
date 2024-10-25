package JavaCore.introducaoametodos.dominio;

public class ExeciseDominio {
    public String nome;
    public int idade;
    public double [] salario;
    private double media= 0;

    public void imprimir(){
        System.out.println("----------------------------------");
        System.out.println("O nome do funcionário é: " + this.nome);
        System.out.println("A idade do funcionário "+ this.nome + " é: "+this.idade);
        for (double num : this.salario) {
            System.out.println(num);
        }
        media();
    }
    public void media() {

        for (double num : salario){
            media += num;
        }
        System.out.println("A soma de todos os salarios é: " + media);
        media = media / salario.length;
        System.out.println("A média dos salarios é: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }


}