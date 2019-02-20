/*
Following the Interface Segregation Principle, we split up the Iworker interface into
two different interfaces IWorkable and IFeedable. This gives the robot class only 
the work() method and no ability to use the eat() method.
*/

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

interface Ieat {
    public void eat();
}

interface Isick {
    public void sick();
}

interface Ireboot {
    public void reboot();
}