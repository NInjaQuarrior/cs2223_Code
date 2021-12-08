package cs2223Assign3;

import java.io.File;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ConstructionLinearProbe constructLin = new ConstructionLinearProbe();
		ConstructionBST constructBST = new ConstructionBST();

		StopWatch constructTimer = new StopWatch();

		// constructs either the trees or hashes.

		// comment on not used other timers will overwrite
		constructTimer.start();
		constructLin.initDocHashes();
		constructLin.initMasterHash();
		constructLin.updateScores();
		constructTimer.stop();

		// constructTimer.start();
		constructBST.initDocHashes();
		constructBST.initMasterHash();
		constructBST.updateScores();
		// constructTimer.stop();

		// demonstrating use of function in SearchEngine Class
		// +++++++++++++++++++++++++++++++++++++++

		// search engine for either BST or Hash, only use one
		SearchEngine engine = new SearchEngine(constructLin.getMasterHash(), constructLin.getDocHashes());

		// SearchEngineBST engine = new SearchEngineBST(constructBST.getMasterHash(),
		// constructBST.getDocHashes());

		// these will appear at very top of Console out
		// engine.search("Jones");
		// engine.search("Jennyanydots");
		// engine.search("home");

		// hash top 10s
		// these will also appear at very top of Console out, but under the others

		engine.top10((File) constructLin.getDocHashes().getAllKeys().toArray()[1]);

		engine.top10((File) constructLin.getDocHashes().getAllKeys().toArray()[5]);

		engine.top10((File) constructLin.getDocHashes().getAllKeys().toArray()[10]);

		// BST top 10s
		// these will also appear at very top of Console out, but under the others
//		engine.top10((File) constructBST.getDocHashes().getAllKeys().toArray()[1]);
//
//		engine.top10((File) constructBST.getDocHashes().getAllKeys().toArray()[5]);
//
//		engine.top10((File) constructBST.getDocHashes().getAllKeys().toArray()[10]);

		// Code for the analysis

		StopWatch Searchtimer = new StopWatch();

		Object[] masterArray = constructLin.getMasterHash().getAllKeys().toArray();
		// Object[] masterArray = constructBST.getMasterHash().getAllKeys().toArray();

		Random r = new Random();
		int range = masterArray.length;
		Integer ranInt = 0;

		// will time whatever one is uncommented at line34-37
		Searchtimer.start();
		for (int i = 0; i < range / 10; i++) {
			ranInt = r.nextInt(range - 1);
			engine.search(masterArray[ranInt].toString());
		}
		Searchtimer.stop();
		System.out.println("Test random keys 1/10 size: " + Searchtimer.stop());
		System.out.println("Test construct: " + constructTimer.stop());

	}
}
