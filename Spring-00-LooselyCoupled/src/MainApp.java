import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class MainApp {
    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        MentorAccount mentorAccount = new MentorAccount(fullTimeMentor);
        mentorAccount.manageAccount();

        PartTimeMentor partTimeMentor = new PartTimeMentor();
        MentorAccount mentorAccount2 = new MentorAccount(partTimeMentor);
        mentorAccount2.manageAccount();



    }
}
