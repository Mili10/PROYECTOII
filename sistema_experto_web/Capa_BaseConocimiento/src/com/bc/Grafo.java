package com.bc;
import java.util.*;

public class Grafo {

	  public Map<Integer, Set<Integer>> edges = new TreeMap<>();//Map<clave,valor>

	  public void addNode(int u) {
	    if (!edges.containsKey(u)) {//verifica si la clave esta en el map
	      edges.put(u, new TreeSet<Integer>()); //crear un nodo (clave,valor)
	    }
	  }

	  public void removeNode(int u) {
	    if (!edges.containsKey(u)) {
	      return;
	    }
	    for (int v : edges.get(u)) {//get para obtener el valor de la clave u y recorrer treeSet
	      edges.get(v).remove(u);
	    }
	    edges.remove(u);
	  }

	  
	  public void addEdge(int u, int v) {
	    addNode(u);
	    addNode(v);
	    edges.get(u).add(v);
	    edges.get(v).add(u);
	  }

	  public void removeEdge(int u, int v) {
	    edges.get(u).remove(v);
	    edges.get(v).remove(u);
	  }

	  // Usage example
	  public static void main(String[] args) {
	    Grafo g = new Grafo();
	    g.addEdge(0, 1);
	    g.addEdge(1, 2);
	    System.out.println(g.edges);
	    g.removeEdge(1, 0);
	    System.out.println(g.edges);
	    g.removeNode(1);
	    System.out.println(g.edges);
	  }
}
