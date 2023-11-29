//import java.util.ArrayList;
//import java.util.List;
//import NexGem.Libreflix.Entity.General.Assiste;
//import NexGem.Libreflix.Entity.UsuarioEntity;
//import NexGem.Libreflix.Entity.VideoEntity;
//
//
//public class VideoMediator {
//    private List<VideoEntity> videos;
//
//    public VideoMediator() {
//        this.videos = new ArrayList<>();
//    }
//
//    public void adicionarVideo(VideoEntity video) {
//        this.videos.add(video);
//    }
//
//    public void reproduzirVideo(VideoEntity video, UsuarioEntity espectador) {
//        // Verifica se o espectador tem permissão para assistir ao vídeo (pode adicionar lógica mais avançada aqui)
//        if (verificarPermissao(espectador, video)) {
//            // Registra a visualização
//            video.registrarVisualizacao(espectador);
//            // Atualiza estatísticas do vídeo
//            video.atualizarEstatisticas();
//            // Notifica outros vídeos sobre a visualização (pode adicionar lógica mais avançada aqui)
//            notificarOutrosVideos(video, espectador);
//        } else {
//            System.out.println(espectador.getNome() + " não tem permissão para assistir ao vídeo '" + video.getTitulo() + "'.");
//        }
//    }
//
//    private boolean verificarPermissao(UsuarioEntity espectador, VideoEntity video) {
//        // Lógica para verificar se o espectador tem permissão para assistir ao vídeo
//        // Pode incluir verificações de assinatura, idade, etc.
//        return true; // Por padrão, permite a reprodução
//    }
//
//    private void notificarOutrosVideos(VideoEntity video, UsuarioEntity espectador) {
//        for (VideoEntity outroVideo : videos) {
//            if (outroVideo != video) {
//                outroVideo.receberNotificacaoVisualizacao(espectador);
//            }
//        }
//    }
//
//    // Outros métodos específicos do Mediator de Vídeos
//}