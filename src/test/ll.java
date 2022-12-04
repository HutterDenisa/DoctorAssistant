package test;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.widgets.Button;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;

public class ll {
	static Display display = Display.getDefault();
	static Shell shell = new Shell();
	static Label lblName = new Label(shell, SWT.NONE);
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		shell.setFullScreen(true);
		shell.setForeground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		shell.setSize(720, 542);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Button btnA = new Button(shell, SWT.NONE);
		btnA.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnA.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnA.setBounds(10, 98, 33, 37);
		btnA.setText("A");
		
		Button btnZ = new Button(shell, SWT.NONE);
		btnZ.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnZ.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnZ.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnZ.setText("Z");
		btnZ.setBounds(88, 313, 33, 37);
		
		Button btnB = new Button(shell, SWT.NONE);
		btnB.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnB.setBackground(SWTResourceManager.getColor(255, 128, 0));
	
		btnB.setText("B");
		btnB.setBounds(49, 98, 33, 37);
		
		Button btnC = new Button(shell, SWT.NONE);
		btnC.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnC.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnC.setText("C");
		btnC.setBounds(88, 98, 33, 37);
		
		Button btnD = new Button(shell, SWT.NONE);
		btnD.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnD.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnD.setText("D");
		btnD.setBounds(127, 98, 33, 37);
		
		Button btnE = new Button(shell, SWT.NONE);
		btnE.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnE.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnE.setText("E");
		btnE.setBounds(166, 98, 33, 37);
		
		Button btnF = new Button(shell, SWT.NONE);
		btnF.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnF.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnF.setText("F");
		btnF.setBounds(10, 141, 33, 37);
		
		Button btnG = new Button(shell, SWT.NONE);
		btnG.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnG.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnG.setText("G");
		btnG.setBounds(49, 141, 33, 37);
		
		Button btnH = new Button(shell, SWT.NONE);
		btnH.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnH.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnH.setText("H");
		btnH.setBounds(88, 141, 33, 37);
		
		Button btnI = new Button(shell, SWT.NONE);
		btnI.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnI.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnI.setText("I");
		btnI.setBounds(127, 141, 33, 37);
		
		Button btnJ = new Button(shell, SWT.NONE);
		btnJ.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnJ.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnJ.setText("J");
		btnJ.setBounds(166, 141, 33, 37);
		
		Button btnK = new Button(shell, SWT.NONE);
		btnK.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnK.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnK.setText("K");
		btnK.setBounds(10, 184, 33, 37);
		
		Button btnL = new Button(shell, SWT.NONE);
		btnL.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnL.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnL.setText("L");
		btnL.setBounds(49, 184, 33, 37);
		
		Button btnM = new Button(shell, SWT.NONE);
		btnM.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnM.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnM.setText("M");
		btnM.setBounds(88, 184, 33, 37);
		
		Button btnN = new Button(shell, SWT.NONE);
		btnN.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnN.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnN.setText("N");
		btnN.setBounds(127, 184, 33, 37);
		
		Button btnO = new Button(shell, SWT.NONE);
		btnO.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnO.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnO.setText("O");
		btnO.setBounds(166, 184, 33, 37);
		
		Button btnP = new Button(shell, SWT.NONE);
		btnP.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnP.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnP.setText("P");
		btnP.setBounds(10, 227, 33, 37);
		
		Button btnQ = new Button(shell, SWT.NONE);
		btnQ.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnQ.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnQ.setText("Q");
		btnQ.setBounds(49, 227, 33, 37);
		
		Button btnR = new Button(shell, SWT.NONE);
		btnR.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnR.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnR.setText("R");
		btnR.setBounds(88, 227, 33, 37);
		
		Button btnS = new Button(shell, SWT.NONE);
		btnS.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnS.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnS.setText("S");
		btnS.setBounds(127, 227, 33, 37);
		
		Button btnT = new Button(shell, SWT.NONE);
		btnT.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnT.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnT.setText("T");
		btnT.setBounds(166, 227, 33, 37);
		
		Button btnU = new Button(shell, SWT.NONE);
		btnU.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnU.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnU.setBounds(10, 270, 33, 37);
		btnU.setText("U");
		
		Button btnV = new Button(shell, SWT.NONE);
		btnV.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnV.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnV.setSelection(true);
		btnV.setText("V");
		btnV.setBounds(49, 270, 33, 37);
		
		Button btnW = new Button(shell, SWT.NONE);
		btnW.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnW.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnW.setText("W");
		btnW.setBounds(88, 270, 33, 37);
		
		Button btnX = new Button(shell, SWT.NONE);
		btnX.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnX.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnX.setText("X");
		btnX.setBounds(127, 270, 33, 37);
		
		Button btnY = new Button(shell, SWT.NONE);
		btnY.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnY.setBackground(SWTResourceManager.getColor(255, 128, 0));
		btnY.setText("Y");
		btnY.setBounds(166, 270, 33, 37);
		
		
		lblName.setBounds(355, 51, 326, 403);
		lblName.setText("Name");
		
		
		
		ArrayList<Button> textButtons = new ArrayList<Button>();
		textButtons.add(btnA);
		textButtons.add(btnB);
		textButtons.add(btnC);
		textButtons.add(btnD);
		textButtons.add(btnE);
		textButtons.add(btnF);
		textButtons.add(btnG);
		textButtons.add(btnH);
		textButtons.add(btnI);
		textButtons.add(btnJ);
		textButtons.add(btnK);
		textButtons.add(btnL);
		textButtons.add(btnM);
		textButtons.add(btnN);
		textButtons.add(btnO);
		textButtons.add(btnP);
		textButtons.add(btnQ);
		textButtons.add(btnR);
		textButtons.add(btnS);
		textButtons.add(btnT);
		textButtons.add(btnU);
		textButtons.add(btnV);
		textButtons.add(btnW);
		textButtons.add(btnX);
		textButtons.add(btnY);
		textButtons.add(btnZ);
		
		for(Button e : textButtons) {
			e.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDown(MouseEvent a) {
					searchForLetter(e.getText());
				}
			});
		}

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	public static void searchForLetter(String LetterToSearchFor) {
		lblName.setText(DB.GetFromDB(LetterToSearchFor));
	}
}
