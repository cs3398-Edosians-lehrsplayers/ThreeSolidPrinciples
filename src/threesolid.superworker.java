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

import threesolid.IWorker;

class SuperWorker implements IWorker{
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}