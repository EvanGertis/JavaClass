package com.gertis;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbrane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");

        printList(placesToVisit);
        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList)
    {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext())
        {
            System.out.println("Now visiting " + i.next());
        }

        System.out.println("==================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext())
        {
            int comparision = stringListIterator.next().compareTo(newCity);
            if(comparision == 0)
            {
                // equal, do not add
                System.out.println(newCity + " is already included as destination");
            }
            else if (comparision > 0)
            {
                // new City should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparision < 0)
            {
                // move on next city

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty())
        {
            System.out.println("No cities in the itenerary");
        }
        else
        {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                    System.out.println("Holiday (vacation) over ");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward)
                    {
                        listIterator.next();
                    }
                    goingForward = true;
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("There was not a previous destination ");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu()
    {
        System.out.println("Available actions:\n press ");
        System.out.println(" 0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
