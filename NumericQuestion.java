public class NumericQuestion extends Question {

    private double answer;

    public boolean checkAnswer(String response) {

        double responseAsDouble = Double.parseDouble(response);

        return Math.abs(responseAsDouble - answer) < 0.01;

    }

    public void setAnswer(String correctResponse) {

        answer = Double.parseDouble(correctResponse);

    }

}