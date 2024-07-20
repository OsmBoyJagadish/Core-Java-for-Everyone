package coonection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OpImp  implements Opreation{

	@Override
	public void InsertData(EmpPojo emp) {
		PreparedStatement ps;
		try {
			ps=GetConnection.getconnection().prepareStatement("insert into empinfo values (?,?,?) ");
			ps.setInt(1,emp.getId());
			ps.setString(2,emp.getName());
			ps.setDouble(3,emp.getSalary());
			ps.executeUpdate();
			System.out.println("Insert");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateData(EmpPojo emp) {
		PreparedStatement ps;
		try {
			ps=GetConnection.getconnection().prepareStatement("set from empinfo id=? where salary =?");
			ps.setInt(1,emp.getId());
			ps.setDouble(2,emp.getSalary());
			ps.executeUpdate();
			System.out.println("Update");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void DeleteData(EmpPojo emp) {
		PreparedStatement ps;
		try {
			ps=GetConnection.getconnection().prepareStatement(" delete from empinfo where id = ? ");
			ps.setInt(1,emp.getId());
			ps.executeUpdate();
			System.out.println("Delete");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void Display(EmpPojo emp) {
		// TODO Auto-generated method stub
		
	}

}
