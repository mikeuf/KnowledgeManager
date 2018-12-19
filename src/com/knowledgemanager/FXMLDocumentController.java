package com.knowledgemanager;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;

/**
 * FXMLDocumentController.fxml
 *
 * This is the controller for the application form. It presents a set of text
 * fields into which the user can enter data to be saved to the database.
 * Alternatively, the user can load existing articles from the database.
 */
public class FXMLDocumentController implements Initializable {

	@FXML
	private HTMLEditor htmlFieldProblem;
	@FXML
	private TextField textFieldArticleId;
	@FXML
	private TextField textFieldTitle;
	@FXML
	private HTMLEditor htmlFieldSolution;
	@FXML
	private Button btnLoad;
	@FXML
	private Button btnSave;
	@FXML
	private Button btnNewArticle;
	@FXML
	private Label label;
	@FXML
	private TextField textFieldLoadArticle;
	@FXML
	private Label labelLoadStatus;

	/**
	 * When the user clicks Load, the entered article id is selected from the
	 * database. The text fields are updated with the article data.
	 *
	 * @param The button click event handler
	 */
	@FXML
	private void handleBtnLoadAction(ActionEvent event) {

		int articleId = Integer.parseInt(textFieldLoadArticle.getText());

		// Checks to see if the article number actually exists
		if (articleId > newArticle()) {
			labelLoadStatus.setText("Article not found");
			labelLoadStatus.setVisible(true);
			return;
		} else {
			labelLoadStatus.setVisible(false);
		}

		// retrieve the article fields from the database
		List list = loadArticle(articleId);

		String id = (String) list.get(0);
		String title = (String) list.get(1);
		String problem = (String) list.get(2);
		String solution = (String) list.get(3);

		textFieldArticleId.setText(id);
		textFieldTitle.setText(title);
		htmlFieldProblem.setHtmlText(problem);
		htmlFieldSolution.setHtmlText(solution);
	}

	/**
	 * When the user clicks Save, the currently-entered content is saved to the
	 * database for that article.
	 *
	 * @param The button click event handler
	 */
	@FXML
	private void handleBtnSaveAction(ActionEvent event) {
		labelLoadStatus.setVisible(false);

		// populate a new list with the text content and save it to the database.
		List<String> list = new ArrayList<String>();
		list.add(textFieldArticleId.getText());
		list.add(textFieldTitle.getText());
		list.add(htmlFieldProblem.getHtmlText());
		list.add(htmlFieldSolution.getHtmlText());

		saveArticle(list);
	}

	/**
	 * When the user clicks New, the text fields are cleared and the Article ID is
	 * set to the next available number.
	 *
	 * @param The button click event handler
	 */
	@FXML
	private void handleBtnNewAction(ActionEvent event) {
		labelLoadStatus.setVisible(false);

		// determine the next available article id that hasn't been used yet
		int newArticleId = newArticle() + 1;
		textFieldArticleId.setText(Integer.toString(newArticleId));
		
		// clear the text fields
		textFieldTitle.clear();
		htmlFieldProblem.setHtmlText("");
		htmlFieldSolution.setHtmlText("");
	}

	/**
	 * Automatically sets the article ID to the next available number.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		int newArticleId = newArticle() + 1;
		textFieldArticleId.setText(Integer.toString(newArticleId));
	}

	/**
	 * Loads an article from the database
	 *
	 * @param The ID of the article to be loaded
	 * @return The article, as a list of fields
	 */
	private static java.util.List<java.lang.String> loadArticle(int arg0) {
		com.mycompany.knowledgemanager.DbInterface_Service service = new com.mycompany.knowledgemanager.DbInterface_Service();
		com.mycompany.knowledgemanager.DbInterface port = service.getDbInterfacePort();
		return port.loadArticle(arg0);
	}

	/**
	 * Saves an article to the database
	 *
	 * @param The article as a list of fields
	 */
	private static void saveArticle(java.util.List<java.lang.String> arg0) {
		com.mycompany.knowledgemanager.DbInterface_Service service = new com.mycompany.knowledgemanager.DbInterface_Service();
		com.mycompany.knowledgemanager.DbInterface port = service.getDbInterfacePort();
		port.saveArticle(arg0);
	}

	/**
	 * Starts a new article and clears the fields
	 *
	 * @return The highest current article ID
	 */
	private static int newArticle() {
		com.mycompany.knowledgemanager.DbInterface_Service service = new com.mycompany.knowledgemanager.DbInterface_Service();
		com.mycompany.knowledgemanager.DbInterface port = service.getDbInterfacePort();
		return port.newArticle();
	}
	
	
}
