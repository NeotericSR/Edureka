class VotingEligibility{

    int age;
    public static void main(String[] args){
        
        int age_to_be_checked = 19;

        VotingEligibility obj = new VotingEligibility(age_to_be_checked);

        int age = obj.age;

        System.out.println(checkVotingEligibility(age) ? "You can Vote" : "You cannot Vote");
    }

    public VotingEligibility(int age){
        this.age = age;
    }

    public static boolean checkVotingEligibility(Integer age){
        if(age == null)
            return false;
        return age > 18 ? true : false;
    }
}