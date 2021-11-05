package modulo1;

public class Arbol {

    Nodo raiz = null;
    Nodo puntero = null;
    int contadorPuntero = 0;
    //revisar contadores (Se acumulan)
    int contador = 0;
    int contadorHoja = 0;

    public Arbol() {

    }

    public void insertarNodo(Nodo nodoAInsertar) {
        if (raiz == null) {
            raiz = nodoAInsertar;
        } else {
            if (contadorPuntero == 0) {
                puntero = raiz;
            }
            if (nodoAInsertar.getValor() < (puntero.getValor())) {
                if (puntero.getHijoIzquierdo() != null) {
                    puntero = puntero.getHijoIzquierdo();
                    contadorPuntero++;
                    insertarNodo(nodoAInsertar);
                } else {
                    puntero.setHijoIzquierdo(nodoAInsertar);
                    nodoAInsertar.setPadre(puntero);
                    contadorPuntero = 0;
                }
            } else if (nodoAInsertar.getValor() > (puntero.getValor())) {
                if (puntero.getHijoDerecho() != null) {
                    puntero = puntero.getHijoDerecho();
                    contadorPuntero++;
                    insertarNodo(nodoAInsertar);
                } else {
                    puntero.setHijoDerecho(nodoAInsertar);
                    nodoAInsertar.setPadre(puntero);
                    contadorPuntero = 0;
                }
            }
        }
    }

    public void preOrden(Nodo nodo) {
        if (raiz != null) {
            System.out.print(nodo.getValor() + " ");
            if (nodo.getHijoIzquierdo() != null) {
                preOrden(nodo.getHijoIzquierdo());
            }
            if (nodo.getHijoDerecho() != null) {
                preOrden(nodo.getHijoDerecho());
            }
        } else {
            System.out.println("Primero debe insertar un nodo.");
        }
    }

    public void inOrden(Nodo nodo) {
        if (raiz != null) {
            if (nodo.getHijoIzquierdo() != null) {
                inOrden(nodo.getHijoIzquierdo());
            }
            System.out.print(nodo.getValor() + " ");
            if (nodo.getHijoDerecho() != null) {
                inOrden(nodo.getHijoDerecho());
            }
        } else {
            System.out.println("Primero debe insertar un nodo.");
        }
    }

    public void postOrden(Nodo nodo) {
        if (raiz != null) {
            if (raiz != null) {
                if (nodo.getHijoIzquierdo() != null) {
                    postOrden(nodo.getHijoIzquierdo());
                }
                if (nodo.getHijoDerecho() != null) {
                    postOrden(nodo.getHijoDerecho());
                }
                System.out.print(nodo.getValor() + " ");
            } else {
                System.out.println("Primero debe insertar un nodo.");
            }
        }

    }

    //revisar
    public int contarNodosArbol(Nodo nodo) {

        if(nodo != null) {
            contador++;
        }
        if (nodo.getHijoIzquierdo() != null) {
            contarNodosArbol(nodo.getHijoIzquierdo());
        }
        if (nodo.getHijoDerecho() != null) {
            contarNodosArbol(nodo.getHijoDerecho());
        }
        return contador;
    }
    //revisar
    public int contarNodosHoja(Nodo nodo) {

        if(nodo != null && nodo.getHijoIzquierdo() == null && nodo.getHijoDerecho() == null) {
            contadorHoja++;
        }
        if (nodo.getHijoIzquierdo() != null) {
            contarNodosHoja(nodo.getHijoIzquierdo());
        }
        if (nodo.getHijoDerecho() != null) {
            contarNodosHoja(nodo.getHijoDerecho());
        }
        return contadorHoja;
    }

    public void nivelNodo(){

    }

    public int altura(Nodo nodo) {
        if(nodo == null){
            return -1;
        }
        return (Math.max(altura(nodo.getHijoIzquierdo()),altura(nodo.getHijoDerecho())) + 1);
    }

    public Nodo valorMaximo(Nodo nodo) {
        while(nodo.getHijoDerecho() != null) {
            nodo = nodo.getHijoDerecho();
        }
        return nodo;
    }

    public void eliminarMenor(Nodo nodo) {
        while(nodo.getHijoIzquierdo() != null) {
            nodo = nodo.getHijoIzquierdo();
        }
        System.out.println("Se ha eliminado el nodo con el valor: " + nodo.getValor());
        nodo = null;
    }

}
