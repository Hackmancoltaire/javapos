//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
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
 * All services must implement this interface (it is also extended
 * by the jpos.services.BaseService interface which must be implemented
 * by all JavaPOS services).  The one method define in this interface
 * is used to indicate to the service that its connection has been dropped
 * @since 0.1 (Philly 99 meeting)
 * @author E. Michael Maximilien (maxim@us.ibm.com)
 */
public interface JposServiceInstance 
{
    /**
     * Indicate the ServiceInstance that its connection has been dropped
     * @since 0.1 (Philly 99 meeting)
     * @throws jpos.JposException if any error occurs
     */
    public void deleteInstance() throws JposException;
}
