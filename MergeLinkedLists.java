import org.w3c.dom.Node;

public class MergeLinkedLists {
    public Node mergeLists(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        Node prev1 = curr1;
        Node prev2 = curr2;

        if (curr1.next == null && curr2.next == null) {
            throw new NullPointerException("Both lists are null");
        }
        if (curr1.next == null) {
            head1.next = head2;
            return head2;
        }
        if (curr2.next == null) {
            head2.next = head1;
            return head1;
        }

        if (curr1.data <= curr2.data) {
            curr1.next = curr2;
            curr1 = curr1.next;
            curr2 = curr2.next;
        } else {
            curr2.next = curr1;
        }
    }
}
