package com.example.blockinggui.logic;

import javafx.scene.Node;


/**
 * This class represents the calculation.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Calculation {

    private boolean jobIsStopped = false;

    private boolean jobIsFinished = false;

    private Node gui;

    public void run () {
        jobIsStopped = false;
        jobIsFinished = false;
        for ( int i = 0; i < 5000000000l; i++ ) {
            for ( int j = 0; j < 10000000000l; j++ ) {
                if ( jobIsStopped ) {
                    return;
                }
            }
        }
        jobIsFinished = true;
    }

    public void stop () {
        jobIsStopped = true;
    }

    public boolean jobIsFinished () {
        return jobIsFinished;
    }
}
