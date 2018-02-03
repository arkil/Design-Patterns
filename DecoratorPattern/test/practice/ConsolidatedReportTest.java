package practice;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ConsolidatedReportTest {
	private ConsolidatedReport<Car> report;
	private PrintWriter pw;
	private ByteArrayOutputStream baos;
	private CarStringTransformer itemTransformer;
	private OutputWriterReporter<Car> reporter;

	@Before
	public void setUp() {
		baos = new ByteArrayOutputStream();
		pw = new PrintWriter(baos);
		itemTransformer = new CarStringTransformer();
		reporter = new OutputWriterReporter<>(itemTransformer, pw);
		report = new ConsolidatedReport<>(reporter);

	}

	@Test
	public void canReport() {
		Collection<Car> cars = new ArrayList<>();
		cars.add(new Car("Tesla", "S3"));
		cars.add(new Car("Audi", "A4"));
		report.report(cars);
		pw.flush();
		System.out.println(baos.toString());

	}

}
