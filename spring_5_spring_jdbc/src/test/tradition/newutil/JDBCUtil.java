package tradition.newutil;

import com.an.jdbc.entity.Student;

import java.sql.*;

public class JDBCUtil {
    public Student getOne(int id) {
        String sql = "SELECT id,name FROM student WHERE id = ?";
        Student student = null;
        // 声明 JDBC 变量
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 注册驱动程序
            Class.forName("com.myql.jdbc.Driver");
            // 获取连接
            con = DriverManager.getConnection("jdbc://mysql://localhost:" +
                    "3306/student", "root", "root");
            // 预编译SQL
            ps = con.prepareStatement(sql);
            // 设置参数
            ps.setInt(1, id);
            // 执行SQL
            rs = ps.executeQuery();
            // 组装结果集返回 POJO
            if (rs.next()) {
                student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(1));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭数据库连接资源
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (ps != null && !ps.isClosed()) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null && con.isClosed()) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return student;
    }
}
