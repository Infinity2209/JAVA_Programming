package college;

public class collegeinfo {

    String Clgname = "Government College of Engineering,Kalahandi", Address = "At/Po-Bandhopala";
    int pin = 766001;
    String Branch[] = { "CSE", "MECH.", "Civil", "Electrical" };
    {
        System.out.println("College name:" + Clgname);
        System.out.println("College Address:" + Address);
        System.out.println("Branches available");
        for (int i = 0; i < Branch.length; i++) 
        {
            System.out.println(Branch[i]);
        }
    }

}
