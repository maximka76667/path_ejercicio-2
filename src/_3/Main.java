package _3;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		Path path = Paths.get(System.getProperty("user.dir"));
		System.out.println("Ruta completa: " + path);

		try {
			DirectoryStream<Path> files = Files.newDirectoryStream(path);

			System.out.println("\nCarpetas del directorio:");

			for (Path file : files) {
				if (Files.isDirectory(path.resolve(file))) {
					System.out.println(file);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
