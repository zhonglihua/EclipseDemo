package my.first.rcp.demo;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TreeItem;

public class ViewPart1 extends ViewPart {

	public ViewPart1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		parent.setLayout(new FillLayout());
		
		Tree tree = new Tree(parent, SWT.BORDER);
		
		TreeItem trtmNewTreeitem = new TreeItem(tree, SWT.NONE);
		trtmNewTreeitem.setText("THIS IS 1");
		
		TreeItem trtmNewTreeitem_1 = new TreeItem(tree, SWT.NONE);
		trtmNewTreeitem_1.setText("THIS IS 2");
		
		TreeItem trtmThisIs = new TreeItem(tree, SWT.NONE);
		trtmThisIs.setText("THIS IS 3");
		parent.layout();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
