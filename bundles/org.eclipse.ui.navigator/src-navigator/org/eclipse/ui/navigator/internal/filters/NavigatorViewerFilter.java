/*******************************************************************************
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.ui.navigator.internal.filters;

import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.INavigatorExtensionFilter;


/**
 * <p>
 * <strong>EXPERIMENTAL</strong>. This class or interface has been added as part of a work in
 * progress. There is a guarantee neither that this API will work nor that it will remain the same.
 * Please do not use this API without consulting with the Platform/UI team.
 * </p>
 * 
 * @since 3.2
 *  
 */
public class NavigatorViewerFilter extends NavigatorExtensionFilter implements INavigatorExtensionFilter {

	private final ViewerFilter viewerFilter;

	/**
	 *  
	 */
	public NavigatorViewerFilter(ViewerFilter aViewerFilter) {
		super();
		viewerFilter = aViewerFilter;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.common.navigator.internal.views.navigator.filters.INavigatorExtensionFilter#select(org.eclipse.wst.common.navigator.internal.views.navigator.INavigatorExtensionSite,
	 *      java.lang.Object, java.lang.Object)
	 */
	public boolean select(CommonViewer aViewer, Object aParentElement, Object anElement) {
		if (viewerFilter != null)
			return viewerFilter.select(aViewer, aParentElement, anElement);
		return true;
	}



}
