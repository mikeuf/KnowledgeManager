/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigws00client2;

import java.net.URL;
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
 *
 * @author cyclops
 */
public class FXMLDocumentController implements Initializable {
	
	@FXML
	private Label label;
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
	private void handleBtnLoadAction(ActionEvent event) {
		System.out.println("You clicked me!");
		label.setText("Hello World!");
		int articleId = Integer.parseInt(textFieldArticleId.getText());
		
				List list = businessMethod(articleId);
				String title = (String) list.get(1);
				String problem = (String) list.get(2);
					String solution = (String) list.get(3);
				
			//	StringBuilder problem = new StringBuilder();
			//	problem.append(list.get(0));
		//		String problem = list.get(2);   //Integer.toString((int) list.get(2));
				
		textFieldTitle.setText(title);
				htmlFieldProblem.setHtmlText(problem);
								htmlFieldSolution.setHtmlText(solution);

				list.forEach(System.out::println);
	}
	
	@FXML
	private void handleBtnSaveAction(ActionEvent event) {
		System.out.println("You clicked Save!");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
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



	



	
}
