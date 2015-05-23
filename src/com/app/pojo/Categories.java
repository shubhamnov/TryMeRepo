package com.app.pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name = "categories", schema = "public")
public class Categories implements java.io.Serializable {

	private int categoriesId;
	private String category_name;
	private String categoriesImage;
	private Date dateAdded;
	private Date lastModified;

	public Categories() {
	}

	public Categories(int categoriesId) {
		this.categoriesId = categoriesId;
	}

	@Id
	@Column(name = "categories_id", unique = true, nullable = false)
	public int getCategoriesId() {
		return this.categoriesId;
	}

	public void setCategoriesId(int categoriesId) {
		this.categoriesId = categoriesId;
	}

	@Column(name = "categories_image", length = 64)
	public String getCategoriesImage() {
		return this.categoriesImage;
	}

	public void setCategoriesImage(String categoriesImage) {
		this.categoriesImage = categoriesImage;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_added", length = 29)
	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified", length = 29)
	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Id
	@Column(name = "category_name", unique = false, nullable = false)
	public String getCategory_name() {
		return category_name;
	}

	/**
	 * @param category_name the category_name to set
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

}