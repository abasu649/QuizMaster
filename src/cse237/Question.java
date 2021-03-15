package cse237;

public class Question {
	
	String prompt;
	String correctAnswer;
	
	public  Question(String prompt, String correctAnswer) {
		this.prompt = prompt;
		this.correctAnswer = correctAnswer;
	}
	
	public boolean checkAnswer(String potentialAnswer) {
		return potentialAnswer.equals(correctAnswer);
	}
}
