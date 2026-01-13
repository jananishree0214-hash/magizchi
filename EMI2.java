class EMI2
{
    public static void main(String[] args)
    {
        
        // IMPLICIT (Widening)
        

        long principal = 100000;
        float rate = 12.5f;
        int years = 2;

        System.out.println("IMPLICIT");
        System.out.println("Before casting principal = " + principal);
        System.out.println("Before casting rate = " + rate);
        System.out.println("Before casting years = " + years);

        float p = principal;   
        float t = years;       

        System.out.println("After casting principal to float = " + p);
        System.out.println("After casting years to float = " + t);

        float interest1 = (p * rate * t) / 100;
        float emi1 = (p + interest1) / (t * 12);

        System.out.println("EMI = " + emi1);


        
        // EXPLICIT 
        

        System.out.println("\nEXPLICIT");

        double dp = (double) principal;
        float dr = (float) rate;
        double dt = (double) years;

        System.out.println("After explicit cast principal = " + dp);
        System.out.println("After explicit cast rate = " + dr);
        System.out.println("After explicit cast years = " + dt);

        double interest2 = (dp * dr * dt) / 100;
        double  emi2 = (dp + interest2) / (dt * 12);

        System.out.println("EMI = " + emi2);


        
        // WRONG TYPE CASTING (Narrowing)

        System.out.println("\nWRONG TYPE CASTING");

        int wrongPrincipal = (int) principal;
        int wrongRate = (int) rate;   // decimal lost

        System.out.println("After wrong cast principal = " + wrongPrincipal);
        System.out.println("After wrong cast rate = " + wrongRate);

        int interest3 =
            (wrongPrincipal * wrongRate * years) / 100;

        int emi3 =
            (wrongPrincipal + interest3) / (years * 12);

        System.out.println("Wrong EMI = " + emi3);
    }
}