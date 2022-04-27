# Instructions

## Activity 2.1

1. Create a new file Question.java.
2. Create two private String fields *question* and *answer*.
3. Create a no-arg constructor and initialize both the variables to empty string.
4. Create a parameterized constructor which can set only the question text and set answer field to empty string.
5. Create Getter and Setters for the two fields.
6. Create a method `checkAnswer` which will have an input parameter representing the user response. It will check if the response is equal to answer which was set initially.
7. Create a `display` method to display a question.
8. Replace the below code snippet in the `main` method of Main.java file.
```
Scanner in = new Scanner(System.in);
Question q = new Question();
q.setText("Who invented AC Current?");
q.setAnswer("Nikola Tesla");
q.display();
System.out.print("Your answer:");
String response = in.nextLine();
System.out.println(q.checkAnswer(response));
```
## Activity 2.2

1. Create a new file `MultiChoiceQuestion.java` and extend the    `Question` Class.
2. Create a new private field representing a list of Choices (Arraylist would be a good choice).
3. Create a parameterized constructor which can set only the question text using super constructor and initialize choices to empty Arraylist.
4. Create a method `addChoice` which will accept two input parameters choice ( String ) and correct ( boolean ).
    - If the correct parameter is true than add set the choice to be the answer.
5. Override the `display` method to display the Multiple Choice Question.
    - It will display the question and list of choices.
6. Add a new static method `askQuestion` in Main.java which will present the question.

```

public static void askQuestion(Question q){
  q.display();
  System.out.print("Your answer:");
  Scanner in = new Scanner(System.in);
  String response = in.nextLine();
  System.out.println(q.checkAnswer(response));
}

```

7. Replace the below code snippet in the `main` method of Main.java file.
```
MultiChoiceQuestion first = new MultiChoiceQuestion("What was the original name of the Java language?");
first.addChoice("*7",false);
first.addChoice("Duke",false);
first.addChoice("Oak",true);
first.addChoice("Gosling",false);

MultiChoiceQuestion second = new MultiChoiceQuestion("In which country was the Java born?");
second.addChoice("Australia",false);
second.addChoice("Canada",true);
second.addChoice("Denmark",false);
second.addChoice("USA",false);

askQuestion(first);
askQuestion(second);

```
