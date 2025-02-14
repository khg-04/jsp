package util;

public class SQL {

	public static final String INSERT_customer = "insert into `customer` values (?,?,?,?,NOW())";
	public static final String SELECT_customer = "select * from `customer` where `uid` = ?";
	public static final String SELECT_ALL_customer = "select * from `customer`";
	public static final String UPDATE_customer = "update `customer` set "
												+ "`name`=?,"
												+ "`hp`=?,"
												+ "`age`=? where `uid`=?";
	public static final String DELETE_customer = "delete from `customer` where `uid`=?";
	
}
