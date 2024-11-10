package bookSales;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Scanner;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class Prediction {

	public static void main(String[] args) {
		try {
			File fclFile = new File(Prediction.class.getResource("book_sales.fcl").toURI());
			FIS fis = FIS.load(fclFile.getPath());

			if (fis == null) {
				System.err.println("Cannot load file: " + fclFile);
				return;
			}

			Scanner in = new Scanner(System.in);
			System.out.print("Type in author age:");
			int authorAge = in.nextInt();

			System.out.print("Type in page count:");
			int pageCount = in.nextInt();

			System.out.print("Type in advertiment expenses (YTL):");
			int adExpenses = in.nextInt();

			fis.setVariable("authorAge", authorAge);
			fis.setVariable("numPages", pageCount);
			fis.setVariable("advertisingExpense", adExpenses);
			fis.evaluate();

			Variable numSales = fis.getVariable("numSales");
			System.out.print("Estimated annual sales: " + numSales.getValue());

			FunctionBlock functionBlock = fis.getFunctionBlock(null);
			JFuzzyChart.get().chart(functionBlock);

			in.close();
		} catch (URISyntaxException e) {
			System.err.println("Error loading the FCL file: " + e.getMessage());
		}
	}

}
