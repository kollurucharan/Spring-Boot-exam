package com.pack.books.models;

import java.time.LocalDateTime;

public class SessionTable {

	int sess_id;
	LocalDateTime ussn_cdate;
	long ussn_key;
	LocalDateTime ussn_exptime;
	String ussn_status;

	@Override
	public String toString() {
		return "SessionTable [sess_id=" + sess_id + ", ussn_cdate=" + ussn_cdate + ", ussn_key=" + ussn_key
				+ ", ussn_exptime=" + ussn_exptime + ", ussn_status=" + ussn_status + "]";
	}

	public int getSess_id() {
		return sess_id;
	}

	public void setSess_id(int sess_id) {
		this.sess_id = sess_id;
	}

	public LocalDateTime getUssn_cdate() {
		return ussn_cdate;
	}

	public void setUssn_cdate(LocalDateTime ussn_cdate) {
		this.ussn_cdate = ussn_cdate;
	}

	public long getUssn_key() {
		return ussn_key;
	}

	public void setUssn_key(long ussn_key) {
		this.ussn_key = ussn_key;
	}

	public LocalDateTime getUssn_exptime() {
		return ussn_exptime;
	}

	public void setUssn_exptime(LocalDateTime ussn_exptime) {
		this.ussn_exptime = ussn_exptime;
	}

	public String getUssn_status() {
		return ussn_status;
	}

	public void setUssn_status(String ussn_status) {
		this.ussn_status = ussn_status;
	}

}