import com.reccomendationgenie.app.ConnectionStrength;
import com.reccomendationgenie.app.JsonParser;
import com.reccomendationgenie.app.Member;

public class ConnectionStrengthTest
{

  public ConnectionStrengthTest()
  {
    // TODO Auto-generated constructor stub
  }

  /**
   * @param args
   */
  public static void main(String[] args)
  {

    JsonParser jsonParser = new JsonParser();
    Member swetha = jsonParser.getMember("Swetha");
    Member swetha1 = jsonParser.getMember("Swetha1");

    try
    {
      Double connStrength = ConnectionStrength.getConnectionStrength(swetha, swetha1);
      System.out.println("connStrength=" + connStrength);
    }
    catch (Exception e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    // TODO Auto-generated method stub

  }
}
