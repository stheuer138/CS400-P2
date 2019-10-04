import java.util.List;

/**
 * 
 * Class to implement a BalanceSearchTree. Can be of type AVL or Red-Black.
 * Note which tree you implement here and as a comment when you submit.
 * 
 * @param <K> is the generic type of key
 * @param <V> is the generic type of value
 */
public class BALST<K extends Comparable<K>, V> implements BALSTADT<K, V> {

	private BSTNode<K, V> root;

	private int numKeys;

	public BALST() {
	}

	@Override
	public K getKeyAtRoot() {		
		return root.getKey();
	}

	@Override
	public K getKeyOfLeftChildOf(K key) throws IllegalNullKeyException, KeyNotFoundException {
		// TODO Auto-generated method stub
	  if (key == null) {
	    throw new IllegalNullKeyException();
	  }
	 if (key == root.getKey()) {
		 BSTNode<K, V> leftChild = root.getLeftChild();
		 return leftChild.getKey();
		 //compare to does first item - second item, this if statement would have to traverse the left tree
	 }else if(key.compareTo(root.getKey()) < 0) {
		 
	 }
	  
	}

	@Override
	public K getKeyOfRightChildOf(K key) throws IllegalNullKeyException, KeyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHeight() {
		// uses recursive private method to determine the height from the root node
		return heightHelper(root);
	}
	
	private int heightHelper(BSTNode<K, V> node) {
		//checks that the tree isn't empty
		if (node == null) {
			return 0;
		}else {
			//gets the left and right heights with the recursive method
			int leftHeight = heightHelper(node.getLeftChild());
			int rightHeight = heightHelper(node.getRightChild());
			//compares the two heights to see which one is larger and adds one to account for the original root node
		if (leftHeight > rightHeight) {
			return (leftHeight + 1);
		}else {
			return (rightHeight + 1);
		}
			
		}
	}

	@Override
	public List<K> getInOrderTraversal() {
		// uses a recursive private method to produce a list of an in order traversal of the BST
		return inOrderTraversalHelper(root);
	}
	
	private List<K> inOrderTraversalHelper(BSTNode<K, V> node){
		//creates a list to append the values to
		List<K> inorderlist; 
		
		//checks that the node isn't null
		if (node != null){
			//goes down the left subtree and calls a recursive method
			inOrderTraversalHelper(node.getLeftChild());
			//adds the key to the list
			inorderlist.add(node.getKey());
			//goes down the right subtree
			inOrderTraversalHelper(node.getRightChild());
		}
		//returns the list of key values in order
		return inorderlist;
	}

	@Override
	public List<K> getPreOrderTraversal() {
		// returns a list of the preorder traversal of the bst using a private recursive method
		return preOrderTraversalHelper(root);
	}
	
	private List<K> preOrderTraversalHelper(BSTNode<K, V> node) {
		//creates the list to add the keys to
		List<K> preOrderList;
		//begins the recursive method
		if (node == null) {
			return preOrderList;
			//adds first node to list
			preOrderList.add(node.getKey());
			//traverses the left side
			preOrderTraversalHelper(node.getLeftChild());
			//traverses the right side
			preOrderTraversalHelper(node.getRightChild());
		
		}
	}

	@Override
	public List<K> getPostOrderTraversal() {
		//gets the POT of the tree using a private recursive method 
		return postOrderTraversalHelper(root);
	}
	
	private List<K> postOrderTraversalHelper(BSTNode<K, V> node){
		List<K> postOrderList;
		//not sure why I would do this yet, need to test this to make sure it works
		if (node == null) {
			return postOrderList;
			//traverse the left side 
		postOrderTraversalHelper(node.getLeftChild());
		//then traverse the right side
		postOrderTraversalHelper(node.getRightChild());
		//then add keys to the list
		postOrderList.add(node.getKey());
		}
		
		
	}

	@Override
	public List<K> getLevelOrderTraversal() {
		// TODO Auto-generated method stub
		//use a private helper that uses the heighthelper method
		return null;
	}

	@Override
	public void insert(K key, V value) throws IllegalNullKeyException, DuplicateKeyException {
		// TODO Auto-generated method stub
		//shit is gonna need at least one helper method, not looking forward to this

	}

	@Override
	public boolean remove(K key) throws IllegalNullKeyException, KeyNotFoundException {
		// TODO Auto-generated method stub
		//fuck this, not a fan
		return false;
	}

	@Override
	public V get(K key) throws IllegalNullKeyException, KeyNotFoundException {
		// TODO Auto-generated method stub
		//should be the same code as contains but this will return the value at the key instead of true or false
		return null;
	}

	@Override
	public boolean contains(K key) throws IllegalNullKeyException {
		// TODO Auto-generated method stub
		//same code as get but this will return true or false 
		return false;
	}

	@Override
	public int numKeys() {
		// TODO Auto-generated method stub
		//seems like this should be similar to getHeight but with a count, could also call one of the traversal methods and just do size on the list
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		//fuck this thing, I hate printing shit so it looks good

	}
	
}
