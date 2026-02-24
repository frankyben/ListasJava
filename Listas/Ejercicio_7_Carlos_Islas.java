public class Ejercicio_7_Carlos_Islas {

        static class Node{

        String data;
        Node next;
        Node prev;

        Node(String  data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    // Implementación de lista simplemente enlazada
    static class DoubleLinkedList {
        
        public Node head;
        public Node tail;


        public void addNodeEnd(Node node) {
    
            // Caso lista vacía
            if (head == null) {

                head = node;
                tail = node;
                return;

            }

            Node current = head;
            // Avanzar hasta el último nodo
            while (current.next != null) {
                current = current.next;
            }

            // Insertar al final
            current.next = node;
            node.prev = current;
            this.tail = node;
        
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

        public void reverse(){

            Node current = tail;
            
            if(head != null){

                while (current != null){
                    System.out.print(current.data + " <-> ");
                    current = current.prev;
                }

                System.out.println("Null");
                
            }
            else{
                System.out.println("Lista vacía");
            }

        }

        public void delete(String x){

            if (head != null){

                Node current = head;

                if (current.data.equals(x)){
                    head = head.next;
                    head.prev = null;
                    return;
                }
                else if (tail.data.equals(x)){
                    tail = tail.prev;
                    tail.next = null;
                    return;
                }
                else{
                    while (current != null){
                        if (current.data.equals(x)){
                            current.prev.next = current.next;
                            current.next.prev = current.prev;
                            return;
                        }
                        current = current.next;
                    }
                }

            }
            else{
                System.out.println("Lista vacía");
            }

        }


    }

    public static void main(String[] args) {
        
        DoubleLinkedList lista = new DoubleLinkedList();

        lista.addNodeEnd(new Node("Escribir"));
        lista.addNodeEnd(new Node("Borrar"));
        lista.addNodeEnd(new Node("Copiar"));
        lista.addNodeEnd(new Node("Pegar"));

        lista.printList();
        lista.delete("Copiar");
        lista.printList();

    }
    
}
