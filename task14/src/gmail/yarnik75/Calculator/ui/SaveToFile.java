package gmail.yarnik75.Calculator.ui;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SaveToFile {
	public void saveToFile(String string) {
		Date d = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy-hh:mm:ss a");
		try (Writer w = new FileWriter("expressions.csv", true)) {
			w.write((format1.format(d)) + "   " + string + '\n');
		} catch (IOException e) {
			throw new RuntimeException("Error of record to the file", e);
		}
	}
}
