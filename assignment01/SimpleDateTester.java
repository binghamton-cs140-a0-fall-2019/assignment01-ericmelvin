package assignment01;

public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate aSimpleDate = SimpleDate.of(1999, 01, 01);
		SimpleDate otherSimpleDate = SimpleDate.of(1999, 02, 01);
		System.out.println("TEST");
		System.out.println(aSimpleDate);
		System.out.println("other" + otherSimpleDate);
		System.out.println(aSimpleDate.before(otherSimpleDate));
	}
}
