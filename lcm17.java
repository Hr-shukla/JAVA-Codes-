class lcm17 {
    public static void main(String[] args) {
        int a = 56, b = 98;
        int lcm;
		if (a > b) {
  			  lcm = a;
			} 
		else {
   			 lcm = b;
			}
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}
