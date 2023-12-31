package jpos.loader;

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

import jpos.JposException;

/**
 * Interface defining a JposServiceConnection.  Used to connect, disconnect
 * and access a JavaPOS service
 * @since 0.1 (Philly 99 meeting)
 * @author E. Michael Maximilien (maxim@us.ibm.com)
 */
public interface JposServiceConnection 
{
    /** 
     * @return the JposService associated with this connection 
     * @since 0.1 (Philly 99 meeting)
     */
    public JposServiceInstance getService();

    /**
     * @return the logical name of the JposService associated with this connection
     * @since 0.1 (Philly 99 meeting)
     */
    public String getLogicalName();

    /**
     * Tries to make the connection with the associated JposService
     * @since 0.1 (Philly 99 meeting)
     * @throws jpos.JposException if any errors occurs with trying to make this connection
     */
    public void connect() throws JposException;

    /**
     * Tries to end the connection with the associated service
     * @since 0.1 (Philly 99 meeting)
     * @throws jpos.JposException if any errors occurs with trying to end this connection
     */
    public void disconnect() throws JposException;
}
