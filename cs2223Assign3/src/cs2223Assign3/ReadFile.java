package cs2223Assign3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {

	public String[] readFile(String path) {

		String[] words = null;
		try {
			// read the entire file seperating by \n and spaces
			words = Files.readString(Path.of(path)).split("\\p{javaWhitespace}+");

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			s = s.trim();
			// get rid of weird symbols but leave apostrophes
			s = s.replaceAll("[^a-zA-Z0-9']", "");
			words[i] = s;
		}

		return words;

	}

}
