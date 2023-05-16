package tester;

import com.app.core.Emp;
import com.app.core.SalesMgr;
import com.app.core.TempWorker;
import com.app.core.HRMgr;
import com.app.core.PermanentWorker;
import com.app.core.Mgr;
import com.app.core.Worker;

public class Test1 {

	public static void main(String[] args) {
	Emp e= new SalesMgr();//up casting
	System.out.println(e.computeSalary());
	System.out.println(e.getclass());
	e= new TempWorker();
	System.out.println(e.computeSalary());
	System.out.println(e.getClass());
	Object ref;
	ref e;
	System.out.println(ref.getClass());
	System.out.println(((Emp)ref).computeSalary());
	System.out.println(((TempWorker)ref).computeSalary());
	System.out.println(((TempWorker)ref).computeSalary());
	

	}

}
