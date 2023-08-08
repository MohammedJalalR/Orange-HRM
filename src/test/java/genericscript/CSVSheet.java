package genericscript;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVSheet {

	public static ArrayList<String> fetch() throws CsvValidationException, IOException {
		String file = "./csv/test_data.csv";

		List<String> l1 = new ArrayList();

		CSVReader csvReader = new CSVReader(new FileReader(file));

		String[] data;

		while ((data = csvReader.readNext()) != null) {

			l1.add(data[0]);
			l1.add(data[1]);
			l1.add(data[2]);

		}

		return (ArrayList<String>) l1;
	}

}
