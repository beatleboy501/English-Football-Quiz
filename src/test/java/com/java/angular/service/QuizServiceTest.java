package com.java.angular.service;

import com.java.angular.domain.Quiz;
import junit.framework.TestCase;
import junit.framework.Assert;
import org.junit.Test;

public class QuizServiceTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	@Test
	public final void testGetDefaultQuiz() throws Exception {
		QuizService quizService = new QuizService();
		Quiz quiz = quizService.getDefaultQuiz();
		Assert.assertNotNull(quiz);
		Assert.assertEquals("In What City Should You Live?", quiz.getTitle());
		Assert.assertEquals(5, quiz.getNumberOfQuestions());
	}

}
