//   https://leetcode.com/problems/copy-list-with-random-pointer/

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {

  public Node copyRandomList(Node head) {
    if (head == null) {
      return head;
    }
    // 1.introding new nodes btw old nodes
    Node curr = head;
    while (curr != null) {
      Node nn = new Node(curr.val); // creating new node with same value as curr
      // preserve
      Node next = curr.next;

      // link
      curr.next = nn; // adding new node to the nwxt of the curr
      nn.next = next; // setting next of new node to curr's orignal next so that new node with same
                      // data as curr gets in btw orignal LL

      // move
      curr = next;
    }
    // 2.set random pointers of new nodes

    curr = head;
    while (curr != null) {
      Node random = curr.random;

      if (random != null) {
        curr.next.random = random.next;
      }

      curr = curr.next.next;
    }
    // 3. segregate orignal list and copied list
    Node p1 = head;
    Node p2 = head.next;
    Node newH = p2;

    while (true) {
      Node n1 = p2.next;
      if (n1 == null) {
        p1.next = null;
        break;
      }

      Node n2 = n1.next;

      p1.next = n1;
      p2.next = n2;

      p1 = n1;
      p2 = n2;
    }

    return newH;

  }
}
