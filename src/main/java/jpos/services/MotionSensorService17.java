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
// MotionSensorService17
//
//   Interface defining all new capabilities, properties and methods
//   that are specific to Motion Sensor for release 1.7.
//
//   Automatically generated from MotionSensorControl17.
//
/////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.*;

public interface MotionSensorService17 extends BaseService, jpos.loader.JposServiceInstance
{
	// Capabilities
	public int     getCapPowerReporting() throws JposException;
	
	// Properties
	public boolean getMotion() throws JposException;
	public int     getPowerNotify() throws JposException;
	public void    setPowerNotify(int powerNotify) throws JposException;
	public int     getPowerState() throws JposException;
	public int     getTimeout() throws JposException;
	public void    setTimeout(int timeout) throws JposException;
	
	// Methods
	public void    waitForMotion(int timeout) throws JposException;
	
}
