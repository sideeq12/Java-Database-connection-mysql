import java.sql.* ;

//making the connection and the seven steps
//import the package
//secondly load and register the driver
//third step is establish connection
//fourth step is make proposed statement
//fifth step is your query
// return result ("-") o
//close connection

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:33017/Students";
        String name = "cyberus";
        String password = "-";
        String query = "select first_name from Studentslist where student_id = 2";

        //first;y loading our driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    //establishing connection interface
        Connection con = DriverManager.getConnection(url, name , password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String nameresult = rs.getString( "first_name");
        System.out.println(nameresult);


//        after getting our data we have to close
        st.close();
        con.close();
    }
}