class operations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print("Enter the number 1: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the number 2: ");

        String operations = sc.nextLine();
        System.out.print("Enter the operation: ");

        int res;

        switch(operations){
            case '+':
                res = n1+n2;
                break;
            case '-':
                res = n1-n2;
                break;
            case '*':
                res = n1*n2;
                break;
            case '/':
                res = n1/n2;
                break;
            case '%':
                res = n1%n2;
                break;
            case default:
                System.out.print("Invalid operation");
        }

        System.out.print("The result is" + res);

    }
}