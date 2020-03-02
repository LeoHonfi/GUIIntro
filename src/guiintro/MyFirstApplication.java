package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MyFirstApplication {

	protected Shell shell;
	private Text VornameTf;
	private Button MyButton;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstApplication window = new MyFirstApplication();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		VornameTf = new Text(shell, SWT.BORDER);
		VornameTf.setBounds(136, 104, 76, 21);
		
		MyButton = new Button(shell, SWT.NONE);
		MyButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
		System.out.println(getVornameTf().getText());
			}
		});
		MyButton.setBounds(136, 71, 75, 25);
		MyButton.setText("New Button");
		
		
	}
	public Text getVornameTf() {
		return VornameTf;
	}
}
