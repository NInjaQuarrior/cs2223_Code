package cs2223Assign3;

import java.io.File;
import java.util.List;

public class Term {

	// term for words terms
	public Term(String word, File file, int freq, double tfidf) {
		this.word = word;
		this.file = file;
		this.freq = freq;
		this.TFIDF = tfidf;
	}

	// terms for info regarding docs
	public Term(String word, List<File> files, int freq) {
		this.word = word;
		this.files = files;
		this.freq = freq;

	}

	private String word;
	private File file;
	private List<File> files;
	private int freq;
	private double TFIDF;

	// getters/setters
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public File getFile() {
		return file;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void addFile(File file) {
		files.add(file);
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public double getTFIDF() {
		return TFIDF;
	}

	public void setTFIDF(double tFIDF) {
		TFIDF = tFIDF;
	}

}
