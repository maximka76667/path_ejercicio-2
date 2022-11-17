package _1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		try {
			DirectoryStream<Path> files = Files.newDirectoryStream(Paths.get(System.getProperty("user.home")), "*");
			for (Path file : files) {
				if (Files.isWritable(file) && Files.size(file) > 100) {
					System.out.println(file);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
