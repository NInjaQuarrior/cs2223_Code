package cs2223Assign3;

import java.io.File;

//Implementation of SeachEngine but it instead uses the BinarySearchTree, see Search Engine for comments
public class SearchEngineBST {

	public SearchEngineBST(BinarySearchTree<String, Term> master,
			BinarySearchTree<File, BinarySearchTree<String, Term>> docList) {
		this.docList = docList;
		this.master = master;
	}

	BinarySearchTree<String, Term> master;

	BinarySearchTree<File, BinarySearchTree<String, Term>> docList;

	public void search(String key) {
		System.out.println("Search Results for: " + key + "\n");
		for (File f : master.get(key).getFiles()) {
			Term t = docList.get(f).get(key);
			System.out.println("\tFile Name: " + f.getName());
			System.out.println("\tFrequency: " + t.getFreq());
			System.out.println("\tTF-IDF Score: " + t.getTFIDF());
			System.out.println();
		}
	}

	public void top10(File file) {

		Term[] terms = new Term[docList.get(file).getAllKeys().size()];
		int index = 0;
		for (String s : docList.get(file).getAllKeys()) {
			terms[index] = docList.get(file).get(s);
			index++;
		}

		terms = InsertionSort.sort(terms);
		System.out.println("The Top 10 Terms for" + file.getName() + ": ");
		for (int i = 0; i < 10; i++) {
			System.out.println("\t" + terms[i].getWord() + ": " + terms[i].getTFIDF());
		}

		System.out.println();
	}
}
