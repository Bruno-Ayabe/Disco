import java.util.List;
import java.util.ArrayList;

class Catalogo implements ICatalogo {
    private List<Musica> musicas;

    public Catalogo() {
        musicas = new ArrayList<>();
    }

    @Override
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        System.out.println("Música '" + musica.getNome() + "' adicionada ao catálogo.");
    }

    @Override
    public void removerMusica(String nomeMusica) {
        Musica musicaARemover = null;
        for (Musica musica : musicas) {
            if (musica.getNome().equals(nomeMusica)) {
                musicaARemover = musica;
                break;
            }
        }

        if (musicaARemover != null) {
            musicas.remove(musicaARemover);
            System.out.println("Música '" + nomeMusica + "' removida do catálogo.");
        } else {
            System.out.println("Música não encontrada.");
        }
    }

    @Override
    public void listarMusicas() {
        if (musicas.isEmpty()) {
            System.out.println("O catálogo está vazio.");
        } else {
            System.out.println("Lista de Músicas no Catálogo:");
            for (Musica musica : musicas) {
                musica.exibirDetalhes();
            }
        }
    }
}
