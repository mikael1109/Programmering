package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    Canvas _canvas;

    @FXML
    ColorPicker _colorPicker;

    @FXML
    TextField _brushSize;
    double size = 18;

    public void initialize() {
        GraphicsContext graphicsContext = _canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.BLUE);
        graphicsContext.fillRect(0, 0, _canvas.getWidth(), _canvas.getHeight());
        _canvas.setOnMouseDragged(event -> {

            double x = event.getX() - size / 2;
            double y = event.getY() - size / 2;

            graphicsContext.setFill(_colorPicker.getValue());
            graphicsContext.fillOval(x, y, size, size);
        });
    }

    public void onExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void changeSize(ActionEvent actionEvent) {
        try{
            Double.valueOf(_brushSize.getText());
            size = Double.valueOf(_brushSize.getText());
        }catch (Exception e){
            System.out.println("Not size value");
        }
    }
}
