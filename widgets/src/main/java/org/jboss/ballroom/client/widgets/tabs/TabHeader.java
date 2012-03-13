/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

package org.jboss.ballroom.client.widgets.tabs;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;

/**
 * @author Heiko Braun
 * @date 2/25/11
 */
public class TabHeader extends HorizontalPanel {

    public TabHeader(String title) {
        super();

        HTML tabLeft = new HTML("");
        tabLeft.setStyleName("tab-left");
        HTML tabTitle = new HTML(title);
        tabTitle.setStyleName("tab-title");
        HTML tabRight = new HTML("");
        tabRight.setStyleName("tab-right");

        add(tabLeft);
        add(tabTitle);
        add(tabRight);

        getElement().setAttribute("role", "tablist");
        getElement().setTabIndex(0);
        tabTitle.getElement().setAttribute("role", "tab");
        tabTitle.getElement().setAttribute("aria-selected", "true");


    }
}
