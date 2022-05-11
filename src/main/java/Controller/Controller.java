package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Bills;
import Service.Bill_Service;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping(value="/api")

public class Controller {
	
	@Autowired
	private Bill_Service billservice;
	
	@PostMapping("save-bill")
	public boolean saveBill(@RequestBody Bills bill) {
		 return billservice.saveBill(bill);
		
	}
	
	@GetMapping("bills")
	public List<Bills> allitems() {
		System.out.println("retriving data");
		 return billservice.getBill();
	}
	
	
	@DeleteMapping("delete-bill/{id}")
	public boolean deleteBill(@PathVariable("id") int id,Bills bill) {
		bill.setId(id);
		return billservice.deleteBill(bill);
	}

	@GetMapping("bill/{item_id}")
	public List<Bills> allitemsByID(@PathVariable("id") int id,Bills bill) {
		bill.setId(id);

		List<Bills> local=billservice.getBillByID(bill);
		System.out.println(local.get(0).getBilled_To());		
		 return local;
		
	}
	
	@PostMapping("update-bill/{id}")
	public boolean updateBill(@RequestBody Bills bill,@PathVariable("id") int id) {
		bill.setId(id);
		return billservice.updateBill(bill);
	}

}