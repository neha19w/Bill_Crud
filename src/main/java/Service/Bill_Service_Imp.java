package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Bill_DAO;
import Model.Bills;

@Service
@Transactional
public class Bill_Service_Imp implements Bill_Service {
 
	@Autowired
	private Bill_DAO billdao;
	
	@Override
	public boolean saveBill(Bills bill) {
		return billdao.saveBill(bill);
	}

	
	@Override
	public List<Bills> getBill() {
		return billdao.getBill();
	}

	@Override
	public boolean deleteBill(Bills bill) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Bills> getBillByID(Bills bill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateBill(Bills bill) {
		// TODO Auto-generated method stub
		return false;
	}

}
