/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:3 Dec
 * Description: Assignment practice of Collection
 */
package Wenqi_Tang_Sect8284_Assignment3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

/**
 * The CourseList class demonstrates various operations on LinkedLists containing course names.
 * It performs tasks such as adding, modifying, and manipulating lists of courses.
 * @author Wenqi Tang
 * @version 1.0
 */
public class CourseList {

    /**
     * The main method serves as the entry point for the program, showcasing various operations on LinkedLists.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {


        System.out.println("Welcome Everyone to My Assignment 3. My name is Wenqi Tang");

        // add courses to list1
        String[] courses = {"math", "english", "chemistry", "physics", "history", "geography"};
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList(courses));

        // add courses2 to list2
        String[] courses2 = {"religion", "arts", "accounting", "math", "programming", "biology"};
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList(courses2));

        // Add elements in list2 to list1
        list1.addAll(list2);

        // Print out the initial list
        System.out.println("The List is:\n" + list1);

        // Convert all elements in list1 to uppercase and print the updated list
        System.out.printf("%nDisplaying names of courses in uppercase letters...");
        list1.replaceAll(String::toUpperCase);
        System.out.println("\nThe List is:\n" + list1);

        // Create a sublist of items 4 to 6 from list1, delete the sublist, and print the updated output
        System.out.printf("%nDeleting courses 4 to 6...");
        list1.subList(4,7).clear();
        System.out.println("\nThe List is:\n" + list1);

        // Display the current list of courses
        System.out.printf("%nHere is the current list of courses...");
        System.out.println("\nThe List is:\n" + list1);

        // Print the list in reverse order
        System.out.printf("%nReversed List:");
        Collections.reverse(list1);
        System.out.println("\n" + list1);;

        // Sort the list alphabetically and print it
        System.out.printf("%nSorted courses in alphabetical order...");
        Collections.sort(list1);
        System.out.println("\nThe List is:\n" + list1);

        // Eliminate all duplicated elements and print the final content of the list
        System.out.printf("%nRemoving duplicate courses...");
        Set<String> uniqueCourses = new HashSet<>(list1);
        System.out.println("\nNon-duplicates are: " + uniqueCourses);
    }


}

