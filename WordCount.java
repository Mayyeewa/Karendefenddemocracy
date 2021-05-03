package week4;

import java.io.*;

import java.util.*;

import acm.util.*;

import acm.program.ConsoleProgram;

public class WordCount extends ConsoleProgram {

	public void run() {
		int lines = 0;
		int words = 0;
		int characters = 0;

		BufferedReader bufRead = openFileReader("File: ");
		try {
			while (true) {
				String line = bufRead.readLine();
				if (line == null)
					break;
				lines++;
				words += countWords(line);
				characters += line.length();
			}
			bufRead.close();
		} catch (IOException ex) {
			println("Nothing Exist");
		}
		println("Lines = " + lines);
		println("Words = " + words);
		println("Characters = " + characters);
	}

	private int countWords(String line) {
		boolean isChar = false;
		int words = 0;
		for (int i=0; i<line.length(); i++) {
			char ch = line.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				isChar = true;
			} else {
				if (isChar) words++;
				isChar = false;
			}
		}
		if (isChar) words++;
		
		return words;
	}

	private BufferedReader openFileReader(String popUp) {
		BufferedReader bufRead = null;
		while (bufRead == null) {
			String name = readLine(popUp);
			try {
				bufRead = new BufferedReader(new FileReader(name));
			} catch (IOException ex) {
				println("File that you looking for is not here ma'am.");
			}

		}
		return bufRead;
	}

}
