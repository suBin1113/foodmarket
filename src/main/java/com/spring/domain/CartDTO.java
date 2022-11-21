package com.spring.domain;

import lombok.Data;

@Data
public class CartDTO {
	private Long cno;
	private String pimg;
	private int pid;
	private String pname;
	private int pcount;
	private int pprice;

	public String getPimg() {
		return pimg;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public int getPprice() {
		return pprice;
	}

	public int getPcount() {
		return pcount;
	}

	public Long getCno() {
		return cno;
	}
	
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public void setPcount(int pcount) {
		this.pcount = pcount;
	}
}
