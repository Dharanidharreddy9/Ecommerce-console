package Orders;

import ProductDetails.Product;

public class Cart {

	private String cartId;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	private Product[] listOfProduct;

	public Product[] getListOfProduct() {
		return listOfProduct;
	}

	public void setListOfProduct(Product[] listOfProduct) {
		this.listOfProduct = listOfProduct;
	}
	public Boolean checkOut() {
		return true;
	}
}
