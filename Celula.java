public class Celula {

    Celula proxima; //Aponta para a próxima célula
    Celula anterior; //Aponta para a célula anterior
    Object elemento; //Objeto armazenado

    // Métodos - Construtores das células
    Celula(Celula prox, Object ele) {
        this.proxima = prox;
        this.anterior = null;
        this.elemento = ele;
    }

    Celula(Object ele) {
        this.proxima = null;
        this.anterior = null;
        this.elemento = ele;
    }

    // Recupera a próxima célula
    Celula getProxima() {
        return (this.proxima);
    }

    //Métodos ( Define próxima célula
    void setProxima(Celula prox) {
        this.proxima = prox;
    }

    // Recupera a célula anterior
    Celula getAnterior() {
        return (this.anterior);
    }

    // Define a célula anterior
    void setAnterior(Celula ant) {
        this.anterior = ant;
    }

    // Recupera o objeto (informação) dentro da célula
    Object getElemento() {
        return (this.elemento);
    }
}