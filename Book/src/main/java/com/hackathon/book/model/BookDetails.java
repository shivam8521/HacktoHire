package com.hackathon.book.model;




public class BookDetails {

    
    public BookDetails(int uuid, int rackNo, String title, String author, String category, String edition,
			String status) {
		this.uuid = uuid;
		this.rackNo = rackNo;
		this.title = title;
		this.author = author;
		this.category = category;
		this.edition = edition;
		Status = status;
	}
 
	private int uuid;
    private int rackNo;
    
    private String title;
    
    private String author;
    private String category;
    
    private String edition;
    private String Status;
    
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}
	/**
	 * @param rackNo the rackNo to set
	 */
	public void setRackNo(int rackNo) {
		this.rackNo = rackNo;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @param edition the edition to set
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "BookDetails [uuid=" + uuid + ", rackNo=" + rackNo + ", title=" + title + ", author=" + author
				+ ", category=" + category + ", edition=" + edition + ", Status=" + Status + "]";
	}
	
	
}
