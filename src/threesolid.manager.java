/*
Manager class follows the Open & Closed principle as we can extend its 
functionality without a need to modify existing functions of the source code.
*/

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class Manager {
    IWorker worker;

    public void Manager() {

    }
    public void setWorker(IWorker w) {
        worker=w;
    }

    public void manage() {
        worker.work();
    }
}