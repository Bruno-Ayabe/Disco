class Musica {
    private String nome;
    private String artista;
    private int anoLancamento;
    private String genero;

    public Musica(String nome, String artista, int anoLancamento, String genero) {
        this.nome = nome;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void exibirDetalhes() {
        System.out.println("Música: " + nome);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Gênero: " + genero);
        System.out.println("----------------------------");
    }
}