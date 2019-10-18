class CheckNumber{
    int number;

    public CheckNumber(int number){
        this.number = number;
    }

    public static void main(String[] args){
        //input number to check
        int number_to_check = 0;

        CheckNumber obj = new CheckNumber(number_to_check);

        System.out.println(obj.number < 0 ? "The number you entered is negetive" : obj.number == 0 ? "The number is zero" : "The number you entered is positive");
    }
}
