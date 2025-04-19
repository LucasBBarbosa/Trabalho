public interface IEstruturaDinamica {

    void inserirElemento(String conteudo);
    boolean removerElemento();
    void removerTodasOcorrencias(String conteudo);
    boolean estaCheia();
    boolean estaVazia();
    boolean buscarElemento(String conteudo);
    int quantidadeElementos();
    void editarElemento(String elementoAntigo, String elementoNovo);
    void limpar();
    void exibir();
    No obterPrimeiroElemento();
    No obterUltimoElemento();
}