package application;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Calc {

	private Calculcadora cal;

    @FXML
    private MenuItem menu_new;

    @FXML
    private MenuItem menu_open;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label display;
    
    @FXML
    private Canvas canvas;
    
    @FXML
    private Button but7;

    @FXML
    private Button but8;

    @FXML
    private Button but9;

    @FXML
    private Button but4;

    @FXML
    private Button but5;

    @FXML
    private Button but6;

    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Button but3;

    @FXML
    private Button but0;

    @FXML
    private Button butSoma;

    @FXML
    private Button butRes;

    @FXML
    void clicou_0(MouseEvent event) {
    	cal.appendDisplay("0");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_1(MouseEvent event) {
    	cal.appendDisplay("1");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_2(MouseEvent event) {
    	cal.appendDisplay("2");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_3(MouseEvent event) {
    	cal.appendDisplay("3");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_4(MouseEvent event) {
    	cal.appendDisplay("4");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_5(MouseEvent event) {
    	cal.appendDisplay("5");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_6(MouseEvent event) {
    	cal.appendDisplay("6");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_7(MouseEvent event) {
    	cal.appendDisplay("7");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_8(MouseEvent event) {
    	cal.appendDisplay("8");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_9(MouseEvent event) {
    	cal.appendDisplay("9");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void clicou_Res(MouseEvent event) {
    	cal.setOperando2();
    	display.setText(String.valueOf(cal.soma()));
    }

    @FXML
    void clicou_Soma(MouseEvent event) {
    	cal.setOperando1();
    	cal.setDisplay("");
    	display.setText(cal.getDisplay());
    }

    @FXML
    void press_0(MouseEvent event) {
		Bounds bounds = canvas.getBoundsInLocal();
	    double endX = bounds.getMaxX();
	    double endY = bounds.getMaxY() ;
	   
	    GraphicsContext gc = canvas.getGraphicsContext2D();
	    
	    gc.setStroke(Color.BLUE);
	    gc.strokeText("Escrevendo no Canvas", 15, 10);
	    
	    gc.setLineWidth(1);
	    gc.setStroke(Color.GREEN);
	    gc.strokeLine(0, 0, endX, endY);
	    
	    Color cor = Color.rgb(80,127,255); 
	    
	    gc.moveTo(100, 50);
        gc.lineTo(100, 50);
        gc.setStroke(cor);
        gc.stroke();
        

    }

    @FXML
    void clicou_open(ActionEvent event) {
    	Dialog<String> dialog = new TextInputDialog("");
    	dialog.setTitle("Abrir um arquivo");
    	dialog.setHeaderText("Qual o nome do arquivo?");
    	Optional<String> lido = dialog.showAndWait();
    	if(lido.isPresent()) {
    		System.out.println(lido.get());
    	}
    }
    @FXML
    void initialize() {
        assert menu_new != null : "fx:id=\"menu_new\" was not injected: check your FXML file 'calc.fxml'.";
        assert menu_open != null : "fx:id=\"menu_open\" was not injected: check your FXML file 'calc.fxml'.";
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'calc.fxml'.";
        assert canvas != null : "fx:id=\"canvas\" was not injected: check your FXML file 'calc.fxml'.";
        assert but7 != null : "fx:id=\"but7\" was not injected: check your FXML file 'calc.fxml'.";
        assert but8 != null : "fx:id=\"but8\" was not injected: check your FXML file 'calc.fxml'.";
        assert but9 != null : "fx:id=\"but9\" was not injected: check your FXML file 'calc.fxml'.";
        assert but4 != null : "fx:id=\"but4\" was not injected: check your FXML file 'calc.fxml'.";
        assert but5 != null : "fx:id=\"but5\" was not injected: check your FXML file 'calc.fxml'.";
        assert but6 != null : "fx:id=\"but6\" was not injected: check your FXML file 'calc.fxml'.";
        assert but1 != null : "fx:id=\"but1\" was not injected: check your FXML file 'calc.fxml'.";
        assert but2 != null : "fx:id=\"but2\" was not injected: check your FXML file 'calc.fxml'.";
        assert but3 != null : "fx:id=\"but3\" was not injected: check your FXML file 'calc.fxml'.";
        assert but0 != null : "fx:id=\"but0\" was not injected: check your FXML file 'calc.fxml'.";
        assert butSoma != null : "fx:id=\"butSoma\" was not injected: check your FXML file 'calc.fxml'.";
        assert butRes != null : "fx:id=\"butRes\" was not injected: check your FXML file 'calc.fxml'.";

        cal = new Calculcadora();
        
    }
}
