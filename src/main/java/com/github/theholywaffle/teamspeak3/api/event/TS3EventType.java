/*******************************************************************************
 * Copyright (c) 2014 Bert De Geyter (https://github.com/TheHolyWaffle).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Bert De Geyter (https://github.com/TheHolyWaffle)
 ******************************************************************************/
package com.github.theholywaffle.teamspeak3.api.event;

public enum TS3EventType {
	
	SERVER("server"),
	CHANNEL("channel"),
	TEXT_SERVER("textserver"),
	TEXT_CHANNEL("textchannel"),
	TEXT_PRIVATE("textprivate");
	
	private String name;

	TS3EventType(String name){
		this.name=name;
	}
	
	public String toString(){
		return name;
	}

}
