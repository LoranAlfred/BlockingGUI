package com.example.blockinggui;

import com.example.blockinggui.logic.Calculation;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;


public class JobController implements Initializable {

    private Calculation calculation;

    @FXML
    private TextArea textArea;

    @FXML
    protected void startJob () {
        textArea.setText ( "Starting job..." );
        calculation.run ();
        textArea.setText ( "Job finished!" );
    }

    @FXML
    protected void stopJob () {
        calculation.stop ();
        textArea.setText ( "Job stopped" );
    }

    @Override
    public void initialize ( URL url, ResourceBundle resourceBundle ) {
        calculation = new Calculation ();
    }
}