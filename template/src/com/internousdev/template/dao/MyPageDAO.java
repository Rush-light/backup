package com.internousdev.template.dao;
import java.sql.Connection;
import sql.PreparedStatement;
import java.sql.SQLException;
import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MyPageDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private MyPageDTO myPageDTO = new MyPageDTO();

	public MyPageDTO getMyPageUserInfo(String item_ttion_id,String user_master_id) throws SQLException {

		String sql = "SELECT iit.item_name, ubit,total_price, ubit.total_count, ubit_pay FROM user_buy_item_transaction ubit LEFT JOIN item_info_trasaction iit ON ubit.user_master_id=? ORDER BY ubit.insert_date DESC";

		try {

			PreparedStatement preparedStatement =connection.prepareStatement(sql);
		}
	}


}
