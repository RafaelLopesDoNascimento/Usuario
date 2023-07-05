package User;

public class Usuario {

    //Propriedades
    private String nome;
    private short senha;


    //constructor

public Usuario(String nome, short senha) {
    this.nome = nome;
    this.senha = senha;
}


    //metodos


    public String getNome() {
        return nome;
    }

    public short getSenha() {
        return senha;
    }

    public void alterarSenha(String nome, Short senhaNova) {
    if(nome == this.nome) {
        this.senha = senhaNova;
        System.out.println("Senha alterada");

    } else {
        System.out.println("Nome de usuario não encontrado");
    }
    }
}
