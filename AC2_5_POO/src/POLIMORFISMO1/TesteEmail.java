package POLIMORFISMO1;
class Pessoa { // classe base
    private String nome; //atributo comum

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
  
    public void enviarEmail(String mensagem) { // método sobrescrito pelas subclasses
        // implementação padrão da mensagem
        System.out.println("Olá " + getNome() + "!");
        System.out.println(mensagem);
    }
}

class Professor extends Pessoa { // subclasse Professor

    public Professor(String nome) {
        super(nome);
    }

    @Override
    public void enviarEmail(String mensagem) {
        // mensagem personalizada para professor
        System.out.println("Olá Prof. " + getNome() + "!");
        System.out.println(mensagem);
    }
}

class Aluno extends Pessoa { // subclasse Aluno

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void enviarEmail(String mensagem) {
        // mensagem personalizada para aluno
        System.out.println("Olá Aluno " + getNome() + "!");
        System.out.println(mensagem);
    }
}

public class TesteEmail { // Classe de main para teste do email
    public static void main(String[] args) {
        // criação de objetos de Professor e Aluno
        Pessoa professor = new Professor("Alan Turing");
        Pessoa aluno = new Aluno("Joseph");

        // enviando emails com mensagem personalizada
        String mensagem = "Mensagem teste.";

        professor.enviarEmail(mensagem);
        
        System.out.println(); 
        
        aluno.enviarEmail(mensagem);
    }
}
