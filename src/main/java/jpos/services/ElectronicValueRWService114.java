//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
//
// ElectronicValueRWService114
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Electronic Value Reader Writer for release 1.14.
//
//   Automatically generated from ElectronicValueRWControl114.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface ElectronicValueRWService114 extends ElectronicValueRWService113
{
	// Capabilities
	public boolean getCapPINDevice() throws JposException;
	public boolean CapTrainingMode() throws JposException;
	
	// Properties
	public int     getPINEntry() throws JposException;
	public void    setPINEntry(int pinEntry) throws JposException;
	public int     getTrainingModeState() throws JposException;
	public void    setTrainingModeState(int trainingModeState) throws JposException;
	
	// Methods
	public void    clearParameterInformation() throws JposException;
	public void    queryLastSuccessfulTransactionResult() throws JposException;
	public void    retrieveResultInformation(String name, String[] value) throws JposException;
	public void    setParameterInformation(String name, String value) throws JposException;
	
}
