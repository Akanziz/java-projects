import java.util.LinkedHashMap;
import java.util.Map;

class ChoiceQuestion extends Question {

    private final Map<String, Boolean> choices;

    ChoiceQuestion(String prompt) {
        super(prompt);
        this.choices = new LinkedHashMap<>();
    }

    void addChoice(String answer, boolean isCorrect) {
        this.choices.put(answer, isCorrect);
        if (isCorrect) {
            super.setAnswer(answer);
        }
    }

    public Map<String, Boolean> getChoices() {
        return this.choices;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + String.join("\n", this.choices.keySet());
    }
}