package modulo1;

public class Nodo {

    int valor;
    Nodo hijoIzquierdo = null;
    Nodo hijoDerecho = null;
    Nodo Padre = null;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public Nodo getPadre() {
        return Padre;
    }

    public void setPadre(Nodo padre) {
        Padre = padre;
    }
}
