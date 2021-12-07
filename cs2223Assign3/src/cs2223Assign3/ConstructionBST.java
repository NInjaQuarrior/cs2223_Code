package cs2223Assign3;

import java.io.File;
import java.util.ArrayList;

//Implementation of Contruction but it instead uses the BinarySearchTree, see ConstructionLinearProbe for comments
public class ConstructionBST {

	BinarySearchTree<File, BinarySearchTree<String, Term>> docTrees = new BinarySearchTree<>();
	BinarySearchTree<String, Term> masterTree = new BinarySearchTree<String, Term>();

	public BinarySearchTree<File, BinarySearchTree<String, Term>> getDocHashes() {
		return docTrees;
	}

	public BinarySearchTree<String, Term> getMasterHash() {
		return masterTree;
	}

	final File folder = new File("C:\\Users\\cmmck\\git\\cs2223\\cs2223Assign3\\data\\");

	File[] allFiles = folder.listFiles();

	public BinarySearchTree<File, BinarySearchTree<String, Term>> initDocHashes() {

		ReadFile reader = new ReadFile();

		// cycle through all files
		BinarySearchTree<String, Term> hash;
		for (int i = 0; i < allFiles.length; i++) {
			File f = allFiles[i];
			hash = new BinarySearchTree<String, Term>();
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
			docTrees.put(f, hash);
		}

		return docTrees;
	}

	public BinarySearchTree<String, Term> initMasterHash() {

		for (File f : docTrees.getAllKeys()) {
			for (String s : docTrees.get(f).getAllKeys()) {
				// if word is new add it to hash
				if (masterTree.get(s) == null) {
					ArrayList<File> list = new ArrayList<File>();
					list.add(f);
					masterTree.put(s, new Term(s, list, 1));
				} else {
					// update freq
					Term t = masterTree.get(s);
					t.setFreq(t.getFreq() + 1);
					if (!t.getFiles().contains(f)) {
						t.getFiles().add(f);
					}

				}
			}
		}
		return masterTree;
	}

	public void updateScores() {

		for (File f : docTrees.getAllKeys()) {
			for (String s : docTrees.get(f).getAllKeys()) {
				Term t = docTrees.get(f).get(s);
				double tf = Math.log(t.getFreq() + 1);
				double idf = Math.log(docTrees.getAllKeys().size() / masterTree.get(s).getFreq());
				double tfidf = tf * idf;
				t.setTFIDF(tfidf);

			}
		}
	}

}
