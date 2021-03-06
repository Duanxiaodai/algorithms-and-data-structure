import java.util.LinkedList;
import java.util.Queue;

//"static void main" must be defined in a public class.
//“静态void main”必须在公共类中定义。
public class  showQueue{
 public static void main(String[] args) {
     // 1. Initialize a queue.
     //1.初始化一个队列。
     Queue<Integer> q = new LinkedList<Integer>();
     // 2. Get the first element - return null if queue is empty.
     //2.获取第一个元素——如果队列为空，返回null。
     System.out.println("The first element is: " + q.peek());
     // 3. Push new element.
     //3. 插入新元素。
     q.offer(5);
     q.offer(13);
     q.offer(8);
     q.offer(6);
     // 4. Pop an element.
     //4. 检索并删除该队列的头，如果此队列为空，则返回{@code null}。
     q.poll();
     // 5. Get the first element.
     //5. 得到第一个元素。
     System.out.println("The first element is: " + q.peek());
     // 7. Get the size of the queue.
     //获取队列的大小。
     System.out.println("The size is: " + q.size());
 }
}
