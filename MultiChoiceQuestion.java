// modify choice question to be a multi choice question
public class MultiChoiceQuestion extends ChoiceQuestion {

    public MultiChoiceQuestion() {
        super();
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            // Convert choices.size() to string
            String choiceString = getAnswer() + choices.size() + " ";
            setAnswer(choiceString);
        }
    }
}
