package idcard;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
	private int nowNumber = 0;

	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, nowNumber++);
	}

	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "を登録しました。");
	}

}
