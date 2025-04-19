public class No implements INo {
    private String conteudo;
    private No prox;
    private No anterior;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.prox = null;
        this.anterior = null;
    }
    @Override
    public String getConteudo() {
        return this.conteudo;
    }

    @Override
    public No getAnterior() {
        return this.anterior;
    }

    @Override
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    @Override
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    @Override
    public No getProx() {
        return prox;
    }
    @Override
    public void setProx(No prox) {
        this.prox = prox;
    }

}