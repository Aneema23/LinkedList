/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

import java.util.LinkedList;

/**
 *
 * @author sanda
 */
public class Question13 {
     public static void main(String[] args) {
        // Create a LinkedList to simulate a queue
        LinkedList<Integer> queue = new LinkedList<>();

        // Enqueue integers
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        // Display the queue after adding elements
        System.out.println("Queue after enqueue operations: " + queue);

        // Dequeue the front element
        int removedElement = queue.removeFirst();

        // Display the removed element
        System.out.println("Dequeued element: " + removedElement);

        // Display the queue after the dequeue operation
        System.out.println("Queue after dequeue operation: " + queue);
    }
}
