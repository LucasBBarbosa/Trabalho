public class Main {
    public static void main(String[] args) {

        Pilhadinamica pilhadinamica = new Pilhadinamica("6");
        pilhadinamica.inserirElemento("4");
        pilhadinamica.inserirElemento("4");
        pilhadinamica.inserirElemento("7");
        pilhadinamica.inserirElemento("9");
        pilhadinamica.inserirElemento("10");
        pilhadinamica.exibir();
        System.out.println();
        pilhadinamica.obterPrimeiroElemento();
        System.out.println();
        pilhadinamica.obterUltimoElemento();
        System.out.println();
        pilhadinamica.quantidadeElementos();
        System.out.println();
        pilhadinamica.editarElemento("6","8");
        pilhadinamica.exibir();
        System.out.println();
        pilhadinamica.removerElemento();
        pilhadinamica.exibir();
        System.out.println();
        pilhadinamica.removerTodasOcorrencias("4");
        pilhadinamica.exibir();
        System.out.println();
        pilhadinamica.buscarElemento("6");
        System.out.println();
        pilhadinamica.limpar();
        pilhadinamica.exibir();

    }
}