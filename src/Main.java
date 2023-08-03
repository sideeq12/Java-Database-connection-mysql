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
        String url = "-";
        String name = "-";
        String password = "-";
        String query = "-";

        //first;y loading our driver
    Class.forName("com.mysql.jdbc.Driver");

    //establishing connection interface
        Connection con = DriverManager.getConnection(url, name , password);

        Statement st = con.createStatement();
        st.executeQuery(query);
    }
}