class FillInBlankQuestion extends ChoiceQuestion {


    FillInBlankQuestion(String prompt) {
        super(prompt);
    }

    void addChoice(String ans){
        super.addChoice(ans, true);
    }

    boolean isCorrect(String ans){
        return this.getChoices().containsKey(ans);
    }

    @Override
    public String toString() {
        return super.getPrompt();
    }

    @Override
    void setAnswer(String ans) {
        throw new UnsupportedOperationException("FillInBlankQuestion: cannot directly set answer.");
    }

    @Override
    String getAnswer() {
        throw new UnsupportedOperationException("FillInBlankQuestion: cannot directly get answer.");
    }
}
