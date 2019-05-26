package br.insper.robot19;

import static java.lang.Math.abs;

public class Node {
	private Block value;
	private Node parent;
	private RobotAction action;
	private float pathCost;
	private int h;
	private float n;

	public Node (Block value, Node parent, RobotAction action, float cost,Block end) {
		this.value = value;
		this.parent = parent;
		this.action = action;
		this.pathCost = parent == null ? 0 : parent.getPathCost() + cost;
		int x = value.row;
		int y = value.col;
		int xF = end.row;
		int yF = end.col;
		this.h = abs(x-xF) + abs(y-yF);
		float k = parent == null ? 0 : parent.getPathCost() + cost;
		this.n = k + this.h;


	}


	public Block getValue() {
		return value;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public RobotAction getAction() {
		return action;
	}
	
	public float getPathCost() {
		return pathCost;
	}

	public int getH(){
		return h;
	}

	public float getN(){
		return n;
	}



}
