import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        BeanFactory container= new ClassPathXmlApplicationContext("config.xml");
        System.out.println(container.containsBean("fullTimeMentor"));
        System.out.println(container.containsBean("partTimeMentor"));

        // same thing
     //   ApplicationContext container= new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");
        mentor.createAccount();

        Mentor mentor2 = (Mentor) container.getBean("partTimeMentor");
        mentor2.createAccount();


        Mentor mentor3= container.getBean("fullTimeMentor", Mentor.class);
        mentor3.createAccount();

    }
}
