package dao;

import java.util.List;

import dto.CustomerDTO;
import util.DBHelper;
import util.SQL;

public class CustomerDAO extends DBHelper{
	
	private static final CustomerDAO INSTANCE = new CustomerDAO();
	public static CustomerDAO getInstacne() {
		return INSTANCE;
	}
	private CustomerDAO() {}
	
	public void insertCustomer(CustomerDTO dto) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_customer);
			psmt.setString(1, dto.getCustId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setString(4, dto.getAddr());
			psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public CustomerDTO selectCustomer(String custId) {
		return null;
	}
	public List<CustomerDTO> selectAllCustomer() {
		return null;
	}
	public void updateCustomer(CustomerDTO dto) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_customer);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getHp());
			psmt.setString(3, dto.getAddr());
			psmt.setString(4, dto.getCustId());
			psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
			
			// 시스템 개선 및 업데이트 활용하기 위해 에러 내용을 로깅(시스템 개선 및 업데이트 활용)
			logger.error(e.getMessage());
		}
	}
	public void deleteCustomer(String custId) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_customer);
			psmt.setString(1, custId);
			psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
