package edu.umb.cs680.hw13.Multicast;

public class TableObserver implements DJIAQuoteObserver, StockQuoteObserver {

	public void updateStock(StockEvent obj) {
		StockEvent stockEvent = (StockEvent) obj;
		System.out.print("TableChart of StockEvent: " + stockEvent.getTicker() + " " + stockEvent.getQuote());

	}

	public void updateDJIA(DJIAEvent obj) {
		DJIAEvent djiaEvent = (DJIAEvent) obj;
		System.out.print("TableChart of DJIAEvent: " + djiaEvent.getDjia());
	}

}