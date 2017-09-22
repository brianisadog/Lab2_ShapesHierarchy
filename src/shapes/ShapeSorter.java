package shapes;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * A class that stores a collection of shapes, and is able to sort shapes based
 * on different criteria. Stores shapes in three lists: allShapes, shapes2D,
 * shapes3D. For general shapes: sorting is by area or by name. For 2d shapes,
 * sorting is by area, by name or by perimeter. For 3d shapes, sorting is by
 * area, by name or by volume.
 * 
 * @author BrianSung
 *
 */
public class ShapeSorter {
	// Store in three data structures: 1) all shapes; 2) all 2D shapes; 3) all 3D shapes
	private List<Shape> shapes;
	private List<Shape> shapes2D;
	private List<Shape> shapes3D;

	/** A default constructor for class ShapeSorter */
	public ShapeSorter() {
		shapes = new ArrayList<>();
		shapes2D = new ArrayList<>();
		shapes3D = new ArrayList<>();
	}


	/**
	 * Read a given input file, create different shapes, and add them to the data
	 * structures.
	 * To understand the format of the file, look at the file "shapesFile.txt" in in the input folder.
	 * This method should handle I/O Exceptions.
	 * 
	 * @param filename
	 *            - The name of the file that contains info about the shapes.
	 */
	public void loadShapes(String filename) {

		//load file with BufferedReader
		try (BufferedReader  reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
			String line;

			//read valid lines
			while ((line = reader.readLine()) != null && !line.isEmpty()) {
				/**
				 * str[0] = ShapeName(without Colon)
				 * ShapeName: Circle -> str[1] = radius
				 * ShapeName: ConvexRegularPolygon -> str[1] = edges, str[2] = length
				 * ShapeName: Sphere -> str[1] = radius
				 * ShapeName: PlatonicSolid -> str[1] = edges, str[2] = faces, str[3] = length
				 */

				String[] str = line.replace(":", "").split(" ");

				//initialize shapes for each case and store it into the data structures
				switch (str[0]) {
					case "Circle":
						Shape2D c = new Circle(Double.parseDouble(str[1]));
						shapes.add(c);
						shapes2D.add(c);
						break;

					case "ConvexRegularPolygon":
						Shape2D crp
								= new ConvexRegularPolygon(Integer.parseInt(str[1]), Double.parseDouble(str[2]));
						shapes.add(crp);
						shapes2D.add(crp);
						break;

					case "Sphere":
						Shape3D s = new Sphere(Double.parseDouble(str[1]));
						shapes.add(s);
						shapes3D.add(s);
						break;

					case "PlatonicSolid":
						Shape3D ps = new PlatonicSolid(Integer.parseInt(str[1])
								, Integer.parseInt(str[2]), Double.parseDouble(str[3]));
						shapes.add(ps);
						shapes3D.add(ps);
						break;
				}
			}

		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

	/**
	 * Print the list of shapes to a file as following: First, all 2d shapes
	 * (one line per shape), followed by an empty line. Then all 3d shapes,
	 * followed by an empty line.. Then all shapes from the list. Each shape
	 * should be printed according to the format specified in the toString()
	 * method of the corresponding parent class.
	 * This method should handle I/O Exceptions.
	 * @param filename
	 * 			the name of the output file
	 */
	public void printToFile(String filename) {
		try (PrintWriter pw = new PrintWriter(filename, "UTF-8")) {
			StringBuilder sb = new StringBuilder();

			for (Shape shape: shapes2D){
				sb.append(shape.toString());
				sb.append(System.lineSeparator());
			}

			sb.append(System.lineSeparator());
			for (Shape shape: shapes3D){
				sb.append(shape.toString());
				sb.append(System.lineSeparator());
			}

			sb.append(System.lineSeparator());
			for (int i = 0; i < shapes.size(); i++){
				sb.append(shapes.get(i).toString());
				if (i < shapes.size() - 1) {
					sb.append(System.lineSeparator());
				}
			}

			pw.println(sb.toString()); //write String into the file
			pw.flush();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	/**
	 * Sort a list of Shape-s
	 * 
	 * @param whichShapes
	 *            - A string, either "all", "2D" or "3D" - specifies which list
	 *            of shapes to sort
	 * @param comparator
	 *            - A Comparator object that tells the method how to sort
	 *            shapes.
	 */
	public void sortShapes(String whichShapes, Comparator<Shape> comparator) {

		switch (whichShapes) {
		case "all":
			Collections.sort(shapes, comparator);
			break;
		case "2D":
			Collections.sort(shapes2D, comparator);
			break;
		case "3D":
			Collections.sort(shapes3D, comparator);
			break;
		default:
			System.out.println("Trying to sort invalid type of shape, did not sort.");
		}

	}

}
