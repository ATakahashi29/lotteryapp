package com.lottery.app.entity;

import java.sql.Date;

import lombok.Data;

public class Lottery {
	
	@Data
	public class lottery {
		private long id;
		private String name;
		private String mail;
		private String passkey;
		private String address;
		private long tel;
		private long active_flg;
		private Date join_date;
		private Date change_date;
		
		
	}


}
