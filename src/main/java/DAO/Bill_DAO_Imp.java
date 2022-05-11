package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Bills;

@Repository
public class Bill_DAO_Imp  implements Bill_DAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveBill(Bills bill) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(bill);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Bills> getBill() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Bills> query=currentSession.createQuery("from Bills", Bills.class);
		List<Bills> list=query.getResultList();
		return list;
	}

	@Override
	public boolean deleteBill(Bills bill) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(bill);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Bills> getBillByID(Bills bill) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Bills> query=currentSession.createQuery("from bill where id=:id", Bills.class);
		query.setParameter("id", bill.getId());
		List<Bills> list=query.getResultList();
		return list;
	}

	@Override
	public boolean updateBill(Bills bill) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(bill);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

}
