class MultipleChoiceQuestion extends Question {
    List‹String> choices;
    MultipleChoiceQuestion(ArrayList<String> choices) {
    this.choices = choices;
  }
  void addChoice (String choice, boolean correct) {
  this.choices .add (choice);
  if (correct) {
  this.answer = choice;
    }
 }
  @Override
  public void display() {
    System.out.println(question);
      for(String choice: choices) {
      System.out.println(choice);
        }
    }
}