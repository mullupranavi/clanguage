class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_end(self, data):
        n = Node(data)
        if not self.head:
            self.head = n
        else:
            t = self.head
            while t.next:
                t = t.next
            t.next = n

    def delete_front(self):
        if self.head:
            self.head = self.head.next

    def traverse(self):
        t = self.head
        while t:
            print(t.data, end=" ")
            t = t.next
        print()


ll = LinkedList()
ll.insert_end(10)
ll.insert_end(20)
ll.insert_end(30)
ll.traverse()       
ll.delete_front()
ll.traverse()     
