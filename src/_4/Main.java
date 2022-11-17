package _4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		Path mainPath = Paths.get("C:\\");

		System.out.println(mainPath);

		Path basesPath = mainPath.resolve("bases");
		Path sistemasPath = mainPath.resolve("sistemas");
		Path redesPath = mainPath.resolve("redes");

		Path accessPath = basesPath.resolve("access");
		Path windowsPath = sistemasPath.resolve("windows");

		Path[] directoriesForCreating = { basesPath, sistemasPath, redesPath, basesPath.resolve("sql"), accessPath,
				windowsPath, sistemasPath.resolve("linux"), redesPath.resolve("practica") };

		for (Path path : directoriesForCreating) {
			createDirectory(path);
		}

		createFile(accessPath.resolve("Tema1.txt"));
		createFile(windowsPath.resolve("Listado.txt"));

	}

	public static void createDirectory(Path path) {
		try {
			Files.createDirectories(path);
			System.out.println(path.getFileName() + " fue creado con exito");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createFile(Path path) {
		try {
			if (!Files.exists(path)) {
				Files.createFile(path);
				System.out.println(path.getFileName() + " fue creado con exito");
				return;
			}

			System.out.println(path.getFileName() + " ya existe");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
