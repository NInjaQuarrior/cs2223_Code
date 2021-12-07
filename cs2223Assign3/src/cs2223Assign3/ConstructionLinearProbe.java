package cs2223Assign3;

import java.io.File;
import java.util.ArrayList;

public class ConstructionLinearProbe {

	// init hashes
	LinearProbeHashST<File, LinearProbeHashST<String, Term>> docHashes = new LinearProbeHashST<>();
	LinearProbeHashST<String, Term> masterHash = new LinearProbeHashST<String, Term>();

	// getters
	public LinearProbeHashST<File, LinearProbeHashST<String, Term>> getDocHashes() {
		return docHashes;
	}

	public LinearProbeHashST<String, Term> getMasterHash() {
		return masterHash;
	}

	final File folder = new File("C:\\Users\\cmmck\\git\\cs2223\\cs2223Assign3\\data\\");

	File[] allFiles = folder.listFiles();

	/**
	 * Cycles through each document and each word in each document building a hash
	 * table with a Term object. The document hashes are then stored in another hash
	 * that has the file as the gey and the doc hashes as the value
	 * 
	 * @return
	 */
	public LinearProbeHashST<File, LinearProbeHashST<String, Term>> initDocHashes() {

		ReadFile reader = new ReadFile();

		// cycle through all files
		LinearProbeHashST<String, Term> hash;

		for (int i = 0; i < allFiles.length; i++) {
			File f = allFiles[i];
			hash = new LinearProbeHashST<String, Term>();
			// for every string in the file
			for (String s : reader.readFile(f.toString())) {
				// if word is new add it to hash
				if (hash.get(s) == null) {
					hash.put(s, new Term(s, f, 1, 0));

				} else {
					// update freq
					Term t = hash.get(s);
					t.setFreq(t.getFreq() + 1);
				}
			}
			// put in hash of hashes
			docHashes.put(f, hash);
		}

		return docHashes;
	}

	/**
	 * Builds another hash that stores all the words and what documents they appear
	 * in
	 * 
	 * @return
	 */
	public LinearProbeHashST<String, Term> initMasterHash() {

		for (File f : docHashes.getAllKeys()) {
			for (String s : docHashes.get(f).getAllKeys()) {
				// go through all words in all docs and add to master
				// if word is new add it to hash
				if (masterHash.get(s) == null) {
					ArrayList<File> list = new ArrayList<File>();
					list.add(f);
					masterHash.put(s, new Term(s, list, 1));
				} else {
					// update freq
					Term t = masterHash.get(s);
					t.setFreq(t.getFreq() + 1);
					if (!t.getFiles().contains(f)) {
						t.getFiles().add(f);
					}

				}
			}
		}
		return masterHash;
	}

	// calculates the TF_IDF score for each word and stores it in its docHash
	public void updateScores() {

		for (File f : docHashes.getAllKeys()) {
			for (String s : docHashes.get(f).getAllKeys()) {
				Term t = docHashes.get(f).get(s);
				double tf = Math.log(t.getFreq() + 1);
				double idf = Math.log(docHashes.getAllKeys().size() / masterHash.get(s).getFreq());
				double tfidf = tf * idf;
				t.setTFIDF(tfidf);

			}
		}
	}

}
