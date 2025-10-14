import java.util.Scanner;

class JavaQuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // JAVA QUIZ GAME

        // Question array[]
        String[] questions = {
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "What is the smallest planet in our solar system?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the chemical symbol for water?"
        };

        // Options 2D array[][]
        String[][] options = {
            {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
            {"1. Earth", "2. Jupiter", "3. Mars", "4. Saturn"},
            {"1. Mercury", "2. Venus", "3. Earth", "4. Mars"},
            {"1. William Shakespeare", "2. Charles Dickens", "3. Mark Twain", "4. Jane Austen"},
            {"1. H2O", "2. O2", "3. CO2", "4. N2"}
        };

        // DECLARE VARIABLES
        int[] answers = {3, 2, 1, 1, 1};
        int score = 0;
        int guess;

        // WELCOME MESSAGE
        System.out.println("******** WELCOME TO THE JAVA QUIZ GAME! ********");

        // QUESTIONS LOOP
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            // DISPLAY OPTIONS
            for (String option : options[i]) {
                System.out.println(option);
            }
            // ASK QUESTION
            System.out.print("Enter your answer (1-4): ");
            guess = scanner.nextInt();

            // CHECK ANSWER
            if (guess == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was option " + answers[i]);
            }
        }
        
        // DISPLAY FINAL SCORE
        System.out.println("\nYour final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}