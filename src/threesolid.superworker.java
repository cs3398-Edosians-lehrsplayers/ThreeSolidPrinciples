/*
The superWorker class follows the open/close principle as it can be openly extended by
creating a new interface with a new function without modifying the class itself. The
single responsibility principle does not really apply as all of the classes require
the same functions
*/

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class SuperWorker extends BaseWorker implements Ieat, Isick{
	public void work() {
		//.... working much more
		System.out.format("Working much more ... \n");
	}

	public void eat() {
		//.... eating in launch break
	}
}