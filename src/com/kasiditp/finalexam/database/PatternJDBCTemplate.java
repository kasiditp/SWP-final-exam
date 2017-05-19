package com.kasiditp.finalexam.database;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class PatternJDBCTemplate implements PatternDAO {
	@Autowired
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
	}

	@Override
	public void create(String name, String group, String implementation) {
		// TODO Auto-generated method stub
		String SQL = "insert into Pattern (name, groups, implementation) values (?, ?, ?)";
		jdbcTemplateObject.update( SQL, name, group, implementation);
		System.out.println("Created Record Name = " + name + " Group = " + group + " implementation = " + implementation);
		return;
	}

	@Override
	public Pattern getPattern(Integer id) {
		// TODO Auto-generated method stub
		String SQL = "select * from Pattern where id = ?";
		Pattern pattern = jdbcTemplateObject.queryForObject(SQL,new Object[]{id}, new PatternMapper());
		return pattern;

	}

	@Override
	public List<Pattern> listPatterns() {
		// TODO Auto-generated method stub
		String SQL = "select * from Pattern";
		List <Pattern> patterns = jdbcTemplateObject.query(SQL, new PatternMapper());
		return patterns;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String SQL = "delete from Pattern where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id );
		return;
	}

	@Override
	public void update(Integer id, String name, String group, String implementation) {
		// TODO Auto-generated method stub
		String SQL = "update Pattern set name = ?, groups = ?, implementation = ? where id = ?";
		jdbcTemplateObject.update(SQL, name, group, implementation, id);
		System.out.println("Updated Record with ID = " + id );
		return;
	}

}
