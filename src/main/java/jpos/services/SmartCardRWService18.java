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
// SmartCardRWService18
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Smart Card Reader Writer for release 1.8.
//
//   Automatically generated from SmartCardRWControl18.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface SmartCardRWService18 extends BaseService, jpos.loader.JposServiceInstance
{
	// Capabilities
	public boolean getCapCardErrorDetection() throws JposException;
	public int     getCapInterfaceMode() throws JposException;
	public int     getCapIsoEmvMode() throws JposException;
	public int     getCapPowerReporting() throws JposException;
	public int     getCapSCPresentSensor() throws JposException;
	public int     getCapSCSlots() throws JposException;
	public boolean getCapStatisticsReporting() throws JposException;
	public int     getCapTransmissionProtocol() throws JposException;
	public boolean getCapUpdateStatistics() throws JposException;
	
	// Properties
	public int     getDataCount() throws JposException;
	public boolean getDataEventEnabled() throws JposException;
	public void    setDataEventEnabled(boolean dataEventEnabled) throws JposException;
	public int     getInterfaceMode() throws JposException;
	public void    setInterfaceMode(int interfaceMode) throws JposException;
	public int     getIsoEmvMode() throws JposException;
	public void    setIsoEmvMode(int isoEmvMode) throws JposException;
	public int     getOutputID() throws JposException;
	public int     getPowerNotify() throws JposException;
	public void    setPowerNotify(int powerNotify) throws JposException;
	public int     getPowerState() throws JposException;
	public int     getSCPresentSensor() throws JposException;
	public int     getSCSlot() throws JposException;
	public void    setSCSlot(int scSlot) throws JposException;
	public boolean getTransactionInProgress() throws JposException;
	public int     getTransmissionProtocol() throws JposException;
	
	// Methods
	public void    beginInsertion(int timeout) throws JposException;
	public void    beginRemoval(int timeout) throws JposException;
	public void    clearInput() throws JposException;
	public void    clearOutput() throws JposException;
	public void    endInsertion() throws JposException;
	public void    endRemoval() throws JposException;
	public void    readData(int action, int[] count, String[] data) throws JposException;
	public void    resetStatistics(String statisticsBuffer) throws JposException;
	public void    retrieveStatistics(String[] statisticsBuffer) throws JposException;
	public void    updateStatistics(String statisticsBuffer) throws JposException;
	public void    writeData(int action, int count, String data) throws JposException;
	
}
