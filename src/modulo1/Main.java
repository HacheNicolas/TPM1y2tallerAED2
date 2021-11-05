package modulo1;

public class Main {

    public static void main(String[] args) {

        //Declaración e instanciación del árbol.
        Arbol arbol = new Arbol();

        //Declaración e instanciación de los nodos.
        Nodo n1 = new Nodo(100);
        Nodo n2 = new Nodo(50);
        Nodo n3 = new Nodo(120);
        Nodo n4 = new Nodo(130);
        Nodo n5 = new Nodo(45);
        Nodo n6 = new Nodo(60);
        Nodo n7 = new Nodo(110);

        //Inserción de los nodos en el árbol
        arbol.insertarNodo(n1);
        arbol.insertarNodo(n2);
        arbol.insertarNodo(n3);
        arbol.insertarNodo(n4);
        arbol.insertarNodo(n5);
        arbol.insertarNodo(n6);
        arbol.insertarNodo(n7);

        //El recorrido preorden genera la salida: 100 50 45 60 120 110 130.
        System.out.print("Recorrido preorden: ");
        arbol.preOrden(n1);
        System.out.println();

        //El recorrido inorden genera la salida: 45 50 60 100 110 120 130.
        System.out.print("Recorrido inorden: ");
        arbol.inOrden(n1);
        System.out.println();

        //El recorrido postorden genera la salida: 45 60 50 110 130 120 100.
        System.out.print("Recorrido postorden: ");
        arbol.postOrden(n1);
        System.out.println();

        System.out.print("Cantidad de nodos del árbol: ");
        System.out.println(arbol.contarNodosArbol(n1));
        System.out.println(arbol.contarNodosArbol(n1));

        System.out.print("Cantidad de nodos hoja del árbol: ");
        System.out.println(arbol.contarNodosHoja(n1));

        System.out.print("Impresión de un nodo y su nivel en el árbol: ");
        System.out.println();

        System.out.print("Altura del árbol: ");
        System.out.println(arbol.altura(n1));

        System.out.print("Valor máximo almacenado en el árbol: ");
        System.out.println(arbol.valorMaximo(n1).getValor());

        System.out.print("Eliminación del nodo con el menor valor del árbol: ");
        arbol.eliminarMenor(n1);




        /*
        3) El siguiente código:

        private void imprimir (Nodo n) {
            if (n != null) {
                imprimir (n.izq);
                System.out.print(n.info + " ");
                imprimir (n.der);
            }
        }

        Hace referencia a un recorrido inorden. La salida del mismo es:
        6 8 7 12 15 10


        El siguiente código:

        public void Muestra() {
            if (raiz!=null) {
                Nodo n=raiz;
                while (n.der!=null)
                n=n.der;
                System.out.println("Valor:"+n.info);
            }
        }

       Hace referencia a la búsqueda del valor máximo del árbol. La salida del mismo es:
       Valor:15
         */
    }

}
