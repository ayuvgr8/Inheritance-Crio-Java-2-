public class Question { 
  private String question, answer;
  
  public Question(){ 
    this.question = "";
    this.answer = "";
 }
    public Question(String question) {
    this.question = question;
    this.answer="";
  }
  public String getQuestion(){
    return question;    
    }
  public String getAnswer(){
    return answer;
  }
  public void setQuestion(String question) {
    this.question = question;
  }
  public void setAnswer (String answer) {
    this.answer = answer;
  }
  
  public boolean checkAnswer (final String response) {
    if (this.answer.equals (response)) {
    return true;
  }
  return false;
    }
 }