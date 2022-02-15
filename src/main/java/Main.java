import Exceptions.CustomExceptions;
import Games.Premierleague.Controller;
import Games.Premierleague.Export;
import Games.Premierleague.Import;
import Games.Premierleague.Team;
import Inheritance.Circle;
import Inheritance.Rectangle;
import Inheritance.Shapes;
import Inheritance.Square;
import OOP_1.*;
import Testing.Testing;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
//        //Testing area
//        Testing.testing();
//
//        //Competence checks
//        Leetspeek.leetspeek();
//        Selection.selection();
//        Merge.merge();
//        SumOfTwo.sumOfTwoTest();
//        //check also with JunitTest - CompetenceCheck - SumOfTwoTest
//
//        //Week 01 - Day 01
//        IntroductionToJava.VariableAndDatatype.aboutMe();
//        IntroductionToJava.VariableAndDatatype.simpleCalculations();
//        IntroductionToJava.VariableAndDatatype.workingWithStrings();
//
//        //Week 01 - Day 02
//        IntroductionToJava.AssignmentAndLogicalOperator.CharacteristicsOfANumber();
//        IntroductionToJava.AssignmentAndLogicalOperator.freeTimeOrWorkTime();
//        IntroductionToJava.AssignmentAndLogicalOperator.translatingGrades();
//
//        //Week 01 - Day 03
//        FizzBuzz.fizzBuzz();
//        Multiplications.multiplications();
//        CaesarChiffre.caesarChiffre();
//        MaximaCalculation.maximaCalculation();
//
//        //Week 02 - Day 01
//        BingoCard.bingoCard();
//        BingoCard.bingoCard2();
//
//        //Week 02 - Day 02 to Day 04
//        Insertion.insertion();
//        Bubble.bubble();
//        DivideAndConquer.divideAndConquer();
//
//        //Week 03 - Day 01 to Day 02
//        FizzBuzzMethods.fizzBuzzMethods();
//        GameOfLife.gameOfLife();
//
//        //Week 04 - Day 01
//        SetTheory.setTheory();
//        Dictionary.dictionary();
//        BubbleArrayList.bubbleArrayList();
//
//        //Week 05 - Day 01 to Day 02
//        UnitTesting.addTest();
//        //check also with JunitTest - UnitTesting - UnitTestingTest
//
//        //Week 06 - Day 01
//        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
//        doubleLinkedList.add(10);
//        doubleLinkedList.add(20);
//        doubleLinkedList.add(30);
//        doubleLinkedList.add(40);
//        doubleLinkedList.add(50);
//        doubleLinkedList.add(60);
//        doubleLinkedList.add(70);
//        doubleLinkedList.add(80);
//        doubleLinkedList.add(90);
//        doubleLinkedList.add(100);
//        System.out.println(doubleLinkedList);
//        System.out.println(doubleLinkedList.get(0));
//        System.out.println(doubleLinkedList);
//        System.out.println(doubleLinkedList.getReverse(0));
//        doubleLinkedList.printReverse();
//        System.out.println(doubleLinkedList.size());
//        System.out.println("Is the number 50 inside of the list? ... " + doubleLinkedList.contains(50));
//        doubleLinkedList.remove(0);
//        System.out.println(doubleLinkedList);
//        doubleLinkedList.removeReverse(0);
//        System.out.println(doubleLinkedList);
//        doubleLinkedList.clear();
//        System.out.println(doubleLinkedList);
//
//        //With typ "T"
//        DoubleLinkedListTwo doubleLinkedListTwo = new DoubleLinkedListTwo<>();
//        doubleLinkedListTwo.add(10);
//        doubleLinkedListTwo.add(20);
//        doubleLinkedListTwo.add(30);
//        doubleLinkedListTwo.add(40);
//        doubleLinkedListTwo.add(50);
//        doubleLinkedListTwo.add(60);
//        doubleLinkedListTwo.add(70);
//        doubleLinkedListTwo.add(80);
//        doubleLinkedListTwo.add(90);
//        doubleLinkedListTwo.add(10.0);
//        doubleLinkedListTwo.add("String is also Working with 'T'!");
//        System.out.println(doubleLinkedListTwo);
//        System.out.println(doubleLinkedListTwo.get(0));
//        System.out.println(doubleLinkedListTwo.getReverse(0));
//        doubleLinkedListTwo.printReverse();
//        System.out.println("Is the number 10.0 inside of the list? ... " + doubleLinkedListTwo.contains(10.0));
//        System.out.println(doubleLinkedListTwo);
//        doubleLinkedListTwo.remove(0);
//        System.out.println(doubleLinkedListTwo);
//        doubleLinkedListTwo.removeReverse(0);
//        System.out.println(doubleLinkedListTwo);
//        doubleLinkedListTwo.clear();
//        System.out.println(doubleLinkedListTwo);
//
//        //Week 06 - Day 02
//        PeopleManagementSystem peopleManagementSystem = new PeopleManagementSystem();
//        peopleManagementSystem.createPerson("Emanuel", "Leutgeb");
//        peopleManagementSystem.createPerson("Emanuel", "Leutgeb", "27.09.1996", 25, 4600, "Wels", "Birkenstraße 6", Sex.MALE);
//        peopleManagementSystem.createPerson("Emanuel", 25, "27.09.1996");
//
//        //Week 07 - Day 01
//        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
//        doubleLinkedList.add(10);
//        doubleLinkedList.add(20);
//        doubleLinkedList.add(30);
//        doubleLinkedList.add(40);
//        doubleLinkedList.add(50);
//        doubleLinkedList.add(60);
//        doubleLinkedList.add(70);
//        doubleLinkedList.add(80);
//        doubleLinkedList.add(90);
//        doubleLinkedList.add(100);
//        System.out.println(doubleLinkedList);
//        System.out.println(doubleLinkedList.get(0));
//        System.out.println(doubleLinkedList);
//        System.out.println(doubleLinkedList.getReverse(0));
//        doubleLinkedList.printReverse();
//        System.out.println(doubleLinkedList.size());
//        System.out.println("Is the number 50 inside of the list? ... " + doubleLinkedList.contains(50));
//        doubleLinkedList.remove(0);
//        System.out.println(doubleLinkedList);
//        doubleLinkedList.removeReverse(0);
//        System.out.println(doubleLinkedList);
//        doubleLinkedList.clear();
//        System.out.println(doubleLinkedList);
//
//        //Week 07 - Day 01
//        Stack stack = new Stack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        stack.push(60);
//        stack.push(70);
//        stack.push(80);
//        stack.push(90);
//        stack.push(100);
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(Arrays.toString(stack.pop(5)));
//        System.out.println(stack);
//        System.out.println(stack);
//
//        //Week 07 - Day 01
//        Queue queue = new Queue();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.enqueue(60);
//        queue.enqueue(70);
//        queue.enqueue(80);
//        queue.enqueue(90);
//        queue.enqueue(100);
//        System.out.println(queue);
//        System.out.println(queue.size());
//        System.out.println(queue.dequeue());
//        System.out.println(queue);
//        System.out.println(Arrays.toString(queue.dequeue(5)));
//        System.out.println(queue);
//        System.out.println(queue);
//
//        //Week 07 - Day 02
//        Camera cameraSony = new Camera("Sony", 12, 4.7, true, new Lens(30, 20));
//        Camera cameraKodiak = new Camera("Kodiak", 40, 7, true, new Lens(20, 100));
//        Camera cameraNikon = new Camera("Nikon", 20, 3, false, new Lens(10, 20));
//        cameraNikon.getLens().setMinFocalLength(20);
//        cameraNikon.getLens().setMaxFocalLength(10);
//        System.out.println(Camera.instantiationCamera);
//        System.out.println(Lens.instantiationLens)
//
//        //Week 08 - Day 01
//        Circle circle = new Circle("red", true, 5);
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());
//        //circle.setRadius(-5);
//
//        Rectangle rectangle = new Rectangle("green", false, 5, 10);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());
//        //rectangle.setLength(-10);
//
//        Square square = new Square("blue", true, 7);
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//        //square.setLength(-7);
//
//        //Week 09 - Day 01
//        CustomExceptions.myBasicDay();
//
//        //Week 09 - Day 02
//        Controller controller = Import.importCSV();
//        controller.evaluateGames();
//        controller.calculatePoints();
//        Export.exportCSV(controller.getTeams(), "initialGame");
//
//        controller.playGame();
//        controller.printTeamStatistic();
//
//        Export.exportCSV(controller.getTeams(), "playedGame");
    }
}
