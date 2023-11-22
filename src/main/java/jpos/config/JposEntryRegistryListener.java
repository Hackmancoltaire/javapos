package jpos.config;

///////////////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED 
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives. Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted. 
//
// The JavaPOS Config/Loader (aka JCL) is now under the CPL license, which 
// is an OSS Apache-like license.  The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

/**
 * Listener interface to implement when registering for JposEntryEvents
 * @since 0.1 (Philly 99 meeting)
 * @author E. Michael Maximilien (maxim@us.ibm.com)
 */
public interface JposEntryRegistryListener extends EventListener
{
    /**
     * Indicates that a new JposEntry was added to the registry
     * @param event the JposEntryEvent object
     * @since 0.1 (Philly 99 meeting)
     */
    public void jposEntryAdded( JposEntryRegistryEvent event );

    /**
     * Indicates that a JposEntry was removed from the registry
     * @param event the JposEntryEvent object
     * @since 0.1 (Philly 99 meeting)
     */
    public void jposEntryRemoved( JposEntryRegistryEvent event );

    /**
     * Indicates that a JposEntry was modified from the registry
     * @param event the JposEntryEvent object
     * @since 0.1 (Philly 99 meeting)
     */
    public void jposEntryModified( JposEntryRegistryEvent event );
}
