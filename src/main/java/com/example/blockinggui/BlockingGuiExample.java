package com.example.blockinggui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class BlockingGuiExample extends Application {

    @Override
    public void start ( Stage stage ) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader ( BlockingGuiExample.class.getResource ( "main-view.fxml" ) );
        Scene scene = new Scene ( fxmlLoader.load () );
        stage.setTitle ( "Blocking GUI" );
        stage.setScene ( scene );
        stage.show ();
    }

    public static void main ( String[] args ) {
        launch ();
    }
}