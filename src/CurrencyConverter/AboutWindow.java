package CurrencyConverter;

import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.util.ResourceBundle;

public class AboutWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("localization.translation"); //$NON-NLS-1$
	private JPanel contentPane;
	private static AboutWindow windowInstance = null;

	/**
	 * Create the aboutWindow frame
	 */
	private AboutWindow() {
		setTitle(BUNDLE.getString("AboutWindow.this.title")); //$NON-NLS-1$
		setBounds(100, 100, 220, 200);
		setLocationRelativeTo(null);
		setResizable( false );

		// Window components
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);

		// Label "author"
		JLabel lblAuthor = new JLabel(BUNDLE.getString("AboutWindow.lblAuthor.text")); //$NON-NLS-1$
		lblAuthor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthor.setBounds(0, 80, 200, 40);
		lblAuthor.setFont(new Font("Noto Sans", Font.BOLD, 13));
		contentPane.setLayout(null);

		// label "title"
		JLabel lblTitle = new JLabel("Currency Converter");
		lblTitle.setBounds(0, 10, 200, 30);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 15));
		contentPane.add(lblTitle);


		// label "version"
		JLabel lblVersion = new JLabel("Version 2.0");
		lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersion.setBounds(0, 50, 200, 40);
		contentPane.add(lblVersion);
		contentPane.add(lblAuthor);
	}

	// Check if the window is already created to launch only one instance of the window.
	public static AboutWindow getInstance() {
		if (windowInstance == null) {
			windowInstance = new AboutWindow();
		}
		 return windowInstance;
	}
}
