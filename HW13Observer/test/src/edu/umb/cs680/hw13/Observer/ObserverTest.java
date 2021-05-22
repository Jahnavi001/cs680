package edu.umb.cs680.hw13.Observer;
import org.junit.jupiter.api.Test;


class ObserverTest {
	
	PieChartObserver PiechartObserver = new PieChartObserver();
	TableObserver TableObserver = new TableObserver();
	ThreeDObserver THREEDObserver = new ThreeDObserver();
	DJIAQuoteObservable djiaObserver = new DJIAQuoteObservable();
	StockQuoteObservable stockObserver = new StockQuoteObservable();
	
		@SuppressWarnings("deprecation")
		@Test
		void verifyDija() {
			
			djiaObserver.addObserver(PiechartObserver);
			djiaObserver.addObserver(TableObserver);
			djiaObserver.addObserver(THREEDObserver);
			djiaObserver.changeQuote(100);
			djiaObserver.changeQuote(200);
			
		}
		
		@SuppressWarnings("deprecation")
		@Test
		void verifyStock() {
			
			stockObserver.addObserver(PiechartObserver);
			stockObserver.addObserver(TableObserver);
			stockObserver.addObserver(THREEDObserver);
			stockObserver.changeQuote("rtp", 10);
			stockObserver.changeQuote("rtp1", 27);
		
			
		}
		
	
}