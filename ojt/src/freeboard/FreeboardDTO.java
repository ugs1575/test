package freeboard;

public class FreeboardDTO {
	
	 private int f_num        ; 
     private String f_title   ; 
     private String f_filename; 
     private int f_filesize   ; 
     private String f_content ; 
     private int f_viewcnt    ; 
     private String f_writer  ; 
     private String f_date    ;
     
	public int getF_num() {
		return f_num;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	public String getF_title() {
		return f_title;
	}
	public void setF_title(String f_title) {
		this.f_title = f_title;
	}
	public String getF_filename() {
		return f_filename;
	}
	public void setF_filename(String f_filename) {
		this.f_filename = f_filename;
	}
	public int getF_filesize() {
		return f_filesize;
	}
	public void setF_filesize(int f_filesize) {
		this.f_filesize = f_filesize;
	}
	public String getF_content() {
		return f_content;
	}
	public void setF_content(String f_content) {
		this.f_content = f_content;
	}
	public int getF_viewcnt() {
		return f_viewcnt;
	}
	public void setF_viewcnt(int f_viewcnt) {
		this.f_viewcnt = f_viewcnt;
	}
	public String getF_writer() {
		return f_writer;
	}
	public void setF_writer(String f_writer) {
		this.f_writer = f_writer;
	}
	public String getF_date() {
		return f_date;
	}
	public void setF_date(String f_date) {
		this.f_date = f_date;
	} 

}
