package bean;

import dao.EmpHibernateDAO;
import pojo.EmpPojo;

public class EmpBean {
	public static void addEmp(EmpPojo ep) {
				EmpHibernateDAO.addEmp(ep);

	}

	public static void deleteEmp(EmpPojo ep) {
		// TODO Auto-generated method stub
		EmpHibernateDAO.deleteEmpDetail(ep);

	}

	public static EmpPojo details(EmpPojo ep) {
		// TODO Auto-generated method stub
		String msg = null;

		if (ep.getId() == 0) {
			ep = null;
		}
		return EmpHibernateDAO.empDetails(ep);

	}

	public static void updateEmp(EmpPojo ep) {
		// TODO Auto-generated method stub
		EmpHibernateDAO.updateEmpDetail(ep);
	}
	
	public static void listEmp() {
		EmpHibernateDAO.listEmpDetails();
	}

}
