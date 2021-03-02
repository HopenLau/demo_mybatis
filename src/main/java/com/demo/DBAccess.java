package com.demo;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBAccess {
	public SqlSession getSqlSession() throws IOException {
		// 閫氶亷閰嶇疆鏂囦欢鐛插緱鏁告摎搴�ｆ帴淇℃伅銆�
		Reader reader = Resources.getResourceAsReader("config/Configuration.xml");

		// 閫氶亷閰嶇疆淇℃伅锛屾寤轰竴鍊婼qlSessionFactory銆�
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

		// 閫氶亷SqlSessionFactory鎵撻枊涓�鍊嬫暩鎿氬韩鏈冭┍銆�
		SqlSession sqlSession = sqlSessionFactory.openSession();

		return sqlSession;
	}
}
