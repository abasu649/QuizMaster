package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse237.Question;

class QuestionTests {

	@Test
	void testCheckAnswerCorrect() {
		Question quizQuestion = new Question("What is the best distribution?", "normal"); //setup
		boolean correct = quizQuestion.checkAnswer("normal"); //test 1 method
		assertTrue(correct); //check for correctness
	}
	
	@Test
	void testCheckAnswerIncorrect() {
		Question quizQuestion = new Question("What is the best distribution?", "normal"); //setup
		boolean correct = quizQuestion.checkAnswer("hypergeometric"); //test 1 method
		assertFalse(correct); //check for correctness
	}
	

	
}
