/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigws00client2;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;

/**
 *
 * @author cyclops
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
	private void handleBtnLoadAction(ActionEvent event) {

		int articleId = Integer.parseInt(textFieldLoadArticle.getText());

		List list = businessMethod(articleId);
		String id = (String) list.get(0);
		String title = (String) list.get(1);
		String problem = (String) list.get(2);
		String solution = (String) list.get(3);

		textFieldArticleId.setText(id);
		textFieldTitle.setText(title);
		htmlFieldProblem.setHtmlText(problem);
		htmlFieldSolution.setHtmlText(solution);
	}

	@FXML
	private void handleBtnSaveAction(ActionEvent event) {

		List<String> list = new ArrayList<String>();
		list.add(textFieldArticleId.getText());
		list.add(textFieldTitle.getText());
		list.add(htmlFieldProblem.getHtmlText());
		list.add(htmlFieldSolution.getHtmlText());

		if (!saveArticle(list)) {
			System.out.println("There was a problem saving the article.");
		}
	}

	@FXML
	private void handleBtnNewAction(ActionEvent event) {

		// find an article id that hasn't been used yet
		int newArticleId = newArticle() + 1;
		textFieldArticleId.setText(Integer.toString(newArticleId));
		textFieldTitle.clear();
		htmlFieldProblem.setHtmlText("");
		htmlFieldSolution.setHtmlText("");

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		int newArticleId = newArticle() + 1;
		textFieldArticleId.setText(Integer.toString(newArticleId));
	}

	private static String hello(java.lang.String name) {
		com.mycompany.knowledgemanager.DbInterface_Service service = new com.mycompany.knowledgemanager.DbInterface_Service();
		com.mycompany.knowledgemanager.DbInterface port = service.getDbInterfacePort();
		return port.hello(name);
	}

	private static java.util.List<java.lang.String> businessMethod(int arg0) {
		com.mycompany.knowledgemanager.DbInterface_Service service = new com.mycompany.knowledgemanager.DbInterface_Service();
		com.mycompany.knowledgemanager.DbInterface port = service.getDbInterfacePort();
		return port.businessMethod(arg0);
	}

	private static boolean saveArticle(java.util.List<java.lang.String> arg0) {
		com.mycompany.knowledgemanager.DbInterface_Service service = new com.mycompany.knowledgemanager.DbInterface_Service();
		com.mycompany.knowledgemanager.DbInterface port = service.getDbInterfacePort();
		return port.saveArticle(arg0);
	}

	private static int newArticle() {
		com.mycompany.knowledgemanager.DbInterface_Service service = new com.mycompany.knowledgemanager.DbInterface_Service();
		com.mycompany.knowledgemanager.DbInterface port = service.getDbInterfacePort();
		return port.newArticle();
	}

	private void exitApplication(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

}
