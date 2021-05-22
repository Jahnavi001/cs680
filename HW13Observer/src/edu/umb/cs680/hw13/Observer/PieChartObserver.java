package edu.umb.cs680.hw13.Observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class PieChartObserver implements Observer {


	public void update(Observable o, Object obj) {
		if (obj instanceof StockEvent) {
			StockEvent stockEvent = (StockEvent) obj;
			System.out.print("PieChart of StockEvent: " + stockEvent.getTicker() + " " + stockEvent.getQuote());
		} else if (obj instanceof DJIAEvent) {
			DJIAEvent djiaEvent = (DJIAEvent) obj;
			System.out.print("PieChart of DJIAEvent: " + djiaEvent.getDjia());
		}
	}
}