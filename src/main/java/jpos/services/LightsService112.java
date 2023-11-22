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
// LightsService112
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Lights for release 1.12.
//
//   Automatically generated from LightsControl112.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface LightsService112 extends BaseService, jpos.loader.JposServiceInstance
{
	// Capabilities
	public int     getCapAlarm() throws JposException;
	public boolean getCapBlink() throws JposException;
	public int     getCapColor() throws JposException;
	public boolean getCapCompareFirmwareVersion() throws JposException;
	public int     getCapPowerReporting() throws JposException;
	public boolean getCapStatisticsReporting() throws JposException;
	public boolean getCapUpdateFirmware() throws JposException;
	public boolean getCapUpdateStatistics() throws JposException;
	
	// Properties
	public int     getMaxLights() throws JposException;
	public int     getPowerNotify() throws JposException;
	public void    setPowerNotify(int powerNotify) throws JposException;
	public int     getPowerState() throws JposException;
	
	// Methods
	public void    compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException;
	public void    resetStatistics(String statisticsBuffer) throws JposException;
	public void    retrieveStatistics(String[] statisticsBuffer) throws JposException;
	public void    switchOff(int lightNumber) throws JposException;
	public void    switchOn(int lightNumber, int blinkOnCycle, int blinkOffCycle, int color, int alarm) throws JposException;
	public void    updateFirmware(String firmwareFileName) throws JposException;
	public void    updateStatistics(String statisticsBuffer) throws JposException;
	
}
