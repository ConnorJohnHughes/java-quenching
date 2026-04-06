import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    public T data;
    public List<TreeNode<T>> children;

    public TreeNode(T data) {
      this(data, new ArrayList<>());
    }

    public TreeNode(T data, List<TreeNode<T>> children) {
      this.data = data;
      this.children = new ArrayList<>(children);
    }
}
