package practice;

import java.util.Collection;

public class ConsolidatedReport<T> implements Reporter<Collection<T>> {
	private Reporter<T> reporter;

	public ConsolidatedReport(Reporter reporter) {
		this.reporter = reporter;
	}

	@Override
	public boolean report(Collection<T> data) {
		for (T i : data) {
			reporter.report(i);
		}
		return true;
	}

}
