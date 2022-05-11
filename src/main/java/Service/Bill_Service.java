package Service;

import java.util.List;

import Model.Bills;

public interface Bill_Service {

	
	public boolean saveBill(Bills bill);
	public List<Bills> getBill();
	public boolean deleteBill(Bills bill);
	public List<Bills> getBillByID(Bills bill);
	public boolean updateBill(Bills bill);
}
