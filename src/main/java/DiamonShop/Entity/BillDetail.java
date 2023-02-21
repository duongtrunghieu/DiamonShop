package DiamonShop.Entity;

public class BillDetail {
	private Long id;
	private Long id_product;
	private Long id_bills;
	private int quanty;
	private double total;
	
	public BillDetail() {
		super();
	}
	
	public Long getId_bills() {
		return id_bills;
	}

	public void setId_bills(Long id_bills) {
		this.id_bills = id_bills;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_product() {
		return id_product;
	}
	public void setId_product(Long id_product) {
		this.id_product = id_product;
	}
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}
