import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

/**
 * Handles showing percentage bar
 * @author Daniel
 *
 */
public class ProgressBar extends JFrame {
	
	/**
	 * Eclipse generated serial version UID
	 */
	private static final long serialVersionUID = -3275809714876994716L;

	/**
	 * Progess bar
	 */
	private static JProgressBar progessbar = new JProgressBar();

	/**
	 * Bar completed color
	 */
    private final Color COMPLETED_COLOR = Color.DARK_GRAY;

    /**
     * Bar empty color
     */
    private final Color EMPTY_COLOR = Color.LIGHT_GRAY;

    /**
     * Bar text color
     */
    private final Color TEXT_COLOR = Color.WHITE;

    /**
     * Sets the Sythescape icon for bar
     */
    private void setIcon() {
        URL url = null;
        boolean update = true;
/*        try {
            url = new URL("http://www.sythescape.com/Media/icon.png");
        } catch (MalformedURLException ex) {
            update = false;
            ex.printStackTrace();
        }
        if (update) {
            Image bimg = Toolkit.getDefaultToolkit()
                .getImage(url);
            this.setIconImage(bimg);
        } */
    }

    /**
     * Handles the percentage bar
     */
    public ProgressBar() {
        progessbar = new JProgressBar();
        setIcon();
        progessbar.setUI(new BasicProgressBarUI() {
            protected Color getSelectionBackground() {
                return TEXT_COLOR;
            }
            protected Color getSelectionForeground() {
                return TEXT_COLOR;
            }
        });
        progessbar.setBackground(EMPTY_COLOR);
        progessbar.setBorderPainted(false);
        progessbar.setStringPainted(true);
        progessbar.setForeground(COMPLETED_COLOR);
        progessbar.setMaximum(100);
        progessbar.setMinimum(0);
        progessbar.setValue(0);
        progessbar.setString("Downloading cache - " + progessbar.getValue() + "%");
        this.setFont(new Font("Helvetica", 1, 16));
        this.getContentPane().add(progessbar, BorderLayout.CENTER);
        this.setSize(350, 100);
        this.setTitle("Sythescape Updater");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
		    public void windowClosing(WindowEvent we) {
				int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel the download?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
				if (option == 0) {
					setTitle("Cancelling download...");
					try {
						Thread.sleep(1000L);
					} catch (Exception ex) {}
					System.exit(0);
				}
		    }
		});
    }

    /**
     * Updates value of bar
     * @param value
     */
    public static void updateValue(int value) {
        progessbar.setValue(value);
    }
    
    /**
     * Updates string of bar
     * @param string
     */
    public static void updateString(String string) {
    	progessbar.setString(string);
    }
    
    /**
     * Gets the current value of bar
     * @return
     */
    public static int getValue() {
    	return progessbar.getValue();
    }


}