package test1;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class MainFrame {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(1185, 594);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(68, 105, 61, 17);
		lblNewLabel.setText("tet");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(68, 227, 61, 17);
		lblNewLabel_1.setText("New Label");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(68, 349, 61, 17);
		lblNewLabel_2.setText("New Label");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(68, 471, 61, 17);
		lblNewLabel_3.setText("New Label");
		
		Label label = new Label(shell, SWT.NONE);
		label.setText("tet");
		label.setBounds(68, 162, 131, 40);
		
		Button btnFf = new Button(shell, SWT.NONE);
		btnFf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				SecondFrame window = new SecondFrame();
				window.open();
			}
		});
		btnFf.setBounds(204, 63, 80, 27);
		btnFf.setText("ff");
		
		Button btnOo = new Button(shell, SWT.NONE);
		btnOo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				int a = 2;
			}
		});
		btnOo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnOo.setBounds(204, 131, 80, 27);
		btnOo.setText("oo");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(205, 197, 80, 27);
		btnNewButton.setText("New Button");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setBounds(187, 279, 80, 27);
		btnNewButton_1.setText("New Button");
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(315, 372, 416, 163);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("\u7B2C\u4E00\u7EC4");
		
		TabItem tbtmNewItem_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_1.setText("\u7B2C\u4E8C\u7EC4");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
