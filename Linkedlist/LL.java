public class LL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        size++;
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(i == idx-1) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            i++;
        } 
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("empty LL");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("empty LL");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        for(int i=0; i<size-2; i++) {
            temp = temp.next;
        }
        int val = temp.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int itSearch(int key) {
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int recSearch(int key) {
        return searchHelper(head, key);
    }

    public int searchHelper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }

        int idx = searchHelper(head.next, key);
        if(idx == -1) {
            return idx;
        }
        return idx+1;
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthfromEnd(int n) {
         int size = 0;
         Node temp = head;
         while(temp != null) {
             temp = temp.next;
             size++;
         }
         if(n == size) {
             head = head.next;
             return;
         }
         
         int i = 1;
         int itf = size-n;
         Node prev = head;
         while(i < itf) 
             prev = prev.next;
             i++;
         }
         prev.next = prev.next.next; 
    }

    private Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        Node mid = findMidNode(head);

        Node curr = mid;
        Node prev = null;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head; 
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public Node removeCycle() {
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
             if(fast == slow) {
                flag = 1;
                 break;
            }
        }
        
        if(flag == 0)
            return null;
        slow = head;
        int i = 0;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
            i++;
        }
        
        return slow;
    }
    
    private Node mergeSortHelper(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node mid = findMidNode(head);
        Node head2 = mid.next;
        mid.next = null;
        Node newHead1 = mergeSortHelper(head);
        Node newHead2 = mergeSortHelper(head2);

        Node finalHead = merge(newHead1, newHead2);

        return finalHead;
    }

    private Node merge(Node head1, Node head2) {
        Node finalHead = new Node(-1);
        Node temp = finalHead;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return finalHead.next;
    }

    public void mergeSort() {
        head = mergeSortHelper(head);
    }

    public static void main(String args[]) {
        LL ll = new LL();

        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);

        ll.print();
        ll.mergeSort();
        ll.print();
    }
}