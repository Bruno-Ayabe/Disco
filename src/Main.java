public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Musica musica1 = new Musica("Te Assumi Pro Brasil", "Zezé Di Camargo & Luciano", 2023, "Sertanejo");
        Musica musica2 = new Musica("Época de Ouro", "Jorge & Mateus", 2024, "Sertanejo");
        Musica musica3 = new Musica("De Quem É A Culpa?", "Marília Mendonça", 2024, "Sertanejo");
        Musica musica4 = new Musica("Te Esperando", "Luan Santana", 2024, "Sertanejo");
        Musica musica5 = new Musica("Tô Com Tanta Saudade", "Henrique & Juliano", 2024, "Sertanejo");

        catalogo.adicionarMusica(musica1);
        catalogo.adicionarMusica(musica2);
        catalogo.adicionarMusica(musica3);
        catalogo.adicionarMusica(musica4);
        catalogo.adicionarMusica(musica5);

        catalogo.listarMusicas();

        catalogo.removerMusica("Te Esperando");

        catalogo.listarMusicas();
    }
}