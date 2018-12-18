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
	private Button button;
	@FXML
	private TextField fieldArticleId;
	@FXML
	private HTMLEditor htmlFieldProblem;
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		System.out.println("You clicked me!");
		label.setText("Hello World!");
		int articleId = Integer.parseInt(fieldArticleId.getText());
		
				List list = businessMethod(articleId);
				String problem = (String) list.get(1);
				
			//	StringBuilder problem = new StringBuilder();
			//	problem.append(list.get(0));
		//		String problem = list.get(2);   //Integer.toString((int) list.get(2));
				
				htmlFieldProblem.setHtmlText(problem);
				
				list.forEach(System.out::println);
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
