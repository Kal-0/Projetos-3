//import java.util.ArrayList;
//import java.util.List;
//
//public class UsuarioMediatorw {
//    private List<UsuarioStreaming> usuarios;
//
//    public UsuarioMediator() {
//        this.usuarios = new ArrayList<>();
//    }
//
//    public void adicionarUsuario(UsuarioStreaming usuario) throws Exception {
//       UsuarioStreaming usuario_existente = findByPK();
//
//       if (usuario_existente == null){
//        this.usuarios.add(usuario);
//       }else{
//        //TEMPORAÁRIO
//        System.out.println("Usuário já existe!!");
//       }
//
//        
//    }
//}
//
////Agora, vamos criar uma interface UsuarioStreaming que os usuários do sistema de streaming devem implementar:
//public interface UsuarioStreaming {
//    void enviarMensagem(String mensagem, UsuarioStreaming destinatario);
//    void receberMensagem(UsuarioStreaming remetente, String mensagem);
//    void receberTransmissao(UsuarioStreaming remetente, String conteudo);
//    String getNome();
//}
//
////E, finalmente, uma implementação básica de UsuarioPadrao:
//public class UsuarioPadrao implements UsuarioStreaming {
//    private UsuarioMediator mediator;
//    private String nome;
//
//    public UsuarioEntity(UsuarioMediator mediator, String nome) {
//        this.mediator = mediator;
//        this.nome = nome;
//        mediator.adicionarUsuario(this);
//    }
//
//    @Override
//    public void enviarMensagem(String mensagem, UsuarioStreaming destinatario) {
//        mediator.enviarMensagem(mensagem, this, destinatario);
//    }
//
//    @Override
//    public void receberMensagem(UsuarioStreaming remetente, String mensagem) {
//        System.out.println(nome + " recebeu a mensagem de " + remetente.getNome() + ": " + mensagem);
//    }
//
//    @Override
//    public void receberTransmissao(UsuarioStreaming remetente, String conteudo) {
//        System.out.println(nome + " está assistindo: " + conteudo);
//    }
//
//    @Override
//    public String getNome() {
//        return nome;
//    }
//}