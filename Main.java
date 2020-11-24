class Main {
    public static void main(String[] args) {
        System.out.println(GenerateStairs(101));
    }

    static String GenerateStairs(int input) {
        if (input < 0 || input > 100) {
            return "Input is not valid";
        }

        String result = "";

        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j<= input; j++) {
                if (input - j < i) {
                    result += "#";
                } else {
                    result += " ";
                }                
            }
            if (input != i) {
                result += "\n";
            }            
        }

        return result;
        
    }
}