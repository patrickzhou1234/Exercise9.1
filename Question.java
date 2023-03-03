/**
 * A question with a text and an answer.
 */
public class Question {
   private String text;
   private String answer;

   /**
    * Constructs a question with empty question and answer.
    */
   public Question() {
      text = "";
      answer = "";
   }

   /**
    * Sets the question text.
    * 
    * @param questionText the text of this question
    */
   public void setText(String questionText) {
      text = questionText;
   }

   public String getAnswer() {
      return answer;
   }

   /**
    * Sets the answer for this question.
    * 
    * @param correctResponse the answer
    */
   public void setAnswer(String correctResponse) {
      answer = correctResponse;
   }

   /**
    * Checks a given response for correctness.
    * 
    * @param response the response to check
    * @return true if the response was correct, false otherwise
    */
   public boolean checkAnswer(String response) {
      if (response.equals(answer)) {
         return true;
      } else {
         int i;
         response = response.replace(" ", "");
         answer = answer.replace(" ", "");
         boolean works = true;
         for (i = 0; i < answer.length(); i++) {
            if (!(Character.toUpperCase(response.charAt(i)) == answer.charAt(i)
                  || Character.toLowerCase(response.charAt(i)) == answer.charAt(i))) {
               works = false;
            }
         }
         return works;
      }
   }

   /**
    * Displays this question.
    */
   public void display() {
      System.out.println(text);
   }
}
