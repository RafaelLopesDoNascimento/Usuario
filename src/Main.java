import User.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario rafael = new Usuario("Rafael", (short) 1234);



        System.out.println(rafael.getNome());
        System.out.println(rafael.getSenha());

        rafael.alterarSenha("Rafael", (short) 567);
        System.out.println(rafael.getSenha());


    }
}