package it313project4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class TransactionsLogger implements Observer {
	private PrintWriter _log;
	private ArrayList<StockItem> _items;
	
	public void setItems (ArrayList<StockItem> _items) {
		this._items=_items;
	}
	
	public TransactionsLogger(String fileName) throws FileNotFoundException {
		PrintWriter _log = new PrintWriter(fileName);
		
		
		_log.println( );
		_log.print("=================  ");
		_log.println("======= ======= ======= ======= =======");
		_log.flush( );
	}
	
	@Override
	public void update(Observable theTransactionMonitor, Object StockItems) {
		_log.println( );
		_log.flush( );
	}
}
