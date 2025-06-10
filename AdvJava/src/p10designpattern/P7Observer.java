package p10designpattern;

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
	void update(String news);
}

// Subject class
class NewsAgency {
	private List<Observer> observers = new ArrayList<>();
	private String news;

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void setNews(String news) {
		this.news = news;
		notifyObservers();
	}

	private void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(news);
		}
	}
}

// Concrete Observer class
class NewsChannel implements Observer {
	private String news;

	@Override
	public void update(String news) {
		this.news = news;
		display();
	}

	public void display() {
		System.out.println("News Channel received news: " + news);
	}
}

public class P7Observer {
	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();
		NewsChannel channel1 = new NewsChannel();
		NewsChannel channel2 = new NewsChannel();

		newsAgency.addObserver(channel1);
		newsAgency.addObserver(channel2);

		newsAgency.setNews("Breaking News: Observer Pattern in Java!");
		newsAgency.setNews("Another Update: Learn Design Patterns Easily!");
	}
}
