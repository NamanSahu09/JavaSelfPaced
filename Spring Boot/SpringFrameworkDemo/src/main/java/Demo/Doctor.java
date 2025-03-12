package Demo;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff
{
//    Qualification qualification;
    public void assist()
    {
        System.out.println("Doctor is asissting.");
    }
}
