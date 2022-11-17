package _2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Ruta fichero origen
		// Por ejemplo:
		// C:\Users\Usuario\eclipse-workspace\path_ejercicio-2\src\_2\input.txt
		System.out.print("Ruta origen: ");
		Path sourcePath = Paths.get(input.nextLine());

		// Si no existe ruta fichero origen - acabar el programa
		if (!Files.exists(sourcePath)) {
			System.out.println("Fichero entrada no existe");
			input.close();
			return;
		}

		// Ruta fichero destino
		// Por ejemplo:
		// C:\Users\Usuario\eclipse-workspace\path_ejercicio-2\src\_2\output.txt
		System.out.print("Ruta destino: ");
		Path targetPath = Paths.get(input.nextLine());

		try {
			// Mover fichero y reemplazar si ya existe
			Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

		input.close();

	}

}
