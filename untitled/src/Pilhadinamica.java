public class Pilhadinamica implements IEstruturaDinamica {

    private No primeiro;
    private No ultimo;

    public Pilhadinamica(String conteudo) {
        this.primeiro = new No(conteudo);
        this.ultimo = this.primeiro;
    }

    @Override
    public void inserirElemento(String conteudo) {
        No noNovo = new No(conteudo);
        if (estaVazia()) {
            this.primeiro = noNovo;
            this.ultimo = this.primeiro;
        } else {
            this.ultimo.setProx(noNovo);
            noNovo.setAnterior(ultimo);
            this.ultimo = noNovo;
        }
    }

    @Override
    public boolean removerElemento() {
        if (estaVazia()) {
            System.out.println("A pilhar esta vazia");
        } else if (ultimo == primeiro) {
            primeiro = null;
            ultimo = null;
            return true;
        } else {
            System.out.println( "O elemento " + ultimo.getConteudo() + " foi removido");
            ultimo.getAnterior().setProx(null);
            ultimo = ultimo.getAnterior();

            return true;
        }

        return false;
    }

    @Override
    public void removerTodasOcorrencias(String conteudo) {
        No aux = this.ultimo;
        while (aux != null) {
            if (conteudo.equals(aux.getConteudo())) {
                aux.setConteudo(null);

            }
            aux = aux.getAnterior();
        }
        System.out.println("O numero " + conteudo + " foi removido.");
    }

    @Override
    public boolean estaCheia() {
        return false;
    }

    @Override
    public boolean estaVazia() {
        if (this.primeiro == null) {
            return true;
        } else {
            return estaCheia();
        }
    }

    @Override
    public boolean buscarElemento(String conteudo) {
        No aux = this.ultimo;
        while (aux != null) {
            if (conteudo.equals(aux.getConteudo())) {
                System.out.println("O elemento " + conteudo + " esta na pilha");
                return true;
            }
            aux = aux.getAnterior();
        }
        return false;
    }

    @Override
    public int quantidadeElementos() {
        int i = 0;
        No aux = this.ultimo;
        while (aux != null) {
            i++;
            aux = aux.getAnterior();
        }
        System.out.println("quantidade Elementos: " + i );
        return i;
    }

    @Override
    public void editarElemento(String elementoAntigo, String elementoNovo) {
        No aux = this.ultimo;
        while (aux != null) {
            if(elementoAntigo.equals(aux.getConteudo()))
                aux.setConteudo(elementoNovo);
            aux = aux.getAnterior();
        }
    }

    @Override
    public void limpar() {
        No aux = this.ultimo;
        while (aux != null) {
            if (ultimo == primeiro) {
                primeiro = null;
                ultimo = null;
                break;
            } else {
                ultimo.getAnterior().setProx(null);
                ultimo = ultimo.getAnterior();
            }
        }
    }

    @Override
    public void exibir() {
        if (estaVazia()) {
            System.out.println("A pilha esta vazia");
        } else {
            No aux = this.ultimo;
            while (aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getAnterior();
            }
        }
    }

    @Override
    public No obterPrimeiroElemento() {
        System.out.println("O primeiro elemento é " + primeiro.getConteudo());
        return null;
    }

    @Override
    public No obterUltimoElemento() {
        System.out.println("O ultimo elemento é " + ultimo.getConteudo());
        return null;
    }
}
