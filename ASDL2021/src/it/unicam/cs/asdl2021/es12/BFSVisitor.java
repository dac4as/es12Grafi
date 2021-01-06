package it.unicam.cs.asdl2021.es12;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Classe singoletto che fornisce lo schema generico di visita Breadth-First di
 * un grafo rappresentato da un oggetto di tipo Graph<L>.
 * 
 * @author Template: Luca Tesei, Implementazione: collettiva
 *
 * @param <L> le etichette dei nodi del grafo
 */
public class BFSVisitor<L> {

    /**
     * Esegue la visita in ampiezza di un certo grafo a partire da un nodo
     * sorgente. Setta i seguenti valori associati ai nodi: distanza
     * intera, predecessore. La distanza indica il numero minimo di archi che si
     * devono percorrere dal nodo sorgente per raggiungere il nodo e il
     * predecessore rappresenta il padre del nodo in un albero di copertura del
     * grafo. Ogni volta che un nodo viene visitato viene eseguito il metodo
     * visitNode sul nodo. In questa classe il metodo non fa niente, basta
     * creare una sottoclasse e ridefinire il metodo per eseguire azioni
     * particolari.
     * 
     * @param g
     *                   il grafo da visitare.
     * @param source
     *                   il nodo sorgente.
     * @throws NullPointerException
     *                                      se almeno un valore passato è null
     * @throws IllegalArgumentException
     *                                      se il nodo sorgente non appartiene
     *                                      al grafo dato
     */
    public void BFSVisit(Graph<L> g, GraphNode<L> source) {
        if(g==null||source==null) throw new NullPointerException();
        if(!g.containsNode(source)) throw new IllegalArgumentException();
        // NOTA: chiamare il metodo visitNode alla "scoperta" di un nuovo nodo
        for(GraphNode<L> u : g.getNodes())//impostare tutti i nodi in bianco
        {
            u.setColor(GraphNode.COLOR_WHITE);//oppure 0
        }
        source.setColor(GraphNode.COLOR_GREY);
    }

    /**
     * Questo metodo, che di default non fa niente, viene chiamato su tutti i
     * nodi visitati durante la BFS quando i nodi passano da grigio a nero.
     * Ridefinire il metodo in una sottoclasse per effettuare azioni specifiche.
     * 
     * @param n
     *              il nodo visitato
     */
    public void visitNode(GraphNode<L> n) {
        // ridefinire il metodo in una sottoclasse per fare azioni particolari

    }



    class SubBFSVisitor<L> extends BFSVisitor<L>{
        public void visitNode(GraphNode<L> n)
        {

        }
    }
}


