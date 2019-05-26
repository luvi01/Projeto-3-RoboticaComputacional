package br.insper.robot19.BuscaA;

import br.insper.robot19.Node;

import java.util.Comparator;

public class ComparadorA implements Comparator<Node> {
    @Override
    public int compare(Node o1, Node o2) {
        if (o1.getN() > o2.getN()){
            return 1;
        }
        if (o1.getN() < o2.getN()){
            return -1;
        }else{
            return 0;
        }
    }
}
