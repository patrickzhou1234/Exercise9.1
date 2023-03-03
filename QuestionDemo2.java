import java.util.Scanner;

/** This program shows a simple quiz with two choice questions. */
public class QuestionDemo2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      ChoiceQuestion first = new ChoiceQuestion();
      first.setText("What was the original name of the Java language?");
      first.addChoice("*7", false);
      first.addChoice("Duke", false);
      first.addChoice("Oak", true);
      first.addChoice("Gosling", false);

      ChoiceQuestion second = new ChoiceQuestion();
      second.setText("In which country was the inventor of Java born?");
      second.addChoice("Australia", false);
      second.addChoice("Canada", true);
      second.addChoice("Denmark", false);
      second.addChoice("United States", false);

      MultiChoiceQuestion third = new MultiChoiceQuestion();
      third.setText("What are the names of the two main characters in the movie 'Toy Story'?");
      third.addChoice("Woody", true);
      third.addChoice("Buzz", true);
      third.addChoice("Mr. Potato Head", false);
      third.addChoice("Slinky", false);

      presentQuestion(first, in);
      presentQuestion(second, in);
      presentQuestion(third, in);
      in.close();
   }

   /**
    * Presents a question to the user and checks the response.
    * 
    * @param q the question
    */
   public static void presentQuestion(Object obj, Scanner in) {
      if (obj instanceof ChoiceQuestion) {
         ChoiceQuestion q = (ChoiceQuestion) obj;
         q.display();
         System.out.print("Your answer: ");
         String response = in.nextLine();
         System.out.println(q.checkAnswer(response));
      } else if (obj instanceof MultiChoiceQuestion) {
         MultiChoiceQuestion q = (MultiChoiceQuestion) obj;
         q.display();
         System.out.print("Your answer: ");
         String response = in.nextLine();
         System.out.println(q.checkAnswer(response));
      } else {
         System.out.println("Error: Invalid object type");
      }
   }
}
