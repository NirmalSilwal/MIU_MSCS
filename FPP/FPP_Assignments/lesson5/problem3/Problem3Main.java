package lesson5.problem3;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class Problem3Main {

	public static void main(String[] args) {

		Figure[] figures = new Figure[] { new UpwardHat(), new UpwardHat(), 
							new DownwardHat(), new FaceMaker(), new Vertical() };

		// solution c
		for (Figure fig : figures) {
			fig.getFigure();
		}

		System.out.println("\n");
		
		// solution d
		for (Figure fig : figures) {
			System.out.print(fig.getClass().getSimpleName() + " : ");
			fig.getFigure();
			System.out.println();
		}
	}

}