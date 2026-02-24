public class deleteListas {
    static class Node{

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    // Implementación de lista simplemente enlazada
    static class SinglyLinkedList {
        
        public Node head;


        public void addNodeEnd(Node node) {
    
            // Caso lista vacía
            if (head == null) {

                head = node;
                return;

            }

            Node current = head;
            // Avanzar hasta el último nodo
            while (current.next != null) {
                current = current.next;
            }

            // Insertar al final
            current.next = node;
        
        }

        public void printList(){
            Node current = head;

            if (head != null){

                while (current != null){
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }

                System.out.println("null");

            }
            else{
                System.out.println("Lista vacía");
            }
        }

        public void remove(String nombre) {

            if (head == null) {
                return;
            }


            if (head.data.equals(nombre)) {
                head = head.next;
                return;
            }

            Node current = head;

            while (current.next != null) {

                if (current.next.data.equals(nombre)) {
                    current.next = current.next.next;
                    return; 
                } 
                else {
                    current = current.next;
                }
            }
        }


    }

    public static void main(String[] args) {

        SinglyLinkedList lista = new SinglyLinkedList();
        Node nodo1 = new Node("Carlos");
        Node nodo2 = new Node("Elena");
        Node nodo3 = new Node("Marco");
        Node nodo4 = new Node("Sofia");

        lista.addNodeEnd(nodo1);
        lista.addNodeEnd(nodo2);
        lista.addNodeEnd(nodo3);
        lista.addNodeEnd(nodo4);

        lista.printList();

        lista.remove("Carlos");
        lista.printList();

        lista.remove("Marco");
        lista.printList();

    }

    
}
