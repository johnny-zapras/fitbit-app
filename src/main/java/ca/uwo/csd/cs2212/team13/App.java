/*
 * Copyright (c) 2016, Team Sharkzilla (13)
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  * Neither the name of JSR-310 nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package ca.uwo.csd.cs2212.team13;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * When someone tries to run the program, this decides, based on arguments, what
 * actually runs.
 * <p>
 * Located in this folder as very important for pom file and Maven
 * <p>
 * Logger implemented.
 */
public class App {

	/**
	 * A logger to our program to check if test mode/program actually run
	 */
	static Logger logger = LogManager.getLogger(App.class.getName());

	/**
	 * Main method that decides what form of program to run based on arguments
	 * <p>
	 * Creates a {@link Main} instance which actually handles the interface and
	 * input.
	 * <p>
	 * Checks arguments to decide what runs.
	 * <ul>
	 * <li>If test argument, run test mode.
	 * <li>If no arguments, then runs
	 * <li>Otherwise, fails.
	 * </ul>
	 * 
	 * @param args
	 *            the arguments to the program - could be test
	 * @throws IOException
	 *             if i/o glitches out
	 */
	public static void main(String[] args) throws IOException {
		logger.trace("Entering main");
		logger.warn("Hello Maven/log4j World");
		logger.info("My username is team13");

		AccoladeRecord[] ar = new AccoladeRecord[20];
		WriterReader wr = new WriterReader();

		ar[0] = new AccoladeRecord(false, null, 3000, "ThousandStepsAcc", "ca.uwo.csd.cs2212.team13.BestDaysRecord/getSteps_value", "Walked 3000 Steps in a Day");
		ar[1] = new AccoladeRecord(false, null, 5, "maxDistanceAcc", "ca.uwo.csd.cs2212.team13.BestDaysRecord/getDis_value", "Walked 5 km in a Day");
		ar[2] = new AccoladeRecord(false, null, 20000, "tenThouStepsAcc","ca.uwo.csd.cs2212.team13.LifetimeRecord/getSteps", "Walked 20000 Steps in Total");
		ar[3] = new AccoladeRecord(false, null, 60, "sedentaryMinsAcc", "ca.uwo.csd.cs2212.team13.DailyRecord/getSedentaryMinutes", "Reached 60 Sedentary Minutes in a Day");
		ar[4] = new AccoladeRecord(false, null, 0, "zeroSteps","ca.uwo.csd.cs2212.team13.DailyRecord/getSteps", "No Steps in a Day\n");
		ar[5] = new AccoladeRecord(false, null, 2500, "BurnedsomeCalsAcc", "ca.uwo.csd.cs2212.team13.DailyRecord/getCalories", "Burn 2500 Calories in a Day");
		ar[6] = new AccoladeRecord(false, null, 4000, "BurnedMaxCalsAcc", "ca.uwo.csd.cs2212.team13.DailyRecord/getCalories", "Burn 4000 Calories in a Day");
		ar[7] = new AccoladeRecord(false, null, 1000, "maxFloorsAcc", "ca.uwo.csd.cs2212.team13.LifetimeRecord/getFloors", "Climbed 1000 Floors in Total");		
		ar[8] = new AccoladeRecord(false, null, 25, "CardioHeartAcc", "ca.uwo.csd.cs2212.team13.HeartZoneRecord/getMinutes", "Spend 25 minutes in Cardio Heart Rate Zone\n");
		ar[9] = new AccoladeRecord(false, null, 25, "FatburnHeartAcc", "ca.uwo.csd.cs2212.team13.HeartZoneRecord/getMinutes", "Spend 25 minutes in Fat Burn Heart Zone");
		ar[10] = new AccoladeRecord(false, null, 60, "StayedInBoundsAcc", "ca.uwo.csd.cs2212.team13.HeartZoneRecord/getMinutes", "No Out of Range Minutes for One Day");
		ar[11] = new AccoladeRecord(false, null, 0, "outofRangeHeartAcc", "ca.uwo.csd.cs2212.team13.HeartZoneRecord/getMinutes", "Spend 20 minutes in Out of Range");
		ar[12] = new AccoladeRecord(false, null, 50, "peakHeartAcc", "ca.uwo.csd.cs2212.team13.HeartZoneRecord/getMinutes", "Spend 20 minutes in Peak Heart Zone");
		ar[13] = new AccoladeRecord(false, null, 0, "tooManyCalsAcc", "ca.uwo.csd.cs2212.team13.DailyRecord/getCalories", "Burned Less than 1000 Calories in a Day");

		//TO DO

		ar[14] = new AccoladeRecord(false, null, 25, "christmasAcc", "ca.uwo.csd.cs2212.team13.AccoladeRecord/null", "Log On During Christmas\n");
		ar[15] = new AccoladeRecord(false, null, 20, "hanukkahAcc", "ca.uwo.csd.cs2212.team13.AccoladeRecord/null", "Log On During Hanukkanh\n");
		
		ar[16] = new AccoladeRecord(false, null, 0, "metNoGoalsAcc", "ca.uwo.csd.cs2212.team13.DailyRecord/null", "Did Not Complete Any Daily Goals for One Day");
		ar[17] = new AccoladeRecord(false, null, 5, "metAllGoalsAcc","ca.uwo.csd.cs2212.team13.DailyRecord/null", "Completed All Daily Goals for One Day");

		ar[18] = new AccoladeRecord(false, null, 10, "completedHalfAcc", "ca.uwo.csd.cs2212.team13.AccoladeRecord/null", "Achieve Half of the Accolades\n");
		ar[19] = new AccoladeRecord(false, null, 20, "completedAcc", "ca.uwo.csd.cs2212.team13.AccoladeRecord/null", "Achieve All Other Accolades\n");
		
		try {
			wr.writeRecord(ar, "accoladerecords");

		} catch (Exception e) {
			System.out.println("Could not write to file");
		}
		
		Main run = new Main();

		// If no arguments, then actual run. But we don't have that working yet
		if (args.length == 0) {
			//logger.trace("No arguments passed");
			//logger.warn("We need to build a program. And we have to do it quickly");
			//logger.warn("Run with argument test to test");
			logger.trace("Running main program");
			
			run.run();
		}
		// Check if argument is test. If so, run in test mode
		else if (args.length == 1 && args[0].equals("test")) {
			logger.trace("Running test mode");
			run.test_run();
		} else {
			logger.trace("Unvalid arguments passed for now…");
		}
		logger.trace("Exiting main");
	}
}
