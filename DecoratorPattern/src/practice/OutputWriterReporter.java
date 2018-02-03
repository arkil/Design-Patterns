package practice;

import java.io.PrintWriter;

public class OutputWriterReporter<T> implements Reporter<T> {
	private ItemTransformer<T, String> transformer;
	private PrintWriter writer;

	public OutputWriterReporter(ItemTransformer<T, String> transformer, PrintWriter writer) {
		this.transformer = transformer;
		this.writer = writer;
	}

	@Override
	public boolean report(T dataIn) {
		writer.println(transformer.transform(dataIn));
		return false;
	}

}
