package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name ="categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class Category {
	@Id
	@Column(name="category_id")
	  private String categoryId;
		

	@Column(name="category_name")
    private String catagoryName;
	
	@OneToMany(mappedBy="categories")
	  private List<Product> products;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCatagoryName() {
		return catagoryName;
	}



	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((catagoryName == null) ? 0 : catagoryName.hashCode());
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		Category other = (Category) obj;
		if (catagoryName == null) {
			if (other.catagoryName != null)
				return false;
		} else if (!catagoryName.equals(other.catagoryName))
			return false;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", catagoryName=" + catagoryName + ", products=" + products + "]";
	}




	public Category(String categoryId, String catagoryName, List<Product> products) {
		super();
		this.categoryId = categoryId;
		this.catagoryName = catagoryName;
		this.products = products;
	}




	
}
