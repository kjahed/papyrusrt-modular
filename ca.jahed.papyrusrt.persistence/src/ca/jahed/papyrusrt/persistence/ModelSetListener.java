package ca.jahed.papyrusrt.persistence;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;

public class ModelSetListener implements ResourceSetListener {

	@Override
	public NotificationFilter getFilter() {
		return NotificationFilter.RESOURCE_LOADED;
	}

	@Override
	public boolean isAggregatePrecommitListener() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPostcommitOnly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPrecommitOnly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resourceSetChanged(ResourceSetChangeEvent arg0) {
		System.out.println();
		System.out.println(arg0.getEditingDomain().getResourceSet().getResources());
		System.out.println();
	}

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent arg0) throws RollbackException {
		// TODO Auto-generated method stub
		return null;
	}

}
