package com.spring.domain;

import java.io.Serializable;

public class WishlistDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int wno;
	private int pid;
	private String pname;
	private int pprice;
	private String pcontent;
	private String pimg;
	private int pcount;
	
	
	
	public WishlistDTO() {
		super();
	}

	public WishlistDTO(int wno, int pid, String pname, int pprice, String pcontent, String pimg, int pcount) {
		super();
		this.wno = wno;
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pcontent = pcontent;
		this.pimg = pimg;
		this.pcount = pcount;
	}

	public int getWno() {
		return wno;
	}

	public void setWno(int wno) {
		this.wno = wno;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public String getPcontent() {
		return pcontent;
	}

	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

	public String getPimg() {
		return pimg;
	}

	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

	public int getPcount() {
		return pcount;
	}

	public void setPcount(int pcount) {
		this.pcount = pcount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WishlistDTO other = (WishlistDTO) obj;
		if (pid != other.pid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WishlistDTO [wno=" + wno + ", pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pcontent="
				+ pcontent + ", pimg=" + pimg + ", pcount=" + pcount + "]";
	}
	

}

