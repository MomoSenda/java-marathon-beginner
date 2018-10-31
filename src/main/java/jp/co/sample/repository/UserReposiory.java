package jp.co.sample.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.User;



@Repository
@Transactional
public class UserReposiory {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<User> USERROWMAPPER=(rs,i)->{
		User user=new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setAge(rs.getInt("age"));
		user.setAddress(rs.getString("address"));

		return user;	
	
	};
	public User load(int id) {
		String sql="SELECT id,name,age,address from info WHERE id=:id";
	SqlParameterSource param=new MapSqlParameterSource().addValue("id", id);
	
	User user=template.queryForObject(sql, param, USERROWMAPPER);
		return user;
	}
}
