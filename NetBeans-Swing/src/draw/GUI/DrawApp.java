/*
 * DrawApp.java
 */

package draw.GUI;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

public class DrawApp extends SingleFrameApplication {

    @Override protected void startup() {
        show(new DrawView(this));
    }

    @Override protected void configureWindow(java.awt.Window root) {
    }

    public static DrawApp getApplication() {
        return Application.getInstance(DrawApp.class);
    }


    public static void main(String[] args) {
        launch(DrawApp.class, args);
    }
}
