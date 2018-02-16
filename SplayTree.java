
public class SplayTree <T extends Comparable<T>> {
	SplaySubTree<T> root;
	
	public SplayTree(){
		root = new SplaySubTree<T>(null);
	}
	
	/**
	 * @param index - of the node to search for.
	 * @return  - null if index<0 or index>=size otherwise SubTree at index. 
	 */
	public T get(long index) {
		SplaySubTree<T> cT = root.get(index);
		cT.splay();
		root = cT;
		return cT.getData();
	}
	
	/**
	 * @return - the number of nodes in the tree.
	 */
	public long size() { return root.size();}

	/**
	 * @param node - to search for.
	 * @return - the index of node. All nodes are ordered according to the compareTo(T) method.
	 *         
	 */
	public long indexOf(T node) {
		return root.indexOf(node);
	}
	

}
