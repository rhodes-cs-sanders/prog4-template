import java.util.ArrayList;
import java.util.List;

/**
 * A map implemented with a binary search tree.
 */
public class BSTMap<K extends Comparable<K>, V> {

    private Node<K, V> root;    // points to the root of the BST.

    /**
     * Create a new, empty BST.
     */
    public BSTMap() {
        root = null;
    }

    /**
     * Put (add a key-value pair) into this BST.  If the key already exists, the old
     * value will be overwritten with the new one.
     */
    public void put(K newKey, V newValue)
    {
        // Your code here.
    }

    /**
     * Helper function for put.
     */
    private void put(Node<K, V> curr, K newKey, V newValue)
    {
        // Your code here.
    }

    /**
     * Get a value from this BST, based on its key.  If the key doesn't already exist in the BST,
     * this method returns null.
     */
    public V get(K searchKey)
    {
        return null; // remove this.
        // Your code here.
    }

    /**
     * Test if a key is present in this BST.  Returns true if the key is found, false if not.
     */
    public boolean containsKey(K searchKey)
    {
        return true;  // remove this.
        // Your code here.
    }

    /**
     * Given a key, remove the corresponding key-value pair from this BST.  Returns true
     * for a successful deletion, or false if the key wasn't found in the tree.
     */
    public boolean remove(K removeKey)
    {
        return true; // remove this.
        // Your code here.
    }

    /**
     * Return the number of key-value pairs in this BST.
     */
    public int size()
    {
        return 0;  // remove this.
        // Your code here.
    }

    /**
     * Return the height of this BST.
     */
    public int height()
    {
        return 0;  // remove this.
        // Your code here.
    }

    /**
     * Return a List of the keys in this BST, ordered by a preorder traversal.
     */
    public List<K> preorderKeys()
    {
        return null;  // remove this.
        // Your code here.
    }

    /**
     * Return a List of the keys in this BST, ordered by a inorder traversal.
     */
    public List<K> inorderKeys()
    {
        return null;  // remove this.
        // Your code here.
    }

    /**
     * Return a List of the keys in this BST, ordered by a postorder traversal.
     */
    public List<K> postorderKeys()
    {
        return null;  // remove this.
        // Your code here.
    }

    /**
     * It is very common to have private classes nested inside other classes.  This is most commonly used when
     * the nested class has no meaning apart from being a helper class or utility class for the outside class.
     * In this case, this Node class has no meaning outside of this BSTMap class, so we nest it inside here
     * so as to not prevent another class from declaring a Node class as well.
     *
     * Note that even though the members of node are public, because the class itself is private
     */
    private static class Node<K extends Comparable<K>, V> {
        public K key = null;
        public V value = null;
        public Node<K, V> left = null;     // you may initialize member variables of a class when they are defined;
        public Node<K, V> right = null;    // this behaves as if they were initialized in a constructor.
    }
}
