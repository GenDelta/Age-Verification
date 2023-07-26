import java.util.Date; 
public class Delay 
{
    Delay() 
    {
      try
      {
        Thread.sleep(3000);
        new WelcSM();
      }
      catch(InterruptedException ex)
      {
          ex.printStackTrace();
      }
    }
}