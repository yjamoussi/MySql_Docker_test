import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
   Tests a database installation by creating and querying
   a sample table. Call this program as
   java -classpath driver_class_path;. TestDB propertiesFile
*/
public class TestDB 
{
   public static void main(String[] args) throws Exception
   {   
      SimpleDataSource.init("./src/main/java/database.properties");
      
      try (Connection conn = SimpleDataSource.getConnection())
      {
         Statement stat = conn.createStatement();

         //stat.execute("CREATE TABLE Test1 (Name VARCHAR(20))");
         //stat.execute("INSERT INTO Test1 VALUES ('Romeo')");

         ResultSet result = stat.executeQuery("SELECT * FROM Test1");
         result.next();
         System.out.println(result.getString("Name"));

         // stat.execute("DROP TABLE Test");




      }
   }
}
