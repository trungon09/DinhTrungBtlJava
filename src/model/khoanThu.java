package model;

import java.util.Date;

public class khoanThu {
	private Date day;
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	private String moTa;
	private int soTien;
	
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getSoTien() {
		return soTien;
	}
	public void setSoTien(int soTien) {
		this.soTien = soTien;
	}
	
}
