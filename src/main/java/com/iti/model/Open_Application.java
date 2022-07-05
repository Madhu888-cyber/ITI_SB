package com.iti.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Open_Application {

	
	@Pattern(regexp = "^[0-9]{1,2}$", message = "SSC/8th Board is not matched")
	@NotBlank(message = "SSC/8th Board is required")
	private String ssc_board;
	
	@Size(min=6, max = 12, message = "SSC/8th Hall Ticket No is not matched")
	@NotBlank(message = "SSC/8th Hall Ticket No is required")
	private String ssc_regno;
	@NotNull
	@Size(min = 1, message = "board is not valid!")
	private String passyear;
	@NotNull
	@Size(min = 1, message = "board is not valid!")
	private String ssctype;
	 
	
	public Open_Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Open_Application(String ssc_board, String ssc_regno, String passyear, String ssctype) {
		super();
		this.ssc_board = ssc_board;
		this.ssc_regno = ssc_regno;
		this.passyear = passyear;
		this.ssctype = ssctype;
	}
	public String getSsc_board() {
		return ssc_board;
	}
	public void setSsc_board(String ssc_board) {
		this.ssc_board = ssc_board;
	}
	public String getSsc_regno() {
		return ssc_regno;
	}
	public void setSsc_regno(String ssc_regno) {
		this.ssc_regno = ssc_regno;
	}
	public String getPassyear() {
		return passyear;
	}
	public void setPassyear(String passyear) {
		this.passyear = passyear;
	}
	public String getSsctype() {
		return ssctype;
	}
	public void setSsctype(String ssctype) {
		this.ssctype = ssctype;
	}
	@Override
	public String toString() {
		return "Open_Application [ssc_board=" + ssc_board + ", ssc_regno=" + ssc_regno + ", passyear=" + passyear
				+ ", ssctype=" + ssctype + "]";
	}
	
	
}
