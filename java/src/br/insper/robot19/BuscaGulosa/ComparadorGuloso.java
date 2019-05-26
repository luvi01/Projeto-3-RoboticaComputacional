package br.insper.robot19.BuscaGulosa;

import br.insper.robot19.Node;

import java.util.Comparator;

public class ComparadorGuloso implements Comparator<Node> {
    @Override
    public int compare(Node o1, Node o2) {
        if (o1.getH() > o2.getH()){
            return 1;
        }
        if (o1.getH() < o2.getH()){
            return -1;
        }else{
            return 0;
        }
    }
}
