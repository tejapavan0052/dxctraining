package com.product.model;

public class products {
	private int p_num;
	private int p_code;
	private String p_name;
	private String p_status;
	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	public int getP_code() {
		return p_code;
	}
	public void setP_code(int p_code) {
		this.p_code = p_code;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_status() {
		return p_status;
	}
	public void setP_status(String p_status) {
		this.p_status = p_status;
	}
	public products(int p_num, int p_code, String p_name, String p_status) {
		super();
		this.p_num = p_num;
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_status = p_status;
	}
	public products() {
		// TODO Auto-generated constructor stub
		}
	@Override
	public String toString() {
		return "products [p_num=" + p_num + ", p_code=" + p_code + ", p_name=" + p_name + ", p_status=" + p_status
				+ "]";
	}

}
