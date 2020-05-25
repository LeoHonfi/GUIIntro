package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class TaschenrechnungErweiterung {

	protected Shell shell;
	private Text Feld1;
	private Text Feld2;
	int eingabe1;
	int eingabe2;
	private Text txtZahl;
	private Text txtOperation;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TaschenrechnungErweiterung window = new TaschenrechnungErweiterung();
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
		
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			getFeld1().setText(getFeld1().getText()+"1");
			
			}
		});
		button.setBounds(126, 204, 31, 25);
		button.setText("1");
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFeld1().setText(getFeld1().getText()+"2");
			}
		});
		button_1.setText("2");
		button_1.setBounds(163, 204, 31, 25);
		
		Button button_1_1 = new Button(shell, SWT.NONE);
		button_1_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFeld1().setText(getFeld1().getText()+"3");
			}
		});
		button_1_1.setText("3");
		button_1_1.setBounds(200, 204, 31, 25);
		
		Button button_1_1_1 = new Button(shell, SWT.NONE);
		button_1_1_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFeld1().setText(getFeld1().getText()+"4");
			}
		});
		button_1_1_1.setText("4");
		button_1_1_1.setBounds(126, 173, 31, 25);
		
		Button button_1_1_2 = new Button(shell, SWT.NONE);
		button_1_1_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFeld1().setText(getFeld1().getText()+"5");
			}
		});
		button_1_1_2.setText("5");
		button_1_1_2.setBounds(163, 173, 31, 25);
		
		Button button_1_1_3 = new Button(shell, SWT.NONE);
		button_1_1_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFeld1().setText(getFeld1().getText()+"6");
			}
		});
		button_1_1_3.setText("6");
		button_1_1_3.setBounds(200, 173, 31, 25);
		
		Button button_1_1_4 = new Button(shell, SWT.NONE);
		button_1_1_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFeld1().setText(getFeld1().getText()+"7");
			}
		});
		button_1_1_4.setText("7");
		button_1_1_4.setBounds(126, 142, 31, 25);
		
		Button button_1_1_5 = new Button(shell, SWT.NONE);
		button_1_1_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFeld1().setText(getFeld1().getText()+"8");
			}
		});
		button_1_1_5.setText("8");
		button_1_1_5.setBounds(163, 142, 31, 25);
		
		Button button_1_1_6 = new Button(shell, SWT.NONE);
		button_1_1_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFeld1().setText(getFeld1().getText()+"9");
			}
		});
		button_1_1_6.setText("9");
		button_1_1_6.setBounds(200, 142, 31, 25);
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFeld1().setText(getFeld1().getText()+"0");
			}
		});
		button_2.setBounds(140, 235, 75, 25);
		button_2.setText("0");
		
		
		Button button_1_1_6_1 = new Button(shell, SWT.NONE);
		button_1_1_6_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				eingabe1=Integer.parseInt(getFeld1().getText());
				getFeld2().setText("+");
				getFeld1().setText("");
			}
		});
		button_1_1_6_1.setText("+");
		button_1_1_6_1.setBounds(257, 157, 31, 25);
		
		Button button_1_1_6_2 = new Button(shell, SWT.NONE);
		button_1_1_6_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				eingabe1=Integer.parseInt(getFeld1().getText());
				getFeld2().setText("*");
				getFeld1().setText("");
			}
		});
		button_1_1_6_2.setText("*");
		button_1_1_6_2.setBounds(294, 157, 31, 25);
		
		Button button_1_1_6_3 = new Button(shell, SWT.NONE);
		button_1_1_6_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				eingabe1=Integer.parseInt(getFeld1().getText());
				getFeld2().setText("-");
				getFeld1().setText("");
			}
		});
		button_1_1_6_3.setText("-");
		button_1_1_6_3.setBounds(257, 188, 31, 25);
		
		Button button_1_1_6_4 = new Button(shell, SWT.NONE);
		button_1_1_6_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				eingabe1=Integer.parseInt(getFeld1().getText());
				getFeld2().setText("/");
				getFeld1().setText("");
			}
		});
		button_1_1_6_4.setText("/");
		button_1_1_6_4.setBounds(293, 188, 31, 25);
		
		Button button_1_1_6_5 = new Button(shell, SWT.NONE);
		button_1_1_6_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String ResultAsString;
				int result;
				switch(getFeld2().getText()) {
				case "+":
					eingabe2=Integer.parseInt(getFeld1().getText());
					result = eingabe1+eingabe2;
					ResultAsString = Integer.toString(result);
					getFeld1().setText((ResultAsString));
					break;
				case "-":
					eingabe2=Integer.parseInt(getFeld1().getText());
					result = eingabe1-eingabe2;
					ResultAsString=Integer.toString(result);
					getFeld1().setText((ResultAsString));
					break;
				case "*":
					eingabe2=Integer.parseInt(getFeld1().getText());
					result = eingabe1*eingabe2;
					ResultAsString=Integer.toString(result);
					getFeld1().setText((ResultAsString));
					break;
				case "/":
					eingabe2=Integer.parseInt(getFeld1().getText());
					result = eingabe1/eingabe2;
					ResultAsString=Integer.toString(result);
					getFeld1().setText((ResultAsString));
					break;
						
				}
				getFeld2().setText("=");
			}
		});
		button_1_1_6_5.setText("=");
		button_1_1_6_5.setBounds(257, 215, 67, 25);
		
		Feld1 = new Text(shell, SWT.BORDER);
		Feld1.setText("");
		Feld1.setBounds(118, 55, 76, 21);
		
		Feld2 = new Text(shell, SWT.BORDER);
		Feld2.setBounds(270, 55, 76, 21);
		
		txtZahl = new Text(shell, SWT.BORDER);
		txtZahl.setText("Zahl");
		txtZahl.setBounds(118, 26, 76, 21);
		
		txtOperation = new Text(shell, SWT.BORDER);
		txtOperation.setText("Operation");
		txtOperation.setBounds(270, 26, 76, 21);

	}

	public Text getFeld1() {
		return Feld1;
	}

	public Text getFeld2() {
		return Feld2;
	}
}
