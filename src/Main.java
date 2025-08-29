import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String[] questions = {"Q1. Which of the following is the correct way to print something in Java?",
                "Q2. What is the default value of an int in Java?", "Q3. Which keyword is used to define a class in Java?",
                "Q4. In Java, which of these is NOT a primitive data type?",
                "Q5. What does JVM stand for?"};

        String[][] options = {{"1)print(\"Hello World\")", "2) System.out.println(\"Hello World\");", "3) echo(\"Hello World\");", "4) Console.write(\"Hello World\");"},
                {"1) 0", "2) null", "3) undefined", "4) 1"},
                {"1) define", "2) struct", "3) class", "4) new"},
                {"1) int", "2) String", "3) double", "4) boolean"},
                {"1) Java Virtual Machine", "2) Java Variable Manager", "3) Java Verified Module", "4) Java Version Manager"}};

        int[] answers = {2, 1, 3, 2, 1};
        int guess;
        int score = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("*******************");
        System.out.println("  JAVA QUIZ GAME   ");
        System.out.println("*******************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("Enter your guess");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("*******************");
                System.out.println("      CORRECT      ");
                System.out.println("*******************");
                score++;
            } else {
                System.out.println("*******************");
                System.out.println("       WRONG       ");
                System.out.println("*******************");
            }
            try {
                Thread.sleep(1500); // wait 1.5 seconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println("Your total score is " + score + " out of " + questions.length);

            scanner.close();
        }

    }



