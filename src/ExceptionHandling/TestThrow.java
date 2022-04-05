package ExceptionHandling;

public class TestThrow {

    public static void main(String[] args) {
        try {
            validateVotingAgeInIndia(12, "Ram");
        }catch(CustomUnCheckedException exception) {
            System.out.println(exception.getErrorMessage());
        }
        try {
            validateVotingAgeInIndia(14, "Ram1");
        }catch(CustomUnCheckedException exception) {
            System.out.println(exception.getErrorMessage());
        }
        try {
            validateVotingAgeInIndia(18, "Ram2");
        }catch(CustomUnCheckedException exception) {
            System.out.println(exception.getErrorMessage());
        }
        try {
            validateVotingAgeInIndia(20, "Ram3");
        }catch(CustomUnCheckedException exception) {
            System.out.println(exception.getErrorMessage());
        }
        try {
            validateVotingAgeInIndia(10, "Ram4");
        }catch(CustomUnCheckedException exception) {
            System.out.println(exception.getErrorMessage());
        }
    }

    private static void validateVotingAgeInIndia(int age, String voterName) {

        if(age < 18) {
            throw new CustomUnCheckedException("Voter is not allowed for voting...");
        }else{
            System.out.println(voterName + " is allowed with age " + age);
        }
    }
}
