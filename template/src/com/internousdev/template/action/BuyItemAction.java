package com.internousdev.template.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	private int stock;
	private String pay;
	public Map<String,Object> session;
	private String result;
	private String payment;

	public String execute() {
		result=SUCCESS;

		session.put("stock",stock);
		int intstock = Integer.parseInt(session.get("stock").toString());
		int intprice = Integer.parseInt(session.get("buyitem_price").toString());
		session.put("buyItem_price, intStock*intprice", intprice);
		String payment;

	if(pay.equals(1)){
		payment="現金払い";
		session.put("pay", payment);
	}else {
		payment="クレジットカード";
		session.put(pay, payment);
	}
	return result;

}
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock=stock;
	}
