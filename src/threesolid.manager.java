/*
Manager class follows the Open & Closed principle as we can extend its 
functionality without a need to modify existing functions of the source code.
*/

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class Manager {
    BaseWorker worker;

    public void Manager() {

    }
    public void setWorker(BaseWorker w) {
        worker=w;
    }

    public void manage() {
        worker.work();
    }
}

class ProjectManager extends Manager {
    public void scheduleWork() {
        System.out.format("Do some work for me ... \n");
    }
}

class ProductManager extends Manager {
    public void defineProduct() {
        System.out.format("Here's a product, take it ... \n");
    }
}
