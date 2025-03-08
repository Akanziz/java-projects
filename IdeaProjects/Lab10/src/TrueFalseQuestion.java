class TrueFalseQuestion extends ChoiceQuestion {

    TrueFalseQuestion(String prompt, boolean answer) {
        super(prompt); // Call superclass constructor with the prompt

        // Add choices based on the provided answer
        if (answer) {
            super.addChoice("true", true);
            super.addChoice("false", false);
        } else {
            super.addChoice("true", false);
            super.addChoice("false", true);
        }
    }

    @Override
    void addChoice(String answer, boolean isCorrect) {
        // Override the addChoice method to prevent adding choices in TrueFalseQuestion
        throw new UnsupportedOperationException("TrueFalseQuestion: cannot add choice.");
    }
}