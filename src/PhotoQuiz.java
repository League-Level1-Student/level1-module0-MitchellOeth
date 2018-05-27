
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image
		Component comp;
		// 3. use the "createImage()" method below to initialize your Component
		comp = createImage(
				"https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Google_2015_logo.svg/2000px-Google_2015_logo.svg.png");
		// 4. add the image to the quiz window
		quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("Which company does this logo represent?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("Google")) {
			System.out.println("Correct!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("Incorrect!");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line of code)
		Component comp1;
		comp1 = createImage(
				"data:image/png;base64,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");
		// 11. add the second image to the quiz window
		quizWindow.add(comp1);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer1 = JOptionPane.showInputDialog("Which company does this logo represent?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer1.equals("Samsung")) {
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect!");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
