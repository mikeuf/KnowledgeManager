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
import javafx.scene.control.Label;

/**
 *
 * @author cyclops
 */
public class FXMLDocumentController implements Initializable {
	
	@FXML
	private Label label;
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		System.out.println("You clicked me!");
		label.setText("Hello World!");
		
				List list = businessMethod();
				list.forEach(System.out::println);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	private static java.util.List<java.lang.Object> businessMethod() {
		ws.PersonService_Service service = new ws.PersonService_Service();
		ws.PersonService port = service.getPersonServicePort();
		return port.businessMethod();
	}
	
}
