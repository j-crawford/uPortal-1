/* Copyright 2002 The JA-SIG Collaborative.  All rights reserved.
*  See license distributed with this file and
*  available online at http://www.uportal.org/license.html
*/

package org.jasig.portal.layout.al.common.node;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * An interface describing common features of user layout nodes,
 * that is channels and folders
 *
 * @author <a href="mailto:pkharchenko@interactivebusiness.com">Peter Kharchenko</a>
 * @version 1.0
 */
public interface INodeDescription {

    /**
      * Constants indicating the type of a node
      */
    public static final int CHANNEL = 1;
    public static final int FOLDER = 2;

    /**
     * Determine a name associated with this node.
     *
     * @return a folder/channel name.
     */
    public String getName();

     /**
     * Returns a type of the node, a NodeType constant.
     *
     * @return a type
     */
    public NodeType getType();

    public void setName(String name);

    public boolean isUnremovable();
    public void setUnremovable(boolean setting);

    public boolean isImmutable();
    public void setImmutable(boolean setting);

    public boolean isHidden();
    public void setHidden(boolean setting);


    /**
     * Creates a <code>org.w3c.dom.Element</code> representation of the current node.
     *
     * @param root a <code>Document</code> for which the <code>Element</code> should be created.
     * @return a <code>Element</code> value
     */
    public Element getXML(Document root);

    public void addNodeAttributes(Element node);

}
