class Node:
  data = int()
  next = None

class LinkedList:
  head = None

  def insert(data):
    new_node = Node()
    new_node.data = data
    new_node.next = self.head
    self.head = new_node

  def display():
    temp = self.head
    while (temp != null):
      print(temp.data, end=" ")
      temp = temp.next



    obj = LinkedList()
    obj.insert(10)
    obj.insert(20)
    obj.insert(30)
    print("Linked List:")
    obj.display()



